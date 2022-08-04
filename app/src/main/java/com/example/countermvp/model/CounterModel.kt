package com.example.countermvp.model

import android.widget.Toast

class CounterModel {
    private var count=0

    fun increment(){
        ++count
    }
    fun decrement(){
        --count

    }
    fun getCount():Int{
        return count
    }


}