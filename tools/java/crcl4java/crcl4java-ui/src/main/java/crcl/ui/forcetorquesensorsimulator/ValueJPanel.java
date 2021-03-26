/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crcl.ui.forcetorquesensorsimulator;

import javax.swing.JFrame;

/**
 *
 * @author Will Shackleford {@literal <william.shackleford@nist.gov>}
 */
public class ValueJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ValueJPanel
     */
    @SuppressWarnings("initialization")
    public ValueJPanel() {
        initComponents();
        jLabelName.setText(super.getName());
    }

    /**
     * Creates new form ValueJPanel
     */
    @SuppressWarnings("initialization")
    public ValueJPanel(String name) {
        initComponents();
        jLabelName.setText(name);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelName = new javax.swing.JLabel();
        jSliderFx1 = new javax.swing.JSlider();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldFxMax1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldFxMin1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldFxValue1 = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelName.setText("Fx:");

        jSliderFx1.setMaximum(1000);
        jSliderFx1.setValue(500);
        jSliderFx1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderFx1StateChanged(evt);
            }
        });

        jLabel7.setText("Min: ");

        jTextFieldFxMax1.setText("1000");
        jTextFieldFxMax1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFxMax1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Max: ");

        jTextFieldFxMin1.setText("0");
        jTextFieldFxMin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFxMin1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Value: ");

        jTextFieldFxValue1.setText("500");
        jTextFieldFxValue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFxValue1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSliderFx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldFxMin1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldFxMax1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldFxValue1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldFxMin1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(jTextFieldFxMax1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(jTextFieldFxValue1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7)
                        .addComponent(jSliderFx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelName)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldFxValue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFxValue1ActionPerformed
        final String text = jTextFieldFxValue1.getText();
        final double v = Double.parseDouble(text);
        setValue(v);
    }//GEN-LAST:event_jTextFieldFxValue1ActionPerformed

    private void jSliderFx1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderFx1StateChanged
        jTextFieldFxValue1.setText(Double.toString(getValue()));
    }//GEN-LAST:event_jSliderFx1StateChanged

    private void jTextFieldFxMin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFxMin1ActionPerformed
        final String text = jTextFieldFxValue1.getText();
        final double v = Double.parseDouble(text);
        setValue(v);
    }//GEN-LAST:event_jTextFieldFxMin1ActionPerformed

    private void jTextFieldFxMax1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFxMax1ActionPerformed
        final String text = jTextFieldFxValue1.getText();
        final double v = Double.parseDouble(text);
        setValue(v);
    }//GEN-LAST:event_jTextFieldFxMax1ActionPerformed

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        if (null == jLabelName) {
            return super.getName();
        }
        return jLabelName.getText();
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        super.setName(name);
        jLabelName.setText(name);
    }

    /**
     * Get the value of minValue
     *
     * @return the value of minValue
     */
    public double getMinValue() {
        return Double.parseDouble(jTextFieldFxMin1.getText());
    }

    /**
     * Set the value of minValue
     *
     * @param minValue new value of minValue
     */
    public void setMinValue(double minValue) {
        jTextFieldFxMin1.setText(Double.toString(minValue));
    }

    /**
     * Get the value of minValue
     *
     * @return the value of minValue
     */
    public double getMaxValue() {
        return Double.parseDouble(jTextFieldFxMax1.getText());
    }

    /**
     * Set the value of minValue
     *
     * @param minValue new value of minValue
     */
    public void setMaxValue(double minValue) {
        jTextFieldFxMax1.setText(Double.toString(minValue));
    }

    /**
     * Get the value of value
     *
     * @return the value of value
     */
    public double getValue() {
        int sliderValue = jSliderFx1.getValue();
        return sliderValueToDoubleValue(sliderValue);
    }

    private double sliderValueToDoubleValue(int sliderValue) {
        int sliderMax = jSliderFx1.getMaximum();
        int sliderMin = jSliderFx1.getMinimum();
        double minValue = getMinValue();
        double maxValue = getMaxValue();
        double sliderValueMinDiff = sliderValue - sliderMin;
        double sliderMaxMinDiff = sliderMax - sliderMin;
        double maxMinDiff = maxValue - minValue;
        return minValue + (sliderValueMinDiff / sliderMaxMinDiff) * maxMinDiff;
    }

    /**
     * Set the value of value
     *
     * @param value new value of value
     */
    public void setValue(final double value) {
        int sliderMax = jSliderFx1.getMaximum();
        int sliderMin = jSliderFx1.getMinimum();
        double minValue = getMinValue();
        double maxValue = getMaxValue();
        double sliderMaxMinDiff = sliderMax - sliderMin;
        double maxMinDiff = maxValue - minValue;
        double valueMinDff = value - minValue;
        double newValue = sliderMin + valueMinDff / maxMinDiff * sliderMaxMinDiff;
        int newValueInt = (int) newValue;
        final double newDoubleSliderValue = sliderValueToDoubleValue(newValueInt);
        final String valueText = Double.toString(newDoubleSliderValue);
        jSliderFx1.setValue(newValueInt);
        jTextFieldFxValue1.setText(valueText);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.add(new ValueJPanel());
            frame.pack();
            frame.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JSlider jSliderFx1;
    private javax.swing.JTextField jTextFieldFxMax1;
    private javax.swing.JTextField jTextFieldFxMin1;
    private javax.swing.JTextField jTextFieldFxValue1;
    // End of variables declaration//GEN-END:variables
}
