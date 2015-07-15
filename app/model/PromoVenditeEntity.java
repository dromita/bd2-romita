package model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Nomak on 14/07/2015.
 */
@Entity(name = "promo_vendite")
// @Table(name = "promo_vendite", schema = "public", catalog = "centro_benessere")
public class PromoVenditeEntity {
    private Integer id;
    private Date dataAcquisto;
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
    @Column(name = "data_acquisto", nullable = false, insertable = true, updatable = true)
    public Date getDataAcquisto() {
        return dataAcquisto;
    }

    public void setDataAcquisto(Date dataAcquisto) {
        this.dataAcquisto = dataAcquisto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PromoVenditeEntity that = (PromoVenditeEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (dataAcquisto != null ? !dataAcquisto.equals(that.dataAcquisto) : that.dataAcquisto != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (dataAcquisto != null ? dataAcquisto.hashCode() : 0);
        return result;
    }

    @Override
    public String toString(){
        return String.format("ID: %s, data acquisto: %s", id, dataAcquisto);
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
