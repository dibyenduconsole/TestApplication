package com.dotexe.app.testapplication

import android.util.Log
import androidx.lifecycle.ViewModel

class SecondViewModel:ViewModel() {

    var counterLiveData = androidx.lifecycle.MutableLiveData<Int>()

    fun updateCounter(){
        var count = counterLiveData.value?:0
        counterLiveData.postValue(count+1)

    }

    override fun onCleared() {
        super.onCleared()
        Log.d(">>SecondViewModel","--onCleared")
    }
}