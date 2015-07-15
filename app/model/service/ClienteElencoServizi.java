package model.service;

/**
 * Created by Nomak on 15/07/2015.
 */
public class ClienteElencoServizi {

    String nomeCliente;
    int codiceCliente;
    String nomeServizio;
    String dataFruizione;
    String elencoServizi = null;

    public ClienteElencoServizi(){ };

    public ClienteElencoServizi(String nomeCliente, int codiceCliente, String nomeServizio, String dataFruizione){
        this.nomeCliente = nomeCliente;
        this.codiceCliente = codiceCliente;
        this.nomeServizio = nomeServizio;
        this.dataFruizione = dataFruizione;
    }

    public ClienteElencoServizi(String nomeCliente, int codiceCliente,  String elencoCumulativo){
        this.nomeCliente = nomeCliente;
        this.codiceCliente = codiceCliente;
        this.elencoServizi = elencoCumulativo;
    }

    @Override
    public String toString() {
        String result;

        if (elencoServizi == null)
            result = String.format("%s ($s), %s il %s", nomeCliente, codiceCliente, nomeServizio, dataFruizione);
        else
            result = nomeCliente + " " + elencoServizi;

        return result;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getCodiceCliente() {
        return codiceCliente;
    }

    public void setCodiceCliente(int codiceCliente) {
        this.codiceCliente = codiceCliente;
    }

    public String getNomeServizio() {
        return nomeServizio;
    }

    public void setNomeServizio(String nomeServizio) {
        this.nomeServizio = nomeServizio;
    }

    public String getDataFruizione() {
        return dataFruizione;
    }

    public void setDataFruizione(String dataFruizione) {
        this.dataFruizione = dataFruizione;
    }

    public String getElencoServizi() {
        return elencoServizi;
    }

    public void setElencoServizi(String elencoServizi) {
        this.elencoServizi = elencoServizi;
    }
}
