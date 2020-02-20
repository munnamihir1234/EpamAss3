package epam.Task_4;

public class GetHouseTypeMaterial {

	public Total_Cost getPlan(String house_type)
	{
		if(house_type==null)
			return null;
		if(house_type.equalsIgnoreCase("standard material")) {  
            return new Standard_Material();  
          }   
      else if(house_type.equalsIgnoreCase("Abovestandard material")){  
           return new Above_StandardMaterial();  
       }   
     else if(house_type.equalsIgnoreCase("Highstandard material")) {  
           return new HIghStandard_Material();  
     }
     else if(house_type.equalsIgnoreCase("HighstandardFullautomatic")) {  
   	  return new HIghStandard_and_FullAutomatic();
     }
 return null;  
}  
}
