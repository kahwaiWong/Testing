package com.example.testing

import android.app.Activity
import android.content.Context
import android.widget.TextView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView


class LipstickAdapter (private val context: Activity, private val imgid: Array<Int>, private val imgname: Array<String>)
    :ArrayAdapter<String>(context,R.layout.custom_list,imgname){

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.custom_list,null,true)

        val imageView = rowView.findViewById(R.id.icon) as ImageView
        val subtitleText = rowView.findViewById(R.id.name) as TextView

        imageView.setImageResource(imgid[position])
        subtitleText.text = imgname[position]

        return rowView
    }
}