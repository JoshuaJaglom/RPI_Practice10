package com.zhukov.practice3_6

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {
    val currentColor: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }

    fun onClickBtn(color : Int){
        currentColor.value = color
    }

    companion object {
        @Volatile
        private var INSTANCE: MainViewModel? = null

        fun getMyViewModel(): MainViewModel {
            return INSTANCE ?: synchronized(this){
                val instance = MainViewModel()
                INSTANCE = instance
                instance
            }
        }
    }
}