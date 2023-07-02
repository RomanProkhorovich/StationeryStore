package model.Shop;

import lombok.AllArgsConstructor;
import lombok.Data;
import model.Product.Item;
import model.exceptions.ProductNotFoundException;
import model.exceptions.TooFewProductsException;

import java.util.Map;

@Data
@AllArgsConstructor
public class Storage {
    private Map<Item,Integer> productsCount;

    public void reduceProducts(String article, int count) throws TooFewProductsException, ProductNotFoundException {
        var item=findByArticle(article);
        var productCount =productsCount.get(item);
        if (productCount-count>=0)
            productsCount.put(item,productCount-count) ;

        else
            throw new TooFewProductsException();
    }



    public Item findByArticle(String article) throws ProductNotFoundException {
        return productsCount
                .keySet()
                .stream()
                .filter(x->x.getArticle().equals(article))
                .findFirst()
                .orElseThrow(ProductNotFoundException::new);
    }
}
