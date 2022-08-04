package com.example.countermvp

import com.example.countermvp.Presenter.Presenter
import com.example.countermvp.model.CounterModel

class Injector {
    companion object{
        fun getPresenter():Presenter{
            return Presenter()
        }
        fun getModel():CounterModel{
            return CounterModel()
        }
    }
}