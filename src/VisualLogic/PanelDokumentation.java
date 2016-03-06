/*
MyOpenLab by Carmelo Salafia www.myopenlab.de
Copyright (C) 2004  Carmelo Salafia cswi@gmx.de

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package VisualLogic;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.util.Locale;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLFrameHyperlinkEvent;

/**
 *
 * @author Homer
 */
public class PanelDokumentation extends javax.swing.JPanel {

    String mainPath;
    MyImage image = new MyImage();
    public JLabel label = new JLabel("");
    JTabbedPane tabPane;
    String nope;

    /**
     * Creates new form PanelDokumentation
     */
    public PanelDokumentation(JTabbedPane tabPane) {
        initComponents();
        this.tabPane = tabPane;
        image.setBackground(Color.WHITE);
        jPanel1.add(image);
        jPanel1.add(label);

        jEditorPane1.addHyperlinkListener(
                new HyperlinkListener() {
            public void hyperlinkUpdate(HyperlinkEvent e) {
                // Das aendern des Mauszeigers geht ab 
                // Java 1.3 auch automatisch 
                if (e.getEventType()
                        == HyperlinkEvent.EventType.ENTERED) {
                    ((JEditorPane) e.getSource()).setCursor(
                            Cursor.getPredefinedCursor(
                                    Cursor.HAND_CURSOR));
                } else {
                    if (e.getEventType()
                            == HyperlinkEvent.EventType.EXITED) {
                        ((JEditorPane) e.getSource()).setCursor(
                                Cursor.getPredefinedCursor(
                                        Cursor.DEFAULT_CURSOR));
                    } else // Hier wird auf ein Klick reagiert
                    {
                        if (e.getEventType()
                                == HyperlinkEvent.EventType.ACTIVATED) {
                            JEditorPane pane = (JEditorPane) e.getSource();
                            if (e instanceof HTMLFrameHyperlinkEvent) {
                                HTMLFrameHyperlinkEvent evt
                                        = (HTMLFrameHyperlinkEvent) e;
                                HTMLDocument doc
                                        = (HTMLDocument) pane.getDocument();
                                doc.processHTMLFrameHyperlinkEvent(evt);
                            } else {
                                try {
                                    // Normaler Link
                                    pane.setPage(e.getURL());
                                } catch (Throwable t) {
                                    t.printStackTrace();
                                }
                            }
                        }
                    }
                }
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();

        setLayout(new java.awt.BorderLayout());

        jToolBar1.setFloatable(false);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/de.png"))); // NOI18N
        jButton2.setMargin(new java.awt.Insets(3, 4, 3, 4));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/us.png"))); // NOI18N
        jButton3.setMargin(new java.awt.Insets(3, 4, 3, 4));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bilder/es.png"))); // NOI18N
        jButton4.setMargin(new java.awt.Insets(3, 4, 3, 4));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        add(jToolBar1, java.awt.BorderLayout.NORTH);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jPanel2.add(jPanel1, java.awt.BorderLayout.NORTH);

        jScrollPane1.setEnabled(false);

        jEditorPane1.setEditable(false);
        jScrollPane1.setViewportView(jEditorPane1);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton4ActionPerformed
    {//GEN-HEADEREND:event_jButton4ActionPerformed
        String docFileName = mainPath + "doc_es.html";
        loadDoc(docFileName, jEditorPane1);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton3ActionPerformed
    {//GEN-HEADEREND:event_jButton3ActionPerformed
        String docFileName = mainPath + "doc_en.html";
        loadDoc(docFileName, jEditorPane1);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void processButtons() {
        
        jButton2.setSelected(false);
        jButton3.setSelected(false);
        jButton4.setSelected(false);
            
        
        if (jButton2.isSelected()) {
            jButton3.setSelected(true);
            jButton4.setSelected(true);
        }
        if (jButton3.isSelected()) {
            jButton2.setSelected(true);
            jButton4.setSelected(true);
        }
        if (jButton4.isSelected()) {
            jButton2.setSelected(true);
            jButton3.setSelected(true);
        }
    }


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed

        processButtons();

        String docFileName = mainPath + "doc.html";
        loadDoc(docFileName, jEditorPane1);
    }//GEN-LAST:event_jButton2ActionPerformed

    JPanel docPanel = new JPanel();

    private void loadDoc(String filename, JEditorPane pane) {
        URL url = null;
        if (!new File(filename).exists()) {
            filename = nope;
        }

        try {
            url = new URL("file:" + filename);
        } catch (Exception ex) {

        }

        try {
            pane.setContentType("text/html");
            pane.setPage(url);
        } catch (Exception e) {

        }

    }

    public void openElementDocFile(Element element) throws Exception {
        nope = element.elementPath + "/nope.html";
        String strLocale = Locale.getDefault().toString();

        String docFileName = "";

        mainPath = element.docPath;
        
        
        jButton2.setSelected(false);
        jButton3.setSelected(false);
        jButton4.setSelected(false);

        docFileName = mainPath + "doc.html";

        if (strLocale.equalsIgnoreCase("de_DE")) {
            docFileName = mainPath + "doc.html";
            jButton2.setSelected(true);
        }
        if (strLocale.equalsIgnoreCase("en_US")) {
            docFileName = mainPath + "doc_en.html";
            jButton3.setSelected(true);
        }
        if (strLocale.equalsIgnoreCase("es_ES")) {
            docFileName = mainPath + "doc_es.html";
            jButton4.setSelected(true);
        }

        loadDoc(docFileName, jEditorPane1);

        Image img = element.getIconImage();
        label.setText(element.getNameLocalized());

        if (img != null) {
            image.setImage(img);
            int w = image.getWidth() + 10;
            int h = image.getHeight() + 10;
            jPanel1.setPreferredSize(new Dimension(w, h));
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

}