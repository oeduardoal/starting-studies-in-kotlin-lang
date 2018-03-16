package me.ojuliocesar.kotlinlang.whatisyourweightin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    val marsG = 0.38
    val venusG = 0.91
    val jupiterG = 2.34

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //show our magic
        var weight = enterWeight.text;

        //Get on listiner btn
        showWeightBtn.setOnClickListener {

            if (weight.toString().isEmpty()){

                resultView.text = "Please, enter a value weight."

            }else{
                var result = calculateWeight(weight.toString().toDouble())

                resultView.text = "You weight " + result.toString() + " on Mars"
            }


        }

        marsCheckbox.setOnClickListener(this) // registering our clickListener
        venusCheckbox.setOnClickListener(this)
        jupiterCheckbox.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        v as CheckBox
        var isChecked: Boolean = v.isChecked

        when(v.id){
            R.id.marsCheckbox -> if (isChecked) { resultView.text = "Mars checked" } else { resultView.text = "Mars unchecked"  }
            R.id.venusCheckbox -> if (isChecked) { resultView.text = "Venus checked" } else { resultView.text = "Venus unchecked"  }
            R.id.jupiterCheckbox -> if (isChecked) { resultView.text = "Jupiter checked" } else { resultView.text = "Jupiter unchecked"  }
        }
    }


    fun calculateWeight(userWeight: Double): Double { // 89.78

        return userWeight * marsG

    }
}
