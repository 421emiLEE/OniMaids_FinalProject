package com.example.onimaids_finalproject.data

class VtuberRepositoryImpl : VtuberRepository{
    override fun getVtubers(): List<Vtuber> {
        return listOf(
            Vtuber(
                "1",
                "Minato Aqua",
                "湊あくあ",
                "https://www.youtube.com/channel/UC1opHUrw8rvnsadT-iGp7Cg",
                "COVER Corp",
                "https://hololive.hololivepro.com/wp-content/uploads/2023/04/Minato-Aqua_list_thumb.png"
            ),
            Vtuber(
                "2",
                "Nakiri Ayame",
                "湊あくあ",
                "https://www.youtube.com/channel/UC7fk0CB07ly8oSl0aqKkqFg",
                "COVER Corp",
                "https://hololive.hololivepro.com/wp-content/uploads/2024/10/Nakiri-Ayame_list_thumb.png"
            ),
            Vtuber(
                "3",
                "Yuzuki Choco",
                "湊あくあ",
                "https://www.youtube.com/channel/UC1suqwovbL1kzsoaZgFZLKg",
                "COVER Corp",
                "https://hololive.hololivepro.com/wp-content/uploads/2023/04/Yuzuki-Choco_list_thumb.png"
            ),
            Vtuber(
                "4",
                "Murasaki Shion",
                "湊あくあ",
                "https://www.youtube.com/channel/UCXTpFs_3PqI41qX2d9tL2Rw",
                "COVER Corp",
                "https://hololive.hololivepro.com/wp-content/uploads/2021/12/shion_thumb.png"
            ),
            Vtuber(
                "5",
                "Oozora Subaru",
                "湊あくあ",
                "https://www.youtube.com/channel/UCvzGlP9oQwU--Y0r9id_jnA",
                "COVER Corp",
                "https://hololive.hololivepro.com/wp-content/uploads/2020/06/Oozora-Subaru_list_thumb.png"
            ),
        )
    }

}