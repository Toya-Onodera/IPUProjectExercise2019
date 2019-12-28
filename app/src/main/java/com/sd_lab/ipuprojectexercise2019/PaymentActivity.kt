package com.sd_lab.ipuprojectexercise2019

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_payment.*

class PaymentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        // ListView に格納するために変換する
        val convertBoughtArray: List<String> = intent.getStringExtra("boughtMenu").split(",").map { it.trim() }
        val arrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, convertBoughtArray)
        lvChooseItems.adapter = arrayAdapter

        // 支払う
        paymentButton.setOnClickListener {
            Toast.makeText(this, "注文を確定しました", Toast.LENGTH_SHORT).show()

            // TODO: 待機画面に移行する
            val intent = Intent(this, StatusActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
