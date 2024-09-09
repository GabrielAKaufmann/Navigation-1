import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Scaffold {
        Column(
            modifier = Modifier.fillMaxSize().padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("Bem-vindo à Caça ao Tesouro!")
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { navController.navigate("clue1") }) {
                Text("Iniciar Caça ao Tesouro")
            }
        }
    }
}
