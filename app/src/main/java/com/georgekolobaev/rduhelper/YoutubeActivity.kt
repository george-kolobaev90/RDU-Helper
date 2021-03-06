package com.georgekolobaev.rduhelper

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_base_list_view.*

class YoutubeActivity : BaseListViewActivity() {
    override val titlesResId = R.array.youtube_button_titles
    override val urlsResId = R.array.youtube_button_urls


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        rootContainer.setBackgroundResource(R.drawable.slava1)

        supportActionBar?.title = getString(R.string.button_text_youtube)
    }
}