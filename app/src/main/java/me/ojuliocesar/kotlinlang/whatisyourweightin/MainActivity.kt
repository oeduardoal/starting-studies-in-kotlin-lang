package me.ojuliocesar.kotlinlang.whatisyourweightin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
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
//        var weight = enterWeight.text;

        //Get on listiner btn
        showWeightBtn.setOnClickListener {

           // if (weight.toString().isEmpty()){

             //   resultView.text = "Please, enter a value weight."

            //}else{
            //    var result = calculateWeight(weight.toString().toDouble())

                //resultView.text = "You weight " + result.toString() + " on Mars"
           // }


        }

        marsCheckbox.setOnClickListener(this) // registering our clickListener
        venusCheckbox.setOnClickListener(this)
        jupiterCheckbox.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        v as CheckBox
        var isChecked: Boolean = v.isChecked
        var weight = enterWeight.text


        when(v.id){
            R.id.marsCheckbox -> if (isChecked && !TextUtils.isEmpty(enterWeight.text.toString())) {
                calculateWeight(weight.toString().toDouble(), v)
                venusCheckbox.isChecked = false
                jupiterCheckbox.isChecked = false
            } else {
                resultView.text = "Enter a value weight"
            }
            R.id.venusCheckbox -> if (isChecked && !TextUtils.isEmpty(enterWeight.text.toString())) {
                calculateWeight(weight.toString().toDouble(), v)
                marsCheckbox.isChecked = false
                jupiterCheckbox.isChecked = false
            } else {
                resultView.text = "Enter a value weight"
            }
            R.id.jupiterCheckbox -> if (isChecked && !TextUtils.isEmpty(enterWeight.text.toString())) {
                calculateWeight(weight.toString().toDouble(), v)
                marsCheckbox.isChecked = false
                venusCheckbox.isChecked = false
            } else {
                resultView.text = "Enter a value weight"
            }
        }
    }


    fun calculateWeight(userWeight: Double, checkBox: CheckBox){ // 89.78
        var result: Double?


        when(checkBox.id){
            R.id.marsCheckbox -> {
                result = userWeight * marsG
                resultView.text = "Weight is " + result.format(2) + " on Mars"

            }
            R.id.venusCheckbox -> {
                result = userWeight * venusG
                resultView.text = "Weight is " + result.format(2) + " on Venus"

            }
            R.id.jupiterCheckbox -> {
                result = userWeight * jupiterG
                resultView.text = "Weight is " + result.format(2) + " on Jupiter"

            }
            else -> {
                result = userWeight * marsG
                resultView.text = "Weight is " + result.format(2) + " on Mars"
            }
        }


    }

    fun Double.format(digits: Int) = java.lang.String.format("%.${digits}f", this)
}
