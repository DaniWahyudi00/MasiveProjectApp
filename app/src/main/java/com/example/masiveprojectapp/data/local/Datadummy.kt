package com.example.masiveprojectapp.data.local

import androidx.compose.ui.res.painterResource
import com.example.masiveprojectapp.R
import com.example.masiveprojectapp.model.Arsitek
import com.example.masiveprojectapp.model.ArsitekNew
import com.example.masiveprojectapp.model.DesainNew
import com.example.masiveprojectapp.model.DesainRumah
import com.example.masiveprojectapp.model.DetailProject
import com.example.masiveprojectapp.model.Project
import com.example.masiveprojectapp.model.SliderImage
import com.example.masiveprojectapp.myprofil.MyprofilItem
import com.example.masiveprojectapp.myprofil.UsertItem
import com.example.masiveprojectapp.navigation.Screen


object datadummy {

    val designNew = listOf(
        DesainNew(
            image = R.drawable.desain1,
            name = "Japan Modern Sakura",
            designBy = "design by indah NW",
            description = """
                Japan Modern Sakura adalah desain arsitektur yang memadukan elemen tradisional Jepang dan modern minimalis. Dengan taman sakura sebagai pusat, penggunaan material alami seperti kayu dan batu, serta jendela besar yang memaksimalkan cahaya alami, bangunan ini menciptakan suasana harmonis dan elegan, menggabungkan estetika klasik Jepang dengan fungsionalitas modern
            """.trimIndent(),
            nohp = "+628574701234",
            hargaDesain = "Rp 5.000.000,00",
            rating = "5/5",
            review = "30",
        ),
        DesainNew(
            image = R.drawable.desain2,
            name = "White modern minimalist house",
            designBy = "design by Wishi Halbin",
            description = """
                Rumah dengan perpaduan design modern dan warna putih yang minimalis, mempunyai ruang halaman yang terleta pada depan dan belakang rumah, lahan parkir untuk kendaraan roda dua  dan roda empat.            """.trimIndent(),
            nohp = "+628574701234",
            hargaDesain = "Rp 5.000.000,00",
            rating = "5/5",
            review = "30",
        ),
        DesainNew(
            image = R.drawable.desain3,
            name = "Casa Planes House",
            designBy = "design by Estudio Domero",
            description = """
                Rumah bercorak putih dengan dua lantai menerapkan corak dari bangunan modern eropa, tema rumah dibuat dengan menyatukan elemen alam yang terpancar dari halaman belakang rumah. Dilengkapi dengan kolam renang kecil yang dipadukan dengan nuansa alami.""".trimIndent(),
            nohp = "+628574701234",
            hargaDesain = "Rp 5.000.000,00",
            rating = "5/5",
            review = "30",
        ),
        DesainNew(
            image = R.drawable.desain4,
            name = "Jardin House",
            designBy = "design by Patio Livity",
            description = """
                Proyek visioner ini menawarkan desain arsitektur unik, mempercepat privasi tanpa mengabaikan konektivitas antar ruang fungsional, dan memastikan kenyamanan. Salah satu ciri khas Jardin House adalah penggunaan inovatif dari arsitektur split-level. Desain split-level tidak hanya meningkatkan dinamika ruang tetapi juga berfungsi sebagai sarana untuk menjaga privasi. Meskipun ada pemisahan ruang, kelancaran antara mereka tetap terjaga, menciptakan lingkungan yang menarik dan kohesif. """.trimIndent(),
            nohp = "+628574701234",
            hargaDesain = "Rp 5.000.000,00",
            rating = "5/5",
            review = "30",
        ),
        DesainNew(
            image = R.drawable.desain5,
            name = "Sawa Villa",
            designBy = "design by Stilt",
            description = """
                Desain khusus yang menekankan ruang komunitas, menampilkan area umum yang didedikasikan dan taman bermain, menciptakan lingkungan komunitas yang aman dan mendukung. Proyek ini dirancang dengan cermat untuk mendukung dan meningkatkan interaksi serta kegiatan keluarga, memastikan setiap individu menikmati gaya hidup yang seimbang dan memuaskan. Proyek ini mewakili paradigma baru dalam arsitektur hunian berorientasi keluarga, memadukan desain berkelanjutan dengan fungsionalitas untuk memenuhi kebutuhan beragam kehidupan keluarga.""".trimIndent(),
            nohp = "+628574701234",
            hargaDesain = "Rp 5.000.000,00",
            rating = "5/5",
            review = "30",
        ),
        DesainNew(
            image = R.drawable.desain6,
            name = "Le Kawan House",
            designBy = "design by W+M Design Studio",
            description = """
                kolom kayu ramping berirama yang mendefinisikan ruang tamu terbuka dan dinding batu masif untuk ruang-ruang pribadi. Material yang ada, seperti kayu, batu pasir, teraso, dan ubin semen berwarna, menjadi palet dasar kami untuk merancang bangunan baru. Bahasa arsitektur ini menjadi titik awal saat merancang bangunan baru, dengan beberapa sentuhan untuk menambah kekayaan. """.trimIndent(),
            nohp = "+628574701234",
            hargaDesain = "Rp 5.000.000,00",
            rating = "5/5",
            review = "30",
        ),DesainNew(
            image = R.drawable.desain10,
            name = "Ciasem House",
            designBy = "design by STUDIOKAS",
            description = """
                    Ciasem House adalah rumah bagi sepasang suami istri dan tiga anak mereka. Sebagai kediaman pribadi di Jakarta, sebuah kota dengan paparan sinar matahari yang tinggi dan curah hujan yang lebat, yang terletak di area ramai dengan banyak fasilitas umum, "stacking" menjadi pendekatan untuk menjawab masalah privasi dan iklim.
            """.trimIndent(),
            nohp = "+628574701234",
            hargaDesain = "Rp 5.000.000,00",
            rating = "5/5",
            review = "30",
        ),
        DesainNew(
            image = R.drawable.desain7,
            name = "Well Of Light",
            designBy = "design by Phidias Indonesia",
            description = """
                : The Well of Light House dirancang untuk menjadi oasis bagi para penghuninya. Pendekatan dasarnya adalah menciptakan rumah bergaya Tropical Contemporary. Prinsip utama rumah ini adalah menciptakan pendinginan pasif dengan mengoptimalkan penetrasi cahaya dan aliran udara ke seluruh rumah melalui konfigurasi massa bangunan, fasad solid dan void, serta material. """.trimIndent(),
            nohp = "+628574701234",
            hargaDesain = "Rp 5.000.000,00",
            rating = "5/5",
            review = "30",
        ),
        DesainNew(
            image = R.drawable.desain8,
            name = "Uluwatu House",
            designBy = "design by SAOTA",
            description = """
                Rumah yang terinspirasi dari resor ini terletak di Uluwatu, destinasi selancar ikonik di Bali, memberikan sentuhan kontemporer pada material lokal dan arsitektur vernakular untuk menciptakan rumah liburan modern yang mewah dan selaras dengan keindahan sekitarnya.""".trimIndent(),
            nohp = "+628574701234",
            hargaDesain = "Rp 5.000.000,00",
            rating = "5/5",
            review = "30",
        ),
        DesainNew(
            image = R.drawable.desain9,
            name = "Jae Jiwa Jae Kasinda",
            designBy = "design by RDMA",
            description = """
                iwa Villa dirancang sebagai tempat pelarian dari hiruk-pikuk kehidupan perkotaan. Berbagai jenis kayu, batu bata beton, dan baja dicat hitam dipilih sebagai bahan utama untuk vila tiga lantai ini agar dapat menyatu dengan lingkungan sekitar serta memberi tamu kesempatan untuk melepaskan diri dari rutinitas sehari-hari dan bersantai. Vila ini dirancang untuk mengakomodasi tiga skenario penyewaan di mana tamu dapat memesan kamar studio besar di lantai pertama; menyewa dua suite junior di lantai tiga beserta ruang tamu di lantai dua; atau memesan ketiga lantai sekaligus untuk mengakomodasi kelompok yang lebih besar.""".trimIndent(),
            nohp = "+628574701234",
            hargaDesain = "Rp 5.000.000,00",
            rating = "5/5",
            review = "30",
        ),

    )

