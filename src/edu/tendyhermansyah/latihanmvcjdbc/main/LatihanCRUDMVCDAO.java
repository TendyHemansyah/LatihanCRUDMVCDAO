/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.tendyhermansyah.latihanmvcjdbc.main;

import edu.tendyhermansyah.latihanmvcjdbc.database.KingsBarbershopDatabase;
import edu.tendyhermansyah.latihanmvcjdbc.entity.Pelanggan;
import edu.tendyhermansyah.latihanmvcjdbc.error.PelangganException;
import edu.tendyhermansyah.latihanmvcjdbc.service.PelangganDao;
import edu.tendyhermansyah.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author user
 * NIM      : 10118083
 * NAMA     : Tendy Hermansyah
 * KELAS    : IF-2
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws PelangganException, SQLException {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException e) {
                } catch (PelangganException ex) { 
                    Logger.getLogger(LatihanCRUDMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    } 
}
    