package com.example.recyclerview

import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder


/**
 * Copyright (C) 2016-2022, Allente
 * Project: NGPTV
 * Author:  ggergely
 * Date:    11/15/2022
 */
class MyViewHolder(val itemView: View) : ViewHolder(itemView) {
    val first: TextView = itemView.findViewById(R.id.first)
    val second: TextView = itemView.findViewById(R.id.second)

}