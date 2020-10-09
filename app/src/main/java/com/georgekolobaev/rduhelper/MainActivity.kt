package com.georgekolobaev.rduhelper

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnticipateOvershootInterpolator
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
//
//    private val musicListId = listOf(
//        R.raw.music1,
//        R.raw.music2,
//        R.raw.music3,
//        R.raw.music4
//    )
//
//    private val player by lazy {
//        MediaPlayer.create(this, musicListId.random())
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonShare.setOnClickListener {
            val shareIntent = Intent().apply {
                action = Intent.ACTION_SEND
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, getString(R.string.button_link_app))
            }
            startActivity(Intent.createChooser(shareIntent, getString(R.string.button_text_share_title)))
        }

//
//        buttonWords.setOnClickListener {
//            val intent = Intent(this, Popovswords::class.java)
//            startActivity(intent)
//        }
//
//        buttonToNavigator.setOnClickListener {
//            showNavigator()
////            val intent = Intent(this, RussianMasterNavigator::class.java)
////            startActivity(intent)
//        }

        buttonToNavigator.setOnClickListener {
            val intent = Intent(this, NavigatorActivity::class.java)
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

        buttonHelper.setOnClickListener {
            val intent = Intent(this, HelpfulLinks::class.java)
            startActivity(intent)
        }

        buttonYoutube.setOnClickListener {
            val intent = Intent(this, YoutubeActivity::class.java)
            startActivity(intent)
        }

//
//        listOf(buttonMain, logo, slogan, buttonWords,  buttooninst,  buttoonadd,
//            buttoneadc,  buttonCompSR,  buttonComps,  buttonMain,  buttonClas,
//            buttonDoc,   buttonForum,  buttonraiting,  buttonSearch).forEach {
//            animateAlpha(it)
//        }

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

//        player.start()
    }

//
//    override fun onPause() {
//        super.onPause()
//        player.pause()
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        player.release()
//    }


}