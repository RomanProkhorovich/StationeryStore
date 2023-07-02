package model.Product;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@SuperBuilder
public abstract class PaperItemWithCONTENT extends PaperItem {
    protected String author;
    protected String publisher;



}
