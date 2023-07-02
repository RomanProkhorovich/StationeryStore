package model.Shop;

import lombok.AllArgsConstructor;
import lombok.Data;
import model.exceptions.ProductNotFoundException;
import model.exceptions.TooFewProductsException;


@Data
@AllArgsConstructor
public class Shop {
    private float balance;
    private String name;
    private Storage storage;
    public void sell(String article, int count){
        try {
            var item=getStorage().findByArticle(article);
            balance=balance+item.getPrice()*count;
            getStorage().reduceProducts(article, count);
        } catch (TooFewProductsException e) {
            throw new RuntimeException(e);
        } catch (ProductNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
