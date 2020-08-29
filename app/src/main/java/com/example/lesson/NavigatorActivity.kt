package com.example.lesson

import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_navigator.*

class NavigatorActivity : BaseChildActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigator)

        val titles = resources.getStringArray(R.array.navigator_button_titles)
        val urls = resources.getStringArray(R.array.navigator_button_urls)

        val listAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, titles)
        listOfPages.adapter = listAdapter

        listOfPages.setOnItemClickListener { _, _, position, _ ->
            Helper.gotoUrl(this@NavigatorActivity, urls[position])
        }

    }
}