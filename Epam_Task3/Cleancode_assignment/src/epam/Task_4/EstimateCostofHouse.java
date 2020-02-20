package epam.Task_4;

public class EstimateCostofHouse {
 
	public double total_amount(String name,double squarefoot)
	{
		GetHouseTypeMaterial house_type_material=new GetHouseTypeMaterial();
		Total_Cost total=house_type_material.getPlan(name);
		total.get_cost_per_sqarefeet();
		double total_amt=total.calculate_Bill(squarefoot);
		return total_amt;
		
	}
}
