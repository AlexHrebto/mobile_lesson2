package ru.mirea.khrebtovky.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickShowDialog(View view) {
        MyDialogFragment dialogFragment = new MyDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "mirea");
    }
    public void onClickShowTime(View view) {
        MyTimeDialogFragment dialogFragment = new MyTimeDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "showTime");
    }
    public void onClickShowDate(View view) {
        MyDateDialogFragment dialogFragment = new MyDateDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "showDate");
    }
    public void onClickShowProgress(View view) {
        MyProgressDialogFragment dialogFragment = new MyProgressDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "showProgress");
    }
    public void onOkClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Иду дальше\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Нет\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"На паузе\"!",
                Toast.LENGTH_LONG).show();
    }
}