/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author hp
 */public class JavaApplication2 extends javax.swing.JFrame {
 
    JavaApplication2() {
        JFrame frame = new JFrame();
 
        JLabel lb1 = new JLabel("Height(meter):");
        lb1.setBounds(20, 20, 100, 40);
        frame.add(lb1); 
 
        JLabel lb2 = new JLabel("Weight(kilogram):");
        lb2.setBounds(20, 60, 100, 40);
        frame.add(lb2);  
        
        JLabel lbResult = new JLabel("BMI Calculator in JAVA GUI");
        lbResult.setBounds(20, 90, 300, 40);
        frame.add(lbResult);  
        
        JTextField txtHeight = new JTextField("");
        txtHeight.setBounds(120, 20, 200, 40);
        frame.add(txtHeight); 
 JTextField txtWeight = new JTextField("");
        txtWeight.setBounds(120, 60, 200, 40);
        frame.add(txtWeight); 
 
        JButton btn = new JButton("BMI Calculator");  
        btn.setBounds(20, 130, 250, 30);
        
        //Event
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                double weight=Double.parseDouble(txtWeight.getText());
                double height=Double.parseDouble(txtHeight.getText());
                
                double BMI = weight / Math.pow(height, 2);
 
                 if (BMI < 18.5) {lbResult.setText("underweight - BMI : "+BMI);
                 } else if (BMI < 25) {
                     lbResult.setText("normal - BMI : "+BMI);
                 } else if (BMI < 30) {
                     lbResult.setText("overweight - BMI : "+BMI);
                 } else {
                     lbResult.setText("obese - BMI : "+BMI);
                 }
            }
        });
 
        frame.add(btn);//adding button in JFrame  
 
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
         }
 
    public static void main(String[] args) {
        new JavaApplication2();
    }
}

