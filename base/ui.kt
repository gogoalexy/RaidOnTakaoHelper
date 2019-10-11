package base

class UserInterface()
{
    var numberOfPlayer: Int = 1
    
    fun askNumberOfPlayer()
    {
        print("Please enter the number of player: ")
        numberOfPlayer = Integer.valueOf(readLine()!!)
    }
    
    val playerProfile = mutableListOf(Player("Character"))
    
    fun askCharactersPresent()
    {
        for(characterNumber in 1..numberOfPlayer)
        {
            print("Please enter character $characterNumber: ")
            val characterName: String = readLine()!!
            playerProfile.add(Player(characterName))
        }
    }
    
    fun getResults(playerNumber: Int): Player
    {
        return playerProfile.get(playerNumber)
    }
}
