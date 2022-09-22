package com.example.groceryapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.groceryapp.GroceryRepository

class GroceryViewModalFactory (private val repository: GroceryRepository) : ViewModelProvider.NewInstanceFactory() {

    override fun <T: ViewModel> create(modelClass: Class<T>):T{
        return GroceryViewModal(repository) as T
    }
}