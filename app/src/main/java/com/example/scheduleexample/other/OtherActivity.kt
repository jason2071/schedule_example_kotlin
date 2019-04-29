package com.example.scheduleexample.other

import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import com.example.scheduleexample.R
import com.example.scheduleexample.utils.OtherUtil
import es.dmoral.toasty.Toasty
import kotlinx.android.synthetic.main.activity_other.*


class OtherActivity : AppCompatActivity() {

    private lateinit var otherUtil: OtherUtil
    private var listPerson: ArrayList<Person> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        setModelData()

        otherUtil = OtherUtil(this@OtherActivity)
        textView1.text = otherUtil.getMessage

        btnSend.setOnClickListener {
            otherUtil.setCategory(editText.text.toString())
            otherUtil.getToast.show()
        }

        btnDemoAlert.setOnClickListener {
            //setAlert()

            for (items in listPerson) {
                log("person ::: ${items.name} ${items.age}")
            }
        }

    }

    private fun setModelData() {

        val name = resources.getStringArray(R.array.name_array)
        val lname = resources.getStringArray(R.array.lname_array)

        for (i in 0..20) {
            val person1 = Person("${name.random()} ${lname.random()}")
            person1.age = (15..40).random()
            listPerson.add(person1)
        }
    }

    private fun setAlert() {
        val build = AlertDialog.Builder(this@OtherActivity)
            .setTitle("Title")
            .setMessage("This is a message")
            .setPositiveButton("yes") { dialog, which ->
                Toasty.success(this@OtherActivity, "Yes", Toast.LENGTH_SHORT, true).show()
            }
            .setNegativeButton("no") { dialog, which ->
                Toasty.error(this@OtherActivity, "No", Toast.LENGTH_SHORT, true).show()
            }
            .setNeutralButton("cancel") { dialog, which ->
                Toasty.warning(this@OtherActivity, "Cancel", Toast.LENGTH_SHORT, true).show()
            }
            .show()
    }

    private fun log(s: String) {
        Log.d("OtherActivityAAA", s)
    }
}
