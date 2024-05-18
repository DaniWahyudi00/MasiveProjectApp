package com.example.masiveprojectapp.screens.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import com.example.masiveprojectapp.R
import com.example.masiveprojectapp.model.Project
import com.example.masiveprojectapp.ui.theme.MasiveProjectAppTheme

@Composable
fun ProjectItem(
    project: Project,
    modifier: Modifier,
    onItemClicked : (Int) -> Unit

){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.clickable
        {
            onItemClicked(project.id)
        }
    ) {
        Image(
            painter = painterResource(id = project.photo),
            contentDescription = project.name,
            modifier= Modifier
                //.clip()
                .fillMaxWidth(),
        )

        Text(
            text = project.name,
            style = MaterialTheme.typography.titleSmall,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Left,
            modifier = Modifier.fillMaxWidth(),
            maxLines = 1

        )
        Text(
            text = project.place,
            color = MaterialTheme.colorScheme.primary,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.fillMaxWidth(),
            maxLines = 1
        )

        // masih Error
//        Text(text = project.price,
//            color = MaterialTheme.typography.bodySmall,
//            overflow = TextOverflow.Ellipsis,
//            textAlign = TextAlign.Left,
//            modifier = Modifier.fillMaxWidth(),
//            maxLines = 1
//        )

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