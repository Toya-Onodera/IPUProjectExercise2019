package com.sd_lab.ipuprojectexercise2019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;


import android.os.CountDownTimer;
import android.widget.TextView;
import android.widget.Toast;

public class StatusActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private int percent;
    protected CountDownTimer countDownTimer;
    protected TextView textView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);
        //時間表示
        textView3 = findViewById(R.id.textView3);

        //プロブレスバーの処理
        percent = 0; //

        progressBar = findViewById(R.id.progressBar);
        progressBar.setMax(5);
        progressBar.setProgress(percent);
        progressBar.setMin(0);

        //タイマー処理
        countDownTimer = new CountDownTimer(5000, 1000) {

            // カウントダウン処理
            public void onTick(long millisUntilFinished) {
                int time = (int)(millisUntilFinished / 1000);
                progressBar.setProgress(time);
                textView3.setText(String.valueOf(time) + "秒");
            }

            // カウントが0になった時の処理
            public void onFinish() {
                textView3.setText("準備完了！");
            }

        }.start();



    }



}
