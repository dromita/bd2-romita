package model.service;

import model.ServiziEntity;

/**
 * Created by Nomak on 15/07/2015.
 */
public class ServizioConData {
    ServiziEntity servizio;
    String data;

    public ServizioConData(){ };
    public ServizioConData(ServiziEntity servizio, String data){
        this.servizio = servizio;
        this.data = data;
    }

    @Override
    public String toString() {
        return String.format("%s in data: %s", servizio.getNome(), data);
    }

    public ServiziEntity getServizio() {
        return servizio;
    }

    public void setServizio(ServiziEntity servizio) {
        this.servizio = servizio;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
