package com.example.zd2_chernomorcev

import java.util.*
data class Crime(var id: UUID = UUID.randomUUID()) {
    var title: String = ""
    var date: Date = Date()
    var isSolved: Boolean = false
    constructor(id: UUID, title: String, date: Date, isSolved: Boolean) : this(id){
        this.title = title
        this.id = id
        this.date = date
        this.isSolved = isSolved

    }
}