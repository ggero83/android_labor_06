package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


/**
 * Copyright (C) 2016-2022, Allente
 * Project: NGPTV
 * Author:  ggergely
 * Date:    11/15/2022
 */
class MyAdapter(private val list: List<MyItem>): RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.first.text = list[position].first
        holder.second.text = list[position].second
    }

    override fun getItemCount(): Int {
        return list.size
    }
}