package me.ojuliocesar.kotlinlang.buttonstextviewedittext

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var text = enterNameEdit.text

        showNameBtn.setOnClickListener {
            if (text.isEmpty()) {
                resultText.text = "Enter name"
            }else{
                resultText.text = "Welcome " + text
            }
        }


    }
}
