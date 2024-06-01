package com.example.todo
import androidx.lifecycle.Observer
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.DatePicker
import android.widget.TimePicker
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import com.example.todo.databinding.EditTaskBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.text.SimpleDateFormat
import java.util.*

class EditTaskActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: EditTaskBinding
    private lateinit var myCalendar: Calendar
    private lateinit var dateSetListener: DatePickerDialog.OnDateSetListener
    private lateinit var timeSetListener: TimePickerDialog.OnTimeSetListener
    private var taskId: Long = -1L // The ID of the task to be edited
    private var finalDate = 0L
    private var finalTime = 0L
    private val labels = arrayListOf("Personal", "Business", "Insurance", "Shopping", "Banking")
    private val db by lazy { AppDatabase.getDatabase(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = EditTaskBinding.inflate(layoutInflater)
        setContentView(binding.root)
        myCalendar = Calendar.getInstance()
        taskId = intent.getLongExtra("taskId", -1L) // Get the task ID passed from the main activity

        binding.dateEdt.setOnClickListener(this)
        binding.timeEdt.setOnClickListener(this)
        binding.saveBtn.setOnClickListener(this)

        setUpSpinner()
        loadTaskDetails()
    }

    private fun setUpSpinner() {
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, labels)
        labels.sort()
        binding.spinnerCategory.adapter = adapter
    }

    private fun loadTaskDetails() {
        GlobalScope.launch(Dispatchers.Main) {
            val task = withContext(Dispatchers.IO) { db.todoDao().getTask(taskId) }
            displayTaskDetails(task)
        }
    }


    private fun displayTaskDetails(task: LiveData<TodoModel>) {
        task.observe(this, Observer { todoModel ->
            todoModel?.let {
                with(binding) {
                    titleInpLay.editText?.setText(it.title)
                    spinnerCategory.setSelection(labels.indexOf(it.category))
                    finalDate = it.date
                    finalTime = it.time
                    updateDate()
                }
            }
        })
    }


    override fun onClick(v: View) {
        when (v.id) {
            R.id.dateEdt -> setListener()
            R.id.timeEdt -> setTimeListener()
            R.id.saveBtn -> saveEditedTodo()
        }
    }

    private fun saveEditedTodo() {
        val category = binding.spinnerCategory.selectedItem.toString()
        val title = binding.titleInpLay.editText?.text.toString()

        GlobalScope.launch(Dispatchers.Main) {
            withContext(Dispatchers.IO) {
                db.todoDao().updateTask(TodoModel(title, category, finalDate, finalTime,0, taskId))
            }
            finish()
        }
        Toast.makeText(this, "Task Edited!", Toast.LENGTH_SHORT).show()
        startActivity(Intent(this, MainActivity::class.java))
    }

    private fun setListener() {
        myCalendar = Calendar.getInstance()

        dateSetListener = DatePickerDialog.OnDateSetListener { _: DatePicker, year: Int, month: Int, dayOfMonth: Int ->
            myCalendar.set(Calendar.YEAR, year)
            myCalendar.set(Calendar.MONTH, month)
            myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
            updateDate()
        }

        DatePickerDialog(this, dateSetListener, myCalendar.get(Calendar.YEAR),
            myCalendar.get(Calendar.MONTH), myCalendar.get(Calendar.DAY_OF_MONTH)).apply {
            datePicker.minDate = System.currentTimeMillis()
            show()
        }
    }

    private fun updateDate() {
        val myformat = "EEE, d MMM yyyy"
        val sdf = SimpleDateFormat(myformat)
        finalDate = myCalendar.time.time
        binding.dateEdt.setText(sdf.format(myCalendar.time))
        binding.timeInptLay.visibility = View.VISIBLE
    }

    private fun setTimeListener() {
        myCalendar = Calendar.getInstance()

        timeSetListener = TimePickerDialog.OnTimeSetListener { _: TimePicker, hourOfDay: Int, min: Int ->
            myCalendar.set(Calendar.HOUR_OF_DAY, hourOfDay)
            myCalendar.set(Calendar.MINUTE, min)
            updateTime()
        }

        TimePickerDialog(this, timeSetListener, myCalendar.get(Calendar.HOUR_OF_DAY),
            myCalendar.get(Calendar.MINUTE), false).show()
    }

    private fun updateTime() {
        val myformat = "h:mm a"
        val sdf = SimpleDateFormat(myformat)
        finalTime = myCalendar.time.time
        binding.timeEdt.setText(sdf.format(myCalendar.time))
    }
}
