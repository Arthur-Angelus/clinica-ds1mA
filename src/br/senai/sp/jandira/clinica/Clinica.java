/*
 * PROGRAMADOR: Arthur
 * DATA: 26/02/25
 * EMPRESA: SENAI
 */
package br.senai.sp.jandira.clinica;

import java.time.LocalDate;

import br.senai.sp.jandira.clinica.model.Paciente;

public class Clinica {

	public static void main(String[] args) {
		
		// Criando um objeto paciente
		Paciente p1 = new Paciente();
		p1.setNome("Ana Maria");	
		p1.setAltura(1.65);
		p1.peso = 51;
		p1.telefone = "(11)99999-8888";
		p1.dataNascimento = LocalDate.of(2003, 7, 15);
		
		Paciente p2 = new Paciente();
		p2.setNome("Arthur Angelus");
		p2.setAltura(1.85);
		p2.peso = 93;
		p2.telefone = "(11)64856-8457";
		p2.dataNascimento = LocalDate.of(2006, 11, 23);
		
		//Exibindo a referencia dos objetos
		System.out.println(p1);
		System.out.println(p2);
		
		Paciente p3 = p1;
		
		System.out.println(p3);
		
		//Exibindo os dados do objeto
		p1.mostrarFichaDoPaciente();
		p2.mostrarFichaDoPaciente();
		
	}

}
