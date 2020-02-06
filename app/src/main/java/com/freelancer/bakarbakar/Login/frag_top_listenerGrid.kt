package com.freelancer.bakarbakar.Login


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.Unbinder
import com.freelancer.bakarbakar.Adapters.top_Listener
import com.freelancer.bakarbakar.Adapters.top_listener_grid

import com.freelancer.bakarbakar.R


class frag_top_listenerGrid : AppCompatActivity() {

    @BindView(R.id.idGridList) lateinit var gridItems: GridView

//    private var unbinder: Unbinder? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.frag_top_listener_grid)

        ButterKnife.bind(this)

        val adapter = top_listener_grid(this)
        gridItems.adapter = adapter

    }

//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment\
//        val view = inflater.inflate(R.layout.frag_top_listener_grid, container, false)
//        unbinder = ButterKnife.bind(this,view)
//
//        val adapter = top_listener_grid(this)
//        gridItems.adapter = adapter
//
//        return view
//    }


}
