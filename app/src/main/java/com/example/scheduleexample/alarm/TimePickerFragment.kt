package com.example.scheduleexample.alarm

import android.app.Dialog
import android.app.TimePickerDialog
import android.content.Context
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.text.format.DateFormat
import java.util.*

class TimePickerFragment : DialogFragment() {

     private lateinit var mActivity: AlarmActivity

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val c = Calendar.getInstance()
        val hour = c.get(Calendar.HOUR_OF_DAY)
        val minute = c.get(Calendar.MINUTE)

        return TimePickerDialog(
            mActivity,
            mActivity as TimePickerDialog.OnTimeSetListener,
            hour,
            minute,
            DateFormat.is24HourFormat(mActivity)
        )
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is AlarmActivity) {
            mActivity = context
        }
    }
}