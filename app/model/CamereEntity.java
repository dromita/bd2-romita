package model;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Nomak on 14/07/2015.
 */
@Entity(name = "camere")
//@Table(name = "camere", schema = "public", catalog = "centro_benessere")
public class CamereEntity {
    private Short numCamera;
    private Short piano;
    private BigDecimal costo;

    @Id
    @Column(name = "num_camera", nullable = false, insertable = true, updatable = true)
    public Short getNumCamera() {
        return numCamera;
    }

    public void setNumCamera(Short numCamera) {
        this.numCamera = numCamera;
    }

    @Basic
    @Column(name = "piano", nullable = false, insertable = true, updatable = true)
    public Short getPiano() {
        return piano;
    }

    public void setPiano(Short piano) {
        this.piano = piano;
    }

    @Basic
    @Column(name = "costo", nullable = false, insertable = true, updatable = true, precision = 2)
    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CamereEntity that = (CamereEntity) o;

        if (numCamera != null ? !numCamera.equals(that.numCamera) : that.numCamera != null) return false;
        if (piano != null ? !piano.equals(that.piano) : that.piano != null) return false;
        if (costo != null ? !costo.equals(that.costo) : that.costo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numCamera != null ? numCamera.hashCode() : 0;
        result = 31 * result + (piano != null ? piano.hashCode() : 0);
        result = 31 * result + (costo != null ? costo.hashCode() : 0);
        return result;
    }

    @Override
    public String toString(){
        return String.format("Numero camera: %s, piano: %s, costo: %s", numCamera, piano, costo);
    }
}
