package epam.Task_4;

public class Simple_Interest {
 
	public double calculate_simple_interest(double principal_amount,double period_of_years,double rate_of_interest_per_year)
	
	{
		double simple_interest_amount;
		simple_interest_amount=(principal_amount*rate_of_interest_per_year*period_of_years)/100;
		return simple_interest_amount;
	}
}
