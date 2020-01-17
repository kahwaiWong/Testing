package com.example.testing

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.LinearLayout
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val imageId = arrayOf<Int>(
        R.drawable.image_lipstick2,
        R.drawable.lipstick4,
        R.drawable.image_lipstick3,
        R.drawable.lip1detail
    )

    val imageName = arrayOf<String>(
        "Lipstick 2",
        "Lipstick 4",
        "Lipstick 3",
        "Lipstick 1 detail"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myListAdapter = LipstickAdapter(this,imageId,imageName)
        listView.adapter = myListAdapter

    }
}
