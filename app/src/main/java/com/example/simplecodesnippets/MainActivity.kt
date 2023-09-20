package com.example.simplecodesnippets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.widget.addTextChangedListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // snippet 1(TextView test)
        /**
        val textView1: TextView = findViewById(R.id.textView_one)
        val textView2: TextView = findViewById(R.id.textView_two)
        val textView3: TextView = findViewById(R.id.textView_three)

        textView1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val toast = Toast.makeText(this@MainActivity, "first", Toast.LENGTH_SHORT)
                toast.show()
            }
        })

        // the above code can be written using a lambda expression as below
        textView1.setOnClickListener{
            val toast = Toast.makeText(this, "This is the first text", Toast.LENGTH_SHORT)
            toast.show()
        }

        textView2.setOnClickListener{
            val toast = Toast.makeText(this, "This is the second text", Toast.LENGTH_SHORT)
            toast.show()
        }

        textView3.setOnClickListener{
            textView3.setText("Hello from HelpDesk")
        }

        */

        // snippet 2(Edit Text)
        /**
        val textViewForEditText: TextView = findViewById(R.id.textView)
        val editText: EditText = findViewById(R.id.editText)

        editText.addTextChangedListener{
            val name1 = editText.getText().toString()
            textViewForEditText.setText("Hello " + name1)
        }
        */


        // snippet 3(Image View)
        /**
        val imageView: ImageView = findViewById(R.id.imageView)
        imageView.setOnClickListener{
            val toast = Toast.makeText(this, "Hello From Android", Toast.LENGTH_SHORT)
            toast.show()
        }
        */

    }
}