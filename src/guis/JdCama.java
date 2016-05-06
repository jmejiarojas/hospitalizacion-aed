package guis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controladores.Camas;
import entidades.Cama;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class JdCama extends JDialog {
	
	//Variables globales
	Camas camas = new Camas();

	private final JPanel contentPanel = new JPanel();
	private JPanel panel;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JButton cboIngresar;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField txtNumero;
	private JTextField txtPrecio;
	private JComboBox cboCategoria;
	private JComboBox cboEstado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JdCama dialog = new JdCama();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JdCama() {
		setTitle("MANTENIMIENTO DE CAMAS");
		setBounds(100, 100, 612, 447);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(220, 20, 60));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(173, 216, 230));
		panel.setBounds(30, 55, 395, 157);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		lblNewLabel_1 = new JLabel("N\u00FAmero");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 23, 80, 14);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Precio por d\u00EDa");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 59, 91, 14);
		panel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Categor\u00EDa");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(10, 110, 80, 14);
		panel.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Estado");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(230, 110, 46, 14);
		panel.add(lblNewLabel_4);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(127, 21, 86, 20);
		panel.add(txtNumero);
		txtNumero.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(127, 57, 86, 20);
		panel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		cboCategoria = new JComboBox();
		cboCategoria.setBounds(100, 107, 100, 20);
		panel.add(cboCategoria);
		
		cboEstado = new JComboBox();
		cboEstado.setBounds(286, 107, 99, 20);
		panel.add(cboEstado);
		
		lblNewLabel = new JLabel("Mantenimiento de Camas");
		lblNewLabel.setForeground(new Color(240, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(166, 30, 259, 14);
		contentPanel.add(lblNewLabel);
		
		btnNewButton = new JButton("Nuevo");
		btnNewButton.setIcon(new ImageIcon(JdCama.class.getResource("/iconos/new.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionPerformedBtnNewButton(arg0);
			}
		});
		btnNewButton.setBounds(447, 53, 128, 30);
		contentPanel.add(btnNewButton);
		
		cboIngresar = new JButton("Agregar");
		cboIngresar.setIcon(new ImageIcon(JdCama.class.getResource("/iconos/add.png")));
		cboIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedCboIngresar(e);
			}
		});
		cboIngresar.setBounds(447, 94, 128, 32);
		contentPanel.add(cboIngresar);
		
		btnNewButton_2 = new JButton("Actualizar");
		btnNewButton_2.setIcon(new ImageIcon(JdCama.class.getResource("/iconos/edit.png")));
		btnNewButton_2.setBounds(447, 137, 128, 32);
		contentPanel.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Eliminar");
		btnNewButton_3.setIcon(new ImageIcon(JdCama.class.getResource("/iconos/delete.png")));
		btnNewButton_3.setBounds(447, 180, 128, 32);
		contentPanel.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Cancelar");
		btnNewButton_4.setIcon(new ImageIcon(JdCama.class.getResource("/iconos/cancelar.png")));
		btnNewButton_4.setBounds(447, 221, 128, 32);
		contentPanel.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("Salir");
		btnNewButton_5.setBounds(336, 230, 89, 23);
		contentPanel.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("Buscar");
		btnNewButton_6.setIcon(new ImageIcon(JdCama.class.getResource("/iconos/search.png")));
		btnNewButton_6.setBounds(30, 225, 111, 32);
		contentPanel.add(btnNewButton_6);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 268, 545, 130);
		contentPanel.add(scrollPane);
		
		llenandoComboCategoria();
		llenandoComboEstado();
	}
	private void llenandoComboEstado() {
		// TODO Auto-generated method stub
		cboEstado.addItem("Libre");
		cboEstado.addItem("Ocupado");
	}

	private void llenandoComboCategoria() {
		// TODO Auto-generated method stub
		cboCategoria.addItem("Económico");
		cboCategoria.addItem("Ejecutivo");
	}

	protected void actionPerformedBtnNewButton(ActionEvent arg0) {
		txtNumero.setText(Integer.toString(camas.generarCodigo()));
	}
	protected void actionPerformedCboIngresar(ActionEvent e) {
		
		ingresar();
		
	}

	private void ingresar() {
		// TODO Auto-generated method stub
		try {
			Cama cama= new Cama(leerNumeroCama(), leerCategoria(), leerPrecio(), leerEstado());
			camas.adicionar(cama);
			mensaje("Registro ingresado correctamente");
			camas.grabar(); //Grabamos en el archivo de texto
		} catch (Exception e) {
			// TODO: handle exception
			mensaje("Ha ocurrido un error: " + e.getMessage());
		}
		
	}

	private void mensaje(String mensaje) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, mensaje);
	}

	private int leerEstado() {
		// TODO Auto-generated method stub
		return cboEstado.getSelectedIndex();
	}

	private double leerPrecio() {
		// TODO Auto-generated method stub
		return Double.parseDouble(txtPrecio.getText());
	}

	private int leerCategoria() {
		// TODO Auto-generated method stub
		return cboCategoria.getSelectedIndex();
	}

	private int leerNumeroCama() {
		// TODO Auto-generated method stub
		return Integer.parseInt(txtNumero.getText());
	}
}













