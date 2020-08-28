package com.example.lesson

import android.os.Bundle
import com.example.lesson.Helper.Companion.gotoUrl
import kotlinx.android.synthetic.main.activity_inst.*

class Inst : BaseChildActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inst)

        dancersUnderstand.setOnClickListener {
            gotoUrl(it.context, getString(R.string.button_link_dancersunderstand))
        }

        fk_dancesport.setOnClickListener {
            gotoUrl(it.context, getString(R.string.button_link_fk_dancesport_1))
        }

        QuickDanceSport.setOnClickListener {
            gotoUrl(it.context, getString(R.string.button_link_QuickDancePhoto))
        }

        ballroomPhoto.setOnClickListener {
            gotoUrl(it.context, getString(R.string.button_link_ballroomphoto))
        }

        ballroomPhoto.setOnClickListener {
            gotoUrl(it.context, getString(R.string.button_link_ballroomphoto))
        }
    }
}