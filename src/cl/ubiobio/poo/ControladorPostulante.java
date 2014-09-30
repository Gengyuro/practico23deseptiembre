package cl.ubiobio.poo;

import java.util.ArrayList;

/**
 * Created by SAMSUNG on 23-09-2014.
 */
public class ControladorPostulante {

    private ArrayList<Postulantes> postulantes;
    public ControladorPostulante (){
        postulantes=new ArrayList<Postulantes>();
    }

    public void inscribirPostulante(Postulantes p){
        postulantes.add(p);
    }

    public Postulantes obtienePostulante(String Rut){
        for (int i = 0; i < postulantes.size(); i++) {
            if (postulantes.get(i).getRut().equals(Rut)){
                return postulantes.get(i);
            }
        }
        return null;
    }

    public int obtieneInscritos(){
        return postulantes.size();
    }




}
