package lib;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java31.swing.frmB;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame {
    
    private JPanel     contentPane;
    private JLabel     lblNewLabel;
    private JLabel     lblNewLabel_1;
    private JTextField txtid;
    private JTextField txtpw;
    private JButton    butlogin;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    login frame = new login();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    /**
     * Create the frame.
     */
    public login() {
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 295, 108);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.add(getLblNewLabel());
        contentPane.add(getLblNewLabel_1());
        contentPane.add(getTxtid());
        contentPane.add(getTxtpw());
        contentPane.add(getButlogin());
    }
    
    private JLabel getLblNewLabel() {
        if (lblNewLabel == null) {
            lblNewLabel = new JLabel("ID");
            lblNewLabel.setBounds(29, 10, 57, 15);
        }
        return lblNewLabel;
    }
    
    private JLabel getLblNewLabel_1() {
        if (lblNewLabel_1 == null) {
            lblNewLabel_1 = new JLabel("PW");
            lblNewLabel_1.setBounds(29, 45, 24, 15);
        }
        return lblNewLabel_1;
    }
    
    private JTextField getTxtid() {
        if (txtid == null) {
            txtid = new JTextField();
            txtid.setBounds(56, 7, 116, 21);
            txtid.setColumns(10);
        }
        return txtid;
    }
    
    private JTextField getTxtpw() {
        if (txtpw == null) {
            txtpw = new JTextField();
            txtpw.setBounds(56, 42, 116, 21);
            txtpw.setColumns(10);
        }
        return txtpw;
    }
    
    private JButton getButlogin() {
        if (butlogin == null) {
        	butlogin = new JButton("Login");
        	butlogin.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        if(txtid.getText() .equals("admin")){
        	        main main = new main();
                    main.setVisible(true);
                    dispose();
        	        }
        	    }
        	});
        	butlogin.setBounds(184, 6, 83, 54);
        }
        return butlogin;
    }
}
