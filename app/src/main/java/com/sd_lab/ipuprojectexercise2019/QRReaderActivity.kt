package com.sd_lab.ipuprojectexercise2019

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.zxing.integration.android.IntentIntegrator

class QRReaderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qrreader)

        // カメラの起動
//        IntentIntegrator(this@QRReaderActivity).initiateScan()
    }
}
