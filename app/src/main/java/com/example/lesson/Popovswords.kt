package com.example.lesson

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle

class Popovswords : BaseChildActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popovswords)

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