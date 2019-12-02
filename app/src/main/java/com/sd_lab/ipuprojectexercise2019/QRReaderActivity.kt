package com.sd_lab.ipuprojectexercise2019

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.zxing.client.android.Intents

import com.google.zxing.integration.android.IntentIntegrator

import com.google.zxing.integration.android.IntentResult
import kotlinx.android.synthetic.main.activity_qrreader.*
import org.json.JSONException
import org.json.JSONObject


class QRReaderActivity : AppCompatActivity() {

    internal var qrScanIntegrator: IntentIntegrator? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qrreader)

        // カメラの起動
        qrScanIntegrator = IntentIntegrator(this)
        qrScanIntegrator?.setOrientationLocked(false)
        qrScanIntegrator?.initiateScan()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        val result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data)

        if (result != null) {
            // TODO: Kotlin には三項演算子がない
            val resultStr = if (result.contents == "成功") true else false

            // 利用者が購入したパン (QRコード) の場合
            if (resultStr) {
                // TODO: リザルト画面のアクティビティを表示する
                Toast.makeText(this, "成功", Toast.LENGTH_LONG).show()
            }
        }

        else {
            super.onActivityResult(requestCode, resultCode, data)
        }
    }
}
