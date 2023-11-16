package GUI;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Ayuda extends javax.swing.JFrame {

    public Ayuda() {

    }

    public Ayuda(int Numero) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(Ayuda.DISPOSE_ON_CLOSE);
        mostrarImagen(Numero);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taMostrarAyuda = new javax.swing.JTextArea();
        lblImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(247, 230, 166));

        taMostrarAyuda.setColumns(20);
        taMostrarAyuda.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        taMostrarAyuda.setRows(5);
        jScrollPane1.setViewportView(taMostrarAyuda);

        lblImagen.setText("a");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void dimencionarImagenes(ImageIcon imagenIcono) {
        int anchoDeseado = 700;
        int altoDeseado = 700;

        Image imagenOriginal = imagenIcono.getImage();

        // Obtiene las dimensiones originales de la imagen
        int anchoOriginal = imagenOriginal.getWidth(null);
        int altoOriginal = imagenOriginal.getHeight(null);

        // Calcula las nuevas dimensiones manteniendo las proporciones originales
        double escalaAncho = (double) anchoDeseado / anchoOriginal;
        double escalaAlto = (double) altoDeseado / altoOriginal;
        double factorEscala = Math.min(escalaAncho, escalaAlto);

        // Aplica la escala manteniendo las proporciones originales
        int nuevoAncho = (int) (anchoOriginal * factorEscala);
        int nuevoAlto = (int) (altoOriginal * factorEscala);

        Image imagenEscalada = imagenOriginal.getScaledInstance(nuevoAncho, nuevoAlto, Image.SCALE_SMOOTH);

        // Crea un nuevo ImageIcon con la imagen escalada
        ImageIcon imagenEscaladaIcono = new ImageIcon(imagenEscalada);

        // Usa la imagen escalada en lugar de la imagen original
        lblImagen.setIcon(imagenEscaladaIcono);

        // Centrar la imagen en el JLabel
        lblImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagen.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
    }

    private void cambiosTextArea() {
        taMostrarAyuda.setEditable(false);  // Hace que el área de texto sea de solo lectura
        taMostrarAyuda.setLineWrap(true);    // Hace que las líneas se ajusten automáticamente
        taMostrarAyuda.setWrapStyleWord(true);  // Hace que las palabras se ajusten automáticamente
    }

    public void mostrarImagen(int numero) {
        ImageIcon imagenIcono;
        String ayuda;
        cambiosTextArea();
        switch (numero) {
            case 1:
                imagenIcono = new ImageIcon(getClass().getResource("/componentes/PersonajeUno.png"));
                dimencionarImagenes(imagenIcono);
                ayuda = "EN ESE CAMPO DE TEXTO TENDRÁS QUE COLOCAR EL NOMBRE DEL PERSONAJE, ASEGURATE DE COLOCAR EL NOMBRE DEL PERSONAJE QUE ESTÁ EN EL SISTEMA";
                taMostrarAyuda.setText(ayuda);
                break;
            case 2:
                imagenIcono = new ImageIcon(getClass().getResource("/componentes/BonoDeDaño2.png"));
                dimencionarImagenes(imagenIcono);
                ayuda = "AQUI COLOCARÁS EL BONO DE DAÑO FÍSICO QUE TENGA TU PERSONAJE";
                taMostrarAyuda.setText(ayuda);
                break;

            case 3:
                imagenIcono = new ImageIcon(getClass().getResource("/componentes/NivelPersonaje3.png"));
                dimencionarImagenes(imagenIcono);
                ayuda = "EL NIVEL DE PERSONAJE EN LA INTERFAZ PRINCIPAL DE LOS PERSONAJES QUE TENGAS";
                taMostrarAyuda.setText(ayuda);
                break;

            case 4:
                imagenIcono = new ImageIcon(getClass().getResource("/componentes/PrimerGolpe4.png"));
                dimencionarImagenes(imagenIcono);
                ayuda = "EL PORCENTAJE DEL PRIMER GOLPE LO ENCUENTRAS EN LA PARTE DE TALENTOS";
                taMostrarAyuda.setText(ayuda);
                break;
            case 5:
                imagenIcono = new ImageIcon(getClass().getResource("/componentes/DañoCritico5.png"));
                dimencionarImagenes(imagenIcono);
                ayuda = "ESTE ES EL PORCENTAJE DE DAÑO CRITICO QUE TENGAS EN TU PERSONAJE";
                taMostrarAyuda.setText(ayuda);
                break;
            case 6:
                imagenIcono = new ImageIcon(getClass().getResource("/componentes/Enemigo6.png"));
                dimencionarImagenes(imagenIcono);
                ayuda = "COLOQUE EL NIVEL DEL ENEMIGO PARA CALCULAR EL DAÑO";
                taMostrarAyuda.setText(ayuda);
                break;
            case 7:
                imagenIcono = new ImageIcon(getClass().getResource("/componentes/NivelEnemigo7.png"));
                dimencionarImagenes(imagenIcono);
                ayuda = "ELIGE LOS ENEMIGOS, SOLO PUEDE ELEGIR ENTRE 3 POR EL MOMENTO";
                taMostrarAyuda.setText(ayuda);
                break;
            case 8:
                imagenIcono = new ImageIcon(getClass().getResource("/componentes/ATQBaseArma8.png"));
                dimencionarImagenes(imagenIcono);
                ayuda = "EL DAÑO BASE DE LA ARMA LO PUEDES ENCONTAR EN EL APARTADO DE ARMAS Y PODRAS VER LOS STATS QUE TE PROPROCIONA EL ARMA";
                taMostrarAyuda.setText(ayuda);
                break;
            case 9:
                imagenIcono = new ImageIcon(getClass().getResource("/componentes/ATQTotal9.png"));
                dimencionarImagenes(imagenIcono);
                ayuda = "PARA COLOCAR EL ATQ TOTAL DEBES ENCONTARLO, ESTE ESTÁ DENTRO DEL BOTON DE LOS STATS Y ESTÁ SEPARADO CON EL ATQ DEL ARMA Y EL ATQ DEL PERSONAJE";
                taMostrarAyuda.setText(ayuda);

                break;
            case 10:
                imagenIcono = new ImageIcon(getClass().getResource("/componentes/OtrosDaños10.png"));
                dimencionarImagenes(imagenIcono);
                ayuda = "COLOCA LA BONIFICACIÓN DE LOS 2 ARTEFACTOS FALTANTES (SIN CONTAR LOS PRIMERO DOS) O SI TIENES LOS 4 IGUALES ENTONCES COLOCA LA BONIFIACIÓN QUE TE DAN ESOS 4 IGUALES";
                taMostrarAyuda.setText(ayuda);
                break;
            default:
                throw new AssertionError();
        }

    }

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Ayuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ayuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ayuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ayuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ayuda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JTextArea taMostrarAyuda;
    // End of variables declaration//GEN-END:variables
}
