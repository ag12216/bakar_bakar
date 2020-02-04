package com.freelancer.bakarbakar


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import butterknife.ButterKnife
import butterknife.Unbinder

/**
 * A simple [Fragment] subclass.
 */
class frag_playBack : Fragment() {

    private var unbinder: Unbinder? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_frag_play_back, container, false)
        unbinder = ButterKnife.bind(this,view)
        return view
    }

    override fun onDestroy() {
        super.onDestroy()
        unbinder?.unbind()
    }

}
