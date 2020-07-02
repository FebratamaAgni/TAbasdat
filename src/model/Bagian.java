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

public class Bagian {
    private int id_bagian;
    private Perusahaan perusahaan;
    private String nama_bagian;

    public int getId_bagian() {
        return id_bagian;
    }

    public void setId_bagian(int id_bagian) {
        this.id_bagian = id_bagian;
    }

    public Perusahaan getPerusahaan() {
        return perusahaan;
    }

    public void setPerusahaan(Perusahaan perusahaan) {
        this.perusahaan = perusahaan;
    }


    public String getNama_bagian() {
        return nama_bagian;
    }

    public void setNama_bagian(String nama_bagian) {
        this.nama_bagian = nama_bagian;
    }
    
    
}
