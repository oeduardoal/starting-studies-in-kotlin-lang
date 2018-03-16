package me.ojuliocesar.kotlinlang.whatisyourweightin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var marsG = 0.38

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

    }


    fun calculateWeight(userWeight: Double): Double { // 89.78

        return userWeight * marsG

    }
}
