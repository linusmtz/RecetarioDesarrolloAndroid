package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

data class CakeIngredient(
    val name: String,
    val quantity: String
)
data class CakeDetail(
    val route: String,
    val name: String,
    val imageRes: Int,
    val recipe: String,
    val ingredients: List<CakeIngredient>
)


@Composable
fun App() {
    val navController = rememberNavController()
    val cakeList = listOf(
        CakeDetail(
            route = "cake1",
            name = "Pastel Chocolate",
            imageRes = R.drawable.pastel1,
            recipe = "Mezcla los ingredientes secos con los húmedos. Hornea a 180°C por 35 min. Deja enfriar y decora.",
            ingredients = listOf(
                CakeIngredient("Harina", "2 tazas"),
                CakeIngredient("Cacao en polvo", "1/2 taza"),
                CakeIngredient("Azúcar", "1 taza"),
                CakeIngredient("Huevos", "2 unidades"),
                CakeIngredient("Mantequilla derretida", "1/2 taza"),
                CakeIngredient("Leche", "1 taza"),
                CakeIngredient("Polvo de hornear", "1 cucharadita")
            )
        ),
        CakeDetail(
            route = "cake2",
            name = "Pastel Variado",
            imageRes = R.drawable.pastel2,
            recipe = "Prepara la masa con harina y mantequilla. Divide en capas con diferentes sabores. Hornea 40 min y decora con glaseado.",
            ingredients = listOf(
                CakeIngredient("Harina", "3 tazas"),
                CakeIngredient("Mantequilla", "1 taza"),
                CakeIngredient("Azúcar", "1 1/2 tazas"),
                CakeIngredient("Huevos", "3 unidades"),
                CakeIngredient("Leche", "1 taza"),
                CakeIngredient("Esencia de vainilla", "1 cucharadita")
            )
        ),
        CakeDetail(
            route = "cake3",
            name = "Pastel Chocolate 3 Pisos",
            imageRes = R.drawable.pastel3,
            recipe = "Hornea tres bizcochos de chocolate. Rellena con crema y frutas. Apila y cubre con ganache de chocolate.",
            ingredients = listOf(
                CakeIngredient("Harina", "2 tazas"),
                CakeIngredient("Cacao en polvo", "3/4 taza"),
                CakeIngredient("Azúcar", "1 1/2 tazas"),
                CakeIngredient("Huevos", "3 unidades"),
                CakeIngredient("Mantequilla", "1 taza"),
                CakeIngredient("Leche", "1 taza"),
                CakeIngredient("Crema batida", "1 taza"),
                CakeIngredient("Fresas", "1/2 taza")
            )
        ),
        CakeDetail(
            route = "cake4",
            name = "Pastel Variado 2",
            imageRes = R.drawable.pastel4,
            recipe = "Hornea pastel. Rellena con crema y frutas. Apila y cubre con ganache de chocolate.",
            ingredients = listOf(
                CakeIngredient("Harina", "2 tazas"),
                CakeIngredient("Cacao en polvo", "3/4 taza"),
                CakeIngredient("Azúcar", "1 1/2 tazas"),
                CakeIngredient("Huevos", "3 unidades"),
                CakeIngredient("Mantequilla", "1 taza"),
                CakeIngredient("Leche", "1 taza"),
                CakeIngredient("Crema batida", "1 taza"),

            )
        ),
        CakeDetail(
            route = "cupcake1",
            name = "Cupcake Chocolate",
            imageRes = R.drawable.cupcake1,
            recipe = "Prepara la masa con harina, cacao y mantequilla. Vierte en moldes y hornea 20 min. Decora con crema y chispas.",
            ingredients = listOf(
                CakeIngredient("Harina", "1 1/2 tazas"),
                CakeIngredient("Cacao en polvo", "1/2 taza"),
                CakeIngredient("Azúcar", "3/4 taza"),
                CakeIngredient("Huevos", "2 unidades"),
                CakeIngredient("Leche", "1/2 taza"),
                CakeIngredient("Mantequilla", "1/2 taza"),
                CakeIngredient("Polvo de hornear", "1 cucharadita")
            )
        ),
        CakeDetail(
            route = "cupcake2",
            name = "Cupcake Unicornio",
            imageRes = R.drawable.cupcake2,
            recipe = "Prepara la masa con harina, cacao y mantequilla. Vierte en moldes y hornea 20 min. Decora con crema y chispas.",
            ingredients = listOf(
                CakeIngredient("Harina", "1 1/2 tazas"),
                CakeIngredient("Cacao en polvo", "1/2 taza"),
                CakeIngredient("Azúcar", "3/4 taza"),
                CakeIngredient("Huevos", "2 unidades"),
                CakeIngredient("Leche", "1/2 taza"),
                CakeIngredient("Mantequilla", "1/2 taza"),
                CakeIngredient("Polvo de hornear", "1 cucharadita")
            )
        ),
        CakeDetail(
            route = "brownie",
            name = "Brownies de Chocolate",
            imageRes = R.drawable.brownie,
            recipe = "Mezcla chocolate derretido con mantequilla y azúcar. Agrega harina y huevos. Hornea a 180°C por 25 min.",
            ingredients = listOf(
                CakeIngredient("Chocolate semiamargo", "200g"),
                CakeIngredient("Mantequilla", "1/2 taza"),
                CakeIngredient("Azúcar", "1 taza"),
                CakeIngredient("Harina", "3/4 taza"),
                CakeIngredient("Huevos", "2 unidades"),
                CakeIngredient("Esencia de vainilla", "1 cucharadita")
            )
        ),

        CakeDetail(
            route = "paydefresa",
            name = "Pay de fresa",
            imageRes = R.drawable.payfresa,
            recipe = "Prepara una base de galleta. Mezcla crema con fresas y azúcar. Rellena y refrigera antes de servir.",
            ingredients = listOf(
                CakeIngredient("Galletas trituradas", "1 taza"),
                CakeIngredient("Mantequilla derretida", "1/2 taza"),
                CakeIngredient("Fresas", "1 taza"),
                CakeIngredient("Azúcar", "1/2 taza"),
                CakeIngredient("Crema para batir", "1 taza")
            )
        ),
        CakeDetail(
            route = "paydemanzana",
            name = "Pay de manzana",
            imageRes = R.drawable.paymanzana,
            recipe = "Prepara una base de galleta. Mezcla crema con manzana y azúcar. Rellena y refrigera antes de servir.",
            ingredients = listOf(
                CakeIngredient("Galletas trituradas", "1 taza"),
                CakeIngredient("Mantequilla derretida", "1/2 taza"),
                CakeIngredient("Fresas", "1 taza"),
                CakeIngredient("Azúcar", "1/2 taza"),
                CakeIngredient("Crema para batir", "1 taza"),
                CakeIngredient("Fresas","1 taza")
            )
        )
    )



    // configuración de rutas y composables
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
//            HomeScreen(navController)
            LazyHomeScreen(navController)
        }
        cakeList.forEach { cake ->
            composable(cake.route) {
                CakeScreen(
                    cakeName = cake.name,
                    cakeImage = cake.imageRes,
                    recipe = cake.recipe,
                    onBack = { navController.popBackStack() },
                    ingredient = cake.ingredients
                )
            }
        }
    }
}
