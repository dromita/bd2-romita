package model.forms;

import play.data.validation.Constraints;

/**
 * Created by Nomak on 15/07/2015.
 */
public class ClienteForm {

    @Constraints.Required
    public String id;
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
        return String.format("ID: %s, Nome: %s, Cognome: %s,\n" +
                "CF: %s, Data di nascita: %s,\n" +
                "Indirizzo: %s, %s %s (%s)",
                id, nome, cognome,
                cf, dataNascita,
                indirizzo, cap, citta, provincia);
    }
}
