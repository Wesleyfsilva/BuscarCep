package cep;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.SystemColor;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Rectangle;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dialog.ModalityType;
import java.awt.Dialog.ModalExclusionType;

public class Sobre extends JDialog {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Sobre dialog = new Sobre();
                    dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                    dialog.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the dialog.
     */
    public Sobre() {
    	setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
    	setModalityType(ModalityType.TOOLKIT_MODAL);
        setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/about.png")));
        setResizable(false);
        setTitle("Sobre");
        setBounds(150, 150, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Buscar Cep Ver. 1.0");
        lblNewLabel.setBounds(10, 23, 129, 14);
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("@AUTHOR Wesley Ferreira");
        lblNewLabel_1.setBounds(10, 65, 182, 14);
        contentPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("Web Service:");
        lblNewLabel_2.setBounds(10, 106, 85, 14);
        contentPane.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("https://www.republicavirtual.com.br/");
        lblNewLabel_3.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		link("https://www.republicavirtual.com.br/");
        	}
        });
        lblNewLabel_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblNewLabel_3.setForeground(SystemColor.textHighlight);
        lblNewLabel_3.setBounds(105, 106, 207, 14);
        contentPane.add(lblNewLabel_3);
        
        JButton btnGithub = new JButton("");
        btnGithub.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		link("https://github.com/Wesleyfsilva/BuscarCep");
        	}
        });
        btnGithub.setBounds(new Rectangle(100, 100, 48, 48));
        btnGithub.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnGithub.setBorder(null);
        btnGithub.setBackground(SystemColor.control);
        btnGithub.setToolTipText("GitHub\r\n");
        btnGithub.setIcon(new ImageIcon(Sobre.class.getResource("/img/github.png")));
        btnGithub.setBounds(31, 201, 48, 49);
        contentPane.add(btnGithub);
        
        JButton btnLinkedin = new JButton("");
        btnLinkedin.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		link("https://www.linkedin.com/in/wesley-dev1/");
        	}
        });
        btnLinkedin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnLinkedin.setBorder(null);
        btnLinkedin.setToolTipText("LinkedIn");
        btnLinkedin.setIcon(new ImageIcon(Sobre.class.getResource("/img/linkedin.png")));
        btnLinkedin.setBackground(SystemColor.control);
        btnLinkedin.setBounds(87, 201, 48, 49);
        contentPane.add(btnLinkedin);
    }
    
    private void link(String site) {
		Desktop desktop = Desktop.getDesktop();
		
		try {
			URI uri = new URI(site);
			desktop.browse(uri);
			
		}catch(Exception e) {
			System.out.println(e);
		}
    }
}
