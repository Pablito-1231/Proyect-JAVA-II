package my_pets.swing;

import java.io.File;
import my_pets.modelo.*;
import java.util.ArrayList;
import my_pets.utilidades.GestorArchivos;

public class VentanaJuego extends javax.swing.JFrame {
    
    private final Mascota mascota;
    private final ArrayList<Acciones> historial;

    public VentanaJuego() {

        initComponents();
        
        // Valida y crea archivo de estado de la mascota.
        File FileMascota = new File("mascota.txt");

        if (!FileMascota.exists()) {
            
            mascota = new Perro("Firulais");
            mascota.setFelicidad(50);
            mascota.setHambre(50);
            mascota.setEnergia(50);
            
            GestorArchivos.guardarEstadoMascota(mascota, "mascota.txt");
            
        } else {
            
            String[] datos = GestorArchivos.leerEstadoMascota("mascota.txt");
            
            String tipo = datos[0];
            String nombre = datos[1];

            if (tipo.equals("Perro")) {
                mascota = new Perro(nombre);
            } else {
                mascota = new Gato(nombre);
            }

            mascota.setFelicidad(Integer.parseInt(datos[2]));
            mascota.setHambre(Integer.parseInt(datos[3]));
            mascota.setEnergia(Integer.parseInt(datos[4]));
        }
        
        if (mascota instanceof Perro) {
            lblMascotaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my_pets/imagenes/perro.gif")));

        } else if (mascota instanceof Gato) {
            lblMascotaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my_pets/imagenes/gato.gif")));
        }
        
        // Muestra el estado inicial en los labels.
        lblNombre.setText("Nombre: " + mascota.getNombre());
        lblFelicidad.setText("Felicidad: " + mascota.getFelicidad());
        lblHambre.setText("Hambre: " + mascota.getHambre());
        lblEnergia.setText("Energía: " + mascota.getEnergia());

        // Valida y crea el archivo de historial.
        File FileHistorial = new File("historial.txt");

        if (!FileHistorial.exists()) {

            historial = new ArrayList<>();
            historial.add(new Acciones("Inició historial"));
            GestorArchivos.guardarHistorial(historial, "historial.txt");

        } else {

            historial = GestorArchivos.leerHistorial("historial.txt");
        }

        // Muestra el historial en el txtHistorial.
        for (Acciones accion : historial) {
            txtHistorial.append(accion.getAccion() + "\n");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        lblEnergia = new javax.swing.JLabel();
        lblFelicidad = new javax.swing.JLabel();
        lblHambre = new javax.swing.JLabel();
        btnJugar = new javax.swing.JButton();
        btnAlimentar = new javax.swing.JButton();
        btnDormir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHistorial = new javax.swing.JTextArea();
        btnSalir = new javax.swing.JButton();
        lblMascotaImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Pets");
        setBackground(java.awt.Color.black);

        lblNombre.setText("Nombre...");

        lblEnergia.setText("Energia");

        lblFelicidad.setText("Felicidad");

        lblHambre.setText("Hambre");

        btnJugar.setText("Jugar");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });

        btnAlimentar.setText("Alimentar");
        btnAlimentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlimentarActionPerformed(evt);
            }
        });

        btnDormir.setText("Dormir");
        btnDormir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDormirActionPerformed(evt);
            }
        });

        txtHistorial.setColumns(20);
        txtHistorial.setRows(5);
        jScrollPane1.setViewportView(txtHistorial);

        btnSalir.setText("Atras");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblMascotaImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAlimentar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblHambre))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFelicidad))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEnergia)
                                    .addComponent(btnDormir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblMascotaImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(btnSalir))
                .addGap(18, 18, 18)
                .addComponent(lblMascotaImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHambre)
                    .addComponent(lblFelicidad)
                    .addComponent(lblEnergia))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlimentar)
                    .addComponent(btnJugar)
                    .addComponent(btnDormir))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlimentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlimentarActionPerformed
        
        mascota.alimentar();
        historial.add(new Acciones("Alimentó a " + mascota.getNombre()));
        actualizarEstado();

    }//GEN-LAST:event_btnAlimentarActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        
        mascota.jugar();
        historial.add(new Acciones("Jugó con " + mascota.getNombre()));
        actualizarEstado();
        
    }//GEN-LAST:event_btnJugarActionPerformed

    private void btnDormirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDormirActionPerformed
        
        mascota.dormir();
        historial.add(new Acciones(mascota.getNombre() + " durmió"));
        actualizarEstado();
        
    }//GEN-LAST:event_btnDormirActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        
        new MyPets().setVisible(true);
        this.dispose(); // cerramos ventana principal.
    }//GEN-LAST:event_btnSalirActionPerformed

    private void actualizarEstado() {
        
        //Actualiza el texto de los label.
        lblFelicidad.setText("Felicidad: " + mascota.getFelicidad());
        lblHambre.setText("Hambre: " + mascota.getHambre());
        lblEnergia.setText("Energía: " + mascota.getEnergia());

        // Agrega la última acción al historial visual.
        txtHistorial.append(historial.get(historial.size() - 1).getAccion() + "\n");

        // Guarda cambios en los archivos.
        GestorArchivos.guardarEstadoMascota(mascota, "mascota.txt");
        GestorArchivos.guardarHistorial(historial, "historial.txt");

    }

    
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
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MyPets().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlimentar;
    private javax.swing.JButton btnDormir;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnergia;
    private javax.swing.JLabel lblFelicidad;
    private javax.swing.JLabel lblHambre;
    private javax.swing.JLabel lblMascotaImagen;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextArea txtHistorial;
    // End of variables declaration//GEN-END:variables
}
