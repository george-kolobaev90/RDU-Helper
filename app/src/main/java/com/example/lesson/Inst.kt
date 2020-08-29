package com.example.lesson

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_helpful_links.*

class Inst : BaseListViewActivity() {
    override val titlesResId = R.array.instagram_button_titles
    override val urlsResId = R.array.instagram_button_urls

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        rootContainer.setBackgroundResource(R.drawable.zelyanyn)
    }

}