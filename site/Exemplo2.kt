package me.ojuliocesar.kotlinlang.myimc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnImc.setOnClickListener{

            if( valueHeight.text.toString().isEmpty() || valueWeight.text.toString().isEmpty() ) {
                textResponse.text = "Digite um valor para ser calculado."
            }else{
                var h = valueHeight.text
                var w = valueWeight.text

                calculateIMC(h.toString().toDouble(), w.toString().toDouble())
            }

        }
    }

    fun calculateIMC(h: Double, w: Double)
    {

        if (h > 3.0) {
            textResponse.text = "Sua altura está muito alta para um humano normal."

        } else if (h < 0.3) {
            textResponse.text = "Você também não é um recem nascido."

        } else {

            var imc = w / (h * h)

            if (imc < 18.5) {
                textResponse.text = "Seu IMC é " + imc + " e está abaixo da média."

            } else if(imc >= 18.5 && imc <=24.9) {
                textResponse.text = "Seu IMC é " + imc + "e está na média."

            } else if (imc >= 25 && imc <= 29.9) {
                textResponse.text = "Seu IMC é " + imc + "e está sobrepeso."

            } else if (imc >= 30) {
                textResponse.text = "Seu IMC é " + imc + "e está obeso."

            } else {
                textResponse.text = "Seu IMC é inválido."

            }
        }
    }
}
