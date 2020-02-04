package com.freelancer.bakarbakar


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import android.widget.ImageView
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.Unbinder
import com.freelancer.bakarbakar.Adapters.screen1_adapter

/**
 * A simple [Fragment] subclass.
 */
class frag_Screen1 : Fragment(),View.OnClickListener {

    @BindView(R.id.idGridList) lateinit var gridList: GridView
    @BindView(R.id.idImageMusic) lateinit var imageGesture: ImageView

    private var unbinder: Unbinder? = null

    lateinit var delegate: backToPage

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.frag__screen1, container, false)
        unbinder = ButterKnife.bind(this,view)

        val adapter = screen1_adapter(activity!!)
        gridList.adapter = adapter

        imageGesture.setOnClickListener(this)
        return view
    }


    override fun onDestroy() {
        super.onDestroy()
        unbinder?.unbind()
    }

    override fun onClick(v: View?) {
        delegate.backToPage("music")
    }

}
