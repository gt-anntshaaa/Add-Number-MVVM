package com.application.addnumbermvvmhilt.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.addnumbermvvmhilt.data.MyNumber


class MainViewModel : ViewModel() {
   private val _result = MutableLiveData<MyNumber>()
   val result: LiveData<MyNumber>
        get() = _result


    fun add (number: MyNumber){
        number.result = number.firstValue + number.secondValue
        _result.value = number
    }
//   fun add(firstValue: Double, secondValue: Double){
//       _result.value = firstValue+secondValue
//   }
    
}