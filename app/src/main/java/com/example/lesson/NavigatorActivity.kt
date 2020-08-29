package com.example.lesson

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_helpful_links.*

class NavigatorActivity : BaseListViewActivity() {
    override val titlesResId = R.array.navigator_button_titles
    override val urlsResId = R.array.navigator_button_urls

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        rootContainer.setBackgroundResource(R.drawable.brovko)
    }
}