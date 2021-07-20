package com.velaphi.footgear.models

import androidx.databinding.BaseObservable

data class Shoe (
    var name: String ,
    var brand: String,
    var size: Int,
    var description: String,
    var image: Int
): BaseObservable()