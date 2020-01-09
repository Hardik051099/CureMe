package com.app.hardik.cureme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //splash screen to display it for 2 seconds
        val splash = Intent(this@MainActivity,intro::class.java)
        Handler().postDelayed({
            startActivity(splash)
            finish()
        },2000 )//equal to 2 seconds
    }
}
