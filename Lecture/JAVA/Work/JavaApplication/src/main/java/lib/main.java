package lib;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java31.st1swing.book1;
import java31.swing.frmB;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLayeredPane;
import javax.swing.JTree;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JToolBar;
import javax.swing.JTabbedPane;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class main extends JFrame {
    
    private static List<book> books = null;
    private JPanel            contentPane;
    private JButton           btnNewButton;
    private JButton           btnNewButton_1;
    private JButton           btnNewButton_2;
    private JButton           btnNewButton_3;
    private JScrollPane       scrollPane;
    private static JTable     table;
    private JTabbedPane       tabbedPane;
    private JPanel            panel;
    private JPanel            panel_1;
    private JPanel            panel_2;
    private JList             list;
    private JLabel            lblNewLabel;
    private JLabel            lblNewLabel_1;
    private JLabel            lblNewLabel_2;
    private JLabel            lblNewLabel_3;
    private JLabel            lblNewLabel_4;
    private JLabel            lblNewLabel_5;
    private JButton           btnNewButton_4;
    private JButton           btnNewButton_5;
    private JButton           btnNewButton_6;
    private JButton           btnNewButton_7;
    private JTextField        textField;
    private JTextField        textField_1;
    private JTextField        textField_2;
    private JTextField        textField_3;
    private JTextField        textField_4;
    private JTextField        textField_5;
    private JLabel            lblNewLabel_6;
    private JTextField        textField_6;
    private JScrollPane       scrollPane_1;
    private JTable            table_1;
    private JLabel            lblNewLabel_7;
    private JLabel            lblNewLabel_8;
    private JLabel            lblNewLabel_9;
    private JLabel            lblNewLabel_10;
    private JLabel            lblNewLabel_11;
    private JButton           btnNewButton_8;
    private JButton           btnNewButton_9;
    private JButton           btnNewButton_10;
    private JScrollPane       scrollPane_2;
    private JTable            table_2;
    private JTextField        textField_7;
    private JTextField        textField_8;
    private JTextField        textField_9;
    private JTextField        textField_10;
    private JComboBox         comboBox;
    private JTextField        textField_11;
    private JButton           btnNewButton_11;
    private JTextField        textField_12;
    private JButton           btnNewButton_12;
    private JScrollPane       scrollPane_3;
    private JTable            table_3;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    main frame = new main();
                    frame.setVisible(true);
                    
                    initData();
                    
                    frame.refresherTable(books, table);
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    /**
     * Create the frame.
     */
    public main() {
        setTitle("MAIN");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 861, 526);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.add(getBtnNewButton());
        contentPane.add(getBtnNewButton_1());
        contentPane.add(getBtnNewButton_2());
      //  contentPane.add(getBtnNewButton_3());
        contentPane.add(getScrollPane());
        contentPane.add(getTabbedPane_4());
    }
    
    public static void initData() {
        books = new ArrayList<>();
        books.add(new book(1, "박근혜출당", "2017-11-03", "호러", "없음", 150000, "가능"));
        books.add(new book(2, "수요미식회 갈비탕", "2017-01-02", "미스테리", "이길수", 135000,
                "가능"));
        
    }
    
    private JButton getBtnNewButton() {
        if (btnNewButton == null) {
            btnNewButton = new JButton("회원등록");
            btnNewButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    
                    // 새창띄우기
                    newsusi won = new newsusi();
                    won.setVisible(true);
                    
                }
            });
            btnNewButton.setBounds(12, 10, 97, 50);
        }
        return btnNewButton;
    }
    
    private JButton getBtnNewButton_1() {
        if (btnNewButton_1 == null) {
            btnNewButton_1 = new JButton("책등록");
            btnNewButton_1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    
                    // 새창띄우기
                    newbook book = new newbook();
                    book.setVisible(true);
                    
                }
            });
            btnNewButton_1.setBounds(121, 10, 97, 50);
        }
        return btnNewButton_1;
    }
    
    private JButton getBtnNewButton_2() {
        if (btnNewButton_2 == null) {
            btnNewButton_2 = new JButton("새로고침");
            btnNewButton_2.setBounds(230, 10, 97, 50);
        }
        return btnNewButton_2;
    }
    
 /*   private JButton getBtnNewButton_3() {
        if (btnNewButton_3 == null) {
        	btnNewButton_3 = new JButton("프로그램종료");
        	btnNewButton_3.addActionListener(new ActionListener() {
        	    public void actionPerformed(ActionEvent e) {
        	        System.exit(0);
        	    }
        	}
        }

    }*/
    
    private JScrollPane getScrollPane() {
        if (scrollPane == null) {
            scrollPane = new JScrollPane();
            scrollPane.setBounds(22, 70, 206, 408);
            scrollPane.setViewportView(getTable());
        }
        return scrollPane;
    }
    
    private JTable getTable() {
        if (table == null) {
            table = new JTable();
            table.setModel(new DefaultTableModel(new Object[][] {},
                    new String[] { "\uC774\uB984", "\uCC45 \uC81C\uBAA9",
                            "\uB300\uC5EC \uB0A0\uC9DC" }));
        }
        return table;
    }
    
    private JTabbedPane getTabbedPane_4() {
        if (tabbedPane == null) {
            tabbedPane = new JTabbedPane(JTabbedPane.TOP);
            tabbedPane.setBackground(Color.WHITE);
            tabbedPane.setBounds(230, 70, 603, 408);
            tabbedPane.addTab("책정보", null, getPanel_1(), null);
            tabbedPane.addTab("회원 관리", null, getPanel_2(), null);
            tabbedPane.addTab("대여 목록", null, getPanel(), null);
        }
        return tabbedPane;
    }
    
    private JPanel getPanel() {
        if (panel == null) {
            panel = new JPanel();
            panel.setLayout(null);
            panel.add(getBtnNewButton_12());
            panel.add(getScrollPane_3());
        }
        return panel;
    }
    
    private JPanel getPanel_1() {
        if (panel_1 == null) {
            panel_1 = new JPanel();
            panel_1.setLayout(null);
            panel_1.add(getList());
            panel_1.add(getLblNewLabel());
            panel_1.add(getLblNewLabel_1());
            panel_1.add(getLblNewLabel_2());
            panel_1.add(getLblNewLabel_3());
            panel_1.add(getLblNewLabel_4());
            panel_1.add(getLblNewLabel_5());
            panel_1.add(getBtnNewButton_4());
            panel_1.add(getBtnNewButton_5());
            panel_1.add(getBtnNewButton_6());
            panel_1.add(getBtnNewButton_7());
            panel_1.add(getTextField());
            panel_1.add(getTextField_1());
            panel_1.add(getTextField_2());
            panel_1.add(getTextField_3());
            panel_1.add(getTextField_4());
            panel_1.add(getTextField_5());
            panel_1.add(getLblNewLabel_6());
            panel_1.add(getTextField_6());
            panel_1.add(getScrollPane_1());
        }
        return panel_1;
    }
    
    private JPanel getPanel_2() {
        if (panel_2 == null) {
            panel_2 = new JPanel();
            panel_2.setLayout(null);
            panel_2.add(getLblNewLabel_7());
            panel_2.add(getLblNewLabel_8());
            panel_2.add(getLblNewLabel_9());
            panel_2.add(getLblNewLabel_10());
            panel_2.add(getLblNewLabel_11());
            panel_2.add(getBtnNewButton_8());
            panel_2.add(getBtnNewButton_9());
            panel_2.add(getBtnNewButton_10());
            panel_2.add(getScrollPane_2());
            panel_2.add(getTextField_7());
            panel_2.add(getTextField_8());
            panel_2.add(getTextField_9());
            panel_2.add(getTextField_10());
            panel_2.add(getComboBox());
            panel_2.add(getTextField_11());
            panel_2.add(getBtnNewButton_11());
            panel_2.add(getTextField_12());
        }
        return panel_2;
    }
    
    private JList getList() {
        if (list == null) {
            list = new JList();
            list.setBounds(12, 10, 225, 238);
        }
        return list;
    }
    
    private JLabel getLblNewLabel() {
        if (lblNewLabel == null) {
            lblNewLabel = new JLabel("책제목");
            lblNewLabel.setBounds(249, 11, 57, 15);
        }
        return lblNewLabel;
    }
    
    private JLabel getLblNewLabel_1() {
        if (lblNewLabel_1 == null) {
            lblNewLabel_1 = new JLabel("출판사");
            lblNewLabel_1.setBounds(249, 36, 57, 15);
        }
        return lblNewLabel_1;
    }
    
    private JLabel getLblNewLabel_2() {
        if (lblNewLabel_2 == null) {
            lblNewLabel_2 = new JLabel("저자");
            lblNewLabel_2.setBounds(249, 61, 57, 15);
        }
        return lblNewLabel_2;
    }
    
    private JLabel getLblNewLabel_3() {
        if (lblNewLabel_3 == null) {
            lblNewLabel_3 = new JLabel("가격");
            lblNewLabel_3.setBounds(249, 86, 57, 15);
        }
        return lblNewLabel_3;
    }
    
    private JLabel getLblNewLabel_4() {
        if (lblNewLabel_4 == null) {
            lblNewLabel_4 = new JLabel("장르");
            lblNewLabel_4.setBounds(249, 111, 57, 15);
        }
        return lblNewLabel_4;
    }
    
    private JLabel getLblNewLabel_5() {
        if (lblNewLabel_5 == null) {
            lblNewLabel_5 = new JLabel("검색");
            lblNewLabel_5.setBounds(249, 136, 57, 15);
        }
        return lblNewLabel_5;
    }
    
    private JButton getBtnNewButton_4() {
        if (btnNewButton_4 == null) {
            btnNewButton_4 = new JButton("대여하기");
            btnNewButton_4.setBounds(259, 161, 127, 40);
        }
        return btnNewButton_4;
    }
    
    private JButton getBtnNewButton_5() {
        if (btnNewButton_5 == null) {
            btnNewButton_5 = new JButton("수정");
            btnNewButton_5.setBounds(433, 161, 127, 40);
        }
        return btnNewButton_5;
    }
    
    private JButton getBtnNewButton_6() {
        if (btnNewButton_6 == null) {
            btnNewButton_6 = new JButton("삭제");
            btnNewButton_6.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                }
            });
            btnNewButton_6.setBounds(259, 208, 127, 40);
        }
        return btnNewButton_6;
    }
    
    private JButton getBtnNewButton_7() {
        if (btnNewButton_7 == null) {
            btnNewButton_7 = new JButton("취소");
            btnNewButton_7.setBounds(433, 208, 127, 40);
        }
        return btnNewButton_7;
    }
    
    private JTextField getTextField() {
        if (textField == null) {
            textField = new JTextField();
            textField.setBounds(296, 8, 116, 21);
            textField.setColumns(10);
        }
        return textField;
    }
    
    private JTextField getTextField_1() {
        if (textField_1 == null) {
            textField_1 = new JTextField();
            textField_1.setBounds(296, 33, 116, 21);
            textField_1.setColumns(10);
        }
        return textField_1;
    }
    
    private JTextField getTextField_2() {
        if (textField_2 == null) {
            textField_2 = new JTextField();
            textField_2.setBounds(296, 58, 116, 21);
            textField_2.setColumns(10);
        }
        return textField_2;
    }
    
    private JTextField getTextField_3() {
        if (textField_3 == null) {
            textField_3 = new JTextField();
            textField_3.setBounds(296, 83, 116, 21);
            textField_3.setColumns(10);
        }
        return textField_3;
    }
    
    private JTextField getTextField_4() {
        if (textField_4 == null) {
            textField_4 = new JTextField();
            textField_4.setBounds(296, 108, 116, 21);
            textField_4.setColumns(10);
        }
        return textField_4;
    }
    
    private JTextField getTextField_5() {
        if (textField_5 == null) {
            textField_5 = new JTextField();
            textField_5.setBounds(296, 133, 116, 21);
            textField_5.setColumns(10);
        }
        return textField_5;
    }
    
    private JLabel getLblNewLabel_6() {
        if (lblNewLabel_6 == null) {
            lblNewLabel_6 = new JLabel("책 번호");
            lblNewLabel_6.setBounds(433, 11, 57, 15);
        }
        return lblNewLabel_6;
    }
    
    private JTextField getTextField_6() {
        if (textField_6 == null) {
            textField_6 = new JTextField();
            textField_6.setBounds(479, 8, 82, 21);
            textField_6.setColumns(10);
        }
        return textField_6;
    }
    
    private JScrollPane getScrollPane_1() {
        if (scrollPane_1 == null) {
            scrollPane_1 = new JScrollPane();
            scrollPane_1.setBounds(12, 258, 574, 111);
            scrollPane_1.setViewportView(getTable_1_1());
            
        }
        
        return scrollPane_1;
    }
    
    private JTable getTable_1_1() {
        if (table_1 == null) {
            table_1 = new JTable();
            table_1.setModel(new DefaultTableModel(new Object[][] {},
                    new String[] { "No.", "\uC81C\uBAA9", "\uCD9C\uD310\uC0AC",
                            "\uC7A5\uB974", "\uC800\uC790", "\uAC00\uACA9",
                            "\uB300\uC5EC \uC815\uBCF4" }));
        }
        return table_1;
    }
    
    private JLabel getLblNewLabel_7() {
        if (lblNewLabel_7 == null) {
            lblNewLabel_7 = new JLabel("이름");
            lblNewLabel_7.setBounds(12, 10, 57, 15);
        }
        return lblNewLabel_7;
    }
    
    private JLabel getLblNewLabel_8() {
        if (lblNewLabel_8 == null) {
            lblNewLabel_8 = new JLabel("주민번호");
            lblNewLabel_8.setBounds(12, 35, 57, 15);
        }
        return lblNewLabel_8;
    }
    
    private JLabel getLblNewLabel_9() {
        if (lblNewLabel_9 == null) {
            lblNewLabel_9 = new JLabel("전화번호");
            lblNewLabel_9.setBounds(12, 60, 57, 15);
        }
        return lblNewLabel_9;
    }
    
    private JLabel getLblNewLabel_10() {
        if (lblNewLabel_10 == null) {
            lblNewLabel_10 = new JLabel("메일주소");
            lblNewLabel_10.setBounds(12, 85, 57, 15);
        }
        return lblNewLabel_10;
    }
    
    private JLabel getLblNewLabel_11() {
        if (lblNewLabel_11 == null) {
            lblNewLabel_11 = new JLabel("검색");
            lblNewLabel_11.setBounds(12, 110, 57, 15);
        }
        return lblNewLabel_11;
    }
    
    private JButton getBtnNewButton_8() {
        if (btnNewButton_8 == null) {
            btnNewButton_8 = new JButton("회원삭제");
            btnNewButton_8.setBounds(12, 135, 97, 37);
        }
        return btnNewButton_8;
    }
    
    private JButton getBtnNewButton_9() {
        if (btnNewButton_9 == null) {
            btnNewButton_9 = new JButton("회원수정");
            btnNewButton_9.setBounds(121, 135, 97, 37);
        }
        return btnNewButton_9;
    }
    
    private JButton getBtnNewButton_10() {
        if (btnNewButton_10 == null) {
            btnNewButton_10 = new JButton("취소");
            btnNewButton_10.setBounds(230, 135, 97, 37);
        }
        return btnNewButton_10;
    }
    
    private JScrollPane getScrollPane_2() {
        if (scrollPane_2 == null) {
            scrollPane_2 = new JScrollPane();
            scrollPane_2.setBounds(12, 182, 574, 187);
            scrollPane_2.setViewportView(getTable_2());
        }
        return scrollPane_2;
    }
    
    private JTable getTable_2() {
        if (table_2 == null) {
            table_2 = new JTable();
            table_2.setModel(new DefaultTableModel(new Object[][] {},
                    new String[] { "\uD68C\uC6D0\uBC88\uD638", "\uC774\uB984",
                            "\uC8FC\uBBFC\uBC88\uD638",
                            "\uC804\uD654\uBC88\uD638",
                            "\uBA54\uC77C\uC8FC\uC18C" }));
        }
        return table_2;
    }
    
    private JTextField getTextField_7() {
        if (textField_7 == null) {
            textField_7 = new JTextField();
            textField_7.setBounds(74, 7, 116, 21);
            textField_7.setColumns(10);
        }
        return textField_7;
    }
    
    private JTextField getTextField_8() {
        if (textField_8 == null) {
            textField_8 = new JTextField();
            textField_8.setBounds(74, 32, 116, 21);
            textField_8.setColumns(10);
        }
        return textField_8;
    }
    
    private JTextField getTextField_9() {
        if (textField_9 == null) {
            textField_9 = new JTextField();
            textField_9.setBounds(74, 57, 116, 21);
            textField_9.setColumns(10);
        }
        return textField_9;
    }
    
    private JTextField getTextField_10() {
        if (textField_10 == null) {
            textField_10 = new JTextField();
            textField_10.setBounds(74, 82, 116, 21);
            textField_10.setColumns(10);
        }
        return textField_10;
    }
    
    private JComboBox getComboBox() {
        if (comboBox == null) {
            comboBox = new JComboBox();
            comboBox.setModel(
                    new DefaultComboBoxModel(new String[] { "회원번호" }));
            comboBox.setBounds(74, 107, 74, 21);
        }
        return comboBox;
    }
    
    private JTextField getTextField_11() {
        if (textField_11 == null) {
            textField_11 = new JTextField();
            textField_11.setBounds(173, 107, 116, 21);
            textField_11.setColumns(10);
        }
        return textField_11;
    }
    
    private JButton getBtnNewButton_11() {
        if (btnNewButton_11 == null) {
            btnNewButton_11 = new JButton("검색");
            btnNewButton_11.setBounds(286, 106, 67, 23);
        }
        return btnNewButton_11;
    }
    
    private JTextField getTextField_12() {
        if (textField_12 == null) {
            textField_12 = new JTextField();
            textField_12.setBounds(202, 7, 57, 21);
            textField_12.setColumns(10);
        }
        return textField_12;
    }
    
    private JButton getBtnNewButton_12() {
        if (btnNewButton_12 == null) {
            btnNewButton_12 = new JButton("반납완료");
            btnNewButton_12.setBounds(362, 10, 224, 67);
        }
        return btnNewButton_12;
    }
    
    private JScrollPane getScrollPane_3() {
        if (scrollPane_3 == null) {
            scrollPane_3 = new JScrollPane();
            scrollPane_3.setBounds(12, 91, 574, 278);
            scrollPane_3.setViewportView(getTable_3());
        }
        return scrollPane_3;
    }
    
    private JTable getTable_3() {
        if (table_3 == null) {
            table_3 = new JTable();
            table_3.setModel(new DefaultTableModel(new Object[][] {},
                    new String[] { "No.", "\uC774\uB984",
                            "\uC804\uD654\uBC88\uD638",
                            "\uC8FC\uBBFC\uBC88\uD638",
                            "\uBA54\uC77C\uC8FC\uC18C", "\uCC45\uC81C\uBAA9",
                            "\uCD9C\uD310\uC0AC", "\uC7A5\uB974",
                            "\uC800\uC790", "\uCC45\uBC88\uD638",
                            "\uB300\uC5EC\uB0A0\uC9DC" }));
        }
        return table_3;
    }
    
    public void refresherTable(List<book> list, JTable table) {
        Object[] tempObject = new Object[7]; // JTable의 컬럼개수
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        
        for (book obj : list) {
            tempObject[0] = obj.getNo();
            tempObject[1] = obj.get제목();
            tempObject[2] = obj.get출판사();
            tempObject[3] = obj.get장르();
            tempObject[4] = obj.get저자();
            tempObject[5] = obj.get가격();
            tempObject[6] = obj.get대여정보();
            
            model.addRow(tempObject);
        }
        
        if (model.getRowCount() > 0) {
            table.setRowSelectionInterval(0, 0);
        }
        table.setModel(model);
    }
    
}
