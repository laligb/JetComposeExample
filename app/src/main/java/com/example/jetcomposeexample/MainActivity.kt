package com.example.jetcomposeexample

import android.os.Bundle
import android.util.EventLogTags.Description
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetcomposeexample.ui.theme.JetComposeExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetComposeExampleTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val scrollState = rememberScrollState()
                    Column (
                        modifier = Modifier
                            .padding(15.dp)
                            .verticalScroll(scrollState)
                    ){

                        //Element(Perfil())
                        Element()
                        Element()
                        Element()
                        Element()
                        Element()
                        Element()
                        Element()
                        Element()
                        Element()
                        Element()
                    }




                    /*Text(
                        text = "Hola class!",
                        color = Color.Red,
                        fontSize = 20.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(100.dp)
                    )*/

                     /*   Row(
                            modifier = Modifier
                                .padding(15.dp)
                                .fillMaxWidth()

                        ){
                            // Functions diverses
                            Serveis()
                            Spacer(modifier = Modifier.width(10.dp))
                            Description()
                        } */


                   /* Column {

                        Button(onClick = { /*TODO*/ } ,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(20.dp),
                            colors = ButtonDefaults.buttonColors(containerColor =  Color.Blue,
                                contentColor = Color.Cyan )

                        ) {
                            Text(text = "Pis 1")
                        }
                        Button(onClick = { /*TODO*/ } ,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(20.dp),
                            colors = ButtonDefaults.buttonColors(containerColor =  Color.Green,
                                contentColor = Color.Yellow )

                        ) {
                            Text(text = "Pis 2")
                        }
                        Button(onClick = { /*TODO*/ } ,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(20.dp),
                            colors = ButtonDefaults.buttonColors(containerColor =  Color.Red,
                                contentColor = Color.White )

                        ) {
                            Text(text = "Pis 3")
                        }

                    }*/

                }
            }
        }
    }
}
@Composable
private fun Element() {
    Row {
        Avatar()
        Column (
            modifier = Modifier.padding(15.dp)
        ) {
            SalutatioPersonal(nom = "Joan")
            Description()

        }
    }
}

@Composable
private fun Avatar(){
    Image(
        painter = painterResource(R.drawable.img_dragons),
        contentDescription = "Logo App",
        modifier = Modifier
            .height(100.dp)
            .clip(CircleShape)
            .background(Color.Blue)
    )
}

@Composable
private fun SalutatioPersonal(nom: String){
    MaterialTheme(){
        Text (
            text = "Hola ${nom}",
            color = Color.Blue,
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Serif,
//            modifier = Modifier.padding(vertical = 10.dp),
            style = MaterialTheme.typography.titleMedium
        )
    }
}


@Composable
private fun Serveis() {
    Text(
        text = "Web Development\nHosting\nWeb Apps\nDesktop App",
        color = Color.White,
        fontSize = 20.sp,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Serif,
        modifier = Modifier
            .padding(horizontal = 10.dp, vertical = 60.dp)

    )
}

@Composable
private fun Description(){
    Text(text = "Ets un bon estudiant de Goland"
//        modifier = Modifier.padding(vertical = 10.dp)
        )
}

/*@Composable
private fun Description() {
    Text(text = "Benvingut a la teva consultora experta a on estem a la teva disposicio",
    modifier = Modifier
        .padding(horizontal = 0.dp, vertical = 60.dp)
    )

} */

