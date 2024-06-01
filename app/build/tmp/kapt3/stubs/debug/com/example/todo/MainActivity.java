package com.example.todo;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0019J\u0012\u0010\u001d\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\u000e\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&J\b\u0010\'\u001a\u00020\u0019H\u0002J-\u0010(\u001a\u00020\u0019*\u00020)2!\u0010*\u001a\u001d\u0012\u0013\u0012\u00110,\u00a2\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u00190+R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lcom/example/todo/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/example/todo/TodoAdapter;", "getAdapter", "()Lcom/example/todo/TodoAdapter;", "setAdapter", "(Lcom/example/todo/TodoAdapter;)V", "binding", "Lcom/example/todo/databinding/ActivityMainBinding;", "getBinding", "()Lcom/example/todo/databinding/ActivityMainBinding;", "setBinding", "(Lcom/example/todo/databinding/ActivityMainBinding;)V", "db", "Lcom/example/todo/AppDatabase;", "getDb", "()Lcom/example/todo/AppDatabase;", "db$delegate", "Lkotlin/Lazy;", "list", "Ljava/util/ArrayList;", "Lcom/example/todo/TodoModel;", "displayTodo", "", "newText", "", "initSwipe", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "openNewTask", "view", "Landroid/view/View;", "setupRecyclerView", "initItemClick", "Landroidx/recyclerview/widget/RecyclerView;", "onItemClick", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "position", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    public com.example.todo.databinding.ActivityMainBinding binding;
    public com.example.todo.TodoAdapter adapter;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<com.example.todo.TodoModel> list = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy db$delegate = null;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.todo.databinding.ActivityMainBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    com.example.todo.databinding.ActivityMainBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.todo.TodoAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull
    com.example.todo.TodoAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.todo.AppDatabase getDb() {
        return null;
    }
    
    private final void setupRecyclerView() {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public final void initSwipe() {
    }
    
    public final void initItemClick(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView $this$initItemClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onItemClick) {
    }
    
    @java.lang.Override
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull
    android.view.Menu menu) {
        return false;
    }
    
    public final void displayTodo(@org.jetbrains.annotations.NotNull
    java.lang.String newText) {
    }
    
    public final void openNewTask(@org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
}