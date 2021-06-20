package com.example.finance_application.Model

class Member_Model {
    var Name_Member:String=""
    var phone_Member:Long=0
    var Id_member:String=""
    var Status_member:String=""
    var Amount_member:String=""
    var EMI_member:String=""
    var Due_member:String=""

    constructor(
        Name_Member: String,
        phone_Member: Long,
        Id_member: String,
        Status_member: String,
        Amount_member: String,
        EMI_member: String,
        Due_member: String
    ) {
        this.Name_Member = Name_Member
        this.phone_Member = phone_Member
        this.Id_member = Id_member
        this.Status_member = Status_member
        this.Amount_member = Amount_member
        this.EMI_member = EMI_member
        this.Due_member = Due_member
    }
}