import model.Product.Book;
import model.Product.Workbook;
import model.Shop.Receipt;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Book b=Book.builder().name("It")
                .author("Stephen King")
                .publisher("Pub")
                .price(100.5f)
                .sheetCount(900)
                .genre("Horror")
                .build();

        Workbook w = Workbook.builder()
                .type(Workbook.Type.SCHOOL)
                .subject("Math")
                .price(12f)
                .name("Linear Algebra")
                .author("Someone")
                .publisher("Publisher")
                .build();
        Receipt r=new Receipt("Roma");
        r.addProduct(b);
        r.addProduct(w);
        System.out.println(w);
    }
}