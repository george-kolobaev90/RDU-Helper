package com.example.lesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class YoutubeActivity : BaseListViewActivity() {
    override val titlesResId: Int
        get() = TODO("Not yet implemented")
    override val urlsResId: Int
        get() = TODO("Not yet implemented")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)

        supportActionBar?.title = getString(R.string.button_text_instagram)
    }
}