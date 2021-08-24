package maquinasDeCafe;

public abstract class MaquinaDeCafe {
	
	private int gramosDeCafe;
	private static final int GRAMOS_POR_CAFE = 10;
	private static final int CANTIDAD_INICIAL_DE_CAFE = 1000;
	
	
	public MaquinaDeCafe() {
		super();
		this.gramosDeCafe = CANTIDAD_INICIAL_DE_CAFE;
	}
	
	public VasoDeCafe servirCafe() {
		if(this.puedeServir()) {
			this.restarCafe();
			return new VasoDeCafe(true);
		}
		return new VasoDeCafe(false);
	}
	
	public boolean puedeServir() {
		return this.gramosDeCafe >= GRAMOS_POR_CAFE;
	}
	
	protected void restarCafe() {
		this.gramosDeCafe -= GRAMOS_POR_CAFE;
	}

	public int getGramosDeCafe() {
		return this.gramosDeCafe;
	}

}
