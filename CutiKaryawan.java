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
@Table(name = "CutiKaryawan")
@Entity
public class CutiKaryawan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private long id;
    private String No_induk;
    private String Tanggal_mulai;
    private String Lama_cuti;
    private String Keterangan;
    
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
     * @return the Tanggal_mulai
     */
    public String getTanggal_mulai() {
        return Tanggal_mulai;
    }

    /**
     * @param Tanggal_mulai the Tanggal_mulai to set
     */
    public void setTanggal_mulai(String Tanggal_mulai) {
        this.Tanggal_mulai = Tanggal_mulai;
    }

    /**
     * @return the Lama_cuti
     */
    public String getLama_cuti() {
        return Lama_cuti;
    }

    /**
     * @param Lama_cuti the Lama_cuti to set
     */
    public void setLama_cuti(String Lama_cuti) {
        this.Lama_cuti = Lama_cuti;
    }

    /**
     * @return the Keterangan
     */
    public String getKeterangan() {
        return Keterangan;
    }

    /**
     * @param Keterangan the Keterangan to set
     */
    public void setKeterangan(String Keterangan) {
        this.Keterangan = Keterangan;
    }
           
     public CutiKaryawan(){    
    }
    
    public CutiKaryawan(String No_induk, String Tanggal_mulai, String Lama_cuti, String Keterangan){
        this.setNo_induk(No_induk);
        this.Tanggal_mulai = Tanggal_mulai;
        this.Lama_cuti = Lama_cuti;
        this.Keterangan = Keterangan;
    }
    
    @Override
    public String toString(){
        return String.format("(%s, %s, %s, %s)", this.getNo_induk(), this.getTanggal_mulai(), this.getLama_cuti(), this.getKeterangan());
    }
}
  
    
