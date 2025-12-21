package br.com.sousa.aluvery.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material3.Surface
import br.com.sousa.aluvery.ui.screen.ProductFormScreen
import br.com.sousa.aluvery.ui.theme.AluveryTheme
import br.com.sousa.aluvery.ui.viewmodels.ProductFormScreenViewModel

class ProductFormActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AluveryTheme {
                Surface {
                    val viewModel: ProductFormScreenViewModel by viewModels()
                    ProductFormScreen(
                        viewModel = viewModel,
                        onSaveClick = {
                            finish()
                        })
                }
            }
        }
    }
}