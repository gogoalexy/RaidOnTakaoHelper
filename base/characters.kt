package base

enum class RELIGION {
    NA, Tradition, Christian, Shinto
}

enum class FETTER {
    Perseverance, Fulfill, Regret
}

open class Character()
{
    var Hp: Int = 7
    var Anxiety: Int = 0

    fun hurt(hp: Int)
    {
        Hp -= hp
    }

    fun cure(hp: Int)
    {
        Hp += hp
        if (Hp > 7)
        Hp = 7
    }

    fun fear(anxiety: Int)
    {
        Anxiety += anxiety
    }

    fun calm(anxiety: Int)
    {
        Anxiety -= anxiety
        if (Anxiety < 0)
        Anxiety = 0
    }
    
    fun isDead(): Boolean
    {
        var status: Boolean
        if (Hp !in 0..7)
            status = true
        else if (Anxiety !in 0..7)
            status = true
        else if (Hp == Anxiety)
            status = true
        else
            status = false
        return status
    }

    var AbilityUsed: Boolean = false

    fun isAbilityUsed() : Boolean
    {
        return AbilityUsed
    }

    var Strength: Int = 2
    var GiveUpMove: Boolean = false

    fun isStrengthLocked() : Boolean
    {
        return GiveUpMove
    }

    fun giveUpMove()
    {
        GiveUpMove = true
    }

    fun useStrength()
    {
        Strength -= 1
    }

    fun recoverStrength(strength: Int)
    {
        Strength += strength
    }

    open val Religion = RELIGION.NA

    var FetterI = FETTER.Perseverance
    var FetterII = FETTER.Perseverance
    var FetterIII = FETTER.Perseverance

}

class Musician() : Character()
{
    override val Religion = RELIGION.Tradition
}

class Student() : Character()
{
    override val Religion = RELIGION.Tradition
}

class Engineer() : Character()
{
    override val Religion = RELIGION.Shinto
}

class Army() : Character()
{
    override val Religion = RELIGION.Shinto
}

class Doctor() : Character()
{
    override val Religion = RELIGION.Christian
}

class Cook() : Character()
{
    override val Religion = RELIGION.Tradition
}

class Journalist() : Character()
{
    override val Religion = RELIGION.Christian
}

class Father() : Character()
{
    override val Religion = RELIGION.Christian
}
