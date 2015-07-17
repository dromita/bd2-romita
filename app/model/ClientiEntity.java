package model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Nomak on 14/07/2015.
 */
@Entity(name = "clienti")
// @Table(name = "clienti", schema = "public", catalog = "centro_benessere")
public class ClientiEntity {
    private Integer id;
    private String nome;
    private String cognome;
    private String indirizzo;
    private String citta;
    private String provincia;
    private String cap;
    private String cf;
    private Date dataNascita;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @Column(name = "cognome", nullable = false, insertable = true, updatable = true, length = 2147483647)
    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    @Basic
    @Column(name = "indirizzo", nullable = false, insertable = true, updatable = true, length = 2147483647)
    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    @Basic
    @Column(name = "citta", nullable = false, insertable = true, updatable = true, length = 2147483647)
    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    @Basic
    @Column(name = "provincia", nullable = false, insertable = true, updatable = true, length = 2147483647)
    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Basic
    @Column(name = "cap", nullable = false, insertable = true, updatable = true)
    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    @Basic
    @Column(name = "cf", nullable = false, insertable = true, updatable = true, length = 16)
    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    @Basic
    @Column(name = "data_nascita", nullable = false, insertable = true, updatable = true)
    public Date getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClientiEntity that = (ClientiEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (nome != null ? !nome.equals(that.nome) : that.nome != null) return false;
        if (cognome != null ? !cognome.equals(that.cognome) : that.cognome != null) return false;
        if (indirizzo != null ? !indirizzo.equals(that.indirizzo) : that.indirizzo != null) return false;
        if (citta != null ? !citta.equals(that.citta) : that.citta != null) return false;
        if (provincia != null ? !provincia.equals(that.provincia) : that.provincia != null) return false;
        if (cap != null ? !cap.equals(that.cap) : that.cap != null) return false;
        if (cf != null ? !cf.equals(that.cf) : that.cf != null) return false;
        if (dataNascita != null ? !dataNascita.equals(that.dataNascita) : that.dataNascita != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (cognome != null ? cognome.hashCode() : 0);
        result = 31 * result + (indirizzo != null ? indirizzo.hashCode() : 0);
        result = 31 * result + (citta != null ? citta.hashCode() : 0);
        result = 31 * result + (provincia != null ? provincia.hashCode() : 0);
        result = 31 * result + (cap != null ? cap.hashCode() : 0);
        result = 31 * result + (cf != null ? cf.hashCode() : 0);
        result = 31 * result + (dataNascita != null ? dataNascita.hashCode() : 0);
        return result;
    }

    @Override
    public String toString(){
        return String.format("ID: %s, Nome: %s, cognome: %s,\nindirizzo: %s, %s, %s(%s),\nCodice fiscale: %s,\nData di nascita: %s",
                id, nome, cognome, indirizzo, cap, citta, provincia, cf, dataNascita);
    }
}
