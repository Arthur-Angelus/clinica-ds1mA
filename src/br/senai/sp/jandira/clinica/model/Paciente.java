package br.senai.sp.jandira.clinica.model;

import java.time.LocalDate;

public class Paciente {
	
	private String nome;
	public LocalDate dataNascimento;
	public int peso;
	private double altura;
	public String telefone;
	private double imc;
	
	public void setNome(String nome) {
		//TRUE
		if(nome.length() >=3) {
			this.nome = nome.toUpperCase() ;
		} else {
			//FALSE
			System.out.println("\nO nome " + nome + ", não é valido!\nO nome deve conter pelo menos 3 caracteres!\n");
			}
		
			}
	
	public void setAltura(double altura) {
		if(altura >=0) {
			this.altura = altura;
		} else {
			System.out.println("\nA altura do(a) paciente" + nome + " deve ser um valor maior do que 0!\n");
		}	
	}		
	
	public void calcularIdade() {
		
	}
	
	public double calcularImc() {
		imc = peso / Math.pow(altura, 2);
		return imc;
	}
	
	public void classificarImc() {
		
	}
	
	public void mostrarFichaDoPaciente() {
		System.out.println("=======================");
		System.out.println("DADOS DO PACIENTE");
		System.out.println("=======================");
		System.out.println("Nome: " + nome);
		System.out.println("Peso: " + peso);
		System.out.println("Altura: " + altura);
		System.out.println("IMC: " + String.format("%.1f", calcularImc()));
		System.out.println("Telefone: " + telefone);
		System.out.println("=======================");
		System.out.println();
			
	}
	
}