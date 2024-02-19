/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author ishan
 */
public class SearchPage extends JFrame {
    
    private JLabel lblSearch;
    
    private JButton btnSearchOrder;
    private JButton btnCustomer;
    
    public SearchPage() {
        setTitle("Search Page");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
        
        lblSearch = new JLabel();
        lblSearch.setText("Search Page");
        lblSearch.setFont(new Font("",Font.PLAIN,40));
        lblSearch.setForeground(Color.white);
        lblSearch.setBounds(0,0,500,70);
        lblSearch.setVerticalAlignment(JLabel.CENTER);
        lblSearch.setHorizontalAlignment(JLabel.CENTER);
        lblSearch.setBackground(new Color(255,25,25));
        lblSearch.setOpaque(true);
        
        btnSearchOrder = new JButton("Search Order");
        btnSearchOrder.setForeground(Color.white);
        btnSearchOrder.setBackground(Color.red);
        btnSearchOrder.setFont(new Font("",Font.PLAIN,17));
        btnSearchOrder.setBounds(150, 180, 200, 40);
        btnSearchOrder.setFocusable(false);
        btnSearchOrder.addActionListener(evt ->{
            new SearchOrderPage().setVisible(true);
        });
        
        btnCustomer = new JButton("Search Customer");
        btnCustomer.setForeground(Color.white);
        btnCustomer.setBackground(Color.red);
        btnCustomer.setFont(new Font("",Font.PLAIN,17));
        btnCustomer.setBounds(150, 230, 200, 40);
        btnCustomer.setFocusable(false);
        btnCustomer.addActionListener(evt ->{
            new SearchCustomerPage().setVisible(true);
        });
        
        add(btnSearchOrder);
        add(btnCustomer);
        add(lblSearch);
        
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../images/icon/icons8-customer-48.png")));
    }
}
