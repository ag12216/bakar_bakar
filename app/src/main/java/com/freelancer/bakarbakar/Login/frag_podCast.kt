package com.freelancer.bakarbakar.Login


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.TouchDelegate
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.Unbinder
import com.freelancer.bakarbakar.Adapters.featured_audio

import com.freelancer.bakarbakar.R
import com.freelancer.bakarbakar.backToPage

/**
 * A simple [Fragment] subclass.
 */
class frag_podCast : Fragment() {

    @BindView(R.id.idListView) lateinit var lisView: ListView

    private var unbinder: Unbinder? = null
    lateinit var delegate: backToPage

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.frag_pod_cast, container, false)
        unbinder = ButterKnife.bind(this,view)

        val adapter = featured_audio(activity!!,true)
        lisView.adapter = adapter

        return view
    }

    override fun onResume() {
        super.onResume()
        delegate.updateTitle("music")
    }

    override fun onDestroy() {
        super.onDestroy()
        unbinder?.unbind()
    }

}
