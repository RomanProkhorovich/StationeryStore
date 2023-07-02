package model.Product;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Setter
@Getter
public class Workbook extends PaperItemWithCONTENT {
    private Type type;
    private String subject;

    public Type getType() {
        return type;
    }

    public String getSubject() {
        return subject;
    }

    public static enum Type {
        SCHOOL("Школа"),
        UNIVERSITY("Универ"),
        SELFEDUCATION("Саморазвитие");

        private String typeName;

        Type(String type) {
            this.typeName = type;
        }

        public String getType() {
            return typeName;
        }

    }

    @Override
    public String toString() {
        return  author +" " +publisher+" " + name +' '+type.getType()+' '+subject ;
    }
}
