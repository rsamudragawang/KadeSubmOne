package com.ganargatul.kadesubmone

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import com.ganargatul.kadesubmone.UI.MainActivityUI
import com.ganargatul.kadesubmone.adapter.Adapter
import com.ganargatul.kadesubmone.model.Items
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView

class MainActivity : AppCompatActivity() {
    private var items: MutableList<Items> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initdata()

    }

    @SuppressLint("Recycle")
    private fun initdata() {
        val name = resources.getStringArray(R.array.name_league)
        val description = resources.getStringArray(R.array.description)
        val image = resources.obtainTypedArray(R.array.photo_league)
        val adapter = Adapter(applicationContext,items){
//            val toast = Toast.makeText(applicationContext, it.name, Toast.LENGTH_SHORT)
//            toast.show()
            var nowItems = Items(it.name,it.description,it.image)
            var bundle = Bundle()
            startActivity<DetailActivity>("Data" to nowItems)
        }
        items.clear()
        for (i in name.indices){
            items.add(Items(name[i],description [i],image.getResourceId(i,0)))
        }
        MainActivityUI(adapter).setContentView(this)


    }

}
