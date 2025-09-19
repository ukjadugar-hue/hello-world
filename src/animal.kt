abstract  class Animal
{
    val name:String="unknow"
    abstract val species: String

    fun sleep(){
        println("$name is sleeping...")
    }
    abstract fun makeSound()

    open fun move(){
        println("$name is moving...")
    }



}