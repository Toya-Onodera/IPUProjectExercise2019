package com.sd_lab.ipuprojectexercise2019

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 商品選択画面へ
        goItemPageButton.setOnClickListener {
            val intent = Intent(this, SelectionMainActivity::class.java)
            startActivity(intent)
        }

        // 支払画面へ
        goPaymentPageButton.setOnClickListener {
            val intent = Intent(this, PaymentActivity::class.java)
            startActivity(intent)
        }

        // 商品準備状況確認画面へ
        goProgressPageButton.setOnClickListener {
            val intent = Intent(this, StatusActivity::class.java)
            startActivity(intent)
        }

        // QR サンプル表示画面へ
        goSamplePageButton.setOnClickListener {
            val intent = Intent(this, QRImageViewActivity::class.java)
            startActivity(intent)
        }

        // QR での商品識別画面へ
        goQRItemSelectPageButton.setOnClickListener {
            val intent = Intent(this, QRReaderActivity::class.java)
            startActivity(intent)
        }
    }
}
