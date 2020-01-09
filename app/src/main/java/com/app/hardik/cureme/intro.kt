package com.app.hardik.cureme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class intro : AppCompatActivity() {
    //globally declaring
lateinit var login : Button
lateinit var signup : Button
    fun login (view: View){

    }
    fun signup (view: View) {

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        //assigning ids
        login = findViewById(R.id.login)
        signup = findViewById(R.id.login)
    }
}
