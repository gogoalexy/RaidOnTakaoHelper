package base

data class Player(val characterName: String)
{
    init
    {
        val character = when(characterName)
        {
            "Musician" -> Musician()
            "Student" -> Student()
            "Engineer" -> Engineer()
            "Army" -> Army()
            "Doctor" -> Doctor()
            "Cook" -> Cook()
            "Journalist" -> Journalist()
            "Father" -> Father()
            else -> Character()
        }
    }
}
