

class Library {
    private val books: MutableList<Book> = mutableListOf()
    fun addbook(book: Book) {
        books.add(book)
        println("Added:  ${book.title}")
    }
    fun borrowBook(isbn: String): Boolean{
        val book = books.find{
            it.isbn == isbn && it.isAvailable
        }
        return if(book != null){
            book.isAvailable=false
            println("borrowed: ${book.title}")
            true
        }else {
            println("book not available")
        false
        }

    }
    fun returnBook(isbn: String): Boolean{
        val book = books.find{
            it.isbn == isbn && !it.isAvailable
        }
        return if (book != null){
            book.isAvailable =true
            println("Returned: ${book.title}")
            true
        }else{
            println("book not found in borrowed list")
            false
        }
    }
    fun listAvailableBooks(){
        val available = books.filter{ it.isAvailable}
        println("Available books")
        available.forEach {
            println(" - ${it.title} by ${it.author}")
        }
    }

}