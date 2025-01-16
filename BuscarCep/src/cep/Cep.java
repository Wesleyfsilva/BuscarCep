package cep;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Atxy2k.CustomTextField.RestrictedTextField;
import java.awt.Dialog.ModalExclusionType;

public class Cep extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCep;
	private JTextField txtEndereco;
	private JTextField txtBairro;
	private JTextField txtCidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cep frame = new Cep();
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
	public Cep() {
		setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Cep.class.getResource("/img/home.png")));
		setTitle("Home");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cep");
		lblNewLabel.setBounds(10, 29, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtCep = new JTextField();
		txtCep.setBounds(66, 26, 129, 20);
		contentPane.add(txtCep);
		txtCep.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Endereço");
		lblNewLabel_1.setBounds(10, 66, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(66, 63, 290, 20);
		contentPane.add(txtEndereco);
		txtEndereco.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Bairro");
		lblNewLabel_2.setBounds(10, 108, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		txtBairro = new JTextField();
		txtBairro.setBounds(66, 105, 290, 20);
		contentPane.add(txtBairro);
		txtBairro.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Cidade");
		lblNewLabel_3.setBounds(10, 152, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		txtCidade = new JTextField();
		txtCidade.setBounds(66, 149, 231, 20);
		contentPane.add(txtCidade);
		txtCidade.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("UF");
		lblNewLabel_4.setBounds(307, 152, 21, 14);
		contentPane.add(lblNewLabel_4);
		
		JComboBox cboUF = new JComboBox();
		cboUF.setBounds(327, 148, 53, 22);
		contentPane.add(cboUF);
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(txtCep.getText().equals("")) {
					JOptionPane.showMessageDialog(null,  "Informe o CEP");
					txtCep.requestFocus();
				}else {
					//buscar Cep
				}
						
			}
		});
		btnBuscar.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnBuscar.setBounds(267, 25, 89, 23);
		contentPane.add(btnBuscar);
		
		JButton btnLimpar = new JButton("LIMPAR");
		btnLimpar.setBounds(41, 211, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnSobre = new JButton("");
		btnSobre.setBackground(SystemColor.control);
		btnSobre.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSobre.setToolTipText("Sobre");
		btnSobre.setBorder(null);
		btnSobre.setIcon(new ImageIcon(Cep.class.getResource("/img/about.png")));
		
		btnSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sobre sobre = new Sobre();
				sobre.setModalExclusionType(getModalExclusionType());
				sobre.setVisible(true);
				
			}
		});
		btnSobre.setBounds(378, 14, 46, 44);
		contentPane.add(btnSobre);
		
		/*Uso da biblioteca atxy2k para validação do campo txtCep*/
		
		RestrictedTextField validar = new RestrictedTextField(txtCep);
		validar.setOnlyNums(true);
		validar.setLimit(8);
		
		
		
	}// fim do construtor
	
	
	}

