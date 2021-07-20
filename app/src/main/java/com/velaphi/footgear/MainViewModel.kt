package com.velaphi.footgear

import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import androidx.databinding.BindingAdapter
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import com.velaphi.footgear.models.Shoe
import com.velaphi.footgear.repository.Repository
import com.velaphi.footgear.utils.getRandomImageRes

class MainViewModel : ViewModel() {

    private val _shoes = MutableLiveData<ArrayList<Shoe>>()

    val shoes: LiveData<ArrayList<Shoe>>
        get() = _shoes

    fun addShoe(v: View, shoe: Shoe) {
        shoe.image = getRandomImageRes()
        _shoes.value?.add(shoe)
        navigateUp(v)
    }

    init {
        getShoes()
    }

    fun getShoes() {
        _shoes.value = Repository().getShoes()
    }

    fun navigateUp(v: View) {
        v.findNavController().navigateUp()
    }
}
