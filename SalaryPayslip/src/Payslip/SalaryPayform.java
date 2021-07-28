package Payslip;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SalaryPayform extends JFrame implements ActionListener  {
	
	JFrame f;
    static JPanel p1,p2,p3,p4,p5;
    static JLabel JL1,JL2,JL3,JL4,JL5;
	static JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,
      l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32;
    static JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,
	t19,t20,t21,t22,t23,t24,t25,t26,t27,t28,t29,t30,t31,t32;
	static JButton b1,b2,b3,b4,b5;
	static JComboBox c1;
	static JTextArea a1;

 public SalaryPayform() {
        f = new JFrame("SalaryPayform");
		f.setBounds(100, 100, 882, 754);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(null);
		
	    JL5= new JLabel("SALARY PAYSLIP FOR THE MONTH OF");
		JL5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		JL5.setBounds(156, 70, 300, 14);
		f.getContentPane().add(JL5);
		
	    JL4= new JLabel("ZENCOPORATION PRIVATE .LTD.");
		JL4.setFont(new Font("Tahoma", Font.BOLD, 22));
		JL4.setBounds(242, 20, 388, 43);
		f.getContentPane().add(JL4);
		
		l1 = new JLabel("EMPLOYEE NUM");
		l1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		l1.setBounds(25, 129, 98, 23);
		f.getContentPane().add(l1);
		
		 l2= new JLabel("EMPLOYEE NAME");
		l2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		l2.setBounds(25, 163, 98, 19);
		f.getContentPane().add(l2);
		
		l3= new JLabel("DESIGNATION");
		l3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		l3.setBounds(25, 199, 103, 19);
		f.getContentPane().add(l3);
		
		l4= new JLabel("DAYS PRESENT");
		l4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		l4.setBounds(25, 243, 98, 18);
		f.getContentPane().add(l4);
		
		l5= new JLabel("WEEKLY HOLIDAYS");
		l5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		l5.setBounds(25, 284, 115, 23);
		f.getContentPane().add(l5);
		
		 l6= new JLabel("EARNED LEAVE");
		l6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		l6.setBounds(25, 324, 98, 18);
		f.getContentPane().add(l6);
		
		l7 = new JLabel("EARNED LEAVE BALANCE");
         l7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		l7.setBounds(25, 365, 151, 23);
		f.getContentPane().add(l7);
		
		l8 = new JLabel("PAID DAYS");
		l8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		l8.setBounds(25, 438, 98, 18);
		f.getContentPane().add(l8);
		
		 l9= new JLabel("LOSS OF PAY");
	    l9 .setFont(new Font("Tahoma", Font.PLAIN, 13));
	    l9.setBounds(25, 478, 91, 23);
		f.getContentPane().add(l9);
		
		l10 = new JLabel("BASIC");
		l10 .setFont(new Font("Tahoma", Font.PLAIN, 13));
		l10.setBounds(25, 399, 46, 23);
		f.getContentPane().add(l10);
		
		l11 = new JLabel("HRA");
	    l11.setFont(new Font("Tahoma", Font.PLAIN, 13));
		l11.setBounds(28, 512, 53, 23);
		f.getContentPane().add(l11);
		
		l12 = new JLabel("CON.");
		l12.setFont(new Font("Tahoma", Font.PLAIN, 13));
		l12.setBounds(25, 546, 46, 19);
		f.getContentPane().add(l12);
		
		l13 = new JLabel("DEARNESS ALLOWANCE");
		l13.setFont(new Font("Tahoma", Font.PLAIN, 13));
		l13.setBounds(25, 576, 151, 23);
		f.getContentPane().add(l13);
		
	    l14= new JLabel("EMP PROVID.FND");
		l14.setFont(new Font("Tahoma", Font.PLAIN, 13));
		l14.setBounds(333, 129, 109, 23);
		f.getContentPane().add(l14);
		
		l15 = new JLabel("EMP STATE INS.");
		l15.setFont(new Font("Tahoma", Font.PLAIN, 13));
		l15.setBounds(333, 165, 98, 23);
		f.getContentPane().add(l15);
		
	l16 = new JLabel("PROF. TAX");
	l16.setFont(new Font("Tahoma", Font.PLAIN, 13));
	l16.setBounds(333, 207, 98, 23);
		f.getContentPane().add(l16);
		
		l17 = new JLabel("LOAN");
		l17.setFont(new Font("Tahoma", Font.PLAIN, 13));
		l17.setBounds(333, 243, 98, 23);
		f.getContentPane().add(l17);
		
		l18= new JLabel("ADVANCE");
		l18.setFont(new Font("Tahoma", Font.PLAIN, 13));
		l18.setBounds(333, 287, 98, 23);
		f.getContentPane().add(l18);
		
		 l19= new JLabel("Misc Deduct.1");
		 l19.setFont(new Font("Tahoma", Font.PLAIN, 13));
		 l19.setBounds(333, 322, 98, 23);
		f.getContentPane().add(l19);
		
		l20 = new JLabel("Misc Deduct.2");
		l20.setFont(new Font("Tahoma", Font.PLAIN, 13));
		l20 .setBounds(333, 365, 98, 23);
		f.getContentPane().add(l20);
		
		 l21= new JLabel("Misc.Deduct.3");
		l21.setFont(new Font("Tahoma", Font.PLAIN, 13));
		l21.setBounds(333, 399, 98, 23);
		f.getContentPane().add(l21);
		
		l22 = new JLabel("Total Deduct.");
		l22.setFont(new Font("Tahoma", Font.PLAIN, 13));
		l22.setBounds(333, 512, 98, 23);
		f.getContentPane().add(l22);
		
		 t1= new JTextField();
		t1.setBounds(174, 131, 128, 20);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(174, 163, 128, 20);
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
	    t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(174, 199, 128, 20);
		f.getContentPane().add(t3);
		
		 t4= new JTextField();
		t4.setColumns(10);
		t4.setBounds(174, 243, 128, 20);
		f.getContentPane().add(t4);
		
		 t5= new JTextField();
		t5.setColumns(10);
		t5.setBounds(174, 286, 128, 20);
		f.getContentPane().add(t5);
		
		 t6= new JTextField();
	     t6.setColumns(10);
		t6.setBounds(174, 322, 128, 20);
		f.getContentPane().add(t6);
		
		t7= new JTextField();
		t7.setColumns(10);
		t7.setBounds(174, 367, 128, 20);
		f.getContentPane().add(t7);
		
		t8 = new JTextField();
		t8.setColumns(10);
		t8.setBounds(174, 399, 128, 20);
		f.getContentPane().add(t8);
		
		 t9 = new JTextField();
	   	t9.setColumns(10);
		t9.setBounds(174, 436, 128, 20);
		f.getContentPane().add(t9);
		
		t10= new JTextField();
		t10.setColumns(10);
		t10.setBounds(174, 478, 128, 20);
		f.getContentPane().add(t10);
		
		t11 = new JTextField();
		t11.setColumns(10);
		t11.setBounds(174, 514, 128, 20);
		f.getContentPane().add(t11);
		
		t12= new JTextField();
		t12.setColumns(10);
		t12.setBounds(174, 546, 128, 20);
		f.getContentPane().add(t12);
		
		t13= new JTextField();
		t13.setColumns(10);
		t13.setBounds(174, 578, 128, 20);
		f.getContentPane().add(t13);
		
		t14= new JTextField();
		t14.setColumns(10);
		t14.setBounds(441, 131, 128, 20);
		f.getContentPane().add(t14);
       
		t15= new JTextField();
		 t15.setColumns(10);
		t15.setBounds(441, 165, 128, 20);
		f.getContentPane().add(t15);
		
		 t16= new JTextField();
		 t16.setColumns(10);
		t16.setBounds(441, 212, 128, 20);
		f.getContentPane().add(t16);
		
		t17 = new JTextField();
		t17.setColumns(10);
		t17.setBounds(441, 243, 128, 20);
		f.getContentPane().add(t17);
		
		t18= new JTextField();
         t18.setColumns(10);
		t18.setBounds(441, 286, 128, 20);
		f.getContentPane().add(t18);
		
		t19 = new JTextField();
		t19.setColumns(10);
		t19.setBounds(441, 324, 128, 20);
		f.getContentPane().add(t19);
		
		t20 = new JTextField();
		t20.setColumns(10);
		t20.setBounds(441, 367, 128, 20);
		f.getContentPane().add(t20);
		
		 t21= new JTextField();
		t21.setColumns(10);
		t21.setBounds(441, 401, 128, 20);
		f.getContentPane().add(t21);
		
		t22 = new JTextField();
		t22.setColumns(10);
		t22.setBounds(441, 478, 128, 20);
		f.getContentPane().add(t22);
		
		t23 = new JTextField();
		t23.setColumns(10);
		t23.setBounds(441, 514, 128, 20);
		f.getContentPane().add(t23);
		
		t24 = new JTextField();
		t24.setColumns(10);
		t24.setBounds(441, 578, 128, 20);
		f.getContentPane().add(t24);
		
	     l23= new JLabel("E.BASIC");
		l23.setFont(new Font("Tahoma", Font.PLAIN, 13));
	    l23.setBounds(601, 129, 98, 23);
		f.getContentPane().add(l23);
		
		 l24= new JLabel("E. HRA");
		l24.setFont(new Font("Tahoma", Font.PLAIN, 13));
		l24.setBounds(601, 163, 98, 23);
		f.getContentPane().add(l24);
		
		 l25= new JLabel("ETS/CON");
		l25.setFont(new Font("Tahoma", Font.PLAIN, 13));
		l25.setBounds(601, 202, 98, 23);
		f.getContentPane().add(l25);
		
		 l26= new JLabel("Misc.Ear 1");
	     l26.setFont(new Font("Tahoma", Font.PLAIN, 13));
		l26.setBounds(601, 241, 98, 23);
		f.getContentPane().add(l26);
		
		 l27= new JLabel("OVER TIME/OT");
		l27.setFont(new Font("Tahoma", Font.PLAIN, 13));
		l27.setBounds(601, 284, 98, 23);
		f.getContentPane().add(l27);
		
		l28 = new JLabel("Misc.Ear 2");
	    l28 .setFont(new Font("Tahoma", Font.PLAIN, 13));
		l28.setBounds(601, 322, 98, 23);
		f.getContentPane().add(l28);
		
		 t25 = new JTextField();
	     t25.setColumns(10);
		 t25.setBounds(710, 131, 128, 20);
		 f.getContentPane().add(t25);
		
		t26 = new JTextField();
		t26.setColumns(10);
	    t26.setBounds(710, 163, 128, 20);
		f.getContentPane().add(t26);
		
		t27 = new JTextField();
		t27.setColumns(10);
		t27.setBounds(710, 199, 128, 20);
		f.getContentPane().add(t27);
		
		 t28= new JTextField();
		t28.setColumns(10);
		t28.setBounds(710, 243, 128, 20);
		f.getContentPane().add(t28);
		
		 t29= new JTextField();
		t29.setColumns(10);
		t29.setBounds(709, 286, 128, 20);
		f.getContentPane().add(t29);
		
		t30 = new JTextField();
		t30.setColumns(10);
		t30.setBounds(709, 324, 128, 20);
		f.getContentPane().add(t30);
		
		p1 = new JPanel();
		p1.setBounds(581, 100, 275, 273);
		f.getContentPane().add(p1);
		
		JL1= new JLabel("EARNINGS");
		p1.add(JL1);
		JL1.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		
		 String[] S= {"jan","feb","mar","apr","may","jun",
		    		"jul","aug","sept","oct","nov","dec"};
	    c1= new JComboBox(S); 
	    c1.setBounds(487, 64, 115, 20);
		f.getContentPane().add(c1);
		
		p2 = new JPanel();
		p2.setBounds(10, 100, 300, 511);
		f.getContentPane().add(p2);
		
		l29= new JLabel("TOTAL GROSS");
		l29.setFont(new Font("Tahoma", Font.BOLD, 14));
		l29.setBounds(333, 576, 109, 23);
		f.getContentPane().add(l29);
		
	    p3= new JPanel();
		p3.setBounds(589, 413, 267, 291);
		f.getContentPane().add(p3);
		
		 JL2= new JLabel("PAYSLIP");
		JL2.setFont(new Font("Tahoma", Font.BOLD, 17));
		JL2.setBounds(675, 384, 98, 23);
		f.getContentPane().add(JL2);
       
		l30 = new JLabel("GROSS");
		l30.setFont(new Font("Tahoma", Font.PLAIN, 13));
		l30.setBounds(333, 478, 98, 23);
		f.getContentPane().add(l30);
		
		t31 = new JTextField();
		t31.setColumns(10);
		t31.setBounds(441, 438, 128, 20);
		f.getContentPane().add(t31);
		
		l31= new JLabel("Total Deduct.source");
		l31.setFont(new Font("Tahoma", Font.PLAIN, 13));
		l31.setBounds(320, 436, 122, 23);
		f.getContentPane().add(l31);
		
	     l32 = new JLabel("Net Pay");
		l32.setFont(new Font("Tahoma", Font.PLAIN, 13));
		l32.setBounds(333, 542, 98, 23);
		f.getContentPane().add(l32);
		
		t32= new JTextField();
		t32.setColumns(10);
		t32.setBounds(441, 546, 128, 20);
		f.getContentPane().add(t32);
		
        JL3= new JLabel("DEDUCTION");
		JL3.setFont(new Font("Tahoma", Font.BOLD, 16));
		JL3.setBounds(400, 106, 103, 23);
		f.getContentPane().add(JL3);
		
		
		a1 = new JTextArea();
		a1.setBackground(Color.LIGHT_GRAY);
		a1.setBounds(601, 414, 255, 273);
		f.getContentPane().add(a1);
		
		p5 = new JPanel();
		p5.setBounds(592, 408, 274, 296);
		f.getContentPane().add(p5);
	    f.setVisible(true);
	    
        b1= new JButton("ADD");
		b1.setBounds(28, 650, 100, 37);
		b1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String l1=t1.getText();
				String l2=t2.getText();
				String l3=t3.getText();
				String l4=t4.getText();
				String l5=t5.getText();
				String l6=t6.getText();
				String l7=t7.getText();
				String l8=t8.getText();
				String l9=t9.getText();
		        String l10=t10.getText();
				String l11=t11.getText();
				String l12=t12.getText();
				String l13=t13.getText();
				String l14=t14.getText();
				String l15=t15.getText();
				String l16=t16.getText();
				String l17=t17.getText();
				String l18=t18.getText();
				String l19=t19.getText();
				String l20=t20.getText();
				String l21=t21.getText();
				String l22=t22.getText();
				String l23=t23.getText();
				String l24=t24.getText();
				String l25=t25.getText();
				String l26=t26.getText();
				String l27=t27.getText();
				String l28=t28.getText();
				String l29=t29.getText();
				String l30=t30.getText();
				String l31=t31.getText();
				String l32=t32.getText();
				
				try {
		        	
		        	Class.forName("com.mysql.cj.jdbc.Driver");
		            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_details", "root", "SrideviM26");
		String query = "INSERT INTO salaryslip values('" + l1 + "','" + l2 + "','" + l3 + "','" + l4 + "','" + l5 + "','" + l6 + "','"
				+l7+ "','" +l8+ "','" +l9+"','"+l10+"','"+l11+"','"+l12+"','"+l13+"','"+l14+"','"+l15+"','"+l16+"','"+l17+"','"+l18+"','"+l19+"','"+l20+"','"+l21+"','"+l22+
				"','"+l23+"','"+l24+"','"+l25+"','"+l26+"','"+l27+"','"+l28+"','"+l29+"','"+l30+"','"+l31+"','"+l32+"')";

		            
		            Statement sta = conn.createStatement();
		            int x= sta.executeUpdate(query);
		            if (x == 0) {
		                JOptionPane.showMessageDialog(b1, "This is alredy exist");
		            } else {
		                JOptionPane.showMessageDialog(b1,
		                    "Welcome Your account is sucessfully created");
		            }
		            conn.close();
		        } catch (Exception exception) {
		            exception.printStackTrace();
		        }
		    }
		});
		b1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		f.getContentPane().add(b1);
	
	    b4 = new JButton("EXIT");
		b4.setBounds(410, 650, 100, 37);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f=new JFrame("EXIT");
				if(JOptionPane.showConfirmDialog(f, "confirm if yu need to exit","payslip system",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		b4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		f.getContentPane().add(b4);
		
		b3 = new JButton("RESET");
		b3.setBounds(278, 650, 100, 37);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText(null);
				t2.setText(null);
				t3.setText(null);
				t4.setText(null);
				t5.setText(null);
				t6.setText(null);
				t7.setText(null);
				t8.setText(null);
				t9.setText(null);
				t10.setText(null);
				t11.setText(null);
				t12.setText(null);
				t13.setText(null);
				t14.setText(null);
				t15.setText(null);
				t16.setText(null);
				t17.setText(null);
				t18.setText(null);
				t19.setText(null);
				t20.setText(null);
				t21.setText(null);
				t22.setText(null);
				t23.setText(null);
				t24.setText(null);
				t25.setText(null);
				t26.setText(null);
				t27.setText(null);
				t28.setText(null);
				t29.setText(null);
				t31.setText(null);
				t32.setText(null);
				
	}
		});
		b3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		f.getContentPane().add(b3);
		
		b2= new JButton("PAYSLIP");
		b2.setBounds(149, 650, 100, 37);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				a1.append("empno: "+ t1.getText() +"\n "+ "empname: "+ t2.getText()+"\n"+ "desination:" + t3.getText()+
						"\n"+"dayspresent: "+t4.getText()+ "\n"+"Basic "+t8.getText()+"\n"+"profession Tax:"+t16.getText()+
						"\n"+"Advance:"+t18.getText()+"\n"+"Gross:"+t23.getText()+"\n"+"netpay:"+t25.getText()+"\n"+"Total Gross:"+t26.getText());
					
				
			}
		});
		b2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		f.getContentPane().add(b2);
		}
	

		
public static void main(String[] args) {
		 new SalaryPayform();
	}


}
		

