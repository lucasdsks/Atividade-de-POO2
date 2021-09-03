package aplication;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entities.Animal;
import entities.Domestico;
import entities.Silvestre;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Opt = 0;
		
		List<Animal> lista = new ArrayList<>(); 
		Opt = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadatrar um animal?\n1 - Silvestre\n2 - Domestico"));
				
		switch(Opt)
		{
			case 1:
			Animal silvestre = new Silvestre(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do animal : ")), 
					JOptionPane.showInputDialog("Especie : "),
					JOptionPane.showInputDialog("Habitat : "),
					JOptionPane.showInputDialog("Numero Premiss�o : "));
			lista.add(silvestre);
			break;
			case 2 :
			Animal domestico = new Domestico(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do animal : ")), 
					JOptionPane.showInputDialog("Especie : "),
					JOptionPane.showInputDialog("Habitat : "),
					JOptionPane.showInputDialog("Carteira de Vacina��o : "));
			lista.add(domestico);
			break;
			default:
			JOptionPane.showMessageDialog(null, "Op��o Invalida");
			
		}
		
		for(Animal x: lista)
		{
			JOptionPane.showMessageDialog(null, "Id: " + x.getIdAnimal() + "\nDescri��o: " + x.getDescricao());
		}
		
		
	

	}

}
