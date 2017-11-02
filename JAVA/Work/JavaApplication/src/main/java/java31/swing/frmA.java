package java31.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmA extends JFrame {
    
    private JPanel contentPane;
    private JButton btnNewButton;
    private JTextField aField;
    private static frmA frame = null;
    private JButton btnNewButton_1;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new frmA();
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
    public frmA() {
        setTitle("frmA");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 451, 194);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.add(getBtnNewButton());
        contentPane.add(getAField());
        contentPane.add(getBtnNewButton_1());
    }
    
    private JButton getBtnNewButton() {
        if (btnNewButton == null) {
        	btnNewButton = new JButton("새창띄우기 : setter방식");
        	btnNewButton.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        //새창띄우기
        	        frmB frmb = new frmB();
        	        frmb.setVisible(true);
        	        
        	        //setText()임의로 추가된 메서드
        	        frmb.setText(aField.getText());	
        	        
        	        //frmA정보를 frmB에 넘겨준다.
        	        frmb.setParent(frame);
        	        
        	    }
        	});
        	btnNewButton.setBounds(23, 10, 393, 23);
        }
        return btnNewButton;
    }
    private JTextField getAField() {
        if (aField == null) {
        	aField = new JTextField();
        	aField.setBounds(23, 43, 393, 21);
        	aField.setColumns(10);
        }
        return aField;
    }
    public void refresh( String value ) {
        //frmB에서 넘겨받은 값을 textField에 설정
        aField.setText( value );
        }
    private JButton getBtnNewButton_1() {
        if (btnNewButton_1 == null) {
        	btnNewButton_1 = new JButton("새창띄우기 : 생성자");
        	btnNewButton_1.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
                   
        	        String val = aField.getText();
        	        frmB frmb = new frmB(frame,val);
        	        frmb.setVisible(true);
        	        frmb.setParent(frame);
        	        frmb.setText(val);
        	        
        	    }
        	});
        	btnNewButton_1.setBounds(23, 74, 393, 23);
        }
        return btnNewButton_1;
    }
}
