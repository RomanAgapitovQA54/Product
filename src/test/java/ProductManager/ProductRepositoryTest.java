package ProductManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    @Test
    public void removeById() {
        ProductRepository repo = new ProductRepository();

        Book book1 = new Book(1, "Harry Potter", 100, "Joanne Rowling");
        Book book2 = new Book(2, "Beautiful world, where are you", 200, "Anna Babyashkina");
        Book book3 = new Book(3, "Steppe", 300, "Oksana Vasyakina");
        Smartphone phone1 = new Smartphone(4, "Iphone 14", 500, "Apple");
        Smartphone phone2 = new Smartphone(5, "Galaxy S3", 400, "Samsung");
        Smartphone phone3 = new Smartphone(6, "Redmi 1", 300, "Xiaomi");


        repo.add(book1);
        repo.add(book2);
        repo.add(book3);
        repo.add(phone1);
        repo.add(phone2);
        repo.add(phone3);

        repo.removeById(3);

        Product[] actual = repo.findAll();
        Product[] expected = {book1, book2, phone1, phone2, phone3};
        Assertions.assertArrayEquals(expected, actual);

    }

}