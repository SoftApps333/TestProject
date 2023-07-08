package com.example.toasty

import android.content.Context
import android.widget.Toast

object Toasty {
   fun Context.toasty(message: String){
      Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
   }
}