package com.application.addnumbermvvmhilt.util

import android.opengl.Visibility
import android.view.View
import android.widget.TextView

fun TextView.setVisible(visible: Boolean) {
    if (visible) {
        this.visibility = View.VISIBLE
    } else {
        this.visibility = View.GONE
    }
}
