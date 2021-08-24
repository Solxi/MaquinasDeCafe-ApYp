package maquinasDeCafe;

public class VasoDeCafe {
	
	private boolean lleno = false;
	
	public boolean estaLleno()	{
		return this.lleno;
	}

	public VasoDeCafe(boolean lleno) {
		super();
		this.lleno = lleno;
	}

	@Override
	public String toString() {
		return "VasoDeCafe [lleno=" + lleno + "]";
	}

}
