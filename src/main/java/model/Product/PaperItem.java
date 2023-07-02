package model.Product;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@Getter
@Setter

@SuperBuilder
public abstract class PaperItem extends Item {
    protected int sheetCount;


    public int getSheetCount() {
        return this.sheetCount;
    }


}
