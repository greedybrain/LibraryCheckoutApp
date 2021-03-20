package tut.java.library_app;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    public static final List<Book> BOOKS = new ArrayList<>();

    // todo: init books / get all books
    public static List<Book> all() {
        BOOKS.add(new Book("To Kill a Mockingbird", "Harper Lee", "1111", "Published in 1960, this timeless classic explores human behaviour and the collective conscience of The Deep South in the early 20th century. Humour entwines the delicate strands of prejudice, hatred, hypocrisy, love and innocence to create one of the best novels ever written."));
        BOOKS.add(new Book("1984", "George Orwell", "2222", "Although 1984 has passed us by, George Orwell’s dystopian, totalitarian world of control, fear and lies has never been more relevant. Delve into the life of Winston Smith as he struggles with his developing human nature in a world where individuality, freewill and love are forbidden."));
        BOOKS.add(new Book("Harry Potter and the Philosopher’s Stone", "J.K. Rowling", "3333", "I’m willing to bet you’ve heard of Harry Potter, but have you read the books? Join Harry Potter as he begins his journey into the world of magic, where he is the celebrated Boy Who Lived. Visit Hogwarts, meet your favourite characters and watch Harry grow into the one of the most famous literary characters in the world."));
        BOOKS.add(new Book("The Lord of the Rings", "J.R.R. Tolkien", "4444", "Middle Earth is a wonderful, expansive fantasy world filled with turmoil, heroes, evil and innocence. Although our protagonist Frodo Baggins’ quest seems impossible to complete, this trilogy is a tale of triumph in the most impossible circumstances."));
        BOOKS.add(new Book("The Great Gatsby", "Scott Fitzgerald", "5555", "Published in 1925, Fitzgerald’s The Great Gatsby explores the decadence of the Jazz Age, and one man’s introduction into a world where even those with the most indulgent lives cannot earn love."));
        BOOKS.add(new Book("Pride and Prejudice", "Jane Austen", "6666", "One of the most famous novels of all time, Pride And Prejudice details the courtship of two opposed characters in a world where manners and courtesy are of the utmost importance."));
        BOOKS.add(new Book("The Diary Of A Young Girl", "Ann Frank", "7777", "Unforgettable and deeply influential, Anne Frank’s diary is a raw account of a young girl’s life as she hides from the Nazis. Despite her circumstances, Anne believes that people are still good at heart and that the world is full of beauty: she will change your life."));
        BOOKS.add(new Book("The Book Thief", "Markus Zusak", "8888", "Set in Germany during 1939, The Book Thief follows Liesel as she rescues books from the tyranny of Nazi rule. Meanwhile, her family has hidden a Jewish fighter in their basement and death looks down on the family, narrating our tale. Experience bravery that is rarely found in the world, and friendship that is formed in the most unlikely of situations."));
        BOOKS.add(new Book("The Hobbit", "J.R.R. Tolkien", "9999", "Although the movies are inexplicably long, The Hobbit was originally written as a short children’s book. Meet your favourite characters for the first time as the unforgettable Bilbo Baggins traverses the harsh landscapes of Middle Earth to challenge a dragon."));
        BOOKS.add(new Book("Little Women", "Louisa May Alcott", "0000", "Join four sisters, each with their own prominent personality, as they come of age in charming 19th Century New England. Experience their struggles and revel in their flaws, as these girls become strong women."));

        return BOOKS;
    }

    public static void showOptions() {
        System.out.println("Which book do you want to check out?");
        System.out.println("====================================");
        System.out.printf("1 for \"To Kill a Mockingbird\"%n");
        System.out.printf("2 for \"1984\"%n");
        System.out.printf("3 for \"Harry Potter and the Philosopher’s Stone\"%n");
        System.out.printf("4 for \"The Lord of the Rings\"%n");
        System.out.printf("5 for \"The Great Gatsby\"%n");
        System.out.printf("6 for \"Pride and Prejudice\"%n");
        System.out.printf("7 for \"The Diary Of A Young Girl\"%n");
        System.out.printf("8 for \"The Book Thief\"%n");
        System.out.printf("9 for \"The Hobbit\"%n");
        System.out.printf("10 for \"Little Women\"%n");
        System.out.print("> ");
    }
}
