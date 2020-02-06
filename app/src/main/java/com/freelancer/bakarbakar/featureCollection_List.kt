package com.freelancer.bakarbakar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import butterknife.BindView
import butterknife.ButterKnife
import com.freelancer.bakarbakar.Adapters.featured_audio

class featureCollection_List : AppCompatActivity() {

    @BindView(R.id.idList) lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_collection__list)

        ButterKnife.bind(this)

        val adapter = featured_audio(this)
        listView.adapter = adapter

    }
}
