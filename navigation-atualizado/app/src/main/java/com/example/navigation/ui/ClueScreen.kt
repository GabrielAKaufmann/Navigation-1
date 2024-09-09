import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun ClueScreen(navController: NavController, clueNumber: Int) {
    val clueText = when (clueNumber) {
        1 -> "Pista 1: O que tem um pescoço mas não tem cabeça?"
        2 -> "Pista 2: O que pode ser quebrado mas nunca é segurado?"
        3 -> "Pista 3: O que tem chaves mas não pode abrir portas?"
        else -> "Pista não encontrada."
    }

    Scaffold {
        Column(
            modifier = Modifier.fillMaxSize().padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(clueText)
            Spacer(modifier = Modifier.height(16.dp))
            Row {
                Button(onClick = {
                    if (clueNumber < 3) {
                        navController.navigate("clue${clueNumber + 1}")
                    } else {
                        navController.navigate("treasure")
                    }
                }) {
                    Text("Próxima Pista")
                }
                Spacer(modifier = Modifier.width(16.dp))
                Button(onClick = {
                    if (clueNumber > 1) {
                        navController.navigate("clue${clueNumber - 1}")
                    } else {
                        navController.navigate("home")
                    }
                }) {
                    Text("Voltar")
                }
            }
        }
    }
}
