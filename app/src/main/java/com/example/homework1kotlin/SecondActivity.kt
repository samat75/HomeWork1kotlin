package com.example.homework1kotlin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.homework1kotlin.databinding.ActivityMainBinding
import com.example.homework1kotlin.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var ui: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(ui.root)

        val data: String? = intent.getStringExtra(MainActivity.KEY_RES).toString()
        data?.let { ui.editText2.setText(data) }

        ui.button2.setOnClickListener{
            if (!ui.editText2.text.isNullOrBlank()) {

                setResult(Activity.RESULT_OK, Intent().putExtra(MainActivity.KEY_RES, ui.editText2.text?.toString()))
                finish()
            }else{
                showMessage("Type something in order to send it")
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}