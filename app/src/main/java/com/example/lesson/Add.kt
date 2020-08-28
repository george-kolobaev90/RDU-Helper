package com.example.lesson

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.lesson.Helper.Companion.gotoUrl
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_r_d_u.*

class Add : BaseChildActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_r_d_u)

        chursina.setOnClickListener {
            gotoUrl(it.context, getString(R.string.button_link_chursina))
        }

        academy.setOnClickListener {
            gotoUrl(it.context, getString(R.string.button_link_academy))
        }

        artfly.setOnClickListener {
            gotoUrl(it.context, getString(R.string.button_link_artfly))
        }

        maximum.setOnClickListener {
            gotoUrl(it.context, getString(R.string.button_link_maximum))
        }
    }
}