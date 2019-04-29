package com.example.scheduleexample

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.scheduleexample.alarm.AlarmActivity
import com.example.scheduleexample.other.OtherActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAlarm.setOnClickListener {
            startActivity(Intent(this@MainActivity, AlarmActivity::class.java))
        }

        btnOther.setOnClickListener {
            startActivity(Intent(this@MainActivity, OtherActivity::class.java))
        }
    }
}
