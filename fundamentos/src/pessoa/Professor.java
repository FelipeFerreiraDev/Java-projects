package pessoa;

public class Professor extends Pessoa {
	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	String imprimeDados() {
		System.out.print(super.imprimeDados());
		return " Você é professor";
	}
	
}
