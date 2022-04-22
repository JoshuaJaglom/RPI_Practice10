package com.zhukov.rpi_practice10

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val check = MutableLiveData<Boolean>()

    fun changeValue() {
        check.value = check.value != true
    }
}