package com.georgekolobaev.rduhelper

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle

class Popovswords : BaseChildActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popovswords)

        val pt = DrawPoint()
        pt.position.set(10, 20)

        val line = DrawLine()
        line.position.set(10, 20)
        line.endPosition.set(100, 200)

        val rect = DrawLine()
        rect.position.set(10, 20)
        rect.endPosition.set(100, 200)

        listOf(pt, line, rect).forEach {
            it.draw()
        }
    }


    private fun showText() {
        openUrl("hello", 123)
        openUrl("hello world", 1234)
    }

    private fun openUrl(url: String, number: Int) {
        val image = BitmapFactory.decodeResource(resources, R.drawable.logo2)
        showImage(image)
    }

    private fun showImage(image: Bitmap) {

    }

}