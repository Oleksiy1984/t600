package com.maven;

import model.Adres;
import model.ProverkaEntity;
import model.VolumeEntity;
import org.hibernate.Session;

import java.math.BigDecimal;

/**
 * Created by Zhenichka on 13.08.2016.
 */
public class App2 {
    public static void main( String[] args )
    {

    Session sesion = HibernateUtil.getSessionFactory().openSession();

try {
        sesion.getTransaction().begin();

        ProverkaEntity vol =new ProverkaEntity();

    vol.setS3("300");
vol.setS1("s4");
    vol.setS2("s3");


        sesion.save(vol);
        sesion.getTransaction().commit();


    } catch (Exception e) {
        e.printStackTrace();
    }finally{
        sesion.close();
        HibernateUtil.getSessionFactory().close();
    }
}
}


