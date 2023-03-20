package com.demo.jobintentservicedemo

import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.core.app.JobIntentService
import com.demo.jobintentservicedemo.MainActivity.Companion.TAG
import java.util.*

class MyJobIntentService : JobIntentService() {
    companion object{
        fun enqueueWork(context: Context, intent: Intent){
            enqueueWork(context, MyJobIntentService::class.java, 101, intent)
        }
    }

    private var randomNumber:Int? =null
    override fun onHandleWork(intent: Intent) {
        Log.e(TAG, "onStartCommand() called ${intent?.getStringExtra("myKey")?:"NO DATA"}")
        for (i in 1..1000){
            Thread.sleep(1000)
            randomNumber = Random().nextInt(10000)
            Log.e(TAG, "RandomNumber: $randomNumber")
        }
        stopSelf()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG,"onDestroy() called")
    }
}