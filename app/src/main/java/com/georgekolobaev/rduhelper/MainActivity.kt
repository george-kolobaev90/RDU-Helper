package com.georgekolobaev.rduhelper

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.animation.AnticipateOvershootInterpolator
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buttonToRandomiser.setOnClickListener {
            val intent = Intent(this, Randomiser::class.java)
            startActivity(intent)
        }


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
            val intent = Intent(this, Federations::class.java)
            startActivity(intent)
        }

        buttonYoutube.setOnClickListener {
            val intent = Intent(this, YoutubeActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.button_share -> {
                shareApp()
                return true
            }
            R.id.button_feedback -> {
                Helper.gotoUrl(this, getAppGooglePlayUrl())
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun shareApp() {
        val shareIntent = Intent().apply {
            action = Intent.ACTION_SEND
            type = "text/plain"
            putExtra(Intent.EXTRA_TEXT, getAppGooglePlayUrl())
        }

        startActivity(
            Intent.createChooser(
                shareIntent,
                getString(R.string.button_text_share_title)
            )
        )
    }

    private fun getAppGooglePlayUrl() =
        getString(R.string.play_store_app_link, packageName)

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_funcs, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onStart() {
        super.onStart()
        logo
            .animate()
            .setInterpolator(AnticipateOvershootInterpolator())
            .rotationBy(360f)
            .setDuration(2500)
            .setStartDelay(400)
            .start()
    }

}