package model.Product;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Objects;
import java.util.UUID;


@Getter
@Setter
@SuperBuilder
public abstract class Item {

    protected float price;
    protected String name;
    protected String Article= UUID.randomUUID().toString();


    public String getArticle() {
        return Article;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Article.equals(item.Article);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Article);
    }
}
