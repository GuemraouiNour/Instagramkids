package com.example.instagramkids

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_main4.*


class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        supportActionBar?.hide()



        radio_one.setOnClickListener {
            var id: Int = RadioGroup.checkedRadioButtonId
            if (id != -1){
                val radio = findViewById<RadioGroup>(id)
                var gender = radio.toString()

                if (gender == "boy"){
                    startActivity(Intent(this, MainActivity2::class.java))

                }
                else if(gender == "girl"){
                    startActivity(Intent(this, MainActivity3::class.java))
                }
            }
        }



    }
}