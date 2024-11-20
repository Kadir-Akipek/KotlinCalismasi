package com.kadirakipek.calisanlarprojesi

class Calisanlar(val isim: String, maas: Int,val departman: String,val yas: Int) {

    private val _maas = maas

    fun maasGoster() {
        println(this._maas)
    }

}