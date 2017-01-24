package com.maven;

import model.Adres;
import model.ProverkaEntity;
import model.VolumeEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory = null;
        Session session = null;
        org.hibernate.Transaction tx = null;
        Scanner scanner = new Scanner(System.in);
try {
    factory = HibernateUtil.getSessionFactory();
    session = factory.openSession();
    tx = session.beginTransaction();

    Query query = session.createQuery("select t from VolumeEntity t where t.id = :i");
    System.out.println("Please specify height: ");
    query.setParameter("i", new Integer(scanner.nextInt()));

    List<VolumeEntity> volume = query.list();



    List<VolumeEntity> v = query.list();

    for (VolumeEntity t : v) {
        System.out.println(t.getM3());
    }

    //for(VolumeEntity t:volume){
        //System.out.println(t.getId()+" " +t.getM3());
    //}
    //VolumeEntity vol = session.get(VolumeEntity.class,1);
    //System.out.println(vol.getM3().doubleValue()+1);
    //transaction.commit();
    /*
    Adres adres =new Adres();
    adres.setS1("1234");
    adres.setS2("356");
        String value = "20.900";
       String.format("%21.200f", new BigDecimal(value));
        BigDecimal money = new BigDecimal(value);
        vol.setM3(money);
    vol.setAddress(adres);
        sesion.save(vol);
        sesion.getTransaction().commit();
        */
    /*sesion.refresh(vol);
double df=vol.getM3().doubleValue();
    System.out.println(df);
    double fg=3.140;
    df=df+fg;
    System.out.println(df);
*/
    } catch (Exception e) {
    e.printStackTrace();
    tx.rollback();
}finally{
    session.close();
    factory.close();
}
    }
}
