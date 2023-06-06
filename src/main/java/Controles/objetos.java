package Controles;

public class objetos {

	String Items;
	int id;
	public objetos(String items, int id) {
		
		this.Items = items;
		this.id = id;
	}
	public String getItems() {
		return Items;
	}
	public void setItems(String items) {
		Items = items;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
