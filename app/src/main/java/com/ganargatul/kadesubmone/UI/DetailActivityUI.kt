package com.ganargatul.kadesubmone.UI

import android.view.View
import android.widget.LinearLayout
import androidx.core.view.marginBottom
import com.ganargatul.kadesubmone.DetailActivity
import com.ganargatul.kadesubmone.R
import org.jetbrains.anko.*

class DetailActivityUI : AnkoComponent<DetailActivity> {
    override fun createView(ui: AnkoContext<DetailActivity>): LinearLayout= with(ui) {
        verticalLayout{
            imageView {
                id= R.id.image_detail

            }.lparams(width=dip(100),height = dip(100)){
                bottomMargin=dip(100)
                leftMargin=dip(100)

            }
            textView {
                id=R.id.title_detail
            }.lparams(width=dip(100),height = dip(100)){
                bottomMargin=dip(100)
                leftMargin=dip(100)
            }
            textView {
                id=R.id.desc_detail
            }.lparams(width=dip(100),height = dip(100)){
                bottomMargin=dip(100)
                leftMargin=dip(100)
            }

        }

    }
}