package epam.Task_4;

public abstract class Total_Cost {
	protected double cost;
	abstract void get_cost_per_sqarefeet();
		public double calculate_Bill(double squarefoot)
		{
			return (squarefoot*cost);
		}
}
