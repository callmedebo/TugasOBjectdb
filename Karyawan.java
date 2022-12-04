/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mencoba;

import java.io.Serializable;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Debora Marianthi
 */
@Table(name = "Karyawan")
@Entity
public class Karyawan implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private long id;
    private String No_induk;
    private String Nama;
    private String Alamat;
    private String Tanggal_lahir;
    private String Tanggal_masuk;
    
    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the No_induk
     */
    public String getNo_induk() {
        return No_induk;
    }

    /**
     * @param No_induk the No_induk to set
     */
    public void setNo_induk(String No_induk) {
        this.No_induk = No_induk;
    }

    /**
     * @return the Nama
     */
    public String getNama() {
        return Nama;
    }

    /**
     * @param Nama the Nama to set
     */
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    /**
     * @return the Alamat
     */
    public String getAlamat() {
        return Alamat;
    }

    /**
     * @param Alamat the Alamat to set
     */
    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    /**
     * @return the Tanggal_lahir
     */
    public String getTanggal_lahir() {
        return Tanggal_lahir;
    }

    /**
     * @param Tanggal_lahir the Tanggal_lahir to set
     */
    public void setTanggal_lahir(String Tanggal_lahir) {
        this.Tanggal_lahir = Tanggal_lahir;
    }

    /**
     * @return the Tanggal_masuk
     */
    public String getTanggal_masuk() {
        return Tanggal_masuk;
    }

    /**
     * @param Tanggal_masuk the Tanggal_masuk to set
     */
    public void setTanggal_masuk(String Tanggal_masuk) {
        this.Tanggal_masuk = Tanggal_masuk;
    }
    
       
     public Karyawan(){    
    }
    
    public Karyawan(String No_induk, String Nama, String Alamat, String Tanggal_lahir, String Tanggal_masuk){
        this.No_induk = No_induk;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.Tanggal_lahir = Tanggal_lahir;
        this.Tanggal_masuk = Tanggal_masuk;   
    }
    
    @Override
    public String toString(){
        return String.format("(%s, %s, %s, %s, %s)", this.getNo_induk(), this.getNama(), this.getAlamat(), this.getTanggal_lahir(), this.getTanggal_masuk());
    }
}
  
    
