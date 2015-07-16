package model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Nomak on 14/07/2015.
 */
@Entity(name = "prenotazioni")
// @Table(name = "noleggi", schema = "public", catalog = "centro_benessere")
public class PrenotazioniEntity {
    private Integer id;
    private Date checkin;
    private Date checkout;
    private Short numGiorni;
    private CamereEntity camereByCamera;
    private ClientiEntity clientiByCliente;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "checkin", nullable = false, insertable = true, updatable = true)
    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    @Basic
    @Column(name = "checkout", nullable = false, insertable = true, updatable = true)
    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    @Basic
    @Column(name = "num_giorni", nullable = true, insertable = true, updatable = true)
    public Short getNumGiorni() {
        return numGiorni;
    }

    public void setNumGiorni(Short numGiorni) {
        this.numGiorni = numGiorni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrenotazioniEntity that = (PrenotazioniEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (checkin != null ? !checkin.equals(that.checkin) : that.checkin != null) return false;
        if (checkout != null ? !checkout.equals(that.checkout) : that.checkout != null) return false;
        if (numGiorni != null ? !numGiorni.equals(that.numGiorni) : that.numGiorni != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (checkin != null ? checkin.hashCode() : 0);
        result = 31 * result + (checkout != null ? checkout.hashCode() : 0);
        result = 31 * result + (numGiorni != null ? numGiorni.hashCode() : 0);
        return result;
    }

    @Override
    public String toString(){
        return String.format("ID: %s, data check-in: %s, data check-out: %s", id, checkin, checkout);
    }

    @ManyToOne
    @JoinColumn(name = "camera", referencedColumnName = "num_camera", nullable = false)
    public CamereEntity getCamereByCamera() {
        return camereByCamera;
    }

    public void setCamereByCamera(CamereEntity camereByCamera) {
        this.camereByCamera = camereByCamera;
    }

    @ManyToOne
    @JoinColumn(name = "cliente", referencedColumnName = "id", nullable = false)
    public ClientiEntity getClientiByCliente() {
        return clientiByCliente;
    }

    public void setClientiByCliente(ClientiEntity clientiByCliente) {
        this.clientiByCliente = clientiByCliente;
    }
}
