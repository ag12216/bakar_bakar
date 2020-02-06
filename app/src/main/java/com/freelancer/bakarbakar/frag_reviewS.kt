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
class frag_reviewS : Fragment() {

    private var unbinder: Unbinder? = null
    lateinit var delegate: backToPage

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout._frag_review_s, container, false)
        unbinder = ButterKnife.bind(this,view)
        return view
    }

    override fun onResume() {
        super.onResume()
        delegate.updateTitle("review")
    }

    override fun onDestroy() {
        super.onDestroy()
        unbinder?.unbind()
    }


}
