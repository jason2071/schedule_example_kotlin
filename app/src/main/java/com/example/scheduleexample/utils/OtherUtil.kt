package com.example.scheduleexample.utils

import android.content.Context
import android.widget.Toast
import es.dmoral.toasty.Toasty

class OtherUtil(context: Context) {

    private lateinit var message: String
    private var input: String = ""
    private val mContext = context

    fun setCategory(input: String) {
        this.input = input
    }

    val getMessage: String
        get() = "Hello World"

    val getMessage2: String
        get() {
            return resultInput
        }

    private val resultInput: String
        get() {
            if (isNumber) {
                message = "\"$input\" is Integer, " + if (isOddOrEven) "เลขคู่" else "เลขคี่"
            } else {
                message = "\"$input\" is String"
            }
            return message
        }

    private val isOddOrEven : Boolean
        get() {
            val num = input.toInt()
            return num % 2 == 0
        }

    private val isNumber: Boolean
        get() = when (input.toIntOrNull()) {
            null -> false // string
            else -> true // int
        }

    val getToast: Toast
        get() {
            return if (isNumber) {
                if (isOddOrEven) {
                    Toasty.warning(mContext, resultInput, Toast.LENGTH_SHORT, true)
                } else {
                    Toasty.error(mContext, resultInput, Toast.LENGTH_SHORT, true)
                }
            } else {
                Toasty.success(mContext, resultInput, Toast.LENGTH_SHORT, true)
            }
        }
}