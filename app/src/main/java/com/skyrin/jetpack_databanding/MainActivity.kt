package com.skyrin.jetpack_databanding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.skyrin.jetpack_databanding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // 懒加载得到 viewModel 对象
    private val viewModel by lazy {
        ViewModelProviders.of(this).get(MainViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityMainBinding =
            DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }
}
