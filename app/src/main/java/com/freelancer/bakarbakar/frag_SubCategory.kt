package com.freelancer.bakarbakar


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.Unbinder
import com.freelancer.bakarbakar.Adapters.subCategoryAdapter

/**
 * A simple [Fragment] subclass.
 */
class frag_SubCategory : Fragment() {


    @BindView(R.id.idGridList) lateinit var gridList: GridView

    private var unbinder: Unbinder? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.frag__sub_category, container, false)
        unbinder = ButterKnife.bind(this,view)

        val adapter = subCategoryAdapter(activity!!)
        gridList.adapter = adapter

        return view
    }


    override fun onDestroy() {
        super.onDestroy()
        unbinder?.unbind()
    }

}
