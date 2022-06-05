package com.indialone.hilttutorial.hilt.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.indialone.hilttutorial.R
import com.indialone.hilttutorial.databinding.ActivityMainBinding
import com.indialone.hilttutorial.hilt.viewmodels.TestViewModel

//@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    /* private val viewModel by lazy {
         ViewModelProvider(this).get(TestViewModel::class.java)
     }*/

    //    @Inject
    lateinit var viewModel: TestViewModel

//    private val mBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(mBinding.root)

        mBinding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(TestViewModel::class.java)

        mBinding.testViewModel = viewModel



     /*   var names = ""
        viewModel.getAllStudentsNames().forEach {
            names += it + "\n"
        }

        mBinding.data.text = names*/

/*
        val dataLayer = DataLayer()


        var names = ""
        dataLayer.getListOfStudentsNames().forEach {
            names += it + "\n"
        }

        mBinding.data.text = names*/

    }


}