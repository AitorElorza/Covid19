package isp;

public class Pertsona implements InterfacegetYears {
	String name,adina;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdina() {
		return adina;
		
	}

	public void setAdina(String adina) {
		this.adina = adina;
	}

	
	public int getYears() {
		return Integer.parseInt(adina);
	}
}