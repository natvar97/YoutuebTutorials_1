package com.indialone.hilttutorial.hilt.viewmodels

import android.util.Log
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.indialone.hilttutorial.hilt.repositories.TestRepository

//@Inject constructor
class TestViewModel() : ViewModel() {

    private val repository = TestRepository()

    fun getAllStudentsNames(): List<String> {
        return repository.getAllStudentsNames()
    }

    // databinding tutorial

    val username = ObservableField<String>()
    val password = ObservableField<String>()

    fun printButtonClick() {
        if (isValid()) {
            Log.e("TAG", "printButtonClick: username -> ${username.get()}")
        }
    }

    private fun isValid(): Boolean {
        return when {
            username.get().toString().length < 5 -> false
            password.get().toString().length < 5 -> false
            else -> true
        }
    }

}