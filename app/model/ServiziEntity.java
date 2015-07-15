package model;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Nomak on 14/07/2015.
 */
@Entity(name = "servizi")
// @Table(name = "servizi", schema = "public", catalog = "centro_benessere")
public class ServiziEntity {
    private String nome;
    private BigDecimal costo;
    private String descrizione;

    @Id
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
    @Column(name = "descrizione", nullable = true, insertable = true, updatable = true, length = 2147483647)
    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServiziEntity that = (ServiziEntity) o;

        if (nome != null ? !nome.equals(that.nome) : that.nome != null) return false;
        if (costo != null ? !costo.equals(that.costo) : that.costo != null) return false;
        if (descrizione != null ? !descrizione.equals(that.descrizione) : that.descrizione != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + (costo != null ? costo.hashCode() : 0);
        result = 31 * result + (descrizione != null ? descrizione.hashCode() : 0);
        return result;
    }

    @Override
    public String toString(){
        return String.format("Promozione: %s, costo: %s\nDescrizione: ", nome, costo, descrizione);
    }
}
