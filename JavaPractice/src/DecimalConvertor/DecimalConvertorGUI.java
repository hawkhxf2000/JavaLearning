package DecimalConvertor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DecimalConvertorGUI {

	private JFrame frame;
	private JTextField textDecimalInput;

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
		frame.setBounds(100, 100, 532, 376);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDecimal = new JLabel("\u8981\u8F6C\u6362\u7684\u6570\u5B57:");
		lblDecimal.setHorizontalAlignment(SwingConstants.CENTER);
		lblDecimal.setFont(new Font("宋体", Font.PLAIN, 14));
		lblDecimal.setBounds(25, 23, 126, 29);
		frame.getContentPane().add(lblDecimal);
		
		textDecimalInput = new JTextField();
		textDecimalInput.setHorizontalAlignment(SwingConstants.CENTER);
		textDecimalInput.setBounds(145, 24, 291, 29);
		frame.getContentPane().add(textDecimalInput);
		textDecimalInput.setColumns(10);
		
		JLabel lblBinary = new JLabel("\u4E8C\u8FDB\u5236\uFF1A");
		lblBinary.setHorizontalAlignment(SwingConstants.CENTER);
		lblBinary.setFont(new Font("宋体", Font.PLAIN, 14));
		lblBinary.setBounds(25, 83, 126, 29);
		frame.getContentPane().add(lblBinary);
		
		JLabel lblOctal = new JLabel("\u8981\u8F6C\u6362\u7684\u6570\u5B57:");
		lblOctal.setHorizontalAlignment(SwingConstants.CENTER);
		lblOctal.setFont(new Font("宋体", Font.PLAIN, 14));
		lblOctal.setBounds(25, 137, 126, 29);
		frame.getContentPane().add(lblOctal);
		
		JLabel lblHexal = new JLabel("\u8981\u8F6C\u6362\u7684\u6570\u5B57:");
		lblHexal.setHorizontalAlignment(SwingConstants.CENTER);
		lblHexal.setFont(new Font("宋体", Font.PLAIN, 14));
		lblHexal.setBounds(25, 202, 126, 29);
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
		lblHexalOutput.setBounds(145, 202, 291, 29);
		frame.getContentPane().add(lblHexalOutput);
		
		JButton btnConvert = new JButton("\u8F6C\u6362");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numberEnteringString = textDecimalInput.getText();
				lblBinaryOutput.setText(new Convertor(numberEnteringString, 2).Convert());
				lblOctalOutput.setText(new Convertor(numberEnteringString, 8).Convert());
				lblHexalOutput.setText(new Convertor(numberEnteringString, 16).Convert());
			}
		});
		btnConvert.setFont(new Font("宋体", Font.PLAIN, 14));
		btnConvert.setBounds(175, 265, 126, 36);
		frame.getContentPane().add(btnConvert);
	}
}
