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
        //IntentIntegrator(this).initiateScan()
        qrScanIntegrator = IntentIntegrator(this)
//        qrScanIntegrator?.setOrientationLocked(false)

        qrReaderButton.setOnClickListener {
//            Log.d("TEST", qrScanIntegrator.toString());
            qrScanIntegrator?.initiateScan()
        }
    }

//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        val result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data)
//
//        if (result != null) {
//            if (result.contents == null) {
//                Toast.makeText(this, result.contents, Toast.LENGTH_LONG).show()
//            } else {
//                // If QRCode contains data.
//                try {
//                    // Converting the data to json format
//                    val obj = JSONObject(result.contents)
//
//                } catch (e: JSONException) {
//                    e.printStackTrace()
//
//
//                }
//
//            }
//        } else {
//            super.onActivityResult(requestCode, resultCode, data)
//        }
//    }
}
