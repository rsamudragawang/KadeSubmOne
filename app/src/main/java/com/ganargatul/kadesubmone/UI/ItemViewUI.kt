package com.ganargatul.kadesubmone.UI

import android.content.Context
import com.ganargatul.kadesubmone.R
import org.jetbrains.anko.*

class ItemViewUI : AnkoComponent<Context> {
    override fun createView(ui: AnkoContext<Context>)= with(ui) {

            linearLayout {
                lparams(width= matchParent,height = dip(100))
             imageView {
                id= R.id.img_Items
             }.lparams(width=dip(100),height = dip(100)){}
                textView{
                    id=R.id.text_items
                }.lparams(width= matchParent,height = dip(100))

            }

    }
}