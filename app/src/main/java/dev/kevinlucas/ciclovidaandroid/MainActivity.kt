package dev.kevinlucas.ciclovidaandroid

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    val CATEGORIA = "Script"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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

    fun acessarAtividade2(view: View?) {
        val intent = Intent(this, Activity2::class.java)
        startActivity(intent)
    }
}