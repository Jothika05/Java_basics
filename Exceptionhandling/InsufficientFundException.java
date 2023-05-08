package Exceptionhandling;

public class InsufficientFundException extends Exception {
	double amount;
	InsufficientFundException(double awt){
		amount=awt;
	}
	

}
