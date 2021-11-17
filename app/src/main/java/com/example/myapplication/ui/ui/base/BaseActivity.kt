package com.example.myapplication.ui.ui.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import kotlin.reflect.KClass

abstract class BaseActivity<VM: ViewModel>(private val kClass: KClass<VM>) : AppCompatActivity() {

    protected abstract val layoutId: Int

    protected val viewModel: VM by lazy { ViewModelProvider(this, ViewModelProvider
        .AndroidViewModelFactory(application))
        .get(kClass.java) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId)
    }

    protected fun <T> LiveData<T>.observe(block: (T) -> Unit) {
        observe(this@BaseActivity, { block(it) })
    }
}