package com.sd_lab.ipuprojectexercise2019

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_selection_main.*


class SelectionMainActivity : AppCompatActivity() {
    private var breadMenuArray: Array<String>? = null
    private var boughtMenuArray: MutableList<String> = mutableListOf()
    private var boughtMenuText: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selection_main)

        breadMenuArray = resources.getStringArray(R.array.bread_menu)

        // メニューをクリックしたときの動作を書く
        breadList.setOnItemClickListener{ parent, v, position, id ->
            boughtMenuArray.add(breadMenuArray!![position])
            boughtMenuText = ""

            boughtMenuArray.forEachIndexed { i, e ->
                boughtMenuText += if (i != 0) ", ${e}" else "${e}"
            }

            buiedText.text = boughtMenuText
        }

        // メニュー確定
        bt_confirmOrder.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("注文を確定してもよろしいでしょうか？")
                .setMessage(boughtMenuText)
                .setPositiveButton("OK", { d, w ->
                    // TODO: 次のアクティビティに飛ばす
                })
                .setNegativeButton("No", { d, w ->
                    // 何もしない
                })
                .show()
        }
    }
}
