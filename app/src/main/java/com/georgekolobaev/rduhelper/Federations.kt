package com.georgekolobaev.rduhelper

import android.os.Bundle

class Federations : BaseListViewActivity() {
    override val titlesResId = R.array.federations_button_titles
    override val urlsResId = R.array.federations_button_urls

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.title = getString(R.string.button_text_useful_links)
    }
}