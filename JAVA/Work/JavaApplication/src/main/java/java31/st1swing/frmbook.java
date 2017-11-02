package java31.st1swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JLabel;

public class frmbook extends JFrame {
    
    private JPanel contentPane;
    private static List<book1> books = null;
    private JScrollPane scrollPane;
    private static JTable table;
    private JTextField txtbookid;
    private JTextField txtbookname;
    private JTextField txtpublisher;
    private JTextField txtyear;
    private JTextField txtprice;
    private JTextField txtauthid;
    private JCheckBox chuse_yn;
    private JButton btnNewButton;
    private JButton btnNewButton_1;
    private JButton btnNewButton_2;
    private JButton btnNewButton_3;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
    private JLabel lblNewLabel_3;
    private JLabel lblNewLabel_4;
    private JLabel lblNewLabel_5;
    private JLabel lblNewLabel_6;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frmbook frame = new frmbook();
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
    public frmbook() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 785, 512);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.add(getScrollPane());
        contentPane.add(getTxtbookid());
        contentPane.add(getTxtbookname());
        contentPane.add(getTxtpublisher());
        contentPane.add(getTxtyear());
        contentPane.add(getTxtprice());
        contentPane.add(getTxtauthid());
        contentPane.add(getChuse_yn());
        contentPane.add(getBtnNewButton());
        contentPane.add(getBtnNewButton_1());
        contentPane.add(getBtnNewButton_2());
        contentPane.add(getBtnNewButton_3());
        contentPane.add(getLblNewLabel());
        contentPane.add(getLblNewLabel_1());
        contentPane.add(getLblNewLabel_2());
        contentPane.add(getLblNewLabel_3());
        contentPane.add(getLblNewLabel_4());
        contentPane.add(getLblNewLabel_5());
        contentPane.add(getLblNewLabel_6());
    }
    
    public static void initData() {
        books = new ArrayList<>();
        books.add( new book1(1, "operating system" , "wiley"    , "2003", 30700, false, 1 ) ) ;
        books.add( new book1(2, "mysql"            , "oreilly"  , "2009", 58700, true , 2 ) ) ;
        books.add( new book1(3, "java"             , "hall"     , "2013", 40000, true , 3 ) ) ;
        books.add( new book1(4, "first sql"        , "wiley"    , "2015", 57700, true , 4 ) ) ;
    }
    private JScrollPane getScrollPane() {
        if (scrollPane == null) {
        	scrollPane = new JScrollPane();
        	scrollPane.setBounds(12, 10, 745, 204);
        	scrollPane.setViewportView(getTable());
        }
        return scrollPane;
    }
    private JTable getTable() {
        if (table == null) {
        	table = new JTable();
        	table.addMouseListener(new MouseAdapter() {
        	    @Override
        	    public void mouseClicked(MouseEvent e) {
        	        
        	        int row = table.getSelectedRow();
        	        
        	        String bookid = table.getValueAt(row, 0).toString();
        	        String bookname = table.getValueAt(row, 1).toString();
        	        String publisher = table.getValueAt(row, 2).toString();
        	        String year = table.getValueAt(row, 3).toString();
        	        String price = table.getValueAt(row, 4).toString();
        	        String use_yn = table.getValueAt(row, 5).toString();
        	        String authid = table.getValueAt(row, 6).toString();
        	        
        	        txtbookid.setText(bookid);
        	        txtbookname.setText(bookname);
        	        txtpublisher.setText(publisher);
        	        txtyear.setText(year);
        	        txtprice.setText(price);
        	        chuse_yn.setText(use_yn);
        	        txtauthid.setText(authid);
        	        
        	    }
        	});
        	table.setModel(new DefaultTableModel(
        	    new Object[][] {
        	    },
        	    new String[] {
        	        "bookid", "bookname", "publisher", "year", "price", "use_yn", "authid"
        	    }
        	) {
        	    Class[] columnTypes = new Class[] {
        	        Integer.class, String.class, String.class, String.class, Integer.class, Boolean.class, Integer.class
        	    };
        	    public Class getColumnClass(int columnIndex) {
        	        return columnTypes[columnIndex];
        	    }
        	});
        }
        return table;
    }
    private JTextField getTxtbookid() {
        if (txtbookid == null) {
        	txtbookid = new JTextField();
        	txtbookid.setBounds(114, 263, 116, 21);
        	txtbookid.setColumns(10);
        }
        return txtbookid;
    }
    private JTextField getTxtbookname() {
        if (txtbookname == null) {
        	txtbookname = new JTextField();
        	txtbookname.setBounds(114, 294, 116, 21);
        	txtbookname.setColumns(10);
        }
        return txtbookname;
    }
    private JTextField getTxtpublisher() {
        if (txtpublisher == null) {
        	txtpublisher = new JTextField();
        	txtpublisher.setBounds(114, 325, 116, 21);
        	txtpublisher.setColumns(10);
        }
        return txtpublisher;
    }
    private JTextField getTxtyear() {
        if (txtyear == null) {
        	txtyear = new JTextField();
        	txtyear.setBounds(114, 356, 116, 21);
        	txtyear.setColumns(10);
        }
        return txtyear;
    }
    private JTextField getTxtprice() {
        if (txtprice == null) {
        	txtprice = new JTextField();
        	txtprice.setBounds(114, 387, 116, 21);
        	txtprice.setColumns(10);
        }
        return txtprice;
    }
    private JTextField getTxtauthid() {
        if (txtauthid == null) {
        	txtauthid = new JTextField();
        	txtauthid.setBounds(114, 443, 116, 21);
        	txtauthid.setColumns(10);
        }
        return txtauthid;
    }
    private JCheckBox getChuse_yn() {
        if (chuse_yn == null) {
        	chuse_yn = new JCheckBox("New check box");
        	chuse_yn.setBounds(114, 414, 115, 23);
        }
        return chuse_yn;
    }
    public void refresherTable( List<book1> list, JTable table){
        Object [] tempObject = new Object[7]; //JTable의 컬럼개수
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        model.setRowCount(0);
        
        for ( book1 obj : list ){
            tempObject[0] = obj.getBookid();
            tempObject[1] = obj.getBookname();
            tempObject[2] = obj.getPublisher();
            tempObject[3] = obj.getYear();
            tempObject[4] = obj.getPrice();
            tempObject[5] = obj.getUse_yn();
            tempObject[6] = obj.getAuthid();
            
            model.addRow(tempObject);
        }
        
        if ( model.getRowCount() > 0){
            table.setRowSelectionInterval(0, 0);
        }
        table.setModel(model);
    }
    private JButton getBtnNewButton() {
        if (btnNewButton == null) {
        	btnNewButton = new JButton("조회");
        	btnNewButton.setBounds(22, 224, 97, 23);
        }
        return btnNewButton;
    }
    private JButton getBtnNewButton_1() {
        if (btnNewButton_1 == null) {
        	btnNewButton_1 = new JButton("추가");
        	btnNewButton_1.setBounds(131, 224, 97, 23);
        }
        return btnNewButton_1;
    }
    private JButton getBtnNewButton_2() {
        if (btnNewButton_2 == null) {
        	btnNewButton_2 = new JButton("수정");
        	btnNewButton_2.setBounds(240, 224, 97, 23);
        }
        return btnNewButton_2;
    }
    private JButton getBtnNewButton_3() {
        if (btnNewButton_3 == null) {
        	btnNewButton_3 = new JButton("삭제");
        	btnNewButton_3.setBounds(349, 224, 97, 23);
        }
        return btnNewButton_3;
    }
    private JLabel getLblNewLabel() {
        if (lblNewLabel == null) {
        	lblNewLabel = new JLabel("bookid");
        	lblNewLabel.setBounds(32, 266, 57, 15);
        }
        return lblNewLabel;
    }
    private JLabel getLblNewLabel_1() {
        if (lblNewLabel_1 == null) {
        	lblNewLabel_1 = new JLabel("bokkname");
        	lblNewLabel_1.setBounds(32, 297, 70, 15);
        }
        return lblNewLabel_1;
    }
    private JLabel getLblNewLabel_2() {
        if (lblNewLabel_2 == null) {
        	lblNewLabel_2 = new JLabel("publisher");
        	lblNewLabel_2.setBounds(32, 328, 57, 15);
        }
        return lblNewLabel_2;
    }
    private JLabel getLblNewLabel_3() {
        if (lblNewLabel_3 == null) {
        	lblNewLabel_3 = new JLabel("year");
        	lblNewLabel_3.setBounds(32, 359, 57, 15);
        }
        return lblNewLabel_3;
    }
    private JLabel getLblNewLabel_4() {
        if (lblNewLabel_4 == null) {
        	lblNewLabel_4 = new JLabel("price");
        	lblNewLabel_4.setBounds(32, 390, 57, 15);
        }
        return lblNewLabel_4;
    }
    private JLabel getLblNewLabel_5() {
        if (lblNewLabel_5 == null) {
        	lblNewLabel_5 = new JLabel("use_yn");
        	lblNewLabel_5.setBounds(32, 418, 57, 15);
        }
        return lblNewLabel_5;
    }
    private JLabel getLblNewLabel_6() {
        if (lblNewLabel_6 == null) {
        	lblNewLabel_6 = new JLabel("authid");
        	lblNewLabel_6.setBounds(32, 446, 57, 15);
        }
        return lblNewLabel_6;
    }
}
