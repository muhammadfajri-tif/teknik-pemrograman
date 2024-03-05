package store;

public class Freelancer extends AbstractStoreEmployee{
	private int taskFinished;
	private final int totalTask;
	
	/**
	 * This is an argument constructor which initializes all the instance
	 * variables
	 *
	 * @param numberOfHoursWorked - The parameter Number of hours worked is
	 *                            passed.
	 * @param hourlyRate          - The parameter Hourly rate of the Employee in dollars
	 *                            is passed.
	 * @param storeDetails        - The parameter Details of the Store is passed.
	 * @param basePay             - The parameter Base pay of the Employee in dollars is
	 *                            passed.
	 * @param employeeName        - The parameter Full name of the Employee is passed.
	 * @param taskFinished        - The parameter total task have been done by the Freelancer
	 * @param totalTask           - The parameter total task should be work by the Freelancer
	 */
	public Freelancer(double numberOfHoursWorked, double hourlyRate, String storeDetails, double basePay,
	                  String employeeName, int taskFinished, int totalTask) {
		super(numberOfHoursWorked, hourlyRate, storeDetails, basePay, employeeName);
		this.taskFinished = taskFinished;
		this.totalTask = totalTask;
	}
	
	/**
	 * Returns calculated Pay of the Freelance. The calculated pay is the
	 * sum of total task finished, commission rate, and number of hours worked and hourly rate.
	 *
	 * @return - This method returns Payment of the Freelance.
	 */
	@Override
	public double calculatePay() {
		return ((double) taskFinished / totalTask) + COMMISSION_RATE +
				       (super.getHourlyRate() * super.getNumberOfHoursWorked());
	}
	
	/**
	 * Checks if the employee should be awarded with a promotion.
	 *
	 * @return - This method returns boolean the eligibility status for
	 * promotion for an employee.
	 */
	@Override
	public boolean checkPromotionEligibility() {
		return calculatePay() > 25000.0;
	}
	
	/**
	 * Freelancer has no annual salary.
	 */
	@Override
	public double annualSalary() {
		return -1;
	}
	
	@Override
	public boolean isSteadyPosition() {
		return true;
	}
	
	
	public void setTaskFinished(int taskFinished) {
		this.taskFinished = Math.min(taskFinished, getTotalTask());
	}
	
	public int getTaskFinished() {
		return taskFinished;
	}
	
	public int getTotalTask() {
		return totalTask;
	}
	
	@Override
	public String toString() {
		return  super.toString() + "Total task done: " + getTaskFinished() + "/" + getTotalTask();
	}
}
