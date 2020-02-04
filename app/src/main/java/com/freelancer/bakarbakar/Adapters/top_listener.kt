package com.freelancer.bakarbakar.Adapters

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.recyclerview.widget.RecyclerView
import com.freelancer.bakarbakar.R


class top_Listener(private val context: Activity): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val rowView = inflater.inflate(R.layout.top_listener_adapter,parent,false)
        return ViewHolder(rowView)
    }

    override fun getItemCount(): Int {
        return 20
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val title = 10
    }

    class ViewHolder(itemView: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(
        itemView) {

    }

//    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
//        val inflater = LayoutInflater.from(context)
//        var rowView = inflater.inflate(R.layout.top_listener_adapter,null)
//
//        return rowView
//    }
//
//    override fun getItem(position: Int): Any {
//        return 0
//    }
//
//    override fun getItemId(position: Int): Long {
//       return 0
//    }
//
//    override fun getCount(): Int {
//        return 20
//    }


}