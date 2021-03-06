/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app;

import Concrete.AlumnoJpaController;
import ConcreteExtends.AlumnoJPAExtends;
import Model.Alumno;
import de.javasoft.plaf.synthetica.SyntheticaBlueIceLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaOrangeMetallicLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaSkyMetallicLookAndFeel;
import java.awt.event.ItemEvent;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Programer
 */
public class frmLogin extends javax.swing.JFrame {

    /**
     * Creates new form frmLogin
     */
    public frmLogin() {
        initComponents();
        this.fillComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTitulo = new javax.swing.JPanel();
        cmbAlumnos = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pnlTitulo.setBackground(new java.awt.Color(255, 255, 255));
        pnlTitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlTitulo.setLayout(null);
        getContentPane().add(pnlTitulo);
        pnlTitulo.setBounds(0, 0, 620, 0);

        cmbAlumnos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        cmbAlumnos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbAlumnosItemStateChanged(evt);
            }
        });
        getContentPane().add(cmbAlumnos);
        cmbAlumnos.setBounds(40, 20, 410, 20);

        setBounds(0, 0, 485, 144);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbAlumnosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbAlumnosItemStateChanged
        
        if(evt.getStateChange() == ItemEvent.SELECTED)
        {
            String nombre=cmbAlumnos.getSelectedItem().toString();
            AlumnoJPAExtends extenso = new AlumnoJPAExtends();
            Alumno alumno =  extenso.findAlumnoNombre(nombre);
            JOptionPane.showMessageDialog(null,"Estoy concatenando:__> "+
                    alumno.getNombre() +"\n -->"+alumno.getId() );
        }
        
        
    }//GEN-LAST:event_cmbAlumnosItemStateChanged

    
    protected void fillComboBox()
    {
        AlumnoJpaController ctrl = new AlumnoJpaController();
        List<Alumno> lista=ctrl.findAlumnoEntities(); 
        
        for(int x =0; x < lista.size();x++)
        {
            this.cmbAlumnos.addItem(lista.get(x).getNombre());
        }
       
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
        try {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
            * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
            */
             //UIManager.setLookAndFeel(new SyntheticaSkyMetallicLookAndFeel() );

         
        /*}catch (ParseException ex) {
            Logger.getLogger(frmLogin.class.getName()).log(Level.SEVERE, null, ex);
        }*/

        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbAlumnos;
    private javax.swing.JPanel pnlTitulo;
    // End of variables declaration//GEN-END:variables
}
