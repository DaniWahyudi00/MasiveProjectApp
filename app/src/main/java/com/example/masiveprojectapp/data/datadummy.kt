package com.example.masiveprojectapp.data

import com.example.masiveprojectapp.R
import com.example.masiveprojectapp.model.Arsitek
import com.example.masiveprojectapp.model.DesainRumah
import com.example.masiveprojectapp.model.DetailProject
import com.example.masiveprojectapp.model.Project
import com.example.masiveprojectapp.model.SliderImage
import com.example.masiveprojectapp.myprofil.MyprofilItem
import com.example.masiveprojectapp.myprofil.UsertItem
import com.example.masiveprojectapp.navigation.Screen


object datadummy {

    val Arsiteks = listOf(
        Arsitek(
            id = 1,
            name = "Allisa Gerand",
            role = "Architect & Building Designer",
            description = "Halo, saya merupakan seorang arsitek yang sudah berpengalaman menyelesaikan beberapa project Pembuatan arsitektur rumah. \n" +
                    "Saat ini, saya sudah membuat banyak kebutuhan klien, mulai dari kebutuhan arsitektur. \n" +
                    "Saya siap melayani Anda dengan memberikan hasil yang terbaik. Segera konsultasikan kebutuhan Anda!",
            photo = R.drawable.arsitel_cewe1,
            nohp = +62 - 8123 - 4567 - 8901,
            website = "www.website.com",
            hargajasa = "Rp xxx.xxx.xxx"
        ),
        Arsitek (
            id = 2,
            name = "Adam wong",
            role = "Architect",
            description = "Halo, saya merupakan seorang arsitek yang sudah berpengalaman menyelesaikan beberapa project Pembuatan arsitektur rumah. \n" +
                    "Saat ini, saya sudah membuat banyak kebutuhan klien, mulai dari kebutuhan arsitektur. \n" +
                    "Saya siap melayani Anda dengan memberikan hasil yang terbaik. Segera konsultasikan kebutuhan Anda!",
            photo = R.drawable.arsitek_cewe,
            nohp = +62-8123-4567-8901,
            website = "www.website.com",
            hargajasa = "Rp xxx.xxx.xxx"
        )

    )

    val DesainRumahs = listOf(
        DesainRumah(
            id = 1,
            name = "Japan Modern Sakura",
            description = "Belum tau",
            price = "Rp xxx.xxx.xxx",
            photo = R.drawable.rumah1
        )
    )

    val Projects = listOf(
        Project(
            id = 1,
            name = "Modern House White",
            place ="Bali",
            price = "Rp xxx.xxx.xxx",
            year = "2015",
            photo = R.drawable.project1
        )

    )

    val sliderImage = listOf(
        SliderImage(R.drawable.image_slider_one),
        SliderImage(R.drawable.image_slider_two),
        SliderImage(R.drawable.image_slider_three),
    )

//    val Myprofils = listOf(
//        Myprofil(
//            id = 1,
//            name = "Richard Solikin",
//            telephone = "+6212-3456-7890",
//            email = "dummy@gmail.com",
//            password = "password",
//            gender = "man",
//            screen =
//        )
//    )

    val MyprofilItems = listOf(
        MyprofilItem(
            id = 1,
            title = "My Profil",
            icon = R.drawable.icon_profile_on_profile_screen,
            screen = Screen.MyProfile

        ),MyprofilItem(
            id = 2,
            title = "My Project",
            icon = R.drawable.icon_my_project_on_profile_screen,
            screen = Screen.MyProfile
        ),
        MyprofilItem(
            id = 3,
            title = "Forum",
            icon = R.drawable.icon_forum_on_profile_screen,
            screen = Screen.Profile
    ),
        MyprofilItem(
            id = 4,
            title = "Help Center",
            icon = R.drawable.icon_help_center_on_profile_screen,
            screen = Screen.Profile
    ),
        MyprofilItem(
            id = 5,
            title = "Logout",
            icon = R.drawable.icon_forum_on_profile_screen,
            screen = Screen.Profile
        )
    )

    val UsertItems = listOf(
        UsertItem(
            id = 1,
            username = "Richard Solikin",
            photo = R.drawable.user
        )
    )
    val DetailProjects = listOf(
        DetailProject(
            id = 1,
            name = "Japan Modern Sakura",
            owner = "Rizva",
            price = "Rp xxx.xxx.xxx",
            roomarea = "10 X 10 M",
            description = "Ini berisi desrkripsi",
            condition = "Sempura"
        )

    )
}

