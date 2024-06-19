package com.example.fibonache

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class FibonacheRecyclerViewAdapter (var fibonacheNums: List<Int>): RecyclerView.Adapter<FibonacheHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FibonacheHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.fibonache_nums,parent,false)
        return FibonacheHolder(itemView)

    }

    override fun onBindViewHolder(holder: FibonacheHolder, position: Int) {
        holder.tvNumbers.text = fibonacheNums[position].toString()
    }

    override fun getItemCount(): Int {
        return fibonacheNums.size
    }
}
class FibonacheHolder(itemView: View):ViewHolder(itemView){
    var tvNumbers = itemView.findViewById<TextView>(R.id.tvNumbers)

}
