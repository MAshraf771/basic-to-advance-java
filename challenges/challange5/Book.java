class Book {
  static int totalbook;
  String author;
  String title;
  String isbn;
  boolean isborrowed;
  static {
    totalbook = 0;
  }
  {
    // object init
    totalbook++;
  }

  Book(String isbn, String author, String title) {
    this.isbn = isbn;
    this.author = author;
    this.title = title;

  }

  Book(String isbn) {
    this(isbn, "unknown", "unknown");

  }

  static int getTotalBooks() {

    return totalbook;
  }

  void borrowBook() {

    if (isborrowed) {
      System.out.println("book already borrow");

    }

    this.isborrowed = true;
  }

  void returnbook() {
    if (isborrowed) {
      this.isborrowed = false;
      System.out.println("hope you enjoyd it ");
    } else {
      System.out.println("already in library");
    }

  }

  public static void main(String[] args) {
    Book designofThing = new Book("2", "design", "author");
    Book mybook = new Book("5");
    System.out.println(mybook.getTotalBooks());
    designofThing.borrowBook();
    mybook.borrowBook();
    designofThing.returnbook();
    designofThing.borrowBook();
  }

}
