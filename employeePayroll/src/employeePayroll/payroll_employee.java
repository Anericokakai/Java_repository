package employeePayroll;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class payroll_employee {

	private JFrame frmGeorgetownCleaningServicesemployee;
	private JTextField textFieldempName;
	private JTextField textFieldhoursalary;
	private JTextField textFieldfwMon;
	private JTextField textFieldswMon;
	private JTextField textFieldfwTue;
	private JTextField textFieldswTue;
	private JTextField textFieldfwWed;
	private JTextField textFieldswWed;
	private JTextField textFieldfwThur;
	private JTextField textFieldswThur;
	private JTextField textFieldfwFri;
	private JTextField textFieldswFri;
	private JTextField textFieldfwSat;
	private JTextField textFieldswSat;
	private JTextField textFieldfwSun;
	private JTextField textFieldswSun;
	private JTextField textFieldreghours;
	private JTextField textField_1overhours;
	private JTextField textField_2regamount;
	private JTextField textField_3overamount;
	private JTextField textFieldnetpay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					payroll_employee window = new payroll_employee();
					window.frmGeorgetownCleaningServicesemployee.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public payroll_employee() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGeorgetownCleaningServicesemployee = new JFrame();
		frmGeorgetownCleaningServicesemployee.setTitle("Georgetown Cleaning Services-Employee Payroll");
		frmGeorgetownCleaningServicesemployee.setBounds(100, 100, 1168, 483);
		frmGeorgetownCleaningServicesemployee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGeorgetownCleaningServicesemployee.getContentPane().setLayout(null);
		
		JLabel emp_id = new JLabel("Employee Identification");
		emp_id.setFont(new Font("Tahoma", Font.PLAIN, 13));
		emp_id.setBounds(10, 10, 164, 13);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(emp_id);
		
		JLabel emp_name = new JLabel("Employee Name:");
		emp_name.setFont(new Font("Tahoma", Font.PLAIN, 13));
		emp_name.setBounds(20, 33, 114, 13);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(emp_name);
		
		textFieldempName = new JTextField();
		textFieldempName.setBounds(144, 31, 96, 19);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldempName);
		textFieldempName.setColumns(10);
		
		JLabel hs = new JLabel("Hourly Salary:");
		hs.setFont(new Font("Tahoma", Font.PLAIN, 13));
		hs.setBounds(315, 33, 104, 13);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(hs);
		
		textFieldhoursalary = new JTextField();
		textFieldhoursalary.setBounds(442, 31, 96, 19);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldhoursalary);
		textFieldhoursalary.setColumns(10);
		
		JLabel timesheet = new JLabel("Time Sheet");
		timesheet.setFont(new Font("Tahoma", Font.PLAIN, 13));
		timesheet.setBounds(10, 92, 78, 13);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(timesheet);
		
		JLabel fweek = new JLabel("First Week:");
		fweek.setFont(new Font("Tahoma", Font.PLAIN, 13));
		fweek.setBounds(10, 155, 68, 13);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(fweek);
		
		JLabel sweek = new JLabel("Second Week:");
		sweek.setFont(new Font("Tahoma", Font.PLAIN, 13));
		sweek.setBounds(10, 191, 124, 19);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(sweek);
		
		JLabel Monday = new JLabel("Monday");
		Monday.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Monday.setBounds(170, 113, 62, 13);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(Monday);
		
		JLabel Tuesday = new JLabel("Tuesday");
		Tuesday.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Tuesday.setBounds(278, 113, 78, 13);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(Tuesday);
		
		JLabel Wednesday = new JLabel("Wednesday");
		Wednesday.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Wednesday.setBounds(405, 113, 78, 13);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(Wednesday);
		
		JLabel Thursday = new JLabel("Thursday");
		Thursday.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Thursday.setBounds(527, 113, 84, 13);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(Thursday);
		
		JLabel Friday = new JLabel("Friday");
		Friday.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Friday.setBounds(655, 113, 69, 13);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(Friday);
		
		JLabel Sunday = new JLabel("Sunday");
		Sunday.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Sunday.setBounds(913, 113, 45, 13);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(Sunday);
		
		JLabel Saturday = new JLabel("Saturday");
		Saturday.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Saturday.setBounds(775, 113, 78, 13);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(Saturday);
		
		textFieldfwMon = new JTextField();
		textFieldfwMon.setBounds(144, 153, 96, 19);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldfwMon);
		textFieldfwMon.setColumns(10);
		
		textFieldswMon = new JTextField();
		textFieldswMon.setBounds(144, 192, 96, 19);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldswMon);
		textFieldswMon.setColumns(10);
		
		textFieldfwTue = new JTextField();
		textFieldfwTue.setBounds(278, 153, 96, 19);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldfwTue);
		textFieldfwTue.setColumns(10);
		
		textFieldswTue = new JTextField();
		textFieldswTue.setBounds(278, 192, 96, 19);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldswTue);
		textFieldswTue.setColumns(10);
		
		textFieldfwWed = new JTextField();
		textFieldfwWed.setBounds(405, 153, 96, 19);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldfwWed);
		textFieldfwWed.setColumns(10);
		
		textFieldswWed = new JTextField();
		textFieldswWed.setBounds(405, 192, 96, 19);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldswWed);
		textFieldswWed.setColumns(10);
		
		textFieldfwThur = new JTextField();
		textFieldfwThur.setBounds(530, 153, 96, 19);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldfwThur);
		textFieldfwThur.setColumns(10);
		
		textFieldswThur = new JTextField();
		textFieldswThur.setBounds(530, 192, 96, 19);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldswThur);
		textFieldswThur.setColumns(10);
		
		textFieldfwFri = new JTextField();
		textFieldfwFri.setBounds(655, 153, 96, 19);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldfwFri);
		textFieldfwFri.setColumns(10);
		
		textFieldswFri = new JTextField();
		textFieldswFri.setBounds(655, 192, 96, 19);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldswFri);
		textFieldswFri.setColumns(10);
		
		textFieldfwSat = new JTextField();
		textFieldfwSat.setBounds(776, 153, 96, 19);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldfwSat);
		textFieldfwSat.setColumns(10);
		
		textFieldswSat = new JTextField();
		textFieldswSat.setBounds(775, 192, 96, 19);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldswSat);
		textFieldswSat.setColumns(10);
		
		textFieldfwSun = new JTextField();
		textFieldfwSun.setBounds(910, 153, 96, 19);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldfwSun);
		textFieldfwSun.setColumns(10);
		
		textFieldswSun = new JTextField();
		textFieldswSun.setBounds(910, 192, 96, 19);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldswSun);
		textFieldswSun.setColumns(10);
		
		JLabel pp = new JLabel("Payroll Processing");
		pp.setFont(new Font("Tahoma", Font.PLAIN, 13));
		pp.setBounds(10, 272, 104, 24);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(pp);
		
		JButton btnNewButton = new JButton("Process It");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			emp_name.getText();
			float hs=Float.valueOf(textFieldhoursalary.getText());
			float Monday=Float.valueOf(textFieldfwMon.getText());
			float Monday2=Float.valueOf(textFieldswMon.getText());
			float Tuesday=Float.valueOf(textFieldfwTue.getText());
			float Tuesday2=Float.valueOf(textFieldswTue.getText());
			float Wednesday=Float.valueOf(textFieldfwWed.getText());
			float Wednesday2=Float.valueOf(textFieldswWed.getText());
			float Thursday=Float.valueOf(textFieldfwThur.getText());
			float Thursday2=Float.valueOf(textFieldswThur.getText());
			float Friday=Float.valueOf(textFieldfwFri.getText());
			float Friday2=Float.valueOf(textFieldswFri.getText());
			float Saturday=Float.valueOf(textFieldfwSat.getText());
			float Saturday2=Float.valueOf(textFieldswSat.getText());
			float Sunday=Float.valueOf(textFieldfwSun.getText());
			float Sunday2=Float.valueOf(textFieldswSun.getText());
			float arr1[]= {Monday,Monday2,Tuesday,Tuesday2,Wednesday,Wednesday2,Thursday,Thursday2,Friday,Friday2,Saturday,Saturday2,Sunday,Sunday2};
			float otime,regular,over;
			otime=0;
			regular=0;
			for(int i=0;i<14;i++)
			{
				if (arr1[i]>8)
				{
					over=arr1[i]-8;
					otime=otime+over;
					regular=regular+8;
				}
				else
				{
					regular=regular+arr1[i];
				}
				
			}
			float regHours= regular;
            float overtimeHours= otime;
            textField_1overhours.setText(String.valueOf(overtimeHours));
            textFieldreghours.setText(String.valueOf(regHours));
            float regAmount=regHours * hs;
            String formattedRegularAmount = String.format("%.2f", regAmount);
		

            textField_2regamount.setText(String.valueOf(formattedRegularAmount));
            float overAmount=overtimeHours * hs;
        	String formattedOvertimeAmount = String.format("%.2f", overAmount);
            textField_3overamount.setText(String.valueOf(formattedOvertimeAmount));
            
            float np=overAmount + regAmount;
            String formattednp = String.format("%.2f", np);
            textFieldnetpay.setText(String.valueOf(formattednp));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(10, 335, 104, 89);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(btnNewButton);
		
		JLabel regular = new JLabel("Regular:");
		regular.setFont(new Font("Tahoma", Font.PLAIN, 13));
		regular.setBounds(124, 355, 82, 19);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(regular);
		
		JLabel otime = new JLabel("Overtime:");
		otime.setFont(new Font("Tahoma", Font.PLAIN, 13));
		otime.setBounds(124, 396, 62, 13);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(otime);
		
		textFieldreghours = new JTextField();
		textFieldreghours.setBounds(222, 356, 96, 19);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldreghours);
		textFieldreghours.setColumns(10);
		
		textField_1overhours = new JTextField();
		textField_1overhours.setBounds(222, 394, 96, 19);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textField_1overhours);
		textField_1overhours.setColumns(10);
		
		textField_2regamount = new JTextField();
		textField_2regamount.setEditable(false);
		textField_2regamount.setBounds(387, 356, 96, 19);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textField_2regamount);
		textField_2regamount.setColumns(10);
		
		textField_3overamount = new JTextField();
		textField_3overamount.setEditable(false);
		textField_3overamount.setBounds(387, 394, 96, 19);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textField_3overamount);
		textField_3overamount.setColumns(10);
		
		JLabel hrs = new JLabel("Hours");
		hrs.setFont(new Font("Tahoma", Font.PLAIN, 13));
		hrs.setBounds(222, 320, 45, 13);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(hrs);
		
		JLabel amt = new JLabel("Amount");
		amt.setFont(new Font("Tahoma", Font.PLAIN, 13));
		amt.setBounds(387, 321, 68, 13);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(amt);
		
		JLabel np = new JLabel("Net Pay:");
		np.setFont(new Font("Tahoma", Font.PLAIN, 13));
		np.setBounds(567, 359, 59, 13);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(np);
		
		textFieldnetpay = new JTextField();
		textFieldnetpay.setEditable(false);
		textFieldnetpay.setBounds(655, 356, 96, 19);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(textFieldnetpay);
		textFieldnetpay.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Close");
		btnNewButton_1.setBounds(885, 336, 85, 89);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 71, 1128, -15);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 10, 1134, 71);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 92, 1134, 166);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 278, 1134, 146);
		frmGeorgetownCleaningServicesemployee.getContentPane().add(panel_3);
	}
}
