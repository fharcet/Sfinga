package com.example.sfinga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_drugo_vprasanje.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btn_zacetek.setOnClickListener { val prvoVprasanje = Intent (this, PrvoVprasanjeActivity::class.java)
        startActivity(prvoVprasanje)
        }
    }
}