    // Design new

    val arsiteksNew = listOf(
        ArsitekNew(
            image = R.drawable.arsitek1,
            name = "Allisa Gerand",
            description = "Halo, saya merupakan seorang arsitek yang sudah berpengalaman menyelesaikan beberapa project Pembuatan arsitektur rumah. Saat ini, saya sudah membuat banyak kebutuhan klien, mulai dari kebutuhan arsitektur. Saya siap melayani Anda dengan memberikan hasil yang terbaik. Segera konsultasikan kebutuhan Anda!",
            nohp = "+628574701234",
            hargajasa = "Rp 30.000.000,00",
            rating = "5/5",
            review = "30",
        ),
        ArsitekNew(
            image = R.drawable.arsitek2,
            name = "Geraldi",
            description = "Halo, saya merupakan seorang arsitek yang sudah berpengalaman menyelesaikan beberapa project Pembuatan arsitektur rumah. Saat ini, saya sudah membuat banyak kebutuhan klien, mulai dari kebutuhan arsitektur. Saya siap melayani Anda dengan memberikan hasil yang terbaik. Segera konsultasikan kebutuhan Anda!",
            nohp = "+628135246473",
            hargajasa = "Rp 20.000.000,00",
            rating = "5/5",
            review = "30",
        ),
        ArsitekNew(
            image = R.drawable.arsitek3,
            name = "Ava Marie",
            description = "Halo, saya merupakan seorang arsitek yang sudah berpengalaman menyelesaikan beberapa project Pembuatan arsitektur rumah. Saat ini, saya sudah membuat banyak kebutuhan klien, mulai dari kebutuhan arsitektur. Saya siap melayani Anda dengan memberikan hasil yang terbaik. Segera konsultasikan kebutuhan Anda!",
            nohp = "+628574701234",
            hargajasa = "Rp 7.000.000,00",
            rating = "5/5",
            review = "30",
        ),
        ArsitekNew(
            image = R.drawable.arsitek4,
            name = "Charlotte Louise",
            description = "Halo, saya merupakan seorang arsitek yang sudah berpengalaman menyelesaikan beberapa project Pembuatan arsitektur rumah. Saat ini, saya sudah membuat banyak kebutuhan klien, mulai dari kebutuhan arsitektur. Saya siap melayani Anda dengan memberikan hasil yang terbaik. Segera konsultasikan kebutuhan Anda!",
            nohp = "+628574701234",
            hargajasa = "Rp 6.000.000,00",
            rating = "5/5",
            review = "30",
        ),
        ArsitekNew(
            image = R.drawable.arsitek5,
            name = "Amelia Claire",
            description = "Halo, saya merupakan seorang arsitek yang sudah berpengalaman menyelesaikan beberapa project Pembuatan arsitektur rumah. Saat ini, saya sudah membuat banyak kebutuhan klien, mulai dari kebutuhan arsitektur. Saya siap melayani Anda dengan memberikan hasil yang terbaik. Segera konsultasikan kebutuhan Anda!",
            nohp = "+628574701234",
            hargajasa = "Rp 5.000.000,00",
            rating = "5/5",
            review = "30",
        ),
        ArsitekNew(
            image = R.drawable.arsitek6,
            name = "James Robert",
            description = "Halo, saya merupakan seorang arsitek yang sudah berpengalaman menyelesaikan beberapa project Pembuatan arsitektur rumah. Saat ini, saya sudah membuat banyak kebutuhan klien, mulai dari kebutuhan arsitektur. Saya siap melayani Anda dengan memberikan hasil yang terbaik. Segera konsultasikan kebutuhan Anda!",
            nohp = "+628574701234",
            hargajasa = "Rp 22.000.000,00",
            rating = "5/5",
            review = "30",
        ),
        ArsitekNew(
            image = R.drawable.arsitek7,
            name = "Oliver John",
            description = "Halo, saya merupakan seorang arsitek yang sudah berpengalaman menyelesaikan beberapa project Pembuatan arsitektur rumah. Saat ini, saya sudah membuat banyak kebutuhan klien, mulai dari kebutuhan arsitektur. Saya siap melayani Anda dengan memberikan hasil yang terbaik. Segera konsultasikan kebutuhan Anda!",
            nohp = "+628574701234",
            hargajasa = "Rp 10.000.000,00",
            rating = "5/5",
            review = "30",
        ),
        ArsitekNew(
            image = R.drawable.arsitek8,
            name = "Benjamin Thomas",
            description = "Halo, saya merupakan seorang arsitek yang sudah berpengalaman menyelesaikan beberapa project Pembuatan arsitektur rumah. Saat ini, saya sudah membuat banyak kebutuhan klien, mulai dari kebutuhan arsitektur. Saya siap melayani Anda dengan memberikan hasil yang terbaik. Segera konsultasikan kebutuhan Anda!",
            nohp = "+628574701234",
            hargajasa = "Rp 34.000.000,00",
            rating = "5/5",
            review = "30",
        ),
        ArsitekNew(
            image = R.drawable.arsitek9,
            name = "Elijah Charles",
            description = "Halo, saya merupakan seorang arsitek yang sudah berpengalaman menyelesaikan beberapa project Pembuatan arsitektur rumah. Saat ini, saya sudah membuat banyak kebutuhan klien, mulai dari kebutuhan arsitektur. Saya siap melayani Anda dengan memberikan hasil yang terbaik. Segera konsultasikan kebutuhan Anda!",
            nohp = "+628574701234",
            hargajasa = "Rp 56.000.000,00",
            rating = "5/5",
            review = "30",
        ),
        ArsitekNew(
            image = R.drawable.arsitek10,
            name = "Ethan Daniel",
            description = "Halo, saya merupakan seorang arsitek yang sudah berpengalaman menyelesaikan beberapa project Pembuatan arsitektur rumah. Saat ini, saya sudah membuat banyak kebutuhan klien, mulai dari kebutuhan arsitektur. Saya siap melayani Anda dengan memberikan hasil yang terbaik. Segera konsultasikan kebutuhan Anda!",
            nohp = "+628574701234",
            hargajasa = "Rp 15.000.000,00",
            rating = "5/5",
            review = "30",
        ),
    )

    // Arsitek //

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

