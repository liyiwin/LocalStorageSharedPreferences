package com.example.localstoragesharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_show.*

class ShowActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show)

        val pref = sharedPreference(this)
         textView.setText("${pref.getName()}")
    }
}
