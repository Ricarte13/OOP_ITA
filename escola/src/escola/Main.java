package escola;

public class Main {

	public static void main(String[] args) {
		
		Aluno vinicius = new Aluno();
		
		vinicius.bim1 = 70;
		vinicius.bim2 = 60;
		vinicius.bim3 = 80;
		vinicius.bim4 = 70;

		System.out.println("Media: " + vinicius.media());
		System.out.println("Passou de ano? " + vinicius.passouDeAno());
	}

}
