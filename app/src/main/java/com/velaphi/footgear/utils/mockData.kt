package com.velaphi.footgear.utils

import com.velaphi.footgear.R
import com.velaphi.footgear.models.Shoe

fun getMockData(): ArrayList<Shoe> {
    val shoeList: ArrayList<Shoe> = arrayListOf()

    shoeList.add(
        Shoe(
            "Superstar '89",
            "Adidas",
            3,
            "A style icon is remade for younger feet in these adidas Originals Superstar shoes.",
            getRandomImageRes()

        )
    )
    shoeList.add(
        Shoe(
            "NY Classic '07",
            "New Balance",
            4,
            "A style icon is remade for younger feet in these adidas Originals Superstar shoes.",
            getRandomImageRes()

        )
    )
    shoeList.add(
        Shoe(
            "Air Force One",
            "Nike",
            6,
            "A style icon is remade for younger feet in these adidas Originals Superstar shoes.",
            getRandomImageRes()

        )
    )
    shoeList.add(
        Shoe(
            "Jungle Sneaker",
            "Puma",
            6,
            "A style icon is remade for younger feet in these adidas Originals Superstar shoes.",
            getRandomImageRes()

        )
    )
    return shoeList
}

fun getRandomImageRes(): Int {
    val images: MutableList<Int> = ArrayList()
    images.add(R.drawable.ic_shoe1)
    images.add(R.drawable.ic_shoe2)
    images.add(R.drawable.ic_shoe3)
    images.add(R.drawable.ic_shoe4)
    images.add(R.drawable.ic_shoe5)
    images.add(R.drawable.ic_shoe6)
    images.add(R.drawable.ic_shoe7)

    return images.random()
}