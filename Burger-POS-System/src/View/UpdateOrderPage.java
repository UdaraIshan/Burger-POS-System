/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author ishan
 */
public class UpdateOrderPage extends JFrame {
    
    private JLabel lblUpdateOrder;
    
    public UpdateOrderPage() {
        setTitle("Update Order");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(700, 600);
        setLocationRelativeTo(null);
        setLayout(null);
        
        Font lblFonts=new Font("",Font.BOLD,15);
        
        lblUpdateOrder = new JLabel();
        lblUpdateOrder.setText("Update Order");
        lblUpdateOrder.setFont(new Font("",Font.PLAIN,35));
        lblUpdateOrder.setForeground(Color.white);
        lblUpdateOrder.setBounds(0,0,700,70);
        lblUpdateOrder.setVerticalAlignment(JLabel.CENTER);
        lblUpdateOrder.setHorizontalAlignment(JLabel.CENTER);
        lblUpdateOrder.setBackground(new Color(255,25,25));
        lblUpdateOrder.setOpaque(true);
        
        add(lblUpdateOrder);
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../images/icon/icons8-customer-48.png")));
    }
}
