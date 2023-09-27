package com.dam.laprimera

import android.os.Bundle
import android.util.Log
import android.view.ActionMode
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.dam.laprimera.ui.theme.LaprimeraTheme

class MainActivity : ComponentActivity() {
    val TAG = "estado"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LaprimeraTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }

        }
        Log.d("Estado","Estoy en oncreate")

    }

    override fun onStart() {
        super.onStart()

            Log.d("Estado","estamose en start")


    }

    override fun onResume() {
        super.onResume()

        Log.d("Estado","estamose en resume")


    }

    override fun onPause() {
        super.onPause()
        Log.d("Estado","estamose en pausa")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Estado","estamose en stop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Estado", "estamose en restart")
    }


    override fun onDestroy() {
        super.onDestroy()

        Log.d("Estado","estamose en destruccion")

    }
    fun calcular(a:Int=0,b:Int=0,operacion:()->Unit){
       // val operacion =a+b
        operacion()


    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Hello $name!",
            modifier = modifier

    )

        
    }


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LaprimeraTheme {
        Greeting("Android")
    }
}