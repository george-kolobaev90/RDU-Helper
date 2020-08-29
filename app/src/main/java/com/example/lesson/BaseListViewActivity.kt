package com.example.lesson

import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.lesson.Helper.Companion.gotoUrl
import kotlinx.android.synthetic.main.activity_base_list_view.*

abstract class BaseListViewActivity : BaseChildActivity() {

    protected abstract val titlesResId: Int
    protected abstract val urlsResId: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base_list_view)

        val titles = resources.getStringArray(titlesResId)
        val urls = resources.getStringArray(urlsResId)

        val listAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, titles)
        listOfFederations.adapter = listAdapter

        listOfFederations.setOnItemClickListener { _, _, position, _ ->
            gotoUrl(this@BaseListViewActivity, urls[position])
        }
    }
}