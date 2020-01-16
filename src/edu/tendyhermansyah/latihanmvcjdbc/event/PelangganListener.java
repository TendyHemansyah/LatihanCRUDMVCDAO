/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.tendyhermansyah.latihanmvcjdbc.event;

import edu.tendyhermansyah.latihanmvcjdbc.entity.Pelanggan;
import edu.tendyhermansyah.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author user
 * NIM      : 10118083
 * NAMA     : Tendy Hermansyah
 * KELAS    : IF-2
 */
public interface PelangganListener {
    public void onChange(PelangganModel model);
    
    public void onInsert(Pelanggan pelanggan);
    
    public void onUpdate(Pelanggan pelanggan);
    
    public void onDelete();
}
