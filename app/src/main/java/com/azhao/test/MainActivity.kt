package com.azhao.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.azhao.module.a.AUtils
import com.azhao.module.b.BUtils
import com.azhao.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btApp.setOnClickListener {
            binding.tvApp.text = Utils.getGradleMessage()
//            binding.tvApp.text = Utils.getChannel(this)
        }

        binding.btA.setOnClickListener {
            binding.tvA.text = AUtils.getGradleMessage()
        }

        binding.btB.setOnClickListener {
            binding.tvB.text = BUtils.getGradleMessage()
        }
    }
}