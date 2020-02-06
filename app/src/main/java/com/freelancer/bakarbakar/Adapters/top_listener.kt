package com.freelancer.bakarbakar.Adapters

import android.app.Activity
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.freelancer.bakarbakar.R


class top_Listener(private val context: Activity): RecyclerView.Adapter<top_Listener.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val rowView = inflater.inflate(R.layout.top_listener_adapter,parent,false)

        return ViewHolder(rowView)
    }

    override fun getItemCount(): Int {
        return 20
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(
        itemView) {
        val image = itemView.findViewById(R.id.idProfileImage) as ImageView
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        if(position%2==0){
            val img = R.drawable.right_bean_big
            holder.image.setImageResource(img)
        }
        else{
            val img = R.drawable.left_bean
            holder.image.setImageResource(img)
        }
    }


}