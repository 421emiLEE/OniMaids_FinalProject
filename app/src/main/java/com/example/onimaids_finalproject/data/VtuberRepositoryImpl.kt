package com.example.onimaids_finalproject.data

class VtuberRepositoryImpl : VtuberRepository{
    override fun getVtubers(): List<Vtuber> {
        return listOf(
            Vtuber("Aqua Ch. 湊あくあ", "https://www.youtube.com/channel/UC1opHUrw8rvnsadT-iGp7Cg",  2000, true, ),
            Vtuber("Nakiri Ayame Ch. 百鬼あやめ", "https://www.youtube.com/channel/UC7fk0CB07ly8oSl0aqKkqFg",  2017, true, ),
            Vtuber("Choco Ch. 癒月ちょこ", "https://www.youtube.com/channel/UC1suqwovbL1kzsoaZgFZLKg",  2017, true, ),
            Vtuber("Shion Ch. 紫咲シオン", "https://www.youtube.com/channel/UCXTpFs_3PqI41qX2d9tL2Rw",  2017, true,),
            Vtuber("Subaru Ch. 大空スバル", "https://www.youtube.com/channel/UCvzGlP9oQwU--Y0r9id_jnA", 2018, true, ),
        )
    }

}