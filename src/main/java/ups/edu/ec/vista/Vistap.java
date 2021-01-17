/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.vista;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ups.edu.ec.controlador.ControladorCuenta;

/**
 *
 * @author user
 */
public class Vistap extends javax.swing.JFrame {

    private boolean cajero1;
    private boolean cajero2;
    private boolean cajero3;
    private ControladorCuenta controladorCuenta;
    private ArrayList<Thread> idos;
    

    public Vistap() {
        initComponents();
        cajero1 = false;
        cajero2 = false;
        cajero3 = false;
         

        controladorCuenta = new ControladorCuenta();
        //cambiar a 10
        for (int i = 0; i < 10; i++) {
            controladorCuenta.crear(i, 100, "Cliente " + i);
        }
        idos = new ArrayList();
        for (int i = 0; i < 10; i++) {
            idos.add(new Thread(new Vistap.hilo(i)));
        }
        for (Thread ido : idos) {
            ido.start();
        }
    }

    public class hilo implements Runnable {

        int numero = 0;
        int centi = 0;
        int codigo = 0;
        boolean termino = true;

        private hilo(int i) {
            this.codigo = i;
        }

        @Override
        public void run() {

            try {
                while (termino) {
                    int wait = (int) (Math.random() * (20000 - 15000) + 15000);
                    if (cajero1 == false) {
                        cajero1 = true;

                        switch (centi) {
                            case 0:
                                if (numero < 40) {
                                    numero++;
                                    controladorCuenta.depositar(codigo, 100);
                                  //  Thread.sleep(wait);
                                } else {
                                    numero = 0;
                                    centi++;
                                }
                                break;
                            case 1:
                                if (numero < 20) {
                                    numero++;
                                    controladorCuenta.depositar(codigo, 50);
                                  //  Thread.sleep(wait);
                                } else {
                                    numero = 0;
                                    centi++;
                                }
                                break;
                            case 2:
                                if (numero < 60) {
                                    numero++;
                                    controladorCuenta.depositar(codigo, 20);
                                  //  Thread.sleep(wait);
                                } else {
                                    numero = 0;
                                    centi++;
                                }
                                break;
                            case 3:
                                if (numero < 40) {
                                    numero++;
                                    controladorCuenta.retiro(codigo, 100);
                                   // Thread.sleep(wait);
                                } else {
                                    numero = 0;
                                    centi++;
                                }
                                break;
                            case 4:
                                if (numero < 20) {
                                    numero++;
                                    controladorCuenta.retiro(codigo, 50);
                                    //Thread.sleep(wait);
                                } else {
                                    numero = 0;
                                    centi++;
                                }
                                break;
                            case 5:
                                if (numero < 60) {
                                    numero++;
                                    controladorCuenta.retiro(codigo, 20);
                                   // Thread.sleep(wait);
                                } else {
                                    numero = 0;
                                    centi++;
                                }
                                break;

                        }
                        show();
                        cajero1 = false;

                    } else if (cajero2 == false) {
                        cajero2 = true;
                        switch (centi) {
                            case 0:
                                if (numero < 40) {
                                    numero++;
                                    controladorCuenta.depositar(codigo, 100);
                                   // Thread.sleep(wait);
                                } else {
                                    numero = 0;
                                    centi++;
                                }
                                break;
                            case 1:
                                if (numero < 20) {
                                    numero++;
                                    controladorCuenta.depositar(codigo, 50);
                                   // Thread.sleep(wait);
                                } else {
                                    numero = 0;
                                    centi++;
                                }
                                break;
                            case 2:
                                if (numero < 60) {
                                    numero++;
                                    controladorCuenta.depositar(codigo, 20);
                                    //Thread.sleep(wait);
                                } else {
                                    numero = 0;
                                    centi++;
                                }
                                break;
                            case 3:
                                if (numero < 40) {
                                    numero++;
                                    controladorCuenta.retiro(codigo, 100);
                                    //Thread.sleep(wait);
                                } else {
                                    numero = 0;
                                    centi++;
                                }
                                break;
                            case 4:
                                if (numero < 20) {
                                    numero++;
                                    controladorCuenta.retiro(codigo, 50);
                                   // Thread.sleep(wait);
                                } else {
                                    numero = 0;
                                    centi++;
                                }
                                break;
                            case 5:
                                if (numero < 60) {
                                    numero++;
                                    controladorCuenta.retiro(codigo, 20);
                                    //Thread.sleep(wait);
                                } else {
                                    numero = 0;
                                    centi++;
                                }
                                break;

                        }
                        show();
                        cajero2 = false;

                    } else if (cajero3 == false) {
                        cajero3 = true;
                        switch (centi) {
                            case 0:
                                if (numero < 40) {
                                    numero++;
                                    controladorCuenta.depositar(codigo, 100);
                                    //Thread.sleep(wait);
                                } else {
                                    numero = 0;
                                    centi++;
                                }
                                break;
                            case 1:
                                if (numero < 20) {
                                    numero++;
                                    controladorCuenta.depositar(codigo, 50);
                                   // Thread.sleep(wait);
                                } else {
                                    numero = 0;
                                    centi++;
                                }
                                break;
                            case 2:
                                if (numero < 60) {
                                    numero++;
                                    controladorCuenta.depositar(codigo, 20);
                                    //Thread.sleep(wait);
                                } else {
                                    numero = 0;
                                    centi++;
                                }
                                break;
                            case 3:
                                if (numero < 40) {
                                    numero++;
                                    controladorCuenta.retiro(codigo, 100);
                                   // Thread.sleep(wait);
                                } else {
                                    numero = 0;
                                    centi++;
                                }
                                break;
                            case 4:
                                if (numero < 20) {
                                    numero++;
                                    controladorCuenta.retiro(codigo, 50);
                                  //  Thread.sleep(wait);
                                } else {
                                    numero = 0;
                                    centi++;
                                }
                                break;
                            case 5:
                                if (numero < 60) {
                                    numero++;
                                    controladorCuenta.retiro(codigo, 20);
                                   // Thread.sleep(wait);
                                } else {
                                    numero = 0;
                                    centi++;
                                }
                                break;

                        }
                        show();
                        cajero3 = false;

                    } else {
                       // Thread.sleep(30000);
                    }
                    if(centi==6){
                        termino= false;
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void show() {
            
            System.out.println(controladorCuenta.show());
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vistap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vistap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vistap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vistap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vistap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
