package android.kon.lb1

import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
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
        val btt: ImageButton = findViewById(R.id.imageButton)
        val name: EditText = findViewById(R.id.nameEntr)
        val text: TextView = findViewById(R.id.textView)
        btt.setOnClickListener {
            if (name.text.isEmpty()){
                text.text = "Hello, friend!"
            }
            else {
                text.text = "Hello, " + name.text + "!"
            }
        }
    }
}