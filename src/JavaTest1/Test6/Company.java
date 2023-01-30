package JavaTest1.Test6;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Company {
	private int companyId;
	private String companyName;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	
	
	public static void main(String[] args) {
		Gson gson = new Gson();
		gson = new GsonBuilder().setPrettyPrinting().create();
		
		Company company = new Company(100
				, "Apple"
				, "Apple Computer Inc. 1 infinite Loop"
				, "Cupertino"
				, "CA"
				, "95014");

		System.out.println(gson.toJson(company));
		
//		JsonObject jObject = new JsonObject();
//		jObject.addProperty("companyId", company.companyId);
//		jObject.addProperty("companyName", company.companyName);
//		jObject.addProperty("address", company.address);
//		jObject.addProperty("city", company.city);
//		jObject.addProperty("state", company.state);
//		jObject.addProperty("zipCode", company.zipCode);
//		
//		String cp = gson.toJson(jObject);
//		
//		System.out.println(cp);
	}
}


