package com.example.ownyourshoes

object ShoesData {
    private val shoesName = arrayOf(
        "1", //1
        "2", //2
        "3", //3
        "4", //4
        "5", //5
        "6", //6
        "7", //7
        "8", //8
        "9", //9
        "0" //10
    )

    private val shoesDetail = arrayOf(
        "2", //1
        "2", //2
        "2", //3
        "2", //4
        "2", //5
        "2", //6
        "2", //7
        "2", //8
        "2", //9
        "2" //10
    )

    private val shoesPrice = arrayOf(
        "2", //1
        "2", //2
        "2", //3
        "2", //4
        "2", //5
        "2", //6
        "4", //7
        "1", //8
        "2", //9
        "4" //10
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