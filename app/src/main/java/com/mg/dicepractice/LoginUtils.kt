package com.mg.dicepractice

class LoginUtils {

    fun ValidateEmail(EmailAddress:String): Boolean{
        return EmailAddress.contains("@gmail.com")
    }

    fun getLocalPartLength(EmailAddress: String): Int{
        return EmailAddress.substring(0,EmailAddress.indexOf("@")).length
    }

}