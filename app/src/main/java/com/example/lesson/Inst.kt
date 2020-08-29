package com.example.lesson

import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.lesson.Helper.Companion.gotoUrl
import kotlinx.android.synthetic.main.activity_helpful_links.*
import kotlinx.android.synthetic.main.activity_inst.*

class Inst : BaseChildActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inst)


        val titles = resources.getStringArray(R.array.instagram_button_titles)
        val urls = resources.getStringArray(R.array.instagram_button_urls)

        val listAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, titles)
        listOfInstagrams.adapter = listAdapter

        listOfInstagrams.setOnItemClickListener { _, _, position, _ ->
            gotoUrl(this@Inst, urls[position])
        }

    }
}