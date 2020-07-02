/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Vafe
 */
import model.Bagian;

public class Pegawai {
    private int id_pegawai;
    private Perusahaan perusahaan;
    private Bagian bagian;
    private String nama_pegawai;
    private String alamat;
    private String no_telp;
    private int kode_pos;

    public int getId_pegawai() {
        return id_pegawai;
    }

    public void setId_pegawai(int id_pegawai) {
        this.id_pegawai = id_pegawai;
    }
    
    public Perusahaan getPerusahaan() {
        return perusahaan;
    }

    public void setPerusahaan(Perusahaan perusahaan) {
        this.perusahaan = perusahaan;
    }

    public Bagian getBagian() {
        return bagian;
    }

    public void setBagian(Bagian bagian) {
        this.bagian = bagian;
    }

    public String getNama_pegawai() {
        return nama_pegawai;
    }

    public void setNama_pegawai(String nama_pegawai) {
        this.nama_pegawai = nama_pegawai;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    public int getKode_pos() {
        return kode_pos;
    }

    public void setKode_pos(int kode_pos) {
        this.kode_pos = kode_pos;
    }

    public Object getNama_perusahaan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNama_pegawai() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
