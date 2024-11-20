package com.kadirakipek.calisanlarprojesi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var calisan1 = Calisanlar("Kadir",1500,"Yazılım",21)
        var calisan2 = Calisanlar("Mustafa",2500,"Satış",32)
        var calisan3 = Calisanlar("Tolga",1500,"Pazarlama",51)
        var calisan4 = Calisanlar("Zeynep",1500,"Temizlik",61)
        var calisan5 = Calisanlar("Meryem",1500,"Yazılım",39)
        var calisan6 = Calisanlar("Furkan",1500,"Pazarlama",29)
        var calisan7 = Calisanlar("Burak",1500,"Satış",27)
        var calisan8 = Calisanlar("Ayşe",1500,"Satış",35)
        var calisan9 = Calisanlar("Fatma",1500,"Temizlik",75)
        var calisan10 = Calisanlar("Gülşen",1500,"Yazılım",29)

        var calisanlarListesi = arrayListOf<Calisanlar>(calisan1,calisan2,calisan3,calisan4,calisan5,calisan6,calisan7,calisan8,calisan9,calisan10)


        var calisanlarIsimListesi = calisanlarListesi.map{it.isim}
        var yasDepartmanListesi = calisanlarListesi.filter { it.yas > 30}.filter { it.departman == "Yazılım" }.map{it.maasGoster()}
        var yasIsimListesi = calisanlarListesi.filter { it.yas < 25 }.map { it.isim }
    }
}