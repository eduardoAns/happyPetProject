package HappyPet.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ordenCompra")
@ToString
public class Orden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id")
    private Integer id;

    @Getter @Setter
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idorden", referencedColumnName = "id")
    private Usuario user;

    @Getter @Setter
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idorden", referencedColumnName = "id")
    private Direccion shippingAddress;


    @Getter @Setter @Column(name = "cantidad")
    private Integer numberOfItems;

    @Getter @Setter @Column(name = "total")
    private Integer total;

    @Getter @Setter @Column(name = "subtotal")
    private Integer subTotal;

    @Getter @Setter @Column(name = "impuesto")
    private Double tax;

    @Getter @Setter @Column(name = "fechapago")
    private String paidAt;


    @Getter @Setter @Column(name = "idpaypal")
    private String idPaypal;

    @Getter @Setter @Column(name = "estado")
    private String isPaid;

}
