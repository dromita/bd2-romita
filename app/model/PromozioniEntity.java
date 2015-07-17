package model;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Nomak on 14/07/2015.
 */
@Entity(name = "promozioni")
// @Table(name = "promozioni", schema = "public", catalog = "centro_benessere")
public class PromozioniEntity {
    private Integer id;
    private String nome;
    private BigDecimal costo;
    private Short numNotti;
    private String tipoCamera;
    private String sitoWeb;
    private Short venditeTrim;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nome", nullable = false, insertable = true, updatable = true, length = 2147483647)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Basic
    @Column(name = "costo", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    @Basic
    @Column(name = "num_notti", nullable = false, insertable = true, updatable = true)
    public Short getNumNotti() {
        return numNotti;
    }

    public void setNumNotti(Short numNotti) {
        this.numNotti = numNotti;
    }

    @Basic
    @Column(name = "tipo_camera", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getTipoCamera() {
        return tipoCamera;
    }

    public void setTipoCamera(String tipoCamera) {
        this.tipoCamera = tipoCamera;
    }

    @Basic
    @Column(name = "sito_web", nullable = false, insertable = true, updatable = true, length = 2147483647)
    public String getSitoWeb() {
        return sitoWeb;
    }

    public void setSitoWeb(String sitoWeb) {
        this.sitoWeb = sitoWeb;
    }

    @Basic
    @Column(name = "vendite_trim", nullable = true, insertable = true, updatable = true)
    public Short getVenditeTrim() {
        return venditeTrim;
    }

    public void setVenditeTrim(Short venditeTrim) {
        this.venditeTrim = venditeTrim;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PromozioniEntity that = (PromozioniEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (nome != null ? !nome.equals(that.nome) : that.nome != null) return false;
        if (costo != null ? !costo.equals(that.costo) : that.costo != null) return false;
        if (numNotti != null ? !numNotti.equals(that.numNotti) : that.numNotti != null) return false;
        if (tipoCamera != null ? !tipoCamera.equals(that.tipoCamera) : that.tipoCamera!= null) return false;
        if (sitoWeb != null ? !sitoWeb.equals(that.sitoWeb) : that.sitoWeb != null) return false;
        if (venditeTrim != null ? !venditeTrim.equals(that.venditeTrim) : that.venditeTrim != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (costo != null ? costo.hashCode() : 0);
        result = 31 * result + (numNotti != null ? numNotti.hashCode() : 0);
        result = 31 * result + (tipoCamera != null ? tipoCamera.hashCode() : 0);
        result = 31 * result + (sitoWeb != null ? sitoWeb.hashCode() : 0);
        result = 31 * result + (venditeTrim != null ? venditeTrim.hashCode() : 0);
        return result;
    }


    @Override
    public String toString(){
        return String.format("ID: %s, nome: %s, costo: %s,\nNotti incluse: %s in camera %s\nPromossa da: %s\nVendite trimestrali: $s", id, nome, costo, numNotti, tipoCamera, sitoWeb, venditeTrim);
    }
}
