package com.freelancer.bakarbakar.Adapters

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import com.freelancer.bakarbakar.R

class featured_audio(private val context: Activity,private val holder: Boolean = false): BaseAdapter(){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val inflater = LayoutInflater.from(context)
        val rowView = inflater.inflate(R.layout.featured_audio_adapter,null)
        if (holder){
            val image = rowView.findViewById(R.id.idImageHolder) as ImageView
            image.setImageResource(R.drawable.image_break_cell)
        }
        return rowView
    }

    override fun getItem(position: Int): Any {
        return 0
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return 20
    }

}