package java31.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmAlert extends JFrame {
    
    private JPanel     contentPane;
    private JTextField textField;
    private JButton    btnNewButton;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frmAlert frame = new frmAlert();
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
    public frmAlert() {
        setTitle("알림창 띄우기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.add(getTextField());
        contentPane.add(getBtnNewButton());
    }
    
    private JTextField getTextField() {
        if (textField == null) {
            textField = new JTextField();
            textField.setBounds(46, 59, 116, 21);
            textField.setColumns(10);
        }
        return textField;
    }
    
    private JButton getBtnNewButton() {
        if (btnNewButton == null) {
            btnNewButton = new JButton("click");
            btnNewButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    //텍스트 옮기기
                    String tmp = textField.getText();
                    JOptionPane.showMessageDialog(null, tmp);
                    
                }
            });
            btnNewButton.setBounds(249, 58, 97, 23);
        }
        return btnNewButton;
    }
}
