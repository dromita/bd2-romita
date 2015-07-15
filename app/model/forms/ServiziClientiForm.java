package model.forms;

import dao.ClientiDao;
import dao.FruizioneServiziClientiDao;
import dao.ServiziDao;
import model.ClientiEntity;
import model.FruizioneServiziClientiEntity;
import model.ServiziEntity;

import java.sql.Date;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nomak on 15/07/2015.
 */
public class ServiziClientiForm {

    public Integer codiceCliente;
    public Boolean spa;
    public Boolean piscina;
    public Boolean mass_shiatsu;
    public Boolean mass_relax;

    public List<FruizioneServiziClientiEntity> toEntity(){
        List<FruizioneServiziClientiEntity> result = new LinkedList<>();

        ClientiEntity cliente = null;
        Date data = Date.valueOf(LocalDate.now());
        try {
            cliente = new ClientiDao().findById(codiceCliente);

            if (spa != null){
                FruizioneServiziClientiEntity spa = new FruizioneServiziClientiEntity();
                spa.setDataFruizione(data);
                spa.setClienteByCliente(cliente);
                ServiziEntity servizio = new ServiziDao().findById("SPA");
                spa.setServizioByServizio(servizio);

                result.add(spa);
            }

            if (piscina != null){
                FruizioneServiziClientiEntity piscina = new FruizioneServiziClientiEntity();
                piscina.setDataFruizione(data);
                piscina.setClienteByCliente(cliente);
                ServiziEntity servizio = new ServiziDao().findById("Piscina");
                piscina.setServizioByServizio(servizio);

                result.add(piscina);
            }

            if (mass_relax != null){
                FruizioneServiziClientiEntity relax = new FruizioneServiziClientiEntity();
                relax.setDataFruizione(data);
                relax.setClienteByCliente(cliente);
                ServiziEntity servizio = new ServiziDao().findById("Massaggio relax");
                relax.setServizioByServizio(servizio);

                result.add(relax);
            }

            if (mass_shiatsu != null){
                FruizioneServiziClientiEntity shiatsu = new FruizioneServiziClientiEntity();
                shiatsu.setDataFruizione(data);
                shiatsu.setClienteByCliente(cliente);
                ServiziEntity servizio = new ServiziDao().findById("Massaggio shiatsu");
                shiatsu.setServizioByServizio(servizio);

                result.add(shiatsu);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}
