package com.sd_lab.ipuprojectexercise2019.selection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.sd_lab.ipuprojectexercise2019.R

class SelectionMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selection_main)

        val listView = findViewById<ListView>(R.id.lvAll)
    }
}
