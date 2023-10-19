package model.entities;

import model.exceptions.DomainExceptionFixacao;

public class AccountFixacao {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public AccountFixacao() {
	}

	public AccountFixacao(Integer number, String holder, Double balance, Double withdrawLimit) {
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

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(Double amount) {
		
		balance += amount;
		
	}	
	public void withdraw(double amount) {
		validatewithdraw(amount);
		balance -= amount;
		
	}
	private void validatewithdraw(Double amount) {
		
		if(amount > getWithdrawLimit()) {
		
			throw new DomainExceptionFixacao("A quantia excede o limite de saque");
		
		}
		if (amount > getBalance()) {
				
			throw new DomainExceptionFixacao("Saldo Insuficiente");
		
		}
	}

	@Override
	public String toString() {
		return "new balance: " 
				+ balance;
	}
	
	
	
}
