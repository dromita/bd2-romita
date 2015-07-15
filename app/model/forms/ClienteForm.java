package model.forms;

import model.ClientiEntity;
import play.data.validation.Constraints;

import java.sql.Date;

/**
 * Created by Nomak on 15/07/2015.
 */
public class ClienteForm {

    @Constraints.Required
    public String nome;
    @Constraints.Required
    public String cognome;
    public String indirizzo;
    public String citta;
    public String provincia;
    public String cap;
    @Constraints.Required
    public String cf;
    public String dataNascita;
    public boolean noloAccessori;

    @Override
    public String toString() {
        return String.format("Nome: %s, Cognome: %s,\n" +
                "CF: %s, Data di nascita: %s,\n" +
                "Indirizzo: %s, %s %s (%s)",
                nome, cognome,
                cf, dataNascita,
                indirizzo, cap, citta, provincia);
    }

    public ClientiEntity toEntity() {

        ClientiEntity entity = new ClientiEntity();
        entity.setNome(this.nome);
        entity.setCognome(this.cognome);
        entity.setCf(this.cf);
        entity.setIndirizzo(this.indirizzo);
        entity.setCitta(this.citta);
        entity.setProvincia(this.provincia);
        entity.setCap(this.cap);
        entity.setDataNascita(Date.valueOf(this.dataNascita));


        return entity;
    }
}
