package tratamento_execoes.entities;

import tratamento_execoes.exceptions.ExceedsLimit;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
		
	}
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public Double getBalance() {
		return balance;
	}

	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw(Double amount) throws ExceedsLimit {
		if(amount > withdrawLimit) {
			throw new ExceedsLimit("Withdraw error: The amount exceeds withdraw limit");
		}
		if(amount > balance) {
			throw new ExceedsLimit("Withdraw error: Not enough balance");
		}
		balance -= amount;
	}
	
	
	
	
}
