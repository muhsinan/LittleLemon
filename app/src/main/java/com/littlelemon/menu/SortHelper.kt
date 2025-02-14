package com.littlelemon.menu

class SortHelper {

    fun sortProducts(type: SortType, productsList: List<ProductItem>): List<ProductItem> {
        return when (type) {
            SortType.Alphabetically -> productsList.sortAlphabetically()
            SortType.PriceAsc -> productsList.sortAscendingly()
            SortType.PriceDesc -> productsList.sortDescendingly()
        }
    }

    private fun List<ProductItem>.sortAlphabetically(): List<ProductItem> {
        return sortedBy { it.title }
    }

    private fun List<ProductItem>.sortAscendingly(): List<ProductItem> {
        return sortedBy { it.price }
    }

    private fun List<ProductItem>.sortDescendingly(): List<ProductItem> {
        return sortedBy {-it.price}
    }
}