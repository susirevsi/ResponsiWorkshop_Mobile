package com.gmail.susirevsi123.responsiworkshopmobile

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    internal lateinit var nama: EditText
    internal lateinit var nik: EditText
    internal lateinit var alamat: EditText
    internal lateinit var usia: EditText
    internal lateinit var institusi: EditText
    internal lateinit var hnama: TextView
    internal lateinit var hnik: TextView
    internal lateinit var halamat: TextView
    internal lateinit var humur: TextView
    internal lateinit var hinstitusi: TextView
    internal lateinit var btnsimpan: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nama = findViewById<View>(R.id.input_nama) as EditText
        nik = findViewById<View>(R.id.input_nik) as EditText
        alamat = findViewById<View>(R.id.input_alamat) as EditText
        usia = findViewById<View>(R.id.input_umur) as EditText
        institusi = findViewById<View>(R.id.input_alamat) as EditText
        hnama = findViewById<View>(R.id.hasil_nama) as TextView
        hnik = findViewById<View>(R.id.hasil_nik) as TextView
        halamat = findViewById<View>(R.id.hasil_alamat) as TextView
        humur = findViewById<View>(R.id.hasil_umur) as TextView
        hinstitusi = findViewById<View>(R.id.hasil_institusi) as TextView
        btnsimpan = findViewById<View>(R.id.simpan_button) as Button

        btnsimpan.setOnClickListener {
            val namae: String
            val alam: String
            val usi: String
            val institus: String
            val nomorik: String

            namae = nama.text.toString().trim { it <= ' ' }
            alam = alamat.text.toString().trim { it <= ' ' }
            usi = usia.text.toString().trim { it <= ' ' }
            institus = institusi.text.toString().trim { it <= ' ' }

            nomorik = nik.text.toString().trim { it <= ' ' }

            hnama.text = namae
            hnik.text = nomorik
            halamat.text = alam
            humur.text = usi
            hinstitusi.text = institus
        }
    }
}
