package java31.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextArea;

public class email extends JFrame {
    
    private JPanel contentPane;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
    private JLabel lblNewLabel_3;
    private JLabel lblNewLabel_4;
    private JLabel lblNewLabel_5;
    private JLabel lblNewLabel_6;
    private JRadioButton rdbtnNewRadioButton;
    private JRadioButton rdbtnNewRadioButton_1;
    private JRadioButton rdbtnNewRadioButton_2;
    private JButton btnNewButton;
    private JButton btnNewButton_1;
    private JButton btnNewButton_2;
    private JButton btnNewButton_3;
    private JTextField name;
    private JTextField job;
    private JTextField id;
    private JTextField textEmail;
    private JPanel panel;
    private JPanel panel_1;
    private JButton btnNewButton_4;
    private JButton btnNewButton_5;
    private JTextArea textArea;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField 이름;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    email frame = new email();
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
    public email() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 436, 444);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.add(getPanel());
        contentPane.add(getPanel_1());
        contentPane.add(getBtnNewButton_4());
        contentPane.add(getBtnNewButton_5());
    }
    private JLabel getLblNewLabel() {
        if (lblNewLabel == null) {
        	lblNewLabel = new JLabel("NAME");
        	lblNewLabel.setBounds(12, 10, 57, 15);
        }
        return lblNewLabel;
    }
    private JLabel getLblNewLabel_1() {
        if (lblNewLabel_1 == null) {
        	lblNewLabel_1 = new JLabel("이름");
        	lblNewLabel_1.setBounds(12, 35, 57, 15);
        }
        return lblNewLabel_1;
    }
    private JLabel getLblNewLabel_2() {
        if (lblNewLabel_2 == null) {
        	lblNewLabel_2 = new JLabel("직책");
        	lblNewLabel_2.setBounds(12, 60, 57, 15);
        }
        return lblNewLabel_2;
    }
    private JLabel getLblNewLabel_3() {
        if (lblNewLabel_3 == null) {
        	lblNewLabel_3 = new JLabel("아이디");
        	lblNewLabel_3.setBounds(209, 60, 57, 15);
        }
        return lblNewLabel_3;
    }
    private JLabel getLblNewLabel_4() {
        if (lblNewLabel_4 == null) {
        	lblNewLabel_4 = new JLabel("EMAIL");
        	lblNewLabel_4.setBounds(22, 10, 57, 15);
        }
        return lblNewLabel_4;
    }
    private JLabel getLblNewLabel_5() {
        if (lblNewLabel_5 == null) {
        	lblNewLabel_5 = new JLabel("이메일 주소");
        	lblNewLabel_5.setBounds(22, 35, 69, 15);
        }
        return lblNewLabel_5;
    }
    private JLabel getLblNewLabel_6() {
        if (lblNewLabel_6 == null) {
        	lblNewLabel_6 = new JLabel("MAIL FORMAT");
        	lblNewLabel_6.setBounds(22, 165, 97, 23);
        }
        return lblNewLabel_6;
    }
    private JRadioButton getRdbtnNewRadioButton() {
        if (rdbtnNewRadioButton == null) {
        	rdbtnNewRadioButton = new JRadioButton("HTML");
        	rdbtnNewRadioButton.setBounds(22, 194, 69, 23);
        }
        return rdbtnNewRadioButton;
    }
    private JRadioButton getRdbtnNewRadioButton_1() {
        if (rdbtnNewRadioButton_1 == null) {
        	rdbtnNewRadioButton_1 = new JRadioButton("PLAIN TEXT");
        	rdbtnNewRadioButton_1.setBounds(95, 194, 97, 23);
        }
        return rdbtnNewRadioButton_1;
    }
    private JRadioButton getRdbtnNewRadioButton_2() {
        if (rdbtnNewRadioButton_2 == null) {
        	rdbtnNewRadioButton_2 = new JRadioButton("CUSTOM");
        	rdbtnNewRadioButton_2.setBounds(196, 194, 79, 23);
        }
        return rdbtnNewRadioButton_2;
    }
    private JButton getBtnNewButton() {
        if (btnNewButton == null) {
        	btnNewButton = new JButton("ADD");
        	btnNewButton.setBounds(302, 31, 97, 23);
        	btnNewButton.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        //텍스트 옮기기
        	        String email = textEmail.getText();
        	        String text = textArea.getText();
        	        String val = text + "\r\n" + email;
        	        textArea.setText(val);
                    
        	    }
        	});
        }
        return btnNewButton;
    }
    private JButton getBtnNewButton_1() {
        if (btnNewButton_1 == null) {
        	btnNewButton_1 = new JButton("EDIT");
        	btnNewButton_1.setBounds(302, 64, 97, 23);
        }
        return btnNewButton_1;
    }
    private JButton getBtnNewButton_2() {
        if (btnNewButton_2 == null) {
        	btnNewButton_2 = new JButton("REMOVE");
        	btnNewButton_2.setBounds(302, 97, 97, 23);
        }
        return btnNewButton_2;
    }
    private JButton getBtnNewButton_3() {
        if (btnNewButton_3 == null) {
        	btnNewButton_3 = new JButton("DEFAULT");
        	btnNewButton_3.setBounds(302, 130, 97, 23);
        }
        return btnNewButton_3;
    }
    private JTextField getNAME() {
        if (job == null) {
            job = new JTextField();
            job.setBounds(81, 57, 116, 21);
            job.setColumns(10);
        }
        return job;
    }
    private JTextField getJob() {
        if (job == null) {
        	job = new JTextField();
        	job.setBounds(81, 57, 116, 21);
        	job.setColumns(10);
        }
        return job;
    }
    private JTextField getId() {
        if (id == null) {
        	id = new JTextField();
        	id.setBounds(278, 60, 116, 21);
        	id.setColumns(10);
        }
        return id;
    }
    private JTextField getTextEmail() {
        if (textEmail == null) {
        	textEmail = new JTextField();
        	textEmail.setBounds(103, 32, 177, 21);
        	textEmail.setColumns(10);
        }
        return textEmail;
    }
    private JPanel getPanel() {
        if (panel == null) {
        	panel = new JPanel();
        	panel.setBorder(new LineBorder(Color.CYAN, 1, true));
        	panel.setBounds(2, 10, 411, 91);
        	panel.setLayout(null);
        	panel.add(getId());
        	panel.add(getLblNewLabel_3());
        	panel.add(getJob());
        	panel.add(getLblNewLabel_2());
        	panel.add(getLblNewLabel_1());
        	panel.add(getLblNewLabel());
        	panel.add(get이름());
        }
        return panel;
    }
    private JPanel getPanel_1() {
        if (panel_1 == null) {
        	panel_1 = new JPanel();
        	panel_1.setBorder(new LineBorder(Color.RED, 3, true));
        	panel_1.setBounds(2, 111, 411, 225);
        	panel_1.setLayout(null);
        	panel_1.add(getLblNewLabel_4());
        	panel_1.add(getLblNewLabel_5());
        	panel_1.add(getTextEmail());
        	panel_1.add(getBtnNewButton());
        	panel_1.add(getBtnNewButton_1());
        	panel_1.add(getBtnNewButton_2());
        	panel_1.add(getBtnNewButton_3());
        	panel_1.add(getLblNewLabel_6());
        	panel_1.add(getRdbtnNewRadioButton());
        	panel_1.add(getRdbtnNewRadioButton_1());
        	panel_1.add(getRdbtnNewRadioButton_2());
        	panel_1.add(getTextArea());
        }
        return panel_1;
    }
    private JButton getBtnNewButton_4() {
        if (btnNewButton_4 == null) {
        	btnNewButton_4 = new JButton("OK");
        	btnNewButton_4.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        
        	        String message = "";
        	        message += textArea.getText() + "\r\n";
        	        message += 이름.getText() + "\r\n";
        	        message += job.getText() + "\r\n";
        	        message += id.getText() + "\r\n";
        	        JOptionPane.showMessageDialog(null, message);
        	    }
        	});
        	btnNewButton_4.setBounds(160, 346, 118, 50);
        }
        return btnNewButton_4;
    }
    private JButton getBtnNewButton_5() {
        if (btnNewButton_5 == null) {
        	btnNewButton_5 = new JButton("CANCLE");
        	btnNewButton_5.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        //종료
        	        System.exit(0);
        	    }
        	});
        	btnNewButton_5.setBounds(290, 346, 118, 50);
        }
        return btnNewButton_5;
    }
    private JTextArea getTextArea() {
        if (textArea == null) {
        	textArea = new JTextArea();
        	textArea.setBounds(22, 60, 260, 89);
        }
        return textArea;
    }

    private JTextField get이름() {
        if (이름 == null) {
        	이름 = new JTextField();
        	이름.setBounds(81, 32, 116, 21);
        	이름.setColumns(10);
        }
        return 이름;
    }
}
