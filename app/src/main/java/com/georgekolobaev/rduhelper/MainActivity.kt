package com.georgekolobaev.rduhelper

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.animation.AnticipateOvershootInterpolator
import androidx.appcompat.app.AppCompatActivity
import com.google.android.play.core.review.ReviewManagerFactory
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
/*

    override fun onStart() {
        super.onStart()
        rotateLogo()
    }
*/

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_funcs, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.button_share -> {
                shareApp()
                return true
            }
            R.id.button_feedback -> {
                Helper.gotoUrl(this, getAppGooglePlayUrl())
//                showAppFeedback()
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
/*

    private fun rotateLogo() {
        logo
            .animate()
            .setInterpolator(AnticipateOvershootInterpolator())
            .rotationBy(360f)
            .setDuration(2500)
            .setStartDelay(400)
            .start()
    }
*/

    private fun showAppFeedback() {
        val manager = ReviewManagerFactory.create(this)

        val request = manager.requestReviewFlow()
        request.addOnCompleteListener { request ->
            if (request.isSuccessful) {
                val reviewInfo = request.result

                val flow = manager.launchReviewFlow(this, reviewInfo)
                flow.addOnCompleteListener { _ ->
                    // The flow has finished. The API does not indicate whether the user
                    // reviewed or not, or even whether the review dialog was shown. Thus, no
                    // matter the result, we continue our app flow.
                }
            } else {
                // There was some problem, continue regardless of the result.
                Helper.gotoUrl(this, getAppGooglePlayUrl())
            }
        }
    }

}