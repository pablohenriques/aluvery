package br.com.sousa.aluvery.dao

import androidx.compose.runtime.mutableStateListOf
import br.com.sousa.aluvery.model.Product
import br.com.sousa.aluvery.sampledata.sampleProducts

class ProductDao {

    companion object {
        private val products = mutableStateListOf<Product>(*sampleProducts.toTypedArray())
    }

    fun products() = products.toList()

    fun save(product: Product) {
        products.add(product)
    }
}