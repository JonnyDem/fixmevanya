package model;

import database.Storage;
import lombok.Builder;
import lombok.Data;
import lombok.Value;

/**
 * @author Igor Hnes on 9/14/17.
 */
@Data
@Builder
public class Mac extends AbstractEntity{

    private String name;
    private String type;
    private String weight;
    private double price;
    private String color;
    private Owner owner;

}

