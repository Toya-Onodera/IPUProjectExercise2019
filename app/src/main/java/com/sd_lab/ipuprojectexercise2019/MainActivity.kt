package com.sd_lab.ipuprojectexercise2019

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
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
        goProgressPageButton.setOnClickListener {
            Toast.makeText(this, "03", Toast.LENGTH_SHORT).show()
        }

        // QR での商品識別画面へ
        goQRItemSelectPageButton.setOnClickListener {
            Toast.makeText(this, "04", Toast.LENGTH_SHORT).show()
        }
    }
}