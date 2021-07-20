package com.velaphi.footgear.repository

import com.velaphi.footgear.models.Shoe
import com.velaphi.footgear.utils.getMockData

class Repository {
    fun getShoes(): ArrayList<Shoe> {
        return getMockData()
    }
}