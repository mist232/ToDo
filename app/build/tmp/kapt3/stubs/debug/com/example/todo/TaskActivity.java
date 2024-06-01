package com.example.todo;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\b\u0010\u001f\u001a\u00020\u0019H\u0002J\b\u0010 \u001a\u00020\u0019H\u0002J\b\u0010!\u001a\u00020\u0019H\u0002J\b\u0010\"\u001a\u00020\u0019H\u0002J\b\u0010#\u001a\u00020\u0019H\u0002J\b\u0010$\u001a\u00020\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/example/todo/TaskActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/view/View$OnClickListener;", "()V", "binding", "Lcom/example/todo/databinding/ActivityTaskBinding;", "dateSetListener", "Landroid/app/DatePickerDialog$OnDateSetListener;", "db", "Lcom/example/todo/AppDatabase;", "getDb", "()Lcom/example/todo/AppDatabase;", "db$delegate", "Lkotlin/Lazy;", "finalDate", "", "finalTime", "labels", "Ljava/util/ArrayList;", "", "myCalendar", "Ljava/util/Calendar;", "timeSetListener", "Landroid/app/TimePickerDialog$OnTimeSetListener;", "onClick", "", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "saveTodo", "setListener", "setTimeListener", "setUpSpinner", "updateDate", "updateTime", "app_debug"})
public final class TaskActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener {
    private com.example.todo.databinding.ActivityTaskBinding binding;
    private java.util.Calendar myCalendar;
    private android.app.DatePickerDialog.OnDateSetListener dateSetListener;
    private android.app.TimePickerDialog.OnTimeSetListener timeSetListener;
    private long finalDate = 0L;
    private long finalTime = 0L;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<java.lang.String> labels = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy db$delegate = null;
    
    public TaskActivity() {
        super();
    }
    
    private final com.example.todo.AppDatabase getDb() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpSpinner() {
    }
    
    @java.lang.Override
    public void onClick(@org.jetbrains.annotations.NotNull
    android.view.View v) {
    }
    
    private final void saveTodo() {
    }
    
    private final void setTimeListener() {
    }
    
    private final void updateTime() {
    }
    
    private final void setListener() {
    }
    
    private final void updateDate() {
    }
}