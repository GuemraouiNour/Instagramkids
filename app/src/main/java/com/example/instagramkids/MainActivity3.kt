package com.example.instagramkids

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        btm1.setOnClickListener {

            val name_girl = edt_name1.text.toString()
            val email_girl= edt_email1.text.toString()
            val pasworld_girl = edt_pasw1.text.toString()
            val pasworld_girl_cnfr = pasw_cnf1.text.toString()
            val birth_girl = edt_birth1.text.toString()
            val cntr_girl = edt_cntr1.text.toString()



            if (name_girl.isEmpty()) {
                edt_user.error = " your  name  Required"
                return@setOnClickListener
            }

            if (email_girl.isEmpty()) {
                edt_user.error = " your  email  Required"
                return@setOnClickListener
            }

            if (pasworld_girl.isEmpty()) {
                edt_user.error = " your  passworld  Required"
                return@setOnClickListener
            }
            if (pasworld_girl_cnfr.isEmpty()) {
                edt_psw.error = " your Password Required"
                return@setOnClickListener


            }

            if (birth_girl.isEmpty()) {
                edt_user.error = " your  birthday  Required"
                return@setOnClickListener
            }

            if (cntr_girl.isEmpty()) {
                edt_user.error = " your  country  Required"
                return@setOnClickListener
            }

        }
    }
}