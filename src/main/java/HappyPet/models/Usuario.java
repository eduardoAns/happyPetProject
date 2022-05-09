package HappyPet.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "usuario")
@ToString @EqualsAndHashCode

public class Usuario {

    @Id
    @Getter @Setter @Column(name = "id")
    private String id;

    @Getter @Setter @Column(name = "nombre")
    private String nombre;

    @Getter @Setter @Column(name = "apellido")
    private String apellido;

    @Getter @Setter @Column(name = "correo")
    private String correo;

    @Getter @Setter @Column(name = "password")
    private String password;

    @Getter @Setter @Column(name = "rol")
    private String rol;

    @Getter @Setter @Column(name = "fechaCreacion")
    private String fechaCreacion;



}