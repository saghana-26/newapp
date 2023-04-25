package org.rajalakshmi.newapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etmsg: EditText =findViewById(R.id.etmsg)
        val btdisplay: Button = findViewById(R.id.btdisplay)

        btdisplay.setOnClickListener{

            val alertDialog= AlertDialog.Builder(this)
                .setTitle("MAD lab")
                .setMessage(etmsg.text.toString())
                .setPositiveButton("OK"){dialog, which ->
                     Toast.makeText(applicationContext,"OK BUTTON IS CLICKED",Toast.LENGTH_LONG).show()
                }
                .setNegativeButton("Cancel"){dialog, which ->
                    Toast.makeText(applicationContext,"OK CANCEL IS CLICKED",Toast.LENGTH_LONG).show()
                }
                .create()
            alertDialog.show()
        }
    }
}