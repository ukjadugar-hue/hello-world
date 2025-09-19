class dog(name:String , val breed:String) :Animal(){

    override val species: String =""

    override fun makeSound() {
            println("$name make sound wooh")
    }

    override fun toString(): String {
        return super.toString()
    }
}