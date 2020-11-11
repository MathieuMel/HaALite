package fr.haalite.business;

public class Investigateur {

	private int idInvestigateur;
	private String nom;
	private int volonte;
	private int intelligence;
	private int force;
	private int agilite;
	
	
		
	public Investigateur() {
		super();
	}

	
	
	public int getIdInvestigateur() {
		return idInvestigateur;
	}
	
	public void setIdInvestigateur(int idInvestigateur) {
		this.idInvestigateur = idInvestigateur;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getVolonte() {
		return volonte;
	}
	
	public void setVolonte(int volonte) {
		this.volonte = volonte;
	}
	
	public int getIntelligence() {
		return intelligence;
	}
	
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	
	public int getForce() {
		return force;
	}
	
	public void setForce(int force) {
		this.force = force;
	}
	
	public int getAgilite() {
		return agilite;
	}
	
	public void setAgilite(int agilite) {
		this.agilite = agilite;
	}
	
	@Override
	public String toString() {
		return "Investigateur [idInvestigateur=" + idInvestigateur + ", nom=" + nom + ", volonte=" + volonte
				+ ", intelligence=" + intelligence + ", force=" + force + ", agilite=" + agilite + "]";
	}
	
	
}
