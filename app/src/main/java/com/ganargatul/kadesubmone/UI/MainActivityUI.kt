package com.ganargatul.kadesubmone.UI

import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.ganargatul.kadesubmone.MainActivity
import com.ganargatul.kadesubmone.R
import com.ganargatul.kadesubmone.adapter.Adapter
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView

class MainActivityUI(private val mAdapter: Adapter) : AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>): LinearLayout = with(ui) {
       return verticalLayout{
            padding = dip(16)
            recyclerView {
                lparams(width = matchParent, height = wrapContent)
                layoutManager = LinearLayoutManager(ctx)
                adapter= mAdapter
            }

        }
    }
}