package com.example.homework1kotlin

import android.app.Activity
import android.view.View
import android.widget.Toast

fun Activity.showMessage(message: String? = "This field cannot be emty",
                         length: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this,message,length)
        .show()
}

fun View.visible(){
    this.visibility = View.VISIBLE
}

fun View.invisible(){
    this.visibility = View.INVISIBLE
}
