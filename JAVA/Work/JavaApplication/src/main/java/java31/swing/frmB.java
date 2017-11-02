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

public class frmB extends JFrame {
    private frmA parent = null;
    
    private JPanel contentPane;
    public frmA getParent() {
        return parent;
    }

    public void setParent(frmA parent) {
        this.parent = parent;
    }

    private JButton btnNewButton;
    private JTextField bField;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frmB frame = new frmB();
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
    public frmB() {
        setTitle("frmB");
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 253, 119);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.add(getBtnNewButton());
        contentPane.add(getBField());
    }
    
    private JButton getBtnNewButton() {
        if (btnNewButton == null) {
        	btnNewButton = new JButton("값 주기");
        	btnNewButton.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	       String value = bField.getText();
        	        
        	        parent.refresh( value );
        	        
        	        
        	        dispose(); // 자기 창만 닫기
        	        
        	    }
        	});
        	btnNewButton.setBounds(12, 41, 209, 23);
        }
        return btnNewButton;
    }
    private JTextField getBField() {
        if (bField == null) {
        	bField = new JTextField();
        	bField.setBounds(12, 10, 209, 21);
        	bField.setColumns(10);
        }
        return bField;
    }
    
    public void setText(String value)
    {   //frmA에서 값을 받아 frmB의 textField에 설정
        bField.setText( value);
    }
    
    public frmB(frmA frame,String val) {
        this();
        this.parent = parent;
        bField.setText(val);
        }

}
