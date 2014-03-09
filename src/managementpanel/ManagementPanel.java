/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managementpanel;

import javax.swing.JFrame;


/**
 *
 * @author Mukaddes
 */
public class ManagementPanel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ManagementGUI m_ui = new ManagementGUI();
        m_ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m_ui.setLocationRelativeTo(null);
        m_ui.setVisible(true);
        
    }

//        KasiyerJFrame cashierEnter = new KasiyerJFrame();
//        cashierEnter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        cashierEnter.setLocationRelativeTo(null);
//        cashierEnter.setVisible(true);
}
