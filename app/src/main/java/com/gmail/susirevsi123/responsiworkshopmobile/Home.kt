package com.gmail.susirevsi123.responsiworkshopmobile

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    fun data(view: View) {
        val intent = Intent(this@Home, MainActivity::class.java)
        startActivity(intent)
    }

    fun gambar(view: View) {
        val intent = Intent(this@Home, CameraActivity::class.java)
        startActivity(intent)
    }
}
