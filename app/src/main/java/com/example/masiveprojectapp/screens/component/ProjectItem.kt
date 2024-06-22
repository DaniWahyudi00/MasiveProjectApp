package com.example.masiveprojectapp.screens.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.masiveprojectapp.R
import com.example.masiveprojectapp.model.Project
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme

@Composable
fun ProjectItem(
    project: Project,
    modifier: Modifier,
    onItemClicked : (Int) -> Unit

) {
    Row(
        modifier = modifier
            .padding(10.dp)
            .clip(shape = RoundedCornerShape(14.dp))
            .border(BorderStroke(3.dp,Color.Black), RoundedCornerShape(14.dp))
            .background(color = Color.White)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .clickable
                {
                    onItemClicked(project.id)
                }
        ) {
            Row(
                modifier = modifier
                    .padding(10.dp)
                    .clip(shape = RoundedCornerShape(8.dp))
            ) {
                Box(
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(8.dp))
                        .background(color = Color.White)
                ) {

                    Image(
                        painter = painterResource(id = project.photo),
                        contentDescription = "Photo_Project",
                        modifier = Modifier
                            //.clip()
                            .align(alignment = Alignment.TopStart)
                            .fillMaxWidth(),

                        )
                }
            }
            Text(
                text = project.name,
                style = MaterialTheme.typography.titleSmall,
                fontSize = 16.sp,
                overflow = TextOverflow.Ellipsis,
                textAlign = TextAlign.Left,
                modifier = Modifier.fillMaxWidth()
                    .padding(start = 10.dp, top = 20.dp),
                maxLines = 1

            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp)) {
                Text(
                    text = project.place,
                    style = MaterialTheme.typography.bodySmall,
                    fontSize = 14.sp,
                    color = Color(0xFF888888),
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier,
                    maxLines = 1
                )
                Text(
                    text = "|  ${project.year}",
                    style = MaterialTheme.typography.bodySmall,
                    fontSize = 14.sp,
                    color = Color(0xFF888888),
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier
                        .padding(start = 10.dp),
                )
            }
            Text(
                text = project.price,
                style = MaterialTheme.typography.titleMedium,
                fontSize = 18.sp,
                overflow = TextOverflow.Ellipsis,
                textAlign = TextAlign.Left,
                modifier = Modifier.fillMaxWidth()
                    .padding(start = 10.dp, top = 20.dp),
                maxLines = 1)

        }

    }
}

@Preview(showBackground = true)
@Composable
private fun ArsitekItemPreview(){
    MasiveProjectAppTheme {
        ProjectItem(
            project = Project(
                1, "Rumah Modern White", "Bali", "Rp xxx.xxx.xxx","2015", R.drawable.project1
            ),
            modifier = Modifier,
            onItemClicked = { projectId -> println("Arsitek Id : $projectId") }
        )
    }
}