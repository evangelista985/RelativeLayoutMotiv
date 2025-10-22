package com.example.relativelayoutmotiv

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
<<<<<<< HEAD
        var buttonSalvar = findViewById<Button>(R.id.btn_salvar)

        buttonSalvar.setOnClickListener {
            var nomeText = findViewById<EditText>(R.id.edt_nome).text;
            if (nomeText.isEmpty()) {
                Toast.makeText(this, "Digite seu nome", Toast.LENGTH_LONG).show()

            }    else {
                this.getSharedPreferences("motiv",MODE_PRIVATE).edit().putString("nome",nomeText.toString()).apply()
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            }
        }
    }
}
=======


        var btnSave = findViewById<Button>(R.id.buttonSave);

        btnSave.setOnClickListener{
            var nomeText = findViewById<EditText>(R.id.editTextNome).text;
            if (nomeText.isEmpty()){
                Toast.makeText(this,"Digite seu nome", Toast.LENGTH_LONG).show()
            } else {
                this.getSharedPreferences("motivacao", MODE_PRIVATE).edit().putString("nome", nomeText.toString()).apply()
                var intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }


}
>>>>>>> f5a03922365e579250d9d223501c9707eb615c7a
