package model.service;

/**
 * Created by Nomak on 15/07/2015.
 */
public class PromoListaServizi {

    String nomePromo;
    Float costo;
    String serviziOfferti;

    public PromoListaServizi(){ };

    public PromoListaServizi(String nome, Float prezzo, String listaServizi){
        this.nomePromo = nome;
        this.costo = prezzo;
        this.serviziOfferti = listaServizi;
    }

    @Override
    public String toString(){
        return String.format("Promozione: %s \nServizi offerti: %s\n\n", nomePromo, serviziOfferti);
    }

    public String getNomePromo() {
        return nomePromo;
    }

    public void setNomePromo(String nomePromo) {
        this.nomePromo = nomePromo;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }

    public String getServiziOfferti() {
        return serviziOfferti;
    }

    public void setServiziOfferti(String serviziOfferti) {
        this.serviziOfferti = serviziOfferti;
    }

}
