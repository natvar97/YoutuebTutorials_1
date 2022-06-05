package com.indialone.hilttutorial.apicalling.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.indialone.hilttutorial.apicalling.models.MainResponse
import com.indialone.hilttutorial.apicalling.repository.ApiRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ApiViewModel: ViewModel() {

    private val apiRepository = ApiRepository()

    private val _mainResponse = MutableLiveData<MainResponse>()
    val mainResponse: LiveData<MainResponse> = _mainResponse

    fun getNewsBySources() {
        viewModelScope.launch {
            try {
                val response = async { apiRepository.getNewsBySources() }
//                val withResponse = withContext(Dispatchers.Default) { apiRepository.getNewsBySources() }
                _mainResponse.postValue(response.await())
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

}