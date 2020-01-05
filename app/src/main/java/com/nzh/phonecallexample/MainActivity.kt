package com.nzh.phonecallexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import android.widget.ImageView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var call:ImageView=findViewById(R.id.img_call_button)
        call.setOnClickListener {
            //First Example
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "09456646762"))
            startActivity(intent)

            //Second Example
            //val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "09456646762"))
            //startActivity(intent)
        }
    }
}
