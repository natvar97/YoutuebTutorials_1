package com.indialone.hilttutorial.apicalling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.indialone.hilttutorial.R
import com.indialone.hilttutorial.apicalling.viewmodel.ApiViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ApiCallingActivity : AppCompatActivity() {

    private val TAG = "ApiCallingActivity"
    private val apiViewModel by lazy { ViewModelProvider(this)[ApiViewModel::class.java] }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_api_calling)

        apiViewModel.getNewsBySources()

        apiViewModel.mainResponse.observe(this) {
            Log.e(TAG, "onCreate: mainResponse -> $it")
        }

    }
}