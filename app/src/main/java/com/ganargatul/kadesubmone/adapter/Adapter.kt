package com.ganargatul.kadesubmone.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ganargatul.kadesubmone.R
import com.ganargatul.kadesubmone.UI.ItemViewUI
import com.ganargatul.kadesubmone.model.Items
import com.squareup.picasso.Picasso
import org.jetbrains.anko.AnkoContext

class Adapter(private  val context: Context,private val Items: List<Items>,private val listener: (Items) -> Unit) :
    RecyclerView.Adapter<Adapter.ViewHolder>() {
    class ViewHolder(view: View):RecyclerView.ViewHolder(view) {
        private val img = view.findViewById<ImageView>(R.id.img_Items)
        private val name = view.findViewById<TextView>(R.id.text_items)

        fun bindItem(items: Items,listener: (Items) -> Unit){
            name.text = items.name
            items.image?.let { Picasso.get().load(it).into(img) }
            itemView.setOnClickListener { listener(items) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(ItemViewUI().createView(
        AnkoContext.create(parent.context)))
    override fun getItemCount(): Int = Items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(Items[position], listener)
    }


}