package com.example.finance_application.Model

open class Sign_up_model {
    var username:String=""
    var password:String=""
    var email:String=""
    var phone_number:String=""


    constructor(username: String, password: String, email: String, phone_number: String) {
        this.username = username
        this.password = password
        this.email = email
        this.phone_number = phone_number
    }

}