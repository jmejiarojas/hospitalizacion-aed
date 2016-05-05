package controladores;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

import entidades.Cama;

public class Camas {
	
	private ArrayList<Cama> camas;
	
	public Camas(){
		camas = new ArrayList<Cama>();
		cargar();
	}
	
	public int tamano(){
		return camas.size();
	}
	
	public Cama obtener(int indice){
		return camas.get(indice);
	}
	
	public void adicionar(Cama c){
		camas.add(c);
	}
	
	public void eliminar(Cama c){
		camas.remove(c);
	}
	
	public void actualizar(Cama c){
		for (int i = 0; i < tamano(); i++) {
			if(obtener(i).getNumero() == c.getNumero()){
				camas.set(i, c);
			}
		}
	}
	
	public int generarCodigo(){
		if(tamano() == 0){
			return 1;
		}else{
			return obtener(tamano()-1).getNumero()+1;
		}
	}
	
	public Cama buscarPorNumero(int numero){
		for (Cama cama : camas) {
			if(cama.getNumero() == numero){
				return cama;
			}
		}	
		return null;
	}
	
	public ArrayList<Cama> buscarPorEstado(int estado){
		
		ArrayList<Cama> encontrados = new ArrayList<Cama>();
		for (Cama cama : camas) {
			if(cama.getEstado() == estado){
				encontrados.add(cama);
			}
		}
		
		return encontrados;
	}
	
	public ArrayList<Cama> buscarPorCategoria(int categoria){
			
		ArrayList<Cama> encontrados = new ArrayList<Cama>();
		for (Cama cama : camas) {
			if(cama.getCategoria() == categoria){
				encontrados.add(cama);
			}
		}
		
		return encontrados;
	}
	
	//Escribimos en el archivo camas.txt lo que hay actualmente en el arreglo camas.
	public void grabar(){
		PrintWriter pw;
		String linea;
		Cama cama;
		try {
			pw = new PrintWriter(new FileWriter("camas.txt"));
			for (int i = 0; i < tamano(); i++) {
				cama = obtener(i);
				linea = cama.getNumero() + ";"+
						cama.getCategoria() + ";"+
						cama.getPrecioDia() + ";" +
						cama.getEstado();
				
				pw.println(linea);
			}
			pw.close();
		} catch (Exception e) {
			mensaje("Error: "+e.getMessage());
		}
	}
	
	//Llenamos el arreglo camas con lo que hay en camas.txt
	public void cargar() {
		// TODO Auto-generated method stub
		BufferedReader br;
		String linea;
		StringTokenizer token;
		int numero,categoria,estado;
		double precio;
		
		try {	
			br = new BufferedReader(new FileReader("camas.txt"));
			while((linea = br.readLine()) != null ){
				token = new StringTokenizer(linea, ";");
				numero = Integer.parseInt(token.nextToken().trim());
				categoria = Integer.parseInt(token.nextToken().trim());
				precio = Double.parseDouble(token.nextToken().trim());
				estado = Integer.parseInt(token.nextToken().trim());
				
				Cama cama = new Cama(numero,categoria,precio,estado);
				adicionar(cama);
			}
			br.close();			
		} catch (Exception e) {
			mensaje("Error: " + e.getMessage());
		}
	}
	
	private void mensaje(String mensaje){
		JOptionPane.showMessageDialog(null, "cadena","Soft Hospital",JOptionPane.ERROR_MESSAGE);
	}

}














