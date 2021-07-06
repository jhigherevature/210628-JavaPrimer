package encapsulation;

public class Account {
	private String accountHolder;
	private double accountTotal;
	private long accountId;
	
	/*
	 * Getters and Setters are a convention used to
	 * read/access or change/mutate the fields(variables)
	 * on a class
	 * 
	 * getters and setters use the following naming convention:
	 * get<VariableName>
	 * set<VariableName>
	 */
	public String getAccountHolder() {
		return accountHolder;
	}
	void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	double getAccountTotal() {
		return accountTotal;
	}
	private void setAccountTotal(double accountTotal) {
		this.accountTotal = accountTotal;
	}
	long getAccountId() {
		return accountId;
	}
	void setAccountId(long accountId) {
		this.accountId = accountId;
	}
}
