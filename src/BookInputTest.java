import java.util.Scanner;

public class BookInputTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Book myBook=new Book();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the title of the book");
        myBook.title=scan.nextLine();
        System.out.println("Please enter the author name");
        myBook.author=scan.nextLine();
        System.out.println("Please enter the number of pages");
        myBook.numberOfPages=scan.nextInt();

        System.out.println("The book title is: "+myBook.title);
        System.out.println("The book author is: "+myBook.author);
        System.out.println("The book has " +myBook.numberOfPages+  "pages");

    }

}
