package lib;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class newsusi extends JFrame {
    
    private JPanel contentPane;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
    private JLabel lblNewLabel_3;
    private JLabel lblNewLabel_4;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JLabel lblNewLabel_5;
    private JTextField textField_4;
    private JLabel label;
    private JLabel label_1;
    private JTextField textField_5;
    private JButton btnNewButton;
    private JButton btnNewButton_1;
    private JComboBox comboBox;
    private JComboBox comboBox_1;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    newsusi frame = new newsusi();
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
    public newsusi() {
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 432, 340);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.add(getLblNewLabel());
        contentPane.add(getLblNewLabel_1());
        contentPane.add(getLblNewLabel_2());
        contentPane.add(getLblNewLabel_3());
        contentPane.add(getLblNewLabel_4());
        contentPane.add(getTextField());
        contentPane.add(getTextField_1());
        contentPane.add(getTextField_2());
        contentPane.add(getTextField_3());
        contentPane.add(getLblNewLabel_5());
        contentPane.add(getTextField_4());
        contentPane.add(getLabel());
        contentPane.add(getLabel_1());
        contentPane.add(getTextField_5());
        contentPane.add(getBtnNewButton());
        contentPane.add(getBtnNewButton_1());
        contentPane.add(getComboBox());
        contentPane.add(getComboBox_1());
    }
    private JLabel getLblNewLabel() {
        if (lblNewLabel == null) {
        	lblNewLabel = new JLabel("회원정보입력");
        	lblNewLabel.setBounds(165, 10, 116, 15);
        }
        return lblNewLabel;
    }
    private JLabel getLblNewLabel_1() {
        if (lblNewLabel_1 == null) {
        	lblNewLabel_1 = new JLabel("이름");
        	lblNewLabel_1.setBounds(43, 58, 57, 15);
        }
        return lblNewLabel_1;
    }
    private JLabel getLblNewLabel_2() {
        if (lblNewLabel_2 == null) {
        	lblNewLabel_2 = new JLabel("주민번호");
        	lblNewLabel_2.setBounds(43, 108, 57, 15);
        }
        return lblNewLabel_2;
    }
    private JLabel getLblNewLabel_3() {
        if (lblNewLabel_3 == null) {
        	lblNewLabel_3 = new JLabel("전화번호");
        	lblNewLabel_3.setBounds(43, 154, 57, 15);
        }
        return lblNewLabel_3;
    }
    private JLabel getLblNewLabel_4() {
        if (lblNewLabel_4 == null) {
        	lblNewLabel_4 = new JLabel("메일계정");
        	lblNewLabel_4.setBounds(43, 199, 57, 15);
        }
        return lblNewLabel_4;
    }
    private JTextField getTextField() {
        if (textField == null) {
        	textField = new JTextField();
        	textField.setBounds(112, 55, 116, 21);
        	textField.setColumns(10);
        }
        return textField;
    }
    private JTextField getTextField_1() {
        if (textField_1 == null) {
        	textField_1 = new JTextField();
        	textField_1.setBounds(112, 105, 116, 21);
        	textField_1.setColumns(10);
        }
        return textField_1;
    }
    private JTextField getTextField_2() {
        if (textField_2 == null) {
        	textField_2 = new JTextField();
        	textField_2.setBounds(198, 151, 83, 21);
        	textField_2.setColumns(10);
        }
        return textField_2;
    }
    private JTextField getTextField_3() {
        if (textField_3 == null) {
        	textField_3 = new JTextField();
        	textField_3.setBounds(112, 196, 116, 21);
        	textField_3.setColumns(10);
        }
        return textField_3;
    }
    private JLabel getLblNewLabel_5() {
        if (lblNewLabel_5 == null) {
        	lblNewLabel_5 = new JLabel("-");
        	lblNewLabel_5.setBounds(235, 108, 17, 15);
        }
        return lblNewLabel_5;
    }
    private JTextField getTextField_4() {
        if (textField_4 == null) {
        	textField_4 = new JTextField();
        	textField_4.setBounds(248, 105, 116, 21);
        	textField_4.setColumns(10);
        }
        return textField_4;
    }
    private JLabel getLabel() {
        if (label == null) {
        	label = new JLabel("-");
        	label.setBounds(183, 154, 17, 15);
        }
        return label;
    }
    private JLabel getLabel_1() {
        if (label_1 == null) {
        	label_1 = new JLabel("-");
        	label_1.setBounds(286, 154, 17, 15);
        }
        return label_1;
    }
    private JTextField getTextField_5() {
        if (textField_5 == null) {
        	textField_5 = new JTextField();
        	textField_5.setBounds(296, 151, 83, 21);
        	textField_5.setColumns(10);
        }
        return textField_5;
    }
    private JButton getBtnNewButton() {
        if (btnNewButton == null) {
        	btnNewButton = new JButton("가입");
        	btnNewButton.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        
        	        dispose();
        	    }
        	});
        	btnNewButton.setBounds(81, 241, 97, 45);
        }
        return btnNewButton;
    }
    private JButton getBtnNewButton_1() {
        if (btnNewButton_1 == null) {
        	btnNewButton_1 = new JButton("취소");
        	btnNewButton_1.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        
        	        dispose();
        	    }
        	});
        	btnNewButton_1.setBounds(236, 241, 97, 45);
        }
        return btnNewButton_1;
    }
    private JComboBox getComboBox() {
        if (comboBox == null) {
        	comboBox = new JComboBox();
        	comboBox.setModel(new DefaultComboBoxModel(new String[] {"010", "011", "016", "019"}));
        	comboBox.setBounds(112, 151, 59, 21);
        }
        return comboBox;
    }
    private JComboBox getComboBox_1() {
        if (comboBox_1 == null) {
        	comboBox_1 = new JComboBox();
        	comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"@naver.com", "@daum.net", "@gmail.com"}));
        	comboBox_1.setBounds(240, 196, 139, 21);
        }
        return comboBox_1;
    }
}
