package DecimalConvertor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.EmptyBorder;
import java.awt.event.ItemListener;
import java.util.Iterator;
import java.awt.event.ItemEvent;

public class DecimalConvertorGUI {

	private JFrame frame;
	private JTextField textInput;
	private double numberFormat =2.0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DecimalConvertorGUI window = new DecimalConvertorGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DecimalConvertorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("宋体", Font.PLAIN, 14));
		frame.setBounds(100, 100, 570, 406);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNumberToConvert = new JLabel("\u8981\u8F6C\u6362\u7684\u6570\u5B57:");
		lblNumberToConvert.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumberToConvert.setFont(new Font("宋体", Font.PLAIN, 14));
		lblNumberToConvert.setBounds(25, 23, 126, 29);
		frame.getContentPane().add(lblNumberToConvert);
		
		textInput = new JTextField();
		textInput.setHorizontalAlignment(SwingConstants.CENTER);
		textInput.setBounds(145, 24, 291, 29);
		frame.getContentPane().add(textInput);
		textInput.setColumns(10);
		
		JLabel lblBinary = new JLabel("\u4E8C\u8FDB\u5236\uFF1A");
		lblBinary.setHorizontalAlignment(SwingConstants.CENTER);
		lblBinary.setFont(new Font("宋体", Font.PLAIN, 14));
		lblBinary.setBounds(25, 83, 126, 29);
		frame.getContentPane().add(lblBinary);
		
		JLabel lblOctal = new JLabel("\u516B\u8FDB\u5236:");
		lblOctal.setHorizontalAlignment(SwingConstants.CENTER);
		lblOctal.setFont(new Font("宋体", Font.PLAIN, 14));
		lblOctal.setBounds(25, 137, 126, 29);
		frame.getContentPane().add(lblOctal);
		
		JLabel lblDecimal = new JLabel("\u5341\u8FDB\u5236:");
		lblDecimal.setHorizontalAlignment(SwingConstants.CENTER);
		lblDecimal.setFont(new Font("宋体", Font.PLAIN, 14));
		lblDecimal.setBounds(25, 195, 126, 29);
		frame.getContentPane().add(lblDecimal);
		
		JLabel lblHexal = new JLabel("\u5341\u516D\u8FDB\u5236:");
		lblHexal.setHorizontalAlignment(SwingConstants.CENTER);
		lblHexal.setFont(new Font("宋体", Font.PLAIN, 14));
		lblHexal.setBounds(25, 248, 126, 29);
		frame.getContentPane().add(lblHexal);
		
		JLabel lblBinaryOutput = new JLabel("\u7B49\u5F85\u8BA1\u7B97");
		lblBinaryOutput.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblBinaryOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblBinaryOutput.setFont(new Font("宋体", Font.PLAIN, 14));
		lblBinaryOutput.setBounds(145, 83, 291, 29);
		frame.getContentPane().add(lblBinaryOutput);
		
		JLabel lblOctalOutput = new JLabel("\u7B49\u5F85\u8BA1\u7B97");
		lblOctalOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOctalOutput.setFont(new Font("宋体", Font.PLAIN, 14));
		lblOctalOutput.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblOctalOutput.setBounds(145, 137, 291, 29);
		frame.getContentPane().add(lblOctalOutput);
		
		JLabel lblHexalOutput = new JLabel("\u7B49\u5F85\u8BA1\u7B97");
		lblHexalOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblHexalOutput.setFont(new Font("宋体", Font.PLAIN, 14));
		lblHexalOutput.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblHexalOutput.setBounds(145, 248, 291, 29);
		frame.getContentPane().add(lblHexalOutput);
		
				
		JLabel lblDecimalOutput = new JLabel("\u7B49\u5F85\u8BA1\u7B97");
		lblDecimalOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblDecimalOutput.setFont(new Font("宋体", Font.PLAIN, 14));
		lblDecimalOutput.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblDecimalOutput.setBounds(145, 195, 291, 29);
		frame.getContentPane().add(lblDecimalOutput);
		
		JComboBox comboBoxFormatChoice = new JComboBox();
		comboBoxFormatChoice.setToolTipText("\u8BF7\u9009\u62E9\u9700\u8981\u8F6C\u6362\u6570\u503C\u7684\u8FDB\u5236");
		comboBoxFormatChoice.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(ItemEvent.SELECTED == e.getStateChange()) {
					numberFormat = Double.parseDouble(e.getItem().toString());
				}
			}
		});
		comboBoxFormatChoice.setBorder(new EmptyBorder(0, 0, 0, 0));
		comboBoxFormatChoice.setModel(new DefaultComboBoxModel(new String[] {"2", "8", "10", "16"}));
		comboBoxFormatChoice.setFont(new Font("宋体", Font.PLAIN, 14));
		comboBoxFormatChoice.setBounds(446, 23, 42, 29);
		frame.getContentPane().add(comboBoxFormatChoice);
		
		JButton btnConvert = new JButton("\u8F6C\u6362");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numberEnteringString = textInput.getText();
				
				//判断从输入区获得的字符串中是否有非数字字符，如果有弹出提示框
				for (int i = 0; i < numberEnteringString.length(); i++) {
					char tempChar = numberEnteringString.charAt(i);
					if(tempChar != '.' && (int)tempChar < 48 || (int)tempChar >90 || (int)tempChar >57&& (int)tempChar < 65 ) {
						JOptionPane.showMessageDialog(null, "输入值非数字格式，请重新输入", "输入错误", JOptionPane.ERROR_MESSAGE);
						//textInput.setText("");
						textInput.grabFocus();
					}
				}
				
				NumberConvertToBase10 numberCTB = new NumberConvertToBase10();
				double format = numberFormat;
				String numberInBase10 = numberCTB.numberConvert(numberEnteringString, format);
				lblBinaryOutput.setText(new Convertor(numberInBase10, 2).Convert());
				lblOctalOutput.setText(new Convertor(numberInBase10, 8).Convert());
				//lblDecimalOutput.setText(new Convertor(numberInBase10, 10).Convert());
				//如果直接用convertor运算会出现精度误差，所以直接将numberInBase10的值发送到lblDecimalOutput
				lblDecimalOutput.setText(numberInBase10); 
				lblHexalOutput.setText(new Convertor(numberInBase10, 16).Convert());
			}
		});
		btnConvert.setFont(new Font("宋体", Font.PLAIN, 14));
		btnConvert.setBounds(177, 309, 126, 36);
		frame.getContentPane().add(btnConvert);
		
		
		
		
	}
}
