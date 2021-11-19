package com.example.instagramkids

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        supportActionBar?.hide()


        btm1.setOnClickListener {

            val name_boy = edt_name2.text.toString()
            val email_boy = edt_email2.text.toString()
            val pasworld_boy = edt_pasw2.text.toString()
            val pasworld_boy_cnfr = pasw_cnf2.text.toString()
            val birth_boy = edt_birth2.text.toString()
            val cntr_boy = edt_cntr2.text.toString()



            if (name_boy.isEmpty()) {
                edt_user.error = " your  name  Required"
                return@setOnClickListener
            }

            if (email_boy.isEmpty()) {
                edt_user.error = " your  email  Required"
                return@setOnClickListener
            }

            if (pasworld_boy.isEmpty()) {
                edt_user.error = " your  passworld  Required"
                return@setOnClickListener
            }
            if (pasworld_boy_cnfr.isEmpty()) {
                edt_psw.error = " your Password Required"
                return@setOnClickListener


            }

            if (birth_boy.isEmpty()) {
                edt_user.error = " your  birthday  Required"
                return@setOnClickListener
            }

            if (cntr_boy.isEmpty()) {
                edt_user.error = " your  country  Required"
                return@setOnClickListener
            }

        }
    }
}