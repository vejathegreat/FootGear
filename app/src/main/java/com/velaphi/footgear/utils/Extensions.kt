package com.velaphi.footgear

import androidx.appcompat.widget.AppCompatImageView
import androidx.databinding.BindingAdapter
import com.google.android.material.textfield.TextInputLayout
import java.util.regex.Pattern

fun TextInputLayout.validateString(): Boolean {
    var noErrors = true
    val textString = this.editText?.text.toString()
    if (textString.isEmpty()) {
        this.error = resources.getString(R.string.error_string)
        noErrors = false
    } else {
        this.error = null

    }

    return noErrors
}

fun TextInputLayout.isEmailValid(): Boolean {
    val isEmailValid = Pattern.compile(
        "^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]|[\\w-]{2,}))@"
                + "((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
                + "([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                + "[0-9]{1,2}|25[0-5]|2[0-4][0-9]))|"
                + "([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$"
    ).matcher(this.editText?.text.toString()).matches()

    if (!isEmailValid) {
        this.error = context.getString(R.string.email_address_error)
    }
    return isEmailValid
}

@BindingAdapter("imageResource")
fun setImageViewResource(view: AppCompatImageView, resId : Int) {
    view.setImageResource(resId)
}
