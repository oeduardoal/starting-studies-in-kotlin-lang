package me.ojuliocesar.kotlinlang.checkboxwidget

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CheckBox
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onCheckBoxClicked( view : View ){
        //R
        view as CheckBox // cast our view as a Checkbox object or type or View

        var isCheck: Boolean = view.isChecked

        when(view.id){
            R.id.checkVeggies -> if (isCheck) { showChecked.text = "Veggies checked" } else { showChecked.text = "Veggies unchecked"  }
            R.id.checkFruit -> if (isCheck) { showChecked.text = "Fruit checked" } else { showChecked.text = "Fruit unchecked"  }
            R.id.checkMeat -> if (isCheck) { showChecked.text = "Meats checked" } else { showChecked.text = "Meats unchecked"  }
        }


        //Log.d("Click", "CheckBox cliked")
    }
}
