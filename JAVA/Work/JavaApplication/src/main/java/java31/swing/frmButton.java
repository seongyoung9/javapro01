package java31.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class frmButton extends JFrame {
    
    private JPanel contentPane;
    private JButton btnNewButton;
    private JButton btnNewButton_1;
    private JButton btnNewButton_2;
    private JButton btnNewButton_3;
    private JTextField textField;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frmButton frame = new frmButton();
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
    public frmButton() {
        setTitle("테스트 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 320);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.add(getBtnNewButton());
        contentPane.add(getBtnNewButton_1());
        contentPane.add(getBtnNewButton_2());
        contentPane.add(getBtnNewButton_3());
        contentPane.add(getTextField());
    }
    private JButton getBtnNewButton() {
        if (btnNewButton == null) {
        	btnNewButton = new JButton("오른쪽 버튼");
        	btnNewButton.setEnabled(false);
        	btnNewButton.setBounds(330, 53, 126, 74);
        }
        return btnNewButton;
    }
    private JButton getBtnNewButton_1() {
        if (btnNewButton_1 == null) {
        	btnNewButton_1 = new JButton("가운데 버튼");
        	btnNewButton_1.setBounds(178, 53, 126, 74);
        }
        return btnNewButton_1;
    }
    private JButton getBtnNewButton_2() {
        if (btnNewButton_2 == null) {
        	btnNewButton_2 = new JButton("왼쪽버튼");
        	btnNewButton_2.setBounds(26, 53, 126, 74);
        }
        return btnNewButton_2;
    }
    private JButton getBtnNewButton_3() {
        if (btnNewButton_3 == null) {
        	btnNewButton_3 = new JButton("창닫기");
        	btnNewButton_3.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        System.exit(0);
        	    }
        	});
        	btnNewButton_3.setBounds(26, 197, 430, 56);
        }
        return btnNewButton_3;
    }
    private JTextField getTextField() {
        if (textField == null) {
        	textField = new JTextField();
        	textField.setBounds(26, 156, 430, 21);
        	textField.setColumns(10);
        }
        return textField;
    }
}
