package projeto_filtro;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Marco Antonio, Tony Hudyson, Vitor Hugo
 */
public class Main extends javax.swing.JFrame {
    
    public String caminho = "";
    public BufferedImage imgOriginal;

    public Main() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CaixaDeTexto = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        txtNomeImagem = new javax.swing.JTextField();
        btnSalvarImagem = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnAbrir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        cbxFiltros = new javax.swing.JComboBox<>();
        btnAbrirFiltro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblImagem = new javax.swing.JLabel();

        CaixaDeTexto.setTitle("NOME DA IMAGEM");
        CaixaDeTexto.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        CaixaDeTexto.setModal(true);
        CaixaDeTexto.setResizable(false);
        CaixaDeTexto.setSize(new java.awt.Dimension(400, 150));

        jLabel1.setText("Digite o nome da imagem para salvar:");

        btnSalvarImagem.setText("SALVAR");
        btnSalvarImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarImagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CaixaDeTextoLayout = new javax.swing.GroupLayout(CaixaDeTexto.getContentPane());
        CaixaDeTexto.getContentPane().setLayout(CaixaDeTextoLayout);
        CaixaDeTextoLayout.setHorizontalGroup(
            CaixaDeTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CaixaDeTextoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CaixaDeTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CaixaDeTextoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtNomeImagem))
                .addContainerGap())
            .addGroup(CaixaDeTextoLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(btnSalvarImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );
        CaixaDeTextoLayout.setVerticalGroup(
            CaixaDeTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CaixaDeTextoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvarImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FILTROS.. created by Marco, Tony and Vitor  :D");
        setBackground(new java.awt.Color(153, 255, 255));

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnAbrir.setText("Carregar Imagem");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar Imagem");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        cbxFiltros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um filtro", "Preto e Branco", "Cinza", "Cinza Zebrado", "Sepia", "Negativo", "Espelho", "Linha Vira Coluna", "Coluna Vira Linha", "Mudar cores vermelho, verde e azul", "Media", "Mediana", "Moda", "Máxima", "Mínima", "Zoom" }));
        cbxFiltros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFiltrosActionPerformed(evt);
            }
        });

        btnAbrirFiltro.setText("Abrir Filtro");
        btnAbrirFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirFiltroActionPerformed(evt);
            }
        });

        jLabel2.setText("----->");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAbrir)
                    .addComponent(btnSalvar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAbrirFiltro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(11, 11, 11)
                        .addComponent(cbxFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(256, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAbrir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbrirFiltro)
                    .addComponent(cbxFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(lblImagem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
        );

        setSize(new java.awt.Dimension(665, 625));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        try {

            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Image Files", "jpg", "png"));
            int ok = jFileChooser.showOpenDialog(null);

            if (ok == JFileChooser.APPROVE_OPTION) {

                caminho = jFileChooser.getCurrentDirectory().getPath() + "\\" + jFileChooser.getSelectedFile().getName(); // caminho do arquivo

                imgOriginal = ImageIO.read(new File(caminho));

                atualizaImagem();

            } else {
                jFileChooser.cancelSelection();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    public void atualizaImagem() {
        lblImagem.setIcon(new ImageIcon(imgOriginal));
    }

    private void btnAbrirFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirFiltroActionPerformed
        if (imgOriginal != null) {

            if (cbxFiltros.getSelectedItem().equals("Selecione um filtro")) {
                JOptionPane.showMessageDialog(null, "Nenhum filtro selecionado!\nEscolha um filtro e tente navamente");

            } else if (cbxFiltros.getSelectedItem().equals("Preto e Branco")) {
                PretoeBranco pb = new PretoeBranco();
                pb.imgOriginal = imgOriginal;
                pb.ph = this;

                pb.imgProcessada = imgOriginal;

                pb.setVisible(true);

                pb.atualizaImagemRedimensionada();
            } else if (cbxFiltros.getSelectedItem().equals("Cinza")) {
                Cinza cz = new Cinza();
                cz.imgOriginal = imgOriginal;
                cz.ph = this;

                cz.imgProcessada = imgOriginal;

                cz.setVisible(true);

                cz.atualizaImagemRedimensionada();
            }  else if (cbxFiltros.getSelectedItem().equals("Sepia")) {
                Sepia sp = new Sepia();
                sp.imgOriginal = imgOriginal;
                sp.ph = this;

                sp.imgProcessada = imgOriginal;

                sp.setVisible(true);

                sp.atualizaImagemRedimensionada();
            } else if (cbxFiltros.getSelectedItem().equals("Negativo")) {
                Negativo ng = new Negativo();
                ng.imgOriginal = imgOriginal;
                ng.ph = this;

                ng.imgProcessada = imgOriginal;

                ng.setVisible(true);

                ng.atualizaImagemRedimensionada();
            } else if (cbxFiltros.getSelectedItem().equals("Espelho")) {
                Espelho esph = new Espelho();
                esph.imgOriginal = imgOriginal;
                esph.ph = this;

                esph.imgProcessada = imgOriginal;

                esph.setVisible(true);

                esph.atualizaImagemRedimensionada();
            } else if (cbxFiltros.getSelectedItem().equals("Linha Vira Coluna")) {
                LinhaViraColuna lvc = new LinhaViraColuna();
                lvc.imgOriginal = imgOriginal;
                lvc.ph = this;

                lvc.imgProcessada = imgOriginal;

                lvc.setVisible(true);

                lvc.atualizaImagemRedimensionada();
            } else if (cbxFiltros.getSelectedItem().equals("Coluna Vira Linha")) {
                ColunaViraLinha cvl = new ColunaViraLinha();
                cvl.imgOriginal = imgOriginal;
                cvl.ph = this;

                cvl.imgProcessada = imgOriginal;

                cvl.setVisible(true);

                cvl.atualizaImagemRedimensionada();
            } else if (cbxFiltros.getSelectedItem().equals("Mudar cores vermelho, verde e azul")) {
                EscolherTons et = new EscolherTons();
                et.imgOriginal = imgOriginal;
                et.ph = this;

                et.imgProcessada = imgOriginal;

                et.setVisible(true);

                et.atualizaImagemRedimensionada();
            } else if (cbxFiltros.getSelectedItem().equals("Media")) {
                Media media = new Media();
                media.imgOriginal = imgOriginal;
                media.ph = this;

                media.imgProcessada = imgOriginal;

                media.setVisible(true);

                media.atualizaImagemRedimensionada();
            } else if (cbxFiltros.getSelectedItem().equals("Mediana")) {
                Mediana mediana = new Mediana();
                mediana.imgOriginal = imgOriginal;
                mediana.ph = this;

                mediana.imgProcessada = imgOriginal;

                mediana.setVisible(true);

                mediana.atualizaImagemRedimensionada();
            } else if (cbxFiltros.getSelectedItem().equals("Moda")) {
                Moda moda = new Moda();
                moda.imgOriginal = imgOriginal;
                moda.ph = this;

                moda.imgProcessada = imgOriginal;

                moda.setVisible(true);

                moda.atualizaImagemRedimensionada();
            } else if (cbxFiltros.getSelectedItem().equals("Máxima")) {
                Maxima maxima = new Maxima();
                maxima.imgOriginal = imgOriginal;
                maxima.ph = this;

                maxima.imgProcessada = imgOriginal;

                maxima.setVisible(true);

                maxima.atualizaImagemRedimensionada();
            } else if (cbxFiltros.getSelectedItem().equals("Mínima")) {
                Minima min = new Minima();
                min.imgOriginal = imgOriginal;
                min.ph = this;

                min.imgProcessada = imgOriginal;

                min.setVisible(true);

                min.atualizaImagemRedimensionada();
            } else if (cbxFiltros.getSelectedItem().equals("Zoom")) {
                Zoom zo = new Zoom();
                zo.imgOriginal = imgOriginal;
                zo.ph = this;

                zo.imgProcessada = imgOriginal;

                zo.setVisible(true);

                zo.atualizaImagem();
            } 

        } else {
            JOptionPane.showMessageDialog(null, "Imagem não carregada!\nAbra uma imagem antes de selecionar um filtro");
        }
    }//GEN-LAST:event_btnAbrirFiltroActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        CaixaDeTexto.setLocationRelativeTo(null);
        CaixaDeTexto.setVisible(true);
        try {
            ImageIO.write(imgOriginal, "jpg", new File(txtNomeImagem.getText() + ".jpg"));
            JOptionPane.showMessageDialog(null, "Imagem salva com sucesso!!");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "ERRO:\nNão foi possivel salvar a imagem.\nError:" + ex);
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSalvarImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarImagemActionPerformed
        CaixaDeTexto.dispose();
    }//GEN-LAST:event_btnSalvarImagemActionPerformed

    private void cbxFiltrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFiltrosActionPerformed
        
    }//GEN-LAST:event_cbxFiltrosActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog CaixaDeTexto;
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnAbrirFiltro;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvarImagem;
    private javax.swing.JComboBox<String> cbxFiltros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JTextField txtNomeImagem;
    // End of variables declaration//GEN-END:variables

    
}
