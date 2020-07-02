/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Vafe
 */
import model.Perusahaan;
import model.Bagian;
import model.Pegawai;
import database.Koneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Control {
    Koneksi koneksi;
    ArrayList<Perusahaan> arrPerusahaan;
    ArrayList<Bagian> arrBagian;
    ArrayList<Pegawai> arrPegawai;
    
    public Control() throws SQLException{
        this.koneksi = new Koneksi();
        this.arrPerusahaan = new ArrayList<>();
        this.arrBagian = new ArrayList<>();
        this.arrPegawai = new ArrayList<>();
    }
    public ArrayList<Pegawai> getDataPegawai() throws SQLException{
        this.arrPegawai.clear();
        ResultSet rs = this.koneksi.GetData("SELECT PEGAWAI_06947.*, PEGAWAI_06947.ALAMAT AS ALAMAT_PEGAWAI, PEGAWAI_06947.NO_TELP AS NO_TELP_PEGAWAI, PEGAWAI_06947.KODE_POS AS KODE_POS_PEGAWAI, BAGIAN_06947.*, PERUSAHAAN_06947.*, PERUSAHAAN_06947.ALAMAT AS ALAMAT_PERUSAHAAN, PERUSAHAAN_06947.KODE_POS AS KODE_POS_PERUSAHAAN, PERUSAHAAN_06947.NO_TELP AS NO_TELP_PERUSAHAAN FROM PEGAWAI_06947 JOIN BAGIAN_06947 ON PEGAWAI_06947.ID_BAGIAN = BAGIAN_06947.ID_BAGIAN JOIN PERUSAHAAN_06947 ON PERUSAHAAN_06947.ID_PERUSAHAAN = BAGIAN_06947.ID_BAGIAN");
        while (rs.next()) {            
            Perusahaan perusahaan = new Perusahaan();
            perusahaan.setId_perusahaan(rs.getInt("ID_PERUSAHAAN"));
            perusahaan.setNama_perusahaan(rs.getString("NAMA_PERUSAHAAN"));
            perusahaan.setAlamat(rs.getString("ALAMAT_PERUSAHAAN"));
            perusahaan.setKode_pos(rs.getInt("KODE_POS_PERUSAHAAN"));
            perusahaan.setNo_telp(rs.getString("NO_TELP_PERUSAHAAN"));
            
            Bagian bagian = new Bagian();
            bagian.setId_bagian(rs.getInt("ID_BAGIAN"));
            bagian.setPerusahaan(perusahaan);
            bagian.setNama_bagian(rs.getString("NAMA_BAGIAN"));
            
            Pegawai pegawai = new Pegawai();
            pegawai.setId_pegawai(rs.getInt("ID_PEGAWAI"));
            pegawai.setBagian(bagian);
            pegawai.setPerusahaan(perusahaan);
            pegawai.setNama_pegawai(rs.getString("NAMA_PEGAWAI"));
            pegawai.setAlamat("ALAMAT_PEGAWAI");
            pegawai.setNo_telp(rs.getString("NO_TELP_PEGAWAI"));
            pegawai.setKode_pos(rs.getInt("KODE_POS_PEGAWAI"));
            
         
            this.arrPegawai.add(pegawai); 
        }
        return this.arrPegawai;
    }
    public ArrayList<Perusahaan> getDataPerusahaan() throws SQLException{
        this.arrPerusahaan.clear();
        ResultSet rs = this.koneksi.GetData("SELECT * FROM PERUSAHAAN_06947 ORDER BY ID_PERUSAHAAN ASC");
        while (rs.next()) {
            Perusahaan perusahaan = new Perusahaan();
            perusahaan.setId_perusahaan(rs.getInt("ID_PERUSAHAAN"));
            perusahaan.setNama_perusahaan(rs.getString("NAMA_PERUSAHAAN"));
            perusahaan.setAlamat(rs.getString("ALAMAT"));
            perusahaan.setKode_pos(rs.getInt("KODE_POS"));
            perusahaan.setNo_telp(rs.getString("NO_TELP"));
            this.arrPerusahaan.add(perusahaan);
        }
        return this.arrPerusahaan;
    }
    public ArrayList<Bagian> getDataBagian() throws SQLException{
        this.arrBagian.clear();
        ResultSet rs = this.koneksi.GetData("SELECT BAGIAN_06947.*, PERUSAHAAN_06947.* FROM BAGIAN_06947 JOIN PERUSAHAAN_06947 ON BAGIAN_06947.ID_PERUSAHAAN = PERUSAHAAN_06947.ID_PERUSAHAAN");
        while (rs.next()) {
            Perusahaan perusahaan = new Perusahaan();
            perusahaan.setId_perusahaan(rs.getInt("ID_PERUSAHAAN"));
            perusahaan.setNama_perusahaan(rs.getString("NAMA_PERUSAHAAN"));
            perusahaan.setAlamat(rs.getString("ALAMAT"));
            perusahaan.setKode_pos(rs.getInt("KODE_POS"));
            perusahaan.setNo_telp(rs.getString("NO_TELP"));
            
            Bagian bagian = new Bagian();
            bagian.setId_bagian(rs.getInt("ID_BAGIAN"));
            bagian.setPerusahaan(perusahaan);
            bagian.setNama_bagian(rs.getString("NAMA_BAGIAN"));
            this.arrBagian.add(bagian);
        }
        return this.arrBagian;
    }
    public void insertPerusahaan(Perusahaan perusahaan)throws SQLException{
        try{
            this.koneksi.ManipulasiData("INSERT INTO PERUSAHAAN_06947 (ID_PERUSAHAAN, NAMA_PERUSAHAAN, KODE_POS, NO_TELP, ALAMAT) VALUES (ID_PERUSAHAAN.NEXTVAL, '"+perusahaan.getNama_perusahaan()+"', '"+perusahaan.getKode_pos()+"', '"+perusahaan.getNo_telp()+"','"+perusahaan.getAlamat()+"')");
        } catch (Exception ex) {
            System.out.println(ex);
        } 
    }
    public void deletePerusahaan(Perusahaan perusahaan) throws SQLException{
        try {
            this.koneksi.ManipulasiData("DELETE FROM PERUSAHAAN_06947 WHERE ID_PERUSAHAAN = "+perusahaan.getId_perusahaan());
        } catch (Exception ex) {
            System.out.println(ex);
        } 
    }
    public void editPerusahaan(Perusahaan perusahaan) throws SQLException{
        this.koneksi.ManipulasiData("UPDATE PERUSAHAAN_06947 SET NAMA_PERUSAHAAN = '"+perusahaan.getNama_perusahaan()+"', KODE_POS = '"+perusahaan.getKode_pos()+"', NO_TELP = '"+perusahaan.getNo_telp()+"', ALAMAT = '"+perusahaan.getAlamat()+"' WHERE ID_PERUSAHAAN = "+perusahaan.getId_perusahaan());
    }    
}
