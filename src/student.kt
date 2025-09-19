class student() {
    var rollno:Int = 0
    var age: Int=0
    var name:String=""
    constructor(rollno:Int, name:String) : this() {
       this.rollno=rollno
        this.name=name
    }
    constructor(rollno:Int, name:String , age:Int) : this() {
        this.rollno=rollno
        this.name=name
        this.age=age
    }
}