package generation.italy.shop;

public class Prodotto {
	
	private int codice;
	private String nome;
	private String marca;
	private int prezzo;
	private int iva;
	
	
	public Prodotto(int codice, String nome, String marca, int prezzo, int iva) {
		
		this.codice = codice;
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.iva = iva;
		
	}
	
	public int getCodice() {
		return codice;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.nome = marca;
	}
	
	public int getPrezzo() {
		return prezzo;
	}
	
	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}
	
	public int getIva() {
		return iva;
	}
	
    public int prezzoIva() {
		
		int calcoloIva =  prezzo * iva / 100;
		return prezzo + calcoloIva;
	}
    
    @Override
	public String toString() {
    	return "Prodotto: " + getMarca() + " " + getNome()
    	+  "\nCosto senza iva costa: " + getPrezzo()
    	+ "\nConsto con iva costa: " + prezzoIva();
    }

}
