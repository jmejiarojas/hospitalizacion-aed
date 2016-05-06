package guis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

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
import javax.swing.JTable;

public class JdCama extends JDialog {
	
	//Variables globales
	Camas camas = new Camas();
	
	//Para crear la tabla
	private String[] cabecera = {"Número", "Categoría","Precio x día",  "Estado"};
	private String[][] data = {};
	private DefaultTableModel modeloCama;

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
	private JTextField txtPrecio;
	private JComboBox cboCategoria;
	private JComboBox cboEstado;
	private JTable tblCamas;
	private JLabel lblCodigo;
	private JPanel panel_1;
	private JPanel panel_2;

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
		setBounds(100, 100, 626, 463);
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
		lblNewLabel_3.setBounds(10, 94, 80, 14);
		panel.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Estado");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(10, 132, 46, 14);
		panel.add(lblNewLabel_4);
		
		txtPrecio = new JTextField();
		txtPrecio.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtPrecio.setBounds(127, 57, 86, 20);
		panel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		cboCategoria = new JComboBox();
		cboCategoria.setBounds(127, 92, 100, 20);
		panel.add(cboCategoria);
		
		cboEstado = new JComboBox();
		cboEstado.setBounds(127, 130, 99, 20);
		panel.add(cboEstado);
		
		lblCodigo = new JLabel("xyz");
		lblCodigo.setForeground(new Color(0, 0, 255));
		lblCodigo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCodigo.setBounds(127, 23, 57, 14);
		panel.add(lblCodigo);
		
		lblNewLabel = new JLabel("Mantenimiento de Camas");
		lblNewLabel.setForeground(new Color(240, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(166, 30, 259, 14);
		contentPanel.add(lblNewLabel);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 279, 559, 135);
		contentPanel.add(scrollPane);
		
		tblCamas = new JTable();
		scrollPane.setViewportView(tblCamas);
		
		//Configurando modelo en caja
		modeloCama = new DefaultTableModel(data, cabecera);
		tblCamas.setModel(modeloCama);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(173, 216, 230));
		panel_1.setBounds(443, 55, 146, 217);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);
		
		cboIngresar = new JButton("Agregar");
		cboIngresar.setBounds(10, 52, 128, 32);
		panel_1.add(cboIngresar);
		cboIngresar.setIcon(new ImageIcon(JdCama.class.getResource("/iconos/add.png")));
		
		btnNewButton_2 = new JButton("Actualizar");
		btnNewButton_2.setBounds(10, 95, 128, 32);
		panel_1.add(btnNewButton_2);
		btnNewButton_2.setIcon(new ImageIcon(JdCama.class.getResource("/iconos/edit.png")));
		
		btnNewButton_3 = new JButton("Eliminar");
		btnNewButton_3.setBounds(10, 138, 128, 32);
		panel_1.add(btnNewButton_3);
		btnNewButton_3.setIcon(new ImageIcon(JdCama.class.getResource("/iconos/delete.png")));
		
		btnNewButton_4 = new JButton("Cancelar");
		btnNewButton_4.setBounds(10, 179, 128, 32);
		panel_1.add(btnNewButton_4);
		btnNewButton_4.setIcon(new ImageIcon(JdCama.class.getResource("/iconos/cancelar.png")));
		
		btnNewButton = new JButton("Nuevo");
		btnNewButton.setBounds(10, 11, 128, 30);
		panel_1.add(btnNewButton);
		btnNewButton.setIcon(new ImageIcon(JdCama.class.getResource("/iconos/new.png")));
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(173, 216, 230));
		panel_2.setBounds(29, 223, 396, 49);
		contentPanel.add(panel_2);
		panel_2.setLayout(null);
		
		btnNewButton_6 = new JButton("Buscar");
		btnNewButton_6.setBounds(10, 11, 111, 32);
		panel_2.add(btnNewButton_6);
		btnNewButton_6.setIcon(new ImageIcon(JdCama.class.getResource("/iconos/search.png")));
		
		btnNewButton_5 = new JButton("Salir");
		btnNewButton_5.setBounds(288, 12, 98, 30);
		panel_2.add(btnNewButton_5);
		btnNewButton_5.setIcon(new ImageIcon(JdCama.class.getResource("/iconos/exit.gif")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionPerformedBtnNewButton(arg0);
			}
		});
		cboIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionPerformedCboIngresar(e);
			}
		});
		
		llenandoComboCategoria();
		llenandoComboEstado();
		
		mostrarListado();
	}
	
	private void mostrarListado() {
		// TODO Auto-generated method stub
		inicializaTabla();
		
		for (int i = 0; i < camas.tamano(); i++) {
			Cama cama = camas.obtener(i);
			//Hallando la categoria
			int indiceCategoria = cama.getCategoria();
			String categoria = "";
			
			if(indiceCategoria == 0) categoria = "Economico";
			else categoria = "Ejecutivo";
			//Hallando el estado
			int indiceEstado = cama.getEstado();
			String estado = "";
			
			if(indiceEstado == 0) estado = "Libre";
			else estado = "Desocupado";
			
			Object data[] = {cama.getNumero(),categoria, cama.getPrecioDia(), estado};
			modeloCama.addRow(data);
		}
	}

	private void inicializaTabla() {
		// TODO Auto-generated method stub
		int filas = tblCamas.getRowCount();
		for (int i = 0; i < filas; i++) {
			modeloCama.removeRow(0);
		}
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
		lblCodigo.setText(Integer.toString(camas.generarCodigo()));
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
			mostrarListado();
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
		return Integer.parseInt(lblCodigo.getText());
	}
}













