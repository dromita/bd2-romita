package model;

import javax.persistence.*;

/**
 * Created by Nomak on 14/07/2015.
 */
@Entity(name = "promo_servizi")
// @Table(name = "promo_servizi", schema = "public", catalog = "centro_benessere")
public class PromoServiziEntity {
    private Integer id;
    private Short quantita;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "quantita", nullable = true, insertable = true, updatable = true)
    public Short getQuantita() {
        return quantita;
    }

    public void setQuantita(Short quantita) {
        this.quantita = quantita;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PromoServiziEntity that = (PromoServiziEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (quantita != null ? !quantita.equals(that.quantita) : that.quantita != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (quantita != null ? quantita.hashCode() : 0);
        return result;
    }


    @Override
    public String toString(){
        return String.format("ID: %s, quantita\': %s", id, quantita);
    }
}
