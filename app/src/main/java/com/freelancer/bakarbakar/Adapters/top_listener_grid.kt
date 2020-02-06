package com.freelancer.bakarbakar.Adapters

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import com.freelancer.bakarbakar.R

class top_listener_grid(private val context: Activity): BaseAdapter(){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val inflater = LayoutInflater.from(context)
        val rowView = inflater.inflate(R.layout.top_listener_adapter,null)
        val label = rowView.findViewById(R.id.idParent) as LinearLayout
        label.setBackgroundColor(ContextCompat.getColor(context,R.color.colorWhite))
        return rowView
    }

    override fun getItem(position: Int): Any {
        return 0
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return 100
    }

}