package HappyPet.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "producto")
@ToString @EqualsAndHashCode
public class Producto {

    @Id
    @Getter @Setter
    private Integer id;

    @Getter @Setter
    private String description;

    @Getter @Setter
    private String[] images;

    @Getter @Setter
    private Integer stock;

    @Getter @Setter
    private Integer price;

    @Getter @Setter
    private String size;

    @Getter @Setter
    private String slug;

    @Getter @Setter
    private String[] tags;

    @Getter @Setter
    private String title;

    @Getter @Setter
    private String type;

    @Getter @Setter
    private String gender;


}
