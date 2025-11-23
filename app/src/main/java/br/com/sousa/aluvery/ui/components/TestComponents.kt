package br.com.sousa.aluvery.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.sousa.aluvery.ui.theme.AluveryTheme

@Composable
fun MyFirtsComposable(){
    Text(text = "My first composable")
    Text(text = "My second composable")
}

@Preview(showBackground = true)
@Composable
fun ColumnPreview(){
    Column {
        Text("Text 1")
        Text("Text 2")
    }
}

@Preview(showBackground = true)
@Composable
fun RowPreview() {
    Row {
        Text(text = "Texto 1")
        Text(text = "Texto 1")
    }
}

@Preview(showBackground = true)
@Composable
fun BoxPreview() {
    Box {
        Text(text = "Texto 1")
        Text(text = "Texto 1")
    }
}

@Preview(showBackground = true, widthDp = 300)
@Composable
fun CustomLayoutPreview() {
    Row {
        Text(text = "Texto 1 LInha")
        Text(text = "Texto 2 Linha")
        Column(Modifier
            .background(color = Color.Blue).padding(all = 8.dp).background(color = Color.Red)
        ) {
            Text(text = "Texto 1 Coluna")
            Text(text = "Texto 2 Coluna")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyFirtsComposablePreview(){
    AluveryTheme {
        Surface() {
            MyFirtsComposable()
        }
    }
}