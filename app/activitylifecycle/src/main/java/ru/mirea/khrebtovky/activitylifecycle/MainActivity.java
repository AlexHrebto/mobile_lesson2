package ru.mirea.khrebtovky.activitylifecycle;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart()");
    }
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "onRestoreInstanceState()");
    }


    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);
        Log.i(TAG, "onPostCreate()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume()");
    }
    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i(TAG, "onPostResume()");
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.i(TAG, "onAttachedToWindow()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause()");
    }
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.i(TAG, "onSaveInstanceState()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy()");
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.i(TAG, "onDetachedFromWindow()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart()");
    }
}

//Ответы на вопросы:
//1.    После нажатия на кнопку "Home" и возврата в приложение метод `onCreate` не будет вызван в `MainActivity`,
// если приложение осталось в памяти и не было уничтожено системой. Вместо этого будет вызван метод `onResume`,
// так как активность станет снова видимой пользователю.
//2.    Значение поля `EditText` не изменится после нажатия на кнопку "Home" и возврата в приложение,
// если приложение осталось в памяти. Поля ввода, такие как `EditText`,
// сохраняют свое состояние при переходе между активностями или при возврате в приложение из фонового режима.
//3.    Если приложение не было уничтожено системой и осталось в памяти,
// то значение поля `EditText` также не изменится после нажатия на кнопку "Back" и возврата в приложение.
// Поведение будет аналогичным нажатию кнопки "Home".