package model.Product;

import lombok.*;
import lombok.experimental.SuperBuilder;


@SuperBuilder
@Getter
@Setter

public class Book extends PaperItemWithCONTENT {


    private String genre;

    @Override
    public String toString() {
        return  author +" " +publisher+" " + name ;
    }


}
