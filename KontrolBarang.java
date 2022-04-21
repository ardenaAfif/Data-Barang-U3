package com.mycompany.databarangu3;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import javax.swing.JOptionPane;

public class KontrolBarang  {
    
    private final String[] header = {"Total Barang", "Nama Barang", "Tipe Barang", "Harga Barang"};
    private final ArrayList<Barang> list = new ArrayList<>();
    
    public void tampil(JTable jt) {
        DefaultTableModel dtm = new DefaultTableModel(null, header);
        
        for (int i = 0; i < list.size(); i++) {
            Object[] ob = new Object[4];
            ob[0] = list.get(i).getKode();
            ob[1] = list.get(i).getNama();
            ob[2] = list.get(i).getTipe();
            ob[3] = list.get(i).getHarga();
            dtm.addRow(ob);
        }
        jt.setModel(dtm);
    }
    
    public void tambah(Barang brng) {
        list.add(brng);
        JOptionPane.showMessageDialog(null, "Barang Berhasil Ditambahkan");
    }
    
    public void ganti(Barang brng) {
        for (int i = 0; i < list.size(); i++) {
            if (brng.getKode() == list.get(i).getKode()) {
                list.set(i, brng);
            }
        }
        JOptionPane.showMessageDialog(null, "Data Barang Berhasil Diubah");
    }

    public void hapus(int kode) {
        for (int i = 0; i < list.size(); i++) {
            if (kode == list.get(i).getKode()) {
                list.remove(i);
            }
        }
        JOptionPane.showMessageDialog(null, "Data Barang Berhasil Dihapus");
    }   
    
}
