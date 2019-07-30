package com.gmail.susirevsi123.responsiworkshopmobile

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView

class CameraActivity : AppCompatActivity() {

    private var btCamera: Button? = null
    private var ivCamera: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)

        btCamera = findViewById<View>(R.id.bt_camera) as Button
        ivCamera = findViewById<View>(R.id.iv_camera) as ImageView

        btCamera!!.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent, CAMERA_REQUEST_CODE)
        }
    }

    public override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            CAMERA_REQUEST_CODE -> if (resultCode == Activity.RESULT_OK) {
                val bitmap: Bitmap
                bitmap = data!!.extras!!.get("data") as Bitmap
                ivCamera!!.setImageBitmap(bitmap)
            }
        }
    }

    companion object {
        private val TAG = CameraActivity::class.java!!.getSimpleName()
        private val CAMERA_REQUEST_CODE = 7777
    }
}
