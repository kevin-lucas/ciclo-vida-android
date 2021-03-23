package dev.kevinlucas.ciclovidaandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class Activity2 : AppCompatActivity() {

    val CATEGORIA = "Script"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        Log.i(CATEGORIA, "${javaClass.name}.onCreate();")
    }

    override fun onStart() {
        super.onStart()

        Log.i(CATEGORIA, "${javaClass.name}.onStart();")
    }

    override fun onRestart() {
        super.onRestart()

        Log.i(CATEGORIA, "${javaClass.name}.onRestart();")
    }

    override fun onResume() {
        super.onResume()

        Log.i(CATEGORIA, "${javaClass.name}.onResume();")
    }

    override fun onPause() {
        super.onPause()

        Log.i(CATEGORIA, "${javaClass.name}.onPause();")
    }

    override fun onStop() {
        super.onStop()

        Log.i(CATEGORIA, "${javaClass.name}.onStop();")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i(CATEGORIA, "${javaClass.name}.onDestroy();")
    }

    fun voltar(view: View?) {
        finish()
    }
}