package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mcount=0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mcount++;
        if(mShowCount != null)
            mShowCount.setText(Integer.toString(mcount));
    }

    public void countDown(View view) {
        if(mcount == 0){
            Toast toast1 = Toast.makeText(this,R.string.toast_start, Toast.LENGTH_SHORT);
            toast1.show();
        }
        else if(mShowCount != null){
            mcount=0;
            Toast toast1 = Toast.makeText(this,R.string.toast_reset, Toast.LENGTH_SHORT);
            toast1.show();
            mShowCount.setText("0");
        }


    }
}
