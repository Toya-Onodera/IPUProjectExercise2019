package com.sd_lab.ipuprojectexercise2019

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.google.zxing.client.android.Intents

import com.google.zxing.integration.android.IntentIntegrator

import com.google.zxing.integration.android.IntentResult
import kotlinx.android.synthetic.main.activity_qrreader.*
import org.json.JSONException
import org.json.JSONObject


class QRReaderActivity : AppCompatActivity() {

    internal var qrScanIntegrator: IntentIntegrator? = null
    private var tvResultName: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qrreader)

        tvResultName = findViewById(R.id.tvResultText)

        // カメラの起動
        qrScanIntegrator = IntentIntegrator(this)
        qrScanIntegrator?.setOrientationLocked(false)
        qrScanIntegrator?.setBeepEnabled(false)
        qrScanIntegrator?.initiateScan()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        val result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data)

        if (result != null) {
            Toast.makeText(this, result.contents, Toast.LENGTH_LONG).show()

            // TODO: Kotlin には三項演算子がない
            val resultBoolean = if (result.contents == "成功") true else false
            val resultShowText = if (resultBoolean) "選択した商品です" else "選択した商品では\nありません"
            tvResultName?.setText(resultShowText)
        }

        else {
            super.onActivityResult(requestCode, resultCode, data)
        }
    }
}
