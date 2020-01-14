package com.example.sfinga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_drugo_vprasanje.*

class PrvoVprasanjeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prvo_vprasanje)
        imageView.setImageResource(R.drawable.sfinga)
    }
}
