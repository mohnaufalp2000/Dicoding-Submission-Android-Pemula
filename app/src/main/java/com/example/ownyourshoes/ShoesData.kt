package com.example.ownyourshoes

object ShoesData {
    private val shoesName = arrayOf(
        "Adidas Harden Stepback Unisex Basketball Shoes - Core Black / Grey Two / Glory Mint", //1
        "Adidas Senseboost GO Women's Running Shoes - Grey", //2
        "Skechers GOwalk 5 - Apprize Men's Leisure Shoes", //3
        "Hi-Tec AW19 FM Rio Men's Walking Shoes - Grey", //4
        "New Balance OMN1S Men's Basketball Shoes - Red Black", //5
        "Nike Renew Fusion Men's Training Shoes - Spruce Aura/White-Black-Volt", //6
        "Nike Precision III Men's Basketball Shoes", //7
        "Puma Zone XT Men's Training Shoes - Black White", //8
        "Reebok Instapump Fury Trail Unisex Leisure Shoes - Black", //9
        "Speedo Training Hybrid Men's Shoes" //10
    )

    private val shoesDetail = arrayOf(
        "Lace up mereka seperti salah satu pencetak gol terbaik dalam permainan. Terinspirasi oleh James Harden, sepatu basket adidas ini ringan dan fleksibel untuk mendominasi di kayu keras dan tahan lama dan nyaman bahkan ketika Anda sedang tidak bermain. Logo Harden khas di lidah melengkapi tampilan.", //1
        "Didesain untuk medan perkotaan yang dinamis, sepatu running ini memiliki upper berbahan rajut ringan yang mengikuti gerakan langkah natural kaki Anda. Platform yang lebar menghasilkan topangan untuk gerakan lateral, dan bantalan responsif mengembalikan energi dalam setiap langkah.", //2
        "Yang terdepan dalam teknologi sepatu untuk berjalan kaki kembali berinovasi dengan Skechers GOwalk 5™ - Apprize. Dengan fitur bantalan ULTRA GO™ yang ringan dan responsif dan COMFORT PILLAR TECHNOLOGY™ berdaya pantul tinggi untuk kenyamanan berjalan terbaik. Bahan rajutan mesh bertekstur halus dan upper sintetis, sistem insole Air Cooled Goga Mat™ untuk kenyamanan.", //2
        "Kombinasi upper rajutan katun halus dan jersey timbul. Kombinasi upper mesh sejuk dan jersey timbul. Desain slip on nyaman. Heel counter halus untuk kemudahan penggunaan. Desain bingkai yang aman. Lapisan likra halus. Collar empuk halus untuk kenyamanan maksimal. Penarik tumit untuk kemudahan penggunaan. Alas kaki EVA yang dapat dilepas dengan lapisan likra di bagian atas untuk kenyamanan sepanjang hari. Midsole EVA dengan Walk-Lite Foam untuk bantalan di bagian bawah kaki yang ringan dan responsif. Outsole empuk dari EVA berdensitas tinggi untuk daya tahan.", //3
        "Model bola basket premium kami dibuat untuk pemain yang bisa melakukan semuanya. Tingkatkan levelnya dengan midsole FuelCell full-length, lepaskan kecepatan dan pantulan yang Anda butuhkan untuk meledak pada saat itu. Konstruksi 3D Ultra Heel dan tim atas FitWeave yang ditanamkan untuk mendapatkan fit yang tahan lama dan terkunci yang menjeritkan ember. Ini hari yang baru, jadi tunggu sebentar. Mainkan permainannya. OMN1S telah mendarat.", //4
        "Nike Renew Fusion memadukan stabilitas, bantalan dan daya tahan untuk sesi pelatihan berdampak tinggi. Busa sol bantal berat, aktivitas tinggi, sementara sangkar kaki bagian tengah mengunci kaki Anda ke alas yang rata dan lebar untuk stabilitas.", //5
        "Buat setiap gerakan berharga dalam Nike Precision III. Sepatu mid-top serba guna ini memberi kombinasi bantalan dan bingkai yang siap digunakan bermain, dengan midsole ringan dan pola traksi memutar untuk dukungan dan pengendalian di atas lapangan.", //6
        "Saat penghitung waktu mundur dan detak jantung meningkat. Itulah zona di mana kemajuan terjadi. Dirancang untuk latihan intensitas tinggi dan berlari serta pelatihan berbasis daya tahan, Zone XT memiliki bantalan, dukungan dan genggaman maksimal, dan desain yang diinspirasi denyut jantung yang mencerminkan jantung yang dibutuhkan untuk terus mendorong. Langsung melalui zona.", //7
        "Dirancang untuk: Santai, gaya sehari-hariBantalan heksagonal lembut, Hexalite outsole jejak karet untuk traksi dan daya tahan", //8
        "Speedo Training Hybrid dengan gaya yang dikemas dengan banyak fitur menjadikannya sepatu yang hebat untuk melengkapi aktivitas gerakan ringan Anda. Gunakan itu sebagai sepatu tanah dan air. Sol bawah dilengkapi dengan teknologi fungsi pengisap gurita yang memberikan cengkeraman yang sangat baik di tanah dan perlindungan terhadap permukaan yang basah dan licin. Lubang air di sol bawah memungkinkan sepatu untuk mengering dan cepat kering." //9
    )

    private val shoesPrice = arrayOf(
        "Rp. 1.400.000,00", //1
        "Rp. 1.260.000,00", //2
        "Rp. 899.000,00", //3
        "Rp. 349.300,00", //4
        "Rp. 2.599.000,00", //5
        "Rp. 1.199.000,00", //6
        "Rp. 899.000,00", //7
        "Rp. 1.599.000,00", //8
        "Rp. 1.799.100,00", //9
        "Rp. 449.100,00" //10
    )

    private val shoesImage = intArrayOf(
        R.drawable.adidasharden,
        R.drawable.adidassense,
        R.drawable.gowalk,
        R.drawable.hitecrio,
        R.drawable.newbalanceboma,
        R.drawable.nikemulti,
        R.drawable.nikeprecision,
        R.drawable.pumazone,
        R.drawable.rebookpump,
        R.drawable.speedohybrid
    )


    val listData : ArrayList<Shoes> //Untuk mainActivity, fungsinya saya kurang tau

    get(){
        val list = arrayListOf<Shoes>()
        for (position in shoesName.indices){
            val shoesData = Shoes() //Membuat Objek dari Data Class Shoes

            shoesData.name = shoesName[position]
            shoesData.detail = shoesDetail[position]
            shoesData.price = shoesPrice[position]
            shoesData.image = shoesImage[position]

            list.add(shoesData)
        }
        return list
    }

}