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
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author ishan
 */
public class SearchOrderPage extends JFrame {
    
    private JLabel lblFonts;
    private JLabel lblSearch;
    private JLabel lblOrderId;
    private JLabel lblCustomerId;
    private JLabel lblCustomerName;
    private JLabel lblQuantity;
    private JLabel lblNetTotal;
    private JLabel lblOrderStatus;
    
    private JTextField textOrderId;
    
    private JButton btnSearch;
    
    public SearchOrderPage() {
        setTitle("Search");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setLayout(null);
        
        Font lblFonts=new Font("",Font.BOLD,15);
        
        lblSearch = new JLabel();
        lblSearch.setText("Search Order Details");
        lblSearch.setFont(new Font("",Font.PLAIN,35));
        lblSearch.setForeground(Color.white);
        lblSearch.setBounds(0,0,500,70);
        lblSearch.setVerticalAlignment(JLabel.CENTER);
        lblSearch.setHorizontalAlignment(JLabel.CENTER);
        lblSearch.setBackground(new Color(255,25,25));
        lblSearch.setOpaque(true);
        
        lblOrderId = new JLabel();
        lblOrderId.setText("Enter Order Id: ");
        lblOrderId.setFont(lblFonts);
        lblOrderId.setBounds(50, 100, 150, 20);
        
        lblCustomerId = new JLabel();
        lblCustomerId.setText("Customer Id: ");
        lblCustomerId.setFont(lblFonts);
        lblCustomerId.setBounds(80, 180, 150, 20);
        
        lblCustomerName = new JLabel();
        lblCustomerName.setText("Customer Name: ");
        lblCustomerName.setFont(lblFonts);
        lblCustomerName.setBounds(80, 230, 150, 20);
        
        lblQuantity = new JLabel();
        lblQuantity.setText("Quantity: ");
        lblQuantity.setFont(lblFonts);
        lblQuantity.setBounds(80, 280, 100, 20);
        
        lblNetTotal = new JLabel();
        lblNetTotal.setText("Total: ");
        lblNetTotal.setFont(lblFonts);
        lblNetTotal.setBounds(80, 330, 100, 20);
        
        lblOrderStatus = new JLabel();
        lblOrderStatus.setText("Order Status: ");
        lblOrderStatus.setFont(lblFonts);
        lblOrderStatus.setBounds(80, 380, 150, 20);
        
        textOrderId = new JTextField();
        textOrderId.setBounds(170, 100, 150, 25);
        
        btnSearch = new JButton("Search");
        btnSearch.setFont(lblFonts);
        btnSearch.setBounds(330, 100, 90, 25);
        btnSearch.setForeground(Color.white);
        btnSearch.setBackground(Color.red);
        btnSearch.setFocusable(false);
        btnSearch.addActionListener(evt ->{
            System.out.println("Details Recevied");
            
        });
        
        add(lblSearch);
        add(lblOrderId);
        add(lblCustomerId);
        add(lblCustomerName);
        add(lblQuantity);
        add(lblNetTotal);
        add(lblOrderStatus);
        
        add(textOrderId);
        add(btnSearch);
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../images/icon/icons8-customer-48.png")));
    }
}
