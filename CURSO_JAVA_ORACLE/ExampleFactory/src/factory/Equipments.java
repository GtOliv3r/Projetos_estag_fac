package factory;

public class Equipments implements IEquipments{
	
	private int idEquiment;
	private String description;
	
	
	
	
	public Equipments(int idEquipment) {
		this.idEquiment = idEquipment;
		
	
	}


	@Override
	public String getFullDescription() {
		return idEquiment + " - " + description;
	}


	public int getIdEquiment() {
		return idEquiment;
	}


	public void setIdEquiment(int idEquiment) {
		this.idEquiment = idEquiment;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	

	
	
}

