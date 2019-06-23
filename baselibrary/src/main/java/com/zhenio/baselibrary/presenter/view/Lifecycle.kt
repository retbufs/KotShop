package com.zhenio.baselibrary.presenter.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

interface Lifecycle {
    fun onCreate(savedInstanceState: Bundle?)
    fun onSaveInstanceState(outState: Bundle?)
    fun onRestoreInstanceState(savedInstanceState: Bundle?)
    fun onStart()
    fun onResume()
    fun onRestart()
    fun onPause()
    fun onStop()
    fun onDestroy() }