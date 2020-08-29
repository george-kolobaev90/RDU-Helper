package com.example.lesson

import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.lesson.Helper.Companion.gotoUrl
import kotlinx.android.synthetic.main.activity_helpful_links.*

class HelpfulLinks : BaseChildActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_helpful_links)

        val titles = resources.getStringArray(R.array.federations_button_titles)
        val urls = resources.getStringArray(R.array.federations_button_urls)

        val listAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, titles)
        listOfFederations.adapter = listAdapter

        listOfFederations.setOnItemClickListener { _, _, position, _ ->
            gotoUrl(this@HelpfulLinks, urls[position])
        }
    }
}