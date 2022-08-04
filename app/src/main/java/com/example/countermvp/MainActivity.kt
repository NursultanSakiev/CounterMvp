package com.example.countermvp

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.countermvp.Presenter.Presenter
import com.example.countermvp.databinding.ActivityMainBinding
import com.example.countermvp.view.CounterView

class MainActivity : AppCompatActivity(), CounterView {

    lateinit var binding: ActivityMainBinding
   var presenter = Presenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter=Injector.getPresenter()
        presenter.attachView(this)
        initClicker()
    }

    private fun initClicker() {
        with(binding) {
            incrementBtn.setOnClickListener {
                presenter.increment()
            }
            decrementBtn.setOnClickListener {
                presenter.decrement()
            }
        }
    }


    override fun updateCount(count: String) {
     binding.counterTv.text=count
    }

    override fun showToastPlus() {
       showToast("Поздравляю")
    }

    override fun showGreenPlus() {
       binding.counterTv.setBackgroundColor(Color.GREEN)
    }


}



