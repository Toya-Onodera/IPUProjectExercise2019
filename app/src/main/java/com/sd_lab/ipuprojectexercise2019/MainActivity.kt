package com.sd_lab.ipuprojectexercise2019

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.google.zxing.integration.android.IntentIntegrator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 商品選択画面へ
        goItemPageButton.setOnClickListener {
            Toast.makeText(this, "01", Toast.LENGTH_SHORT).show()
        }

        // 支払画面へ
        goPaymentPageButton.setOnClickListener {
            Toast.makeText(this, "02", Toast.LENGTH_SHORT).show()
        }

        // 商品準備状況確認画面へ
        goSamplePageButton.setOnClickListener {
            val intent = Intent(this, QRImageViewActivity::class.java)
            startActivity(intent)
        }

        // 商品準備状況確認画面へ
        goProgressPageButton.setOnClickListener {
            Toast.makeText(this, "03", Toast.LENGTH_SHORT).show()
        }

        // QR での商品識別画面へ
        goQRItemSelectPageButton.setOnClickListener {
//            IntentIntegrator(this).initiateScan()
            val intent = Intent(this, QRReaderActivity::class.java)
            startActivity(intent)
//            Toast.makeText(this, "04", Toast.LENGTH_SHORT).show()

//            try {
//                val integrator = IntentIntegrator(this)
//                integrator.setCameraId(0)
//                integrator.setBeepEnabled(false)
//                integrator.setBarcodeImageEnabled(true)
//                integrator.initiateScan()
//            }
//
//            catch (e: Exception) {
//                Log.d("Error:", e.toString())
//            }
        }
    }
}
