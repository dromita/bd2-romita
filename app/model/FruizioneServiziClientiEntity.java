package model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Nomak on 14/07/2015.
 */
@Entity(name = "fruizione_servizi_clienti")
// @Table(name = "fruizione_servizi_clienti", schema = "public", catalog = "centro_benessere")
public class FruizioneServiziClientiEntity {
    private Integer id;
    private Date dataFruizione;
    private ClientiEntity clienteByCliente;
    private ServiziEntity servizioByServizio;

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
    @Column(name = "data_fruizione", nullable = false, insertable = true, updatable = true)
    public Date getDataFruizione() {
        return dataFruizione;
    }

    public void setDataFruizione(Date dataFruizione) {
        this.dataFruizione = dataFruizione;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FruizioneServiziClientiEntity that = (FruizioneServiziClientiEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (dataFruizione != null ? !dataFruizione.equals(that.dataFruizione) : that.dataFruizione != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (dataFruizione != null ? dataFruizione.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "cliente", referencedColumnName = "id", nullable = false)
    public ClientiEntity getClienteByCliente() {
        return clienteByCliente;
    }

    public void setClienteByCliente(ClientiEntity clienteByCliente) {
        this.clienteByCliente = clienteByCliente;
    }

    @ManyToOne
    @JoinColumn(name = "servizio", referencedColumnName = "nome", nullable = false)
    public ServiziEntity getServizioByServizio() {
        return servizioByServizio;
    }

    public void setServizioByServizio(ServiziEntity servizioByServizio) {
        this.servizioByServizio = servizioByServizio;
    }
}
