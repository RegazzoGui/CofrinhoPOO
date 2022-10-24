package classes;

import java.util.Objects;

public class Euro extends Moeda {
	//Atributo
	public Euro(double val) {
		super(val);
	}
	
	//Métodos
	@Override
	public void info() {
		System.out.println("Euro: " + getValor());
		
	}
	
	double total = 0.0;
	@Override
	public double converter() {
		total = getValor() * 5.10;
		return total;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(total);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Euro other = (Euro) obj;
		return Double.doubleToLongBits(total) == Double.doubleToLongBits(other.total);
	}

}
