import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun TreasureHuntApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable("clue1") { ClueScreen(navController, clueNumber = 1) }
        composable("clue2") { ClueScreen(navController, clueNumber = 2) }
        composable("clue3") { ClueScreen(navController, clueNumber = 3) }
        composable("treasure") { TreasureScreen(navController) }
    }
}
