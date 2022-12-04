/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mencoba;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author Debora Marianthi
 */
public class Main {
    
   public static void main(String[] args) {

        //Koneksi ke ObjectDB + Pembuatan database
        EntityManagerFactory emf
                = Persistence.createEntityManagerFactory(
                        "$objectdb/db/Karyawan.odb");
        EntityManager em = emf.createEntityManager();

         em.getTransaction().begin();
        //Pembuatan Data
        Karyawan kry1 = new Karyawan("IP06001", "yuni", "Jln. Gajah Mada 115A, Jakarta Pusat", "1970-08-01","2006-07-07");
        Karyawan kry2 = new Karyawan("IP06002", "Anggi", "Jln. Bungur sari v No, 178, bandung", "1977-05-03","2006-07-07");
        Karyawan kry3 = new Karyawan("IP06003", "bambang", "Jln. Yosodpuro 15, surabaya", "1973-08-09","2006-07-07");
        Karyawan kry4 = new Karyawan("IP07004", "Alyssa", "Jln. Cendana No. 6 Bandung", "1983-02-14","2007-01-05");
        Karyawan kry5 = new Karyawan("IP07005", "Maulana", "Jln. Ampera Raya No 1", "1985-10-10","2007-02-05");
        Karyawan kry6 = new Karyawan("IP07006", "ani", "Jln. Pejaten Barat No 6A", "1987-03-09","2007-06-09");
        Karyawan kry7 = new Karyawan("IP07007", "James", "Jln. Padjadjaran No. 111, bandung", "1988-05-19","2007-06-09");
        Karyawan kry8 = new Karyawan("IP09008", "Octavanus", "Jln. Gajah Mada 101. Semarang", "1988-10-07","2008-08-08");
        Karyawan kry9 = new Karyawan("IP09009", "Nugroho", "Jln. Duren Tiga 196, Jakarta selatan", "1988-01-20","2008-11-11");
        Karyawan kry10 = new Karyawan("IP090010", "Raisa", "Jln. Nangka Jakarta selatan", "1989-12-29","2009-02-09");

        //INSERT DATA
        em.persist(kry1);
        em.persist(kry2);
        em.persist(kry3);
        em.persist(kry4);
        em.persist(kry5);
        em.persist(kry6);
        em.persist(kry7);
        em.persist(kry8);
        em.persist(kry9);
        em.persist(kry10);
    
            
    //Pencarian data sesuai id presistance
     //   Karyawan kry1 = em.find(Karyawan.class, 1);
     //   Karyawan kry2 = em.find(Karyawan.class, 2);
     //   Karyawan kry3 = em.find(Karyawan.class, 3);
     //   em.getTransaction().begin();
     
     //UPDATE DATA MENGGUNAKAN JPA
//        kry1.setNama("Debo");
//        kry2.setNama("Debi");
//        kry3.setNama("Debu");

        //DELETE DATA MENGGUNAKAN JPA
//        em.remove(k3);
//        em.getTransaction().commit();
    
em.getTransaction().commit();
        
        
        
        //READ DATABASE MenggunakanRetrieve Data
        System.out.print("Percobaan Debora Marianthi dengan JPQL Objectdb\n");
        System.out.print("Membaca Database Daftar Karyawan pada Netbeans dan menampikan JPQLnya pada ObjectDB dalam menu Explorer-b\n"); 
         TypedQuery<Karyawan> query
      = em.createQuery("SELECT Karyawan FROM Karyawan karyawan",
        Karyawan.class);
      List<Karyawan> results = query.getResultList();
      for (Karyawan data : results) {
         System.out.println(data);
      }
    
 em.getTransaction().begin();
      
      CutiKaryawan ck1 = new CutiKaryawan("IP06001", "2012-02-01", "3", "Acara Keluar");
      CutiKaryawan ck2 = new CutiKaryawan("IP06001", "2012-02-13", "2", "Anak sakit");
      CutiKaryawan ck3 = new CutiKaryawan("IP07007", "2012-02-15", "1", "Nenek sakit");
      CutiKaryawan ck4 = new CutiKaryawan("IP06003", "2012-02-17", "1", "Mendaftar sekolah anak");
      CutiKaryawan ck5 = new CutiKaryawan("IP07006", "2012-02-20", "5", "Menikah");
      CutiKaryawan ck6 = new CutiKaryawan("IP07004", "2012-02-27", "1", "Imunisasi anak");
      
       em.persist(ck1);
       em.persist(ck2);
       em.persist(ck3);
       em.persist(ck4);
       em.persist(ck5);
       em.persist(ck6);
            
       em.getTransaction().commit();
       
       System.out.print("Menampilkan Daftar Cuti Karyawan dengan JPQL pada ObjectDB dalam menu Explorer-b");
       Query CutiKaryawan = em.createQuery("SELECT CutiKaryawan FROM CutiKaryawan cutikaryawan");
      
        //READ DATABASE MenggunakanRetrieve Data
     //    TypedQuery<CutiKaryawan> query
    //  = em.createQuery("SELECT CutiKaryawan FROM CutiKaryawan cutikaryawan",
   //      CutiKaryawan.class);
  //    List<CutiKaryawan> results = query.getResultList();
 //     for (CutiKaryawan data : results) {
 //        System.out.println(data);
 //     }
        
    
       em.close();
        emf.close();

    }
}
   