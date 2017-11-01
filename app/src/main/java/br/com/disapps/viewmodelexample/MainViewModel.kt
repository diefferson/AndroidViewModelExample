package br.com.disapps.viewmodelexample

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

/**
 * Created by diefferson on 31/10/17.
 **/
class MainViewModel: ViewModel(){

    val value1 = MutableLiveData<Int>().apply { value = 0 }
    val value2 = MutableLiveData<Int>().apply { value = 0 }


    fun addvalue1(){
        value1.value = value1.value!!+1
    }

    fun addValue2(){
        value2.value = value2.value!!+1
    }

    fun reset(){
        value1.value = 0
        value2.value = 0
    }

}