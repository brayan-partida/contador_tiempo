package com.example.myapplicationaaaa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

var layin :LinearLayout?=null

    var contadormas=0

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //start activity

       layin=findViewById(R.id.layo)

        var eti=TextView (this)
        var cam=EditText(this)
        var bot=Button(this)
         eti.setText("escriba su nombre")
        bot.setText("saludar")
        layin?.addView(eti)
        layin?.addView(cam)
        layin?.addView(bot)

        bot.setOnClickListener{

            AlertDialog.Builder(this).setMessage("hols"+cam.text.toString().toUpperCase()).show()
        }



    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main1,menu);


        return super.onCreateOptionsMenu(menu)


    }



    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.agregar->{
            agregando(0);
            }
            R.id.eliminar->{
                layin?.removeAllViews()
            }  R.id.salir ->{
            finish()
        }
        }
        return super.onOptionsItemSelected(item)

    }
    //todo:->funciones
    fun agregando(cont:Int):Boolean{
        layin=findViewById(R.id.layo)
        var eti=TextView (this)
        var cam=EditText(this)
        var bot=Button(this)
        eti.setText("escriba su nombre")
        bot.setText("saludar")
        layin?.addView(eti)
        layin?.addView(cam)
        layin?.addView(bot)


        bot.setOnClickListener{

            AlertDialog.Builder(this).setMessage("hols"+cam.text.toString().toUpperCase()).show()

       var timer=object : CountDownTimer(2000,2000) {
            override fun onFinish() {

            }

            override fun onTick(p0: Long) {
               setTitle(""+(contadormas++));
            }

        }
            timer.start()
        }
        return true
    }
}
