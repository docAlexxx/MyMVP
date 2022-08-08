package com.example.mymvp

class CounterPresenter(private val view:MainView) {

    val model=CounterModel()

    fun onCounterClick (id:Int){
        when(id){
            R.id.button_one_btn->{
                view.setText(model.nextItem(0).toString(),0)
            }
            R.id.button_two_btn->{
                view.setText(model.nextItem(1).toString(),1)
            }
            R.id.button_three_btn->{
                view.setText(model.nextItem(2).toString(),2)
            }
        }


    }

}