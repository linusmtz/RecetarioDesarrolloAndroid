package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

// clase de objeto para renderizar cakecard
data class Cake(
    val name: String,
    val image: Int,
    val navRoute: String
)

// home screen pero no sirve para scrollear
@Composable
fun HomeScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Recetario Linus",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(bottom = 16.dp).align(Alignment.CenterHorizontally),
            fontWeight = FontWeight.Bold,
            color = Color.hsl(220f, 0.35f, 0.25f)
        )

        CardCake(
            cakeName = "Pastel Chocolate",
            cakeImage = R.drawable.pastel1
        ) {
            navController.navigate("cake1")
        }
        Spacer(modifier = Modifier.height(8.dp))

        CardCake(
            cakeName = "Pastel Variado",
            cakeImage = R.drawable.pastel2
        ) {
            navController.navigate("cake2")
        }
        Spacer(modifier = Modifier.height(8.dp))

        CardCake(
            cakeName = "Pastel Chocolate 3 Pisos",
            cakeImage = R.drawable.pastel3
        ) {
            navController.navigate("cake3")
        }
        Spacer(modifier = Modifier.height(8.dp))

        CardCake(
            cakeName = "Pastel Variado 2",
            cakeImage = R.drawable.pastel4
        ) {
            navController.navigate("cake4")
        }

    }
}

@Composable
fun LazyHomeScreen(navController: NavHostController){
    val cakeList = listOf(
        Cake("Pastel Chocolate", R.drawable.pastel1, "cake1"),
        Cake("Pastel Variado", R.drawable.pastel2, "cake2"),
        Cake("Pastel Chocolate 3 Pisos", R.drawable.pastel3, "cake3"),
        Cake("Pastel Variado 2", R.drawable.pastel4, "cake4"),
        Cake("Cupcake Chocolate", R.drawable.cupcake1, "cupcake1"),
        Cake("Cupcake Unicornio", R.drawable.cupcake2, "cupcake2"),
        Cake("Brownies", R.drawable.brownie, "brownie"),
        Cake("Pay de fresa", R.drawable.payfresa, "paydefresa"),
        Cake("Pay de manzana", R.drawable.paymanzana, "paydemanzana")
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            ,
        contentPadding = PaddingValues(vertical = 20.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item{
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.hsl(220f, 0.35f, 0.85f))
                    .padding(16.dp)
            ) {
                Text(
                    text = "Recetario Linus",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    color = Color.hsl(220f, 0.35f, 0.25f)
                )
            }
        }
        //codigo renderizando una lista de objetos para la card cake en lugar de definir cada uno
        items(cakeList){ cake->
            CardCake(
                cakeName = cake.name,
                cakeImage = cake.image,
            ) {
                navController.navigate(cake.navRoute)
            }

        }

//        item{
//            CardCake(
//                cakeName = "Pastel Chocolate",
//                cakeImage = R.drawable.pastel1
//            ) {
//                navController.navigate("cake1")
//            }
//        }
//        item{
//            CardCake(
//                cakeName = "Pastel Variado",
//                cakeImage = R.drawable.pastel2
//            ) {
//                navController.navigate("cake2")
//            }
//        }
//        item{
//            CardCake(
//                cakeName = "Pastel Chocolate 3 Pisos",
//                cakeImage = R.drawable.pastel3
//            ) {
//                navController.navigate("cake3")
//            }
//        }
//        item{
//            CardCake(
//                cakeName = "Pastel Variado 2",
//                cakeImage = R.drawable.pastel4
//            ) {
//                navController.navigate("cake4")
//            }
//        }
//        item{
//            CardCake(
//                cakeName = "Cupcake Chocolate",
//                cakeImage = R.drawable.cupcake1
//            ) {
//                navController.navigate("cupcake1")
//            }
//        }
//        item{
//            CardCake(
//                cakeName = "Cupcake Unicornio",
//                cakeImage = R.drawable.cupcake2
//            ) {
//                navController.navigate("cupcake2")
//            }
//        }
//        item{
//            CardCake(
//                cakeName = "Brownies",
//                cakeImage = R.drawable.brownie
//            ) {
//                navController.navigate("cake4")
//            }
//        }
//        item{
//            CardCake(
//                cakeName = "Pay de fresa",
//                cakeImage = R.drawable.payfresa
//            ) {
//                navController.navigate("paydefresa")
//            }
//        }
//        item{
//            CardCake(
//                cakeName = "Pay de manzana",
//                cakeImage = R.drawable.paymanzana
//            ) {
//                navController.navigate("paydemanzana")
//            }
//        }
    }
}

@Composable
fun CakeScreen(
    cakeName: String,
    cakeImage: Int,
    recipe: String,
    onBack: () -> Unit,
    ingredient: List<CakeIngredient>
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        IconButton(onClick = onBack) {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = "Regresar"
            )
        }

        Text(
            text = cakeName,
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Image(
            painter = painterResource(id = cakeImage),
            contentDescription = "Imagen de $cakeName",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Ingredientes",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(8.dp))
        ingredient.forEach{ ingredient->
            Text(
                text = "• ${ingredient.name}: ${ingredient.quantity}",
                style = MaterialTheme.typography.bodyMedium
            )

        }
        Spacer(modifier = Modifier.height(16.dp))

        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = recipe,
            style = MaterialTheme.typography.bodyMedium
        )
    }
}