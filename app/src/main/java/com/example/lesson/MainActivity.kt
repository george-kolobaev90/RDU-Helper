package com.example.lesson

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.view.animation.*
import androidx.appcompat.app.AppCompatActivity
import com.example.lesson.Helper.Companion.animateAlpha
import com.example.lesson.Helper.Companion.gotoUrl
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val musicListId = listOf(
        R.raw.music1,
        R.raw.music2,
        R.raw.music3,
        R.raw.music4
    )

    private val player by lazy {
        MediaPlayer.create(this, musicListId.random())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonWords.setOnClickListener {
            val intent = Intent(this, Popovswords::class.java)
            startActivity(intent)
        }

        buttooninst.setOnClickListener {
            val intent = Intent(this, Inst::class.java)
            startActivity(intent)
        }

        buttoonadd.setOnClickListener {
            val intent = Intent(this, Add::class.java)
            startActivity(intent)
        }

        buttoneadc.setOnClickListener {
            gotoUrl(it.context, getString(R.string.button_link_eadc))
        }

        buttonCompSR.setOnClickListener {
            gotoUrl(it.context, getString(R.string.button_link_competitions_ro))
        }

        buttonComps.setOnClickListener {
            gotoUrl(it.context, getString(R.string.button_link_competitions))
        }

        buttonMain.setOnClickListener {
            gotoUrl(it.context, getString(R.string.button_link_main))
        }

        buttonClas.setOnClickListener {
            gotoUrl(it.context, getString(R.string.button_link_class_of_dancers))
        }

        buttonDoc.setOnClickListener {
            gotoUrl(it.context, getString(R.string.button_link_documents))
        }

        buttonForum.setOnClickListener {
            gotoUrl(it.context, getString(R.string.button_link_documents))
        }

        buttonraiting.setOnClickListener {
            gotoUrl(it.context, getString(R.string.button_link_raiting))
        }

        buttonSearch.setOnClickListener {
            gotoUrl(it.context, getString(R.string.button_link_search_partner))
        }

        listOf(buttonMain, logo, slogan, buttonWords,  buttooninst,  buttoonadd,
            buttoneadc,  buttonCompSR,  buttonComps,  buttonMain,  buttonClas,
            buttonDoc,   buttonForum,  buttonraiting,  buttonSearch).forEach {
            animateAlpha(it)
        }

    }


    override fun onResume() {
        super.onResume()
        logo
            .animate()
            .setInterpolator(AnticipateOvershootInterpolator())
            .rotationBy(360f)
            .setDuration(2500)
            .setStartDelay(400)
            .start()


        player.start()
    }


    override fun onPause() {
        super.onPause()
        player.pause()
    }

    override fun onDestroy() {
        super.onDestroy()
        player.release()
    }

}