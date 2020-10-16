package com.georgekolobaev.rduhelper

import android.os.Bundle
import com.georgekolobaev.rduhelper.Helper.Companion.gotoUrl
import kotlinx.android.synthetic.main.activity_r_d_u.*

class Add : BaseChildActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_r_d_u)

        supportActionBar?.title = getString(R.string.button_text_image_studio)

        chursina.setOnClickListener {
            val gotoUrl = gotoUrl(it.context, getString(R.string.button_link_chursina))
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