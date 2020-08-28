package com.example.lesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_russian_master_navigator.*

class RussianMasterNavigator : BaseChildActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_russian_master_navigator)


        buttoneadc.setOnClickListener {
            Helper.gotoUrl(it.context, getString(R.string.button_link_eadc))
        }

        buttonCompSR.setOnClickListener {
            Helper.gotoUrl(it.context, getString(R.string.button_link_competitions_ro))
        }

        buttonComps.setOnClickListener {
            Helper.gotoUrl(it.context, getString(R.string.button_link_competitions))
        }

        buttonMain.setOnClickListener {
            Helper.gotoUrl(it.context, getString(R.string.button_link_main))
        }

        buttonClas.setOnClickListener {
            Helper.gotoUrl(it.context, getString(R.string.button_link_class_of_dancers))
        }

        buttonDoc.setOnClickListener {
            Helper.gotoUrl(it.context, getString(R.string.button_link_documents))
        }

        buttonForum.setOnClickListener {
            Helper.gotoUrl(it.context, getString(R.string.button_link_documents))
        }

        buttonraiting.setOnClickListener {
            Helper.gotoUrl(it.context, getString(R.string.button_link_raiting))
        }

        buttonSearch.setOnClickListener {
            Helper.gotoUrl(it.context, getString(R.string.button_link_search_partner))
        }

    }
}