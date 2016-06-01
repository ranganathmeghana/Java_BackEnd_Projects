
public class UserExceptions {

	private int accNo;
	private String custId;
	private String custName;
	private double balance;


	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amt){
		Double sum;
		sum=amt+balance;
	}

	public void withdraw(double amt){
		double minReqBalance=500;
		if(getBalance()-amt>minReqBalance){
			this.balance=getBalance()-amt;
		}
		else{

			try {
				throw new NotSufficientBalanceException("Insufficient balance");
			} catch (NotSufficientBalanceException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      UserExceptions obj=new UserExceptions();
      obj.setBalance(400.0);
      obj.withdraw(600.0);
      

	}

}


class NotSufficientBalanceException extends Exception
{
public NotSufficientBalanceException(String msg) {
	// TODO Auto-generated constructor stub
super(msg);
}

}

