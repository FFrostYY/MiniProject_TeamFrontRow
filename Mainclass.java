public class Mainclass {
    public static  void  main (String [] args){

        Library SEM = new Library();
        try{

            User Majed = new User("Majed","1990/12/07","Blidvadersgatan","100");
            User Mohammad = new User("Mohammd","1994/08/01","blid","101");
            SEM.addUser(Majed);
            SEM.addUser(Mohammad);
            Book booknew  = new Book("love","Majed","documentary","Dar","10A");
            SEM.addBook(Booknew);
            SEM.searchBook("love");
            SEM.borrowBook(Majed, "love");
            System.out.println(Majed.getBorrowedBooks());
            SEM.borrowBook(Mohammad,"love");
        }
        catch (Exception e){
            System.out.println(" wrong entry");
        }
        Book booktwo = new Book ("java", "fransico", "eductaion","javafirst","19B");
        SEM.addBook(Booktwo);
        System.out.println(SEM.getBookList());
        SEM.sortBooks();
        System.out.println(SEM.getBookList());










    }
}