package epam.Task_4;

public class Compund_Interest {

	public double calculate_compound_interest(double principal_amount,double period_of_time,double rate_of_interest_per_year)
	{
		double compound_interest_amount=principal_amount*Math.pow(1.0+rate_of_interest_per_year/100.0,period_of_time)-principal_amount;
		return compound_interest_amount;
	}
}
