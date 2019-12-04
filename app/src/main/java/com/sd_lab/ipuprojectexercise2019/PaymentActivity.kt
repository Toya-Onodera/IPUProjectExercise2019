package com.sd_lab.ipuprojectexercise2019

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_payment.*

class PaymentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        // 支払う
        paymentButton.setOnClickListener {
            Toast.makeText(this, "注文を確定しました", Toast.LENGTH_SHORT).show()

            // TODO: 待機画面に移行する
//            setContentView(R.layout.)
            finish()
        }
    }
}
