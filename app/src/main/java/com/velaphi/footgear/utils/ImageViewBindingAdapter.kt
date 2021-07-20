package com.velaphi.footgear.utils

import android.graphics.drawable.Drawable
import androidx.appcompat.widget.AppCompatImageView
import androidx.databinding.BindingAdapter

class ImageViewBindingAdapter {

    @BindingAdapter("imageResource")
    fun setImageDrawable(view: AppCompatImageView, drawable: Drawable?) {
        view.setImageDrawable(drawable)
    }

}