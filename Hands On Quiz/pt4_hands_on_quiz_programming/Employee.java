

public class Employee implements ComputeSalary{
	private String name;
	private int id;
	private int computeDailyRate;
	private int computeMonthlyRate;
	private Department department;
	private int rate;
	private int hours;
	
	public Employee(String name, int id, Department department, int hours, int rate) {
		this.name = name;
		this.id = id;
		this.rate = rate;
		this.hours = hours;
		this.department = department;
	}
	
	public Employee(String string, int i, Department manufacturing) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public int getId() {
		return id;
	}
	
	@Override
	public Department getDepartment() {
		return department;
	}
	
	@Override
	public int getcomputeDailyRate() {
		return hours * rate;
	}
	
	@Override
	public int getcomputeMonthlyRate() {
		return getcomputeDailyRate() * 30;
	}

	@Override
	public String toString() {
		return "Name: " + name + "\n" + "Id: " + id + "\n" +
	"Salary Daily " + getcomputeDailyRate() + "\n" + 
	"Salary Monthly: " + getcomputeMonthlyRate();
	}

	public int getComputeMonthlyRate() {
		return computeMonthlyRate;
	}

	public void setComputeMonthlyRate(int computeMonthlyRate) {
		this.computeMonthlyRate = computeMonthlyRate;
	}

	public int getComputeDailyRate() {
		return computeDailyRate;
	}

	public void setComputeDailyRate(int computeDailyRate) {
		this.computeDailyRate = computeDailyRate;
	}

}
