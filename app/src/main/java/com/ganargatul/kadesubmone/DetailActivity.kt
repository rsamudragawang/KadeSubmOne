package com.ganargatul.kadesubmone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.widget.ImageView
import android.widget.TextView
import com.ganargatul.kadesubmone.UI.DetailActivityUI
import com.ganargatul.kadesubmone.model.Items
import com.squareup.picasso.Picasso
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.setContentView
import org.jetbrains.anko.verticalLayout

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        DetailActivityUI().setContentView(this)
        val items= intent.getParcelableExtra<Items>("Data")
        var img = findViewById<ImageView>(R.id.image_detail)
        var name = findViewById<TextView>(R.id.title_detail)
        var desc = findViewById<TextView>(R.id.desc_detail)
        items.image?.let { Picasso.get().load(it).into(img) }
        name.text = items.name
        desc.text=items.description
    }


}
