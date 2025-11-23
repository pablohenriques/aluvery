package br.com.sousa.aluvery.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.sousa.aluvery.model.Product
import br.com.sousa.aluvery.sampledata.sampleSections
import br.com.sousa.aluvery.ui.components.ProductSection
import br.com.sousa.aluvery.ui.theme.AluveryTheme

@Composable
fun HomeScreen(sections: Map<String, List<Product>>) {
    LazyColumn(
        Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(vertical = 16.dp)
    ) {
        item { Spacer(Modifier) }
        for (section in sections) {
            val title = section.key
            val products = section.value
            item {
                ProductSection(
                    title = title,
                    products = products
                )
            }
        }
        item { Spacer(Modifier) }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    AluveryTheme {
        Surface {
            HomeScreen(sampleSections)
        }
    }
}