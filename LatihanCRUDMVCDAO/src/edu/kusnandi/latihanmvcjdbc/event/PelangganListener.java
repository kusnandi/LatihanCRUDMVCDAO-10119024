/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kusnandi.latihanmvcjdbc.event;

import edu.kusnandi.latihanmvcjdbc.entity.Pelanggan;
import edu.kusnandi.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author KUSNANDI
 * NIM : 10119024
 * NAMA : KUSNANDI PIRMANSYAH
 * KELAS : IF-1
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    
    public void onInsert(Pelanggan pelanggan);
    
    public void onDelete();
    
    public void onUpdate(Pelanggan pelanggan);
    
}
