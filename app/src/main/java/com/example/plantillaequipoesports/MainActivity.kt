package com.example.plantillaequipoesports

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.res.colorResource
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.plantillaequipoesports.ui.theme.PlantillaequipoesportsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PlantillaequipoesportsTheme {
                PantallaPrincipal()
            }
        }
    }
}

@Composable
fun PantallaPrincipal() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
    ) {
        // 1. TÍTULO DE LA APLICACIÓN
        Text(
            text = "TEAM TITANS",
            style = MaterialTheme.typography.headlineMedium,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 16.dp, bottom = 16.dp)
        )

        // 2. JUGADOR 1
        Jugador(
            nombre = "AlexPro",
            rol = "Atacante",
            edad = 21,
            nivel = 87,
            imagen = R.drawable.jugador1
        )
        HorizontalDivider(thickness = 1.dp, color = MaterialTheme.colorScheme.outlineVariant)

        // 3. JUGADOR 2
        Jugador(
            nombre = "ShadowX",
            rol = "Defensor",
            edad = 24,
            nivel = 91,
            imagen = R.drawable.jugador2
        )
        HorizontalDivider(thickness = 1.dp, color = MaterialTheme.colorScheme.outlineVariant)

        // 4. JUGADOR 3
        Jugador(
            nombre = "MartaGG",
            rol = "Soporte",
            edad = 20,
            nivel = 84,
            imagen = R.drawable.jugador3
        )
        HorizontalDivider(thickness = 1.dp, color = MaterialTheme.colorScheme.outlineVariant)

        // 5. JUGADOR 4
        Jugador(
            nombre = "Destroyer",
            rol = "Atacante",
            edad = 23,
            nivel = 89,
            imagen = R.drawable.jugador4
        )
    }
}

@Composable
fun Jugador(
    nombre: String,
    rol: String,
    edad: Int,
    nivel: Int,
    @DrawableRes imagen: Int
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(
                colorResource(id= R.color.Azul),
                shape = RoundedCornerShape(12.dp)
            )
        .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = imagen),
            contentDescription = "Foto de $nombre",
            modifier = Modifier
                .size(64.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.width(16.dp))

        Column {
            Text(
                text = nombre,
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.primary
            )
            Text(text = "Rol: $rol")
            Text(text = "Edad: $edad años")
            Text(text = "Nivel: $nivel")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun JugadorPreview() {
    PlantillaequipoesportsTheme {
        Jugador(
            nombre = "Destroyer",
            rol = "Atacante",
            edad = 23,
            nivel = 89,
            imagen = R.drawable.jugador4
        )
    }
}