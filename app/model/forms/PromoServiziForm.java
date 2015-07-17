package model.forms;

import dao.PromozioniDao;
import dao.ServiziDao;
import model.PromoServiziEntity;
import model.PromozioniEntity;
import model.ServiziEntity;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nomak on 15/07/2015.
 */
public class PromoServiziForm {
    public String nome;
    public String sitoweb;
    public String costo;
    public String numNotti;
    public String tipoCamera;

    public Boolean spa;
    public Boolean piscina;
    public Boolean mass_shiatsu;
    public Boolean mass_relax;

    public String q_spa;
    public String q_piscina;
    public String q_mass_shiatsu;
    public String q_mass_relax;

    public PromozioniEntity getPromoEntity(){
        PromozioniEntity promo = new PromozioniEntity();

        costo = costo.replaceAll(",",".");

        promo.setCosto(BigDecimal.valueOf(Double.parseDouble(costo)));

        promo.setSitoWeb(sitoweb);
        promo.setNome(nome);
        promo.setNumNotti(Short.parseShort(numNotti));
        promo.setTipoCamera(tipoCamera);

        return promo;
    }

    public List<PromoServiziEntity> getPromoServiziEntity(Integer idPromo){
        List<PromoServiziEntity> result = new LinkedList<PromoServiziEntity>();

        try{
            PromozioniEntity promozione = new PromozioniDao().findById(idPromo);

            if (spa != null){
                PromoServiziEntity spa = new PromoServiziEntity();
                spa.setPromozioneByPromozione(promozione);
                ServiziEntity servizio = new ServiziDao().findById("SPA");
                spa.setServizioByServizio(servizio);
                if (q_spa != null && !q_spa.isEmpty())
                    spa.setQuantita(Short.parseShort(q_spa));

                result.add(spa);
            }

            if (piscina != null){
                PromoServiziEntity piscina = new PromoServiziEntity();
                piscina.setPromozioneByPromozione(promozione);
                ServiziEntity servizio = new ServiziDao().findById("Piscina");
                piscina.setServizioByServizio(servizio);
                if (q_piscina != null && !q_piscina.isEmpty())
                    piscina.setQuantita(Short.parseShort(q_piscina));


                result.add(piscina);
            }

            if (mass_relax != null){
                PromoServiziEntity mass_relax = new PromoServiziEntity();
                mass_relax.setPromozioneByPromozione(promozione);
                ServiziEntity servizio = new ServiziDao().findById("Massaggio relax");
                mass_relax.setServizioByServizio(servizio);
                if (q_mass_relax != null && !q_mass_relax.isEmpty())
                    mass_relax.setQuantita(Short.parseShort(q_mass_relax));

                result.add(mass_relax);
            }

            if (mass_shiatsu != null){
                PromoServiziEntity mass_shiatsu = new PromoServiziEntity();
                mass_shiatsu.setPromozioneByPromozione(promozione);
                ServiziEntity servizio = new ServiziDao().findById("Massaggio shiatsu");
                mass_shiatsu.setServizioByServizio(servizio);
                if (q_mass_shiatsu != null && !q_mass_shiatsu.isEmpty())
                    mass_shiatsu.setQuantita(Short.parseShort(q_mass_shiatsu));

                result.add(mass_shiatsu);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

}
