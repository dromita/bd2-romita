package model.service;

import java.math.BigDecimal;

/**
 * Created by Nomak on 15/07/2015.
 */
public class PromoListaServizi {

    String nomePromo;
    BigDecimal costo;
    String serviziOfferti;

    public PromoListaServizi(){ };

    public PromoListaServizi(String nome, BigDecimal prezzo, String listaServizi){
        this.nomePromo = nome;
        this.costo = prezzo;
        this.serviziOfferti = listaServizi;
    }

    @Override
    public String toString(){
        return String.format("Promozione: %s \nServizi offerti: %s\nCosto: %s\n\n", nomePromo, serviziOfferti, costo);
    }

    public String getNomePromo() {
        return nomePromo;
    }

    public void setNomePromo(String nomePromo) {
        this.nomePromo = nomePromo;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    public String getServiziOfferti() {
        return serviziOfferti;
    }

    public void setServiziOfferti(String serviziOfferti) {
        this.serviziOfferti = serviziOfferti;
    }

}
