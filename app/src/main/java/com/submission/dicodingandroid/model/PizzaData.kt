package com.submission.dicodingandroid.model

object PizzaData {
    var data = arrayOf(
        arrayOf(
            "1",
            "Meat Lover",
            "Pizza yang ini masih buat kamu yang gemar dengan daging sapi dan ayam karena pizza ini isinya berupa daging sapi cicang, sosis sapi dan daging ayam cicang.",
            "http://submissionkominfo.imucreative.click/uploads/menu/meat-lover.jpg",
            "Rp. 49.500",
            "Pizza",
            "Irisan sosis sapi, daging sapi cincang, burger sapi, sosis ayam."
        ),
        arrayOf(
            "2",
            "Super Supreme",
            "Pizza Jenis ini merupakan Campuran Pepperoni daging sapi baik diasap maupun dicincang sangat cocok buat kamu yang demen daging sapi.",
            "http://submissionkominfo.imucreative.click/uploads/menu/supreme.jpg",
            "Rp. 49.500",
            "Pizza",
            "Daging ayam dan sapi asap, daging sapi cincang, burger sapi, jamur, paprika merah dan paprika hijau."
        ),
        arrayOf(
            "3",
            "Tuna Melt",
            "Pizza Tuna Melt ini terdiri dari ikan tuna filet, dan jagung. Jika anda Suka seafood, Pizza yang ini paling pas buat anda.",
            "http://submissionkominfo.imucreative.click/uploads/menu/tuna-melt.jpg",
            "Rp. 49.500",
            "Pizza",
            "Irisan daging ikan tuna, butiran jagung, saus mayonnaise."
        ),
        arrayOf(
            "4",
            "American Favourite",
            "Orang amerika paling suka beli pizza yang ini karena isinya Pepperoni sapi, daging sapi cincang dan jamur segar.",
            "http://submissionkominfo.imucreative.click/uploads/menu/american-favourite.jpg",
            "Rp. 49.500",
            "Pizza",
            "Pepperoni sapi, daging sapi cincang, jamur."
        ),

        arrayOf(
            "5",
            "Beef Spaghetti",
            "Spageti yang ditaburi dengan daging sapi asli yang dicincang serta lumuran saus tomat yang segar membuat spageti ini memiliki rasa yang sangat enak. Selai itu, tambahan keju cheedar di beef spaghetti ini membuat rasanya menjadi lebih gurih.",
            "http://submissionkominfo.imucreative.click/uploads/menu/beef-spaghetti.jpg",
            "Rp. 43.000",
            "Pasta",
            "Pepperoni sapi, daging sapi cincang, jamur"
        ),
        arrayOf(
            "6",
            "Beef Lasagna",
            "Pasta ini dimasak dengan cara dipanggang, sehingga menarik perhatian konsumen untuk mencobanya. Dengan campuran daging sapi asli yang dicincang kecil-kecil serta tambahan krim putih yang lembut di setiap lapisannya membuat rasa pasta ini semakin nendang.",
            "http://submissionkominfo.imucreative.click/uploads/menu/beef-lasagna.jpg",
            "Rp. 43.000",
            "Pasta",
            "Dipanggang, daging sapi cincang. krim putih lembut di tiap lapisan."
        ),
        arrayOf(
            "7",
            "Creamy Beef Fettuccine",
            "Pasta ini berisi daging ayam yang diasap dengan campuran jamur tiram yang segar sebagai bahan pelengkapnya. Campuran bahan tersebut kemudia ditumis dengan saus krim yang sangat lembut yang dapat membuat pasta menjadi semakin gurih dan banyak digemari konsumen.",
            "http://submissionkominfo.imucreative.click/uploads/menu/creamy-beef-fettuccine.jpg",
            "Rp. 43.000",
            "Pasta",
            "Daging sapi asap dan jamur, ditumis dengan saus krim lembut."
        ),

        arrayOf(
            "8",
            "Meatballs Beef Mushroom",
            "Nasi dengan bola daging sapi lembut disiram saus daging sapi cincang dan jamur.",
            "http://submissionkominfo.imucreative.click/uploads/menu/meatballs-beef-mushroom.jpg",
            "Rp. 40.000",
            "Rice",
            "Bola daging sapi dengan saus daging sapi cincang dan jamur."
        ),
        arrayOf(
            "9",
            "Black Pepper Chicken",
            "Nasi dengan potongan ayam disiram saus lada hitam dan taburan wijen.",
            "http://submissionkominfo.imucreative.click/uploads/menu/black-pepper-chicken.jpg",
            "Rp. 40.000",
            "Rice",
            "Ayam dengan saus lada hitam."
        ),
        arrayOf(
            "10",
            "Oriental Chicken",
            "Nasi dengan potongan ayam panggang, disiram saus oriental yang pas manisnya",
            "http://submissionkominfo.imucreative.click/uploads/menu/oriental-chicken.jpg",
            "Rp. 40.000",
            "Rice",
            "Daging ayam berpadu dengan saus oriental."
        ),

        arrayOf(
            "11",
            "Choco Mint",
            "Conlat yang menyegarkan.",
            "http://submissionkominfo.imucreative.click/uploads/menu/choco-mint.jpg",
            "Rp. 20.000",
            "Drink",
            "Coklat dan Daun Mint"
        ),
        arrayOf(
            "12",
            "Toffee Coffee",
            "Cofee untuk anda yang doyan ngopi",
            "http://submissionkominfo.imucreative.click/uploads/menu/toffee-coffee.jpg",
            "Rp. 20.000",
            "Drink",
            "Cofee"
        ),
        arrayOf(
            "13",
            "Green Tea Shake",
            "Green Tea dingin yang di shake ditambah icekrim diatasnya",
            "http://submissionkominfo.imucreative.click/uploads/menu/green-tea-shake.jpg",
            "Rp. 20.000",
            "Drink",
            "Green Tea"
        ),
        arrayOf(
            "14",
            "Strawberry Milkshake",
            "Ice strawberry yang di shake dan diberikan icekrim diatasnya",
            "http://submissionkominfo.imucreative.click/uploads/menu/strawberry-milkshake.jpg",
            "Rp. 20.000",
            "Drink",
            "Strawbery & Ice"
        ),
        arrayOf(
            "15",
            "Chocolate Milkshake",
            "Coklat yang di shake ditambah Icekrim yang sangat dingin dan menyegarkan",
            "http://submissionkominfo.imucreative.click/uploads/menu/chocolate-milkshake.jpg",
            "Rp. 20.000",
            "Drink",
            "Chocolate & Ice"
        )

    )

    var valueCategory: String = ""
    val listData: ArrayList<Pizza>
        get() {
            val list = ArrayList<Pizza>()

            for (aData in data) {
                if (aData[5] == valueCategory) {
                    val hero = Pizza()
                    hero.nomor = aData[0]
                    hero.name = aData[1]
                    hero.description = aData[2]
                    hero.photo = aData[3]
                    hero.price = aData[4]
                    hero.category = aData[5]
                    hero.receip = aData[6]
                    list.add(hero)
                }
            }
            return list
        }
}