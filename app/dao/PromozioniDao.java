package dao;

import model.PromozioniEntity;
import model.ServiziEntity;
import model.service.PromoElencoServizi;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nomak on 15/07/2015.
 */
public class PromozioniDao extends DaoService<PromozioniEntity, Integer> {
    EntityManager em = super.getEntityManager();

    public PromozioniEntity getTopPromo(){
        Query q = em.createNativeQuery("SELECT get_top_promo()");

        Integer idPromo = (Integer)q.getSingleResult();

        q = em.createQuery("FROM promozioni WHERE id = :idPromo").setParameter("idPromo", idPromo);

        return (PromozioniEntity)q.getSingleResult();
    }

    public PromozioniEntity getPromo(int promoId){
        return (PromozioniEntity) em.createQuery("FROM promozioni WHERE id = :idPromo").setParameter("idPromo", promoId).getSingleResult();
    }

    public List<PromozioniEntity> getAllPromos(){
        return em.createQuery("FROM promozioni").getResultList();
    }

    public String getElencoServizi(int idPromo){
        StringBuilder elenco = new StringBuilder();
        List<ServiziEntity> listaServizi = getServizi(idPromo);

        for (ServiziEntity servizio : listaServizi){
            elenco.append(servizio.getNome() + ", ");
        }

        return elenco.substring(0, elenco.length() - 2) + "\n\n";
    }

    public List<ServiziEntity> getServizi(int idPromo){
        List<Object[]> listaRifServizi = em.createNativeQuery("SELECT * FROM promo_servizi WHERE promo = :idPromo").setParameter("idPromo", idPromo).getResultList();
        List<ServiziEntity> listaServizi = new LinkedList<>();

        for (Object[] o : listaRifServizi){

            List<Object[]> objList = em.createNativeQuery("SELECT * FROM servizi WHERE nome = :nomeServ ")
                    .setParameter("nomeServ", (String) o[2])
                    .getResultList();
            Object[] obj = objList.get(0);

            ServiziEntity servizio = new ServiziEntity();
            servizio.setNome((String)obj[0]);
            servizio.setCosto((BigDecimal)obj[1]);
            servizio.setDescrizione((String)obj[2]);

            listaServizi.add(servizio);
        }

        return listaServizi;
    }

    public List<PromoElencoServizi> getDetailedPromosAll(){
        List<PromozioniEntity> listPromo = getAllPromos();
        List<PromoElencoServizi> result = new LinkedList<>();

        for (PromozioniEntity promo : listPromo) {
            result.add(getDetailedPromo(promo.getId()));
        }

        return result;
    }

    public PromoElencoServizi getDetailedPromo(int promoId){
        PromozioniEntity promo = getPromo(promoId);
//
//        String sDetailPromo = "SELECT promo_servizi FROM promo_servizi WHERE id = :promoId";
//        //List<PromoServiziEntity> listPromoServizi = em.createNativeQuery(sDetailPromo).getResultList();
//        // uso direttamente il vettore di oggetti perch immagino che non sappia fare il mapping diretto, essendo il controller di un'altra classe
//        List<Object[]> listPromoServizi = em.createNativeQuery(sDetailPromo).setParameter("promoId", promo.getId()).getResultList();

        String elencoServizi = "Servizi: " + getElencoServizi(promo.getId());
        PromoElencoServizi promoServ = new PromoElencoServizi(promo.getNome(), promo.getCosto(), elencoServizi);

        return promoServ;
    }

}
