/*
 * 
 * Declare a class called author having author_name as private data member.
 * Extend author class to have two sub classes called book_publication & paper_publication.
 * Each of these classes have private member called title.
 * Show usage of dynamic method dispatch (dynamic polymorphism) to display book or paper publications of a given author.
 * Use command line arguments for inputting data.
 * 
 */
class author {
    private String author_name;

    author() {
    }

    author(String name) {
        this.author_name = name;
    }

    void display() {
        System.out.println("Author\t\t: " + author_name);
    }
}

class book_publication extends author {
    private String title;

    book_publication(String name, String title) {
        super(name);
        this.title = title;
    }

    void display() {
        System.out.println("Book title\t: " + this.title);
        super.display();
    }
}

class paper_publication extends author {
    private String title;

    paper_publication(String name, String title) {
        super(name);
        this.title = title;
    }

    void display() {
        System.out.println("Paper title\t: " + this.title);
        super.display();
    }
}

public class Main {
    public static void main(String args[]) {
        if (args.length < 4) {
            System.out.println("Please enter arguments in command line...");
            System.exit(1);
        }

        author a;
        book_publication bookPublication = new book_publication(args[0], args[1]);
        paper_publication paperPublication = new paper_publication(args[2], args[3]);

        a = bookPublication;
        a.display();

        a = paperPublication;
        a.display();
    }
}
// run like this :-
// java Main bookAuthor bookTitle paperAuthor paperTitle