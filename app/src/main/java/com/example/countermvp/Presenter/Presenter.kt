package com.example.countermvp.Presenter

import android.widget.Toast
import androidx.core.graphics.toColor
import com.example.countermvp.Injector
import com.example.countermvp.model.CounterModel
import com.example.countermvp.view.CounterView

class Presenter {

    lateinit var view: CounterView
    private val model = Injector.getModel()

    fun increment() {
        model.increment()
        view.updateCount(model.getCount().toString())
        if (model.getCount() == 10) {
            view.showToastPlus()

            if (model.getCount()==15) {
                view.showGreenPlus()
            }
        }


        fun decrement() {
            model.decrement()
            view.updateCount(model.getCount().toString())
        }

    }





        fun attachView(view: CounterView) {
            this.view = view
        }

    fun decrement() {
        model.decrement()
        view.updateCount(model.getCount().toString())
    }
}


