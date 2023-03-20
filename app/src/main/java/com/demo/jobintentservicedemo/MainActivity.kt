package com.demo.jobintentservicedemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.demo.jobintentservicedemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    companion object {
        const val TAG = "MyJobIntentService"
    }
    private var mainActivityBinding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainActivityBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainActivityBinding?.root)
        startService()
    }

    private fun startService() {
        MyJobIntentService.enqueueWork(this, Intent(this, MyJobIntentService::class.java))
    }
}