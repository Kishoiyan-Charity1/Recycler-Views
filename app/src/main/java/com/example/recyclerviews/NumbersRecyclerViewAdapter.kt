package com.example.recyclerviews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NumbersRecyclerViewAdapter(var numbersList: List<Long>): RecyclerView.Adapter<NumbersViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup,ViewType:Int): NumbersViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.numbers_list_item, parent, false)
        return NumbersViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        holder.tvHome.text= numbersList.get(position).toString()
    }
    override fun getItemCount(): Int {
        return numbersList.size
    }

}
class  NumbersViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvHome= itemView.findViewById<TextView>(R.id.tvHome)
}