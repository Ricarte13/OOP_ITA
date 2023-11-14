package imc;

public class Principal {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente(40, 1.72);
		Paciente p2 = new Paciente(95, 1.67);
		Paciente p3 = new Paciente(67, 1.70);
		
		System.out.println(String.format("%.2f", p1.calcularIMC()) + " - " + p1.diagnostico());
		System.out.println(String.format("%.2f", p2.calcularIMC()) + " - " + p2.diagnostico());
		System.out.println(String.format("%.2f", p3.calcularIMC()) + " - " + p3.diagnostico());
		
	}
}
