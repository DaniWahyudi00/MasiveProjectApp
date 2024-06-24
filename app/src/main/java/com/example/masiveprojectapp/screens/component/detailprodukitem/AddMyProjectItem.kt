package com.example.masiveprojectapp.screens.component.detailprodukitem

import android.graphics.BitmapFactory
import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.masiveprojectapp.R
import com.example.masiveprojectapp.screens.component.alertdialog.AlertChangeProfile
import com.example.masiveprojectapp.screens.component.alertdialog.AlertSuccessAddProject
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme
import com.example.masiveprojectapp.ui.theme.poppinsFontFamily
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@Composable
fun AddMyProjectItem(
    modifier: Modifier,
    navController: NavController

) {
    var price by remember { mutableStateOf("") }
    var name by remember { mutableStateOf("") }
    var owner by remember { mutableStateOf("") }
    var size by remember { mutableStateOf("") }
    var condition by remember { mutableStateOf("") }
    val openDialog = remember { mutableStateOf(false) }
    var description by remember { mutableStateOf("") }
    var mainImageUri by remember { mutableStateOf<Uri?>(null) }
    var additionalImageUris by remember { mutableStateOf<List<Uri>>(emptyList()) }


    val launcher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetMultipleContents()
    ) { uris ->
        if (mainImageUri == null && uris.isNotEmpty()) {
            mainImageUri = uris.first()
            additionalImageUris = uris.drop(1)
        } else {
            additionalImageUris = uris
        }
    }
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(start = 15.dp, end = 15.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(245.dp)
        ) {
            if (mainImageUri != null) {
                val bitmap = loadImageFromUri(mainImageUri!!)
                bitmap?.let {
                    Image(
                        bitmap = it,
                        contentDescription = null,
                        modifier = Modifier
                            .matchParentSize()
                            .clickable {
                                // Handle click event to select new main image
                                launcher.launch("image/*")
                            },
                        contentScale = ContentScale.Crop
                    )
                }
            } else {
                Image(
                    painter = painterResource(id = R.drawable.rumah1),
                    contentDescription = null,
                    modifier = Modifier
                        .matchParentSize()
                        .clickable {
                            // Handle click event to select new main image
                            launcher.launch("image/*")
                        },
                    contentScale = ContentScale.Crop
                )
            }

            FloatingActionButton(
                onClick = { launcher.launch("image/*") },
                containerColor = Color(0xFF5E8451),
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(16.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_add_24),
                    contentDescription = "Tambah Gambar",
                    tint = Color.White
                )
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = price,
            onValueChange = { price = it },
            singleLine = true,
            textStyle = LocalTextStyle.current.copy(fontSize = 16.sp),
            label = { Text("Harga Project :") },
            modifier = Modifier
                .fillMaxWidth()

        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            singleLine = true,
            label = { Text("Nama Project :") },
            modifier = Modifier
                .fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Product Details ",
            style = TextStyle(
                fontSize = 16.sp,
                lineHeight = 22.sp,
                fontFamily = poppinsFontFamily,
                fontWeight = FontWeight(600),
                color = Color(0xFF111928)
            )
        )

        Spacer(modifier = Modifier.height(4.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),  // Fill the width of the parent
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(55.dp, Alignment.CenterHorizontally),
            ) {
            Text("Owner", modifier = Modifier.align(Alignment.CenterVertically))
            OutlinedTextField(
                singleLine = true,
                value = owner,
                onValueChange = { owner = it },
                label = { Text("Owner Project") },
                modifier = Modifier
                    .weight(1f)
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),  // Fill the width of the parent
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(20.dp, Alignment.CenterHorizontally)
        ) {
            Text("Size House", modifier = Modifier.align(Alignment.CenterVertically))
            OutlinedTextField(
                value = size,
                singleLine = true,
                onValueChange = { size = it },
                label = { Text("Size: ") },
                modifier = Modifier
                    .weight(1f)
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),  // Fill the width of the parent
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(27.dp, Alignment.CenterHorizontally)
        ) {
            Text("Condition", modifier = Modifier)
            OutlinedTextField(
                value = condition,
                singleLine = true,
                onValueChange = { condition = it },
                label = { Text("Condition :") },
                modifier = Modifier
                    .weight(1f)
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Deskripsi Project",
            style = TextStyle(
                fontSize = 16.sp,
                lineHeight = 22.sp,
                fontFamily = poppinsFontFamily,
                fontWeight = FontWeight(600),
                color = Color(0xFF111928)
            )
        )

        OutlinedTextField(
            value = description,
            onValueChange = { description = it },
            singleLine = true,
            label = { Text("Description :") },
            maxLines = 4,
            modifier = Modifier
                .fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(12.dp))

        /*Text("Masukkan harga Project :", style = MaterialTheme.typography.bodyLarge)
        OutlinedTextField(
            value = price,
            onValueChange = { price = it },
            singleLine = true,
            label = { Text("Price :") },
            modifier = Modifier
                .fillMaxWidth()
        )*/

        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 15.dp)
        ) {
            Button(
                onClick = { navController.navigateUp() },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFD9D9D9)),
                modifier = Modifier
                    .width(160.dp)
                    .height(37.dp)
                    .background(
                        color = Color(0xFFD9D9D9),
                        shape = RoundedCornerShape(size = 11.dp)
                    )
            ) {
                Text(
                    text = "Cancel",
                    style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 25.sp,
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF000000),

                        textAlign = TextAlign.Center,
                    )
                )
            }

            Button(
                onClick = { openDialog.value = true },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF5E8451)),
                modifier = Modifier
                    .width(160.dp)
                    .height(37.dp)
                    .background(
                        color = Color(0xFF5E8451),
                        shape = RoundedCornerShape(size = 11.dp)
                    )
            ) {
                Text(
                    text = "Save",
                    style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 25.sp,
                        fontFamily = poppinsFontFamily,
                        fontWeight = FontWeight(500),
                        color = Color(0xFFFFFFFF),
                        textAlign = TextAlign.Center,
                    )
                )
            }
        }
        if (openDialog.value){
            AlertSuccessAddProject(onDismiss = { openDialog.value = false}, navController = rememberNavController(), onConfirm = {navController.navigateUp()})
        }
    }
}

@Composable
fun loadImageFromUri(uri: Uri): ImageBitmap? {
    val context = LocalContext.current
    var bitmap: ImageBitmap? by remember { mutableStateOf(null) }
    val coroutineScope = rememberCoroutineScope()

    LaunchedEffect(uri) {
        coroutineScope.launch {
            bitmap = withContext(Dispatchers.IO) {
                context.contentResolver.openInputStream(uri)?.use { inputStream ->
                    BitmapFactory.decodeStream(inputStream)?.asImageBitmap()
                }
            }
        }
    }

    return bitmap
}

@Preview(showBackground = true)
@Composable
fun DetailProdukItemPreview() {
    MasiveProjectAppTheme {
        AddMyProjectItem(modifier = Modifier, navController = rememberNavController(),)
    }
}