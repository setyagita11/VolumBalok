package com.zubet.volumbalok

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var panjang : EditText
    private lateinit var lebar : EditText
    private  lateinit var tinggi : EditText
    private lateinit var hitung : Button
    private lateinit var hasil : TextView
    private lateinit var hapus : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        panjang = findViewById(R.id.txtpanjang)
        lebar = findViewById(R.id.txtlebar)
        tinggi = findViewById(R.id.txttinggi)
        hitung = findViewById(R.id.btnhitung)
        hasil = findViewById(R.id.txthasil)
        hapus = findViewById(R.id.btnhapus)

        hitung.setOnClickListener { hitung() }
        hapus.setOnClickListener { hapus() }

    }

    fun hitung (){
        val jumlah = panjang.text.toString().toDouble() * lebar.text.toString().toDouble() * tinggi.text.toString().toDouble()
        hasil.text = jumlah.toString()
    }

    fun hapus (){
        hasil.text = 0.toString()
        panjang.text.clear()
        lebar.text.clear()
        tinggi.text.clear()
    }

}