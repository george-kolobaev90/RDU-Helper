package com.georgekolobaev.rduhelper

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.View
import android.view.animation.AccelerateInterpolator

class Helper {

    companion object {

        fun gotoUrl(context: Context, url: String): Boolean {
            val address = Uri.parse(url.toString())
            val openLinkIntent = Intent(Intent.ACTION_VIEW, address)

            return if (openLinkIntent.resolveActivity(context.packageManager) != null) {
                context.startActivity(openLinkIntent)
                true
            } else {
                false
            }
        }


        fun animateAlpha(view: View) {
            view.alpha = 0f
            view
                .animate()
                .setInterpolator(AccelerateInterpolator())
                .alpha(1f)
                .setDuration(1500)
                .setStartDelay(400)
                .start()
        }
    }

}