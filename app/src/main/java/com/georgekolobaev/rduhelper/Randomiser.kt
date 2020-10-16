package com.georgekolobaev.rduhelper

import android.animation.Animator
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnticipateOvershootInterpolator
import kotlinx.android.synthetic.main.activity_randomiser.*

class Randomiser : BaseChildActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_randomiser)

        supportActionBar?.title = getString(R.string.button_text_to_random)

        button_randomise.setOnClickListener {
            rotate()
        }
    }

    private fun rotate() {
        text_randomiser
            .animate()
            .setInterpolator(AnticipateOvershootInterpolator())
            .rotationBy(1080f)
            .setDuration(3500)
            .setStartDelay(400)
            .setListener(object : Animator.AnimatorListener {
                override fun onAnimationStart(p0: Animator?) {
                    button_randomise.isEnabled = false
                    text_randomiser.text = getString(R.string.button_text_randomiser)
                }

                override fun onAnimationEnd(p0: Animator?) {
                    button_randomise.isEnabled = true

                    text_randomiser.text = listOf("СТ", "ЛА").random()
                }

                override fun onAnimationCancel(p0: Animator?) {
                }

                override fun onAnimationRepeat(p0: Animator?) {
                }

            })
            .start()
    }

}