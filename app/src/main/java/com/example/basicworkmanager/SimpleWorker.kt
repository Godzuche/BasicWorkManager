package com.example.basicworkmanager

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.douglasstarnes.basicworkmanager.WorkStatusSingleton

class SimpleWorker(context: Context, params: WorkerParameters): Worker(context, params) {
    override fun doWork(): Result {
        Thread.sleep(10000)
        WorkStatusSingleton.workComplete = true
        return Result.success()
    }
}