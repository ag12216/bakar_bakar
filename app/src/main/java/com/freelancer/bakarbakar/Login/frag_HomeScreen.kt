package com.freelancer.bakarbakar.Login

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.Unbinder
import com.freelancer.bakarbakar.Adapters.featured_audio
import com.freelancer.bakarbakar.Adapters.top_Listener

import com.freelancer.bakarbakar.R
import com.takusemba.multisnaprecyclerview.MultiSnapRecyclerView


class frag_HomeScreen : Fragment() {

    @BindView(R.id.idHorizontalList) lateinit var collectionView: MultiSnapRecyclerView
    @BindView(R.id.idListView) lateinit var tableView: ListView

    private var unbinder: Unbinder? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_frag__home_screen, container, false)
        unbinder = ButterKnife.bind(this,view)

        val adapter = top_Listener(activity!!)
        val firstManager = LinearLayoutManager(activity!!, LinearLayoutManager.HORIZONTAL, false)
        collectionView.layoutManager = firstManager
        collectionView.adapter = adapter


        val adapterList = featured_audio(activity!!)
        tableView.adapter = adapterList


        return view
    }

    override fun onDestroy() {
        super.onDestroy()
        unbinder?.unbind()
    }


}
