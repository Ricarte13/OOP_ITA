package imc;

public class Paciente {
	double peso;
	double altura;
	
	public Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura= altura;
	}
	
	public double calcularIMC() {
		return this.peso / Math.pow(this.altura, 2);
	}
	
	String laudo;
	public String diagnostico() {
		if(calcularIMC() < 16.0) {
			laudo = "Baixo peso muito grave = IMC abaixo de 16 kg/m²";
		}else if( calcularIMC() < 17.0){
			laudo = "Baixo peso grave = IMC entre 16 e 16,99 kg/m²";
		}else if( calcularIMC() < 18.5){
			laudo = "Baixo peso = IMC entre 17 e 18,49 kg/m²";
		}else if( calcularIMC() < 25.0){
			laudo = "Peso normal = IMC entre 18,50 e 24,99 kg/m²";
		}else if( calcularIMC() < 30){
			laudo = "Sobrepeso = IMC entre 25 e 29,99 kg/m²";
		}else if( calcularIMC() < 35.0){
			laudo = "Obesidade grau I = IMC entre 30 e 34,99 kg/m²";
		}else if( calcularIMC() < 40.0){
			laudo = "Obesidade grau II = IMC entre 35 e 39,99 kg/m²";
		}else {
			laudo = "Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²";
		}
		return laudo;
	
	}

}
