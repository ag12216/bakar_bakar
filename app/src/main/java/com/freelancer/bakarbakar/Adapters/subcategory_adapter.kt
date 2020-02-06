package com.freelancer.bakarbakar.Adapters

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import com.freelancer.bakarbakar.R

class subCategoryAdapter(private val context: Activity,private val imageList: ArrayList<Int>): BaseAdapter(){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val inflater = LayoutInflater.from(context)
        val rowView = inflater.inflate(R.layout.subcategory_adapter,null)
        val image = rowView.findViewById(R.id.idImageIcon) as ImageView
        image.setImageResource(imageList[position])
        return rowView
    }

    override fun getItem(position: Int): Any {
        return 0
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return 24
    }

}