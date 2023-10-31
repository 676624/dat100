package objekter;

public class Student {
	private int studNr;
	private String fornavn;
	private String etternavn;
	
	public int getStudNr() {
		return this.studNr;
	}
	public String getFornavn() {
		return this.fornavn;
	}
	public String getEtternavn() {
		return this.etternavn;
	}

	public void setStudNr(int studNr) {
		this.studNr = studNr;
	}
	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}
	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}
	
	public Student(int studNr, String fornavn, String etternavn) {
		this.studNr = studNr;
		this.fornavn = fornavn;
		this.etternavn = etternavn;
	}
	
	public void skriv() {
		System.out.println("nr: " + studNr + " fornavn: " + fornavn + " etternavn: " + etternavn);
	}
}
