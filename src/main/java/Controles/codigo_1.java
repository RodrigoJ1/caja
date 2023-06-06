package Controles;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/objetos")
public class codigo_1 {

	
	List<objetos> itemArray = new ArrayList<objetos>();
	  
	  public codigo_1() {
	    itemArray.add(new objetos("Objeto1", 1));
	    itemArray.add(new objetos("Objeto2", 2));
	    itemArray.add(new objetos("Objeto3", 3));
	  }
	  
	  @GET
	  @Produces(MediaType.APPLICATION_JSON)
	  public List<objetos> getItems() {
	    return itemArray;
	  }
	
	  @GET
	  @Path("/{id}")  
	  @Produces({MediaType.APPLICATION_JSON})
	  public objetos getItemById(@PathParam("id") int id) {
		  for(objetos caja: itemArray) {
			  if(caja.getId()==id) {
				  return caja;
			  }
		  }return null;
	  }
}
