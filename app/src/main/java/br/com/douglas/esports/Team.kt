package br.com.douglas.esports

data class Team(
    val id: String,
    val name: String
){
    companion object{
        fun getMockTeam()= listOf(
            Team(
                id = "555",
                name = "Fallen"
            ),
            Team(
                id = "789",
                name = "Amendoim"
            ),
            Team(
                id = "123",
                name = "Sacy"
            ),
            Team(
                id = "666",
                name = "Aspas"
            )
        )

    }
}


