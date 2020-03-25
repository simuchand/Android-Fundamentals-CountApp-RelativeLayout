package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int start_count=0, prv_count=0;
    private TextView start_ShowCount,prv_ShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start_ShowCount = findViewById(R.id.show_count);
        prv_ShowCount = findViewById(R.id.show_count_prv);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        start_count++;
         prv_count=start_count;
        if(start_ShowCount != null){
            start_ShowCount.setText(Integer.toString(start_count));
        }

    }

    public void countDown(View view) {
        if(start_count == 0){
            prv_ShowCount.setText("0");
            Toast toast1 = Toast.makeText(this,R.string.toast_start, Toast.LENGTH_SHORT);
            toast1.show();
        }
        else if(start_ShowCount != null){
            start_count=0;
            Toast toast1 = Toast.makeText(this,R.string.toast_reset, Toast.LENGTH_SHORT);
            toast1.show();
            prv_ShowCount.setText(Integer.toString(prv_count));
            start_ShowCount.setText("0");
        }


    }
}
