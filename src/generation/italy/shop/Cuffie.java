package generation.italy.shop;

public class Cuffie extends Prodotto {
	
	private String colore;
	private String connettività;
	
	
	public Cuffie(int codice, String nome, String marca, int prezzo, int iva, String colore, String connettività) {
		
		super(codice, nome, marca, prezzo, iva);
		
		this.colore = colore;
		this.connettività = connettività;
		
	}
	
	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public String getConnetività() {
		return connettività;
	}

	public void setConnettività(String connettività) {
		this.connettività = connettività;
	}
	
	@Override
	public String toString() {
		
		return "Cuffie:"
				+ "\n" + super.toString()
				+ "\nColore: " + getColore()
				+ "\nWireless: " + getConnetività();
	}

}
