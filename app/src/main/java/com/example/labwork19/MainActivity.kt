package com.example.labwork19

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.labwork19.ui.theme.LabWork19Theme
import androidx.compose.material3.Card

import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text

import androidx.compose.ui.unit.dp

import androidx.activity.compose.setContent
import androidx.compose.animation.expandHorizontally
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.runtime.mutableStateOf
import androidx.compose.material3.TextField
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.derivedStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.foundation.layout.Arrangement


import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.lazy.LazyListState
import kotlinx.coroutines.CoroutineScope
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.launch

import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //ProductColumn()
            //ProductRow()
            //ProductVerticalGrid()
            ProductHorizontalGrid()
        }
    }
}

@Composable
fun ProductHorizontalGrid() {

    val gridState = rememberLazyGridState()


    LazyHorizontalGrid(
        state = gridState,
        rows = GridCells.Fixed(4),
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp)
    ) {
        items(products){product -> CircleProductCard(product)}
    }
}

@Composable
fun ProductVerticalGrid() {

    val gridState = rememberLazyGridState()

    LazyVerticalGrid(
        state = gridState,
        columns = GridCells.Fixed(2),
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp)
    ) {
        items(products){product -> CircleProductCard(product)}
    }
}

@Composable
fun ProductRow(){
    var selectedProduct = remember { mutableStateOf<Product?>(null) }


    Column() {
        Text(
            "Выбранный товар: ${selectedProduct.value?.name ?: "Нет"}",
            modifier = Modifier.padding(30.dp)
        )
        LazyRow(modifier = Modifier.padding(30.dp)) {
            items(products){ product ->
                CircleProductCard(product,
                )
            }
        }
    }
}

@Composable
fun ProductColumn(){
    var selectedProduct = remember { mutableStateOf<Product?>(null) }
    val listState = rememberLazyListState()
    val showButton = remember { derivedStateOf { listState.firstVisibleItemIndex > 0 } }
    val coroutineScope = rememberCoroutineScope()

    Column() {
        Row() {
            Text(
                "Выбранный товар: ${selectedProduct.value?.name ?: "Нет"}",
                modifier = Modifier.padding(30.dp)
            )
            Button(onClick = { coroutineScope.launch { listState.scrollToItem(index
            = 0) }},
                modifier = Modifier.padding(30.dp),
                enabled = showButton.value
            ){
                Text("Назад")
            }
        }
        LazyColumn(modifier = Modifier.padding(30.dp), state = listState) {
            items(products) { product ->
                ProductCard(product, onProductClick = { clickedProduct ->
                    selectedProduct.value = clickedProduct
                })
            }
        }
    }
}


@Composable
fun ProductCard(product: Product, onProductClick: (Product) -> Unit) {
    Card(
        modifier = Modifier
            .padding(10.dp)
            .clickable { onProductClick(product) },
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp),


            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Image(
                    bitmap = ImageBitmap.imageResource(product.imageId),
                    contentDescription = "Product Image",
                    modifier = Modifier
                        .size(48.dp)
                )
                Text(
                    text = product.name,

                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "$${ product.price}",
                fontSize = 18.sp
            )
        }
    }
}

@Composable
fun CircleProductCard(product: Product) {
    Card(
        modifier = Modifier
            .padding(30.dp)

    ) {
        Column(
            modifier = Modifier
                .padding(16.dp),

            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                bitmap = ImageBitmap.imageResource(product.imageId),
                contentDescription = "Product Image",

                modifier = Modifier.size(48.dp).clip(CircleShape)

            )

            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = product.name,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "$${ product.price}",
                fontSize = 18.sp
            )
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LabWork19Theme {
        Greeting("Android")
    }
}

data class Product(val article : Int, val name : String, val price : Float, val imageId : Int)

val products = listOf(
    Product(1001, "Oil", 1299.99f, R.drawable.oil),
    Product(1002, "Tomato", 99.99f, R.drawable.tomato),
    Product(1003, "Tea", 199.99f, R.drawable.tea),
    Product(1004, "Eggs", 499.99f, R.drawable.eggs),
    Product(1005, "Meat", 129.99f, R.drawable.meat),
    Product(1006, "Milk", 349.99f, R.drawable.milk),
    Product(1007, "Apple", 799.99f, R.drawable.apple),
    Product(1008, "Banana", 599.99f, R.drawable.banana),
    Product(1009, "Bread", 399.99f, R.drawable.bread),
    Product(1010, "Cabbage", 179.99f, R.drawable.cabbage),
    Product(1011, "Coffee", 349.99f, R.drawable.coffe),
    Product(1012, "Cookies", 279.99f, R.drawable.cookies),
    Product(1013, "Cucumber", 699.99f, R.drawable.cucumber),
    Product(1014, "Flour", 549.99f, R.drawable.flour),
    Product(1015, "Gingerbread", 1499.99f, R.drawable.gingerbread),
    Product(1016, "Juice", 1799.99f, R.drawable.juice),
    Product(1017, "Porridge", 499.99f, R.drawable.porridge),
    Product(1018, "Sausage", 499.99f, R.drawable.sausage),
    Product(1019, "Shrimp", 749.99f, R.drawable.shrimp),
    Product(1020, "Water", 99.99f, R.drawable.water)
)