package com.example.rduhelper

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_base_list_view.*

class NavigatorActivity : BaseListViewActivity() {
    override val titlesResId = R.array.navigator_button_titles
    override val urlsResId = R.array.navigator_button_urls

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        rootContainer.setBackgroundResource(R.drawable.brovko)

        supportActionBar?.title = getString(R.string.button_text_russian_master)
    }
}