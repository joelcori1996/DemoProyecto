package pooutp.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persona", schema = "utp")
public class Persona {


    //subido desde intellij idea
    @Id
    @Column(name = "IDPERSONA")
    private Long idpersona;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "APPATERNO")
    private String apellidoPaterno;

    @Column(name = "APMATERNO")
    private String apellidoMaterno;


    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    @Column(name = "ESTADO")
    private Integer estado;



    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Long idpersona) {
        this.idpersona = idpersona;
    }

    public Persona() {

    }
}
