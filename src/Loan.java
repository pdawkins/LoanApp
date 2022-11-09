import java.time.LocalDate;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private LocalDate loanDate = LocalDate.now();

    public Loan(){}

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public LocalDate getLoanDate() { return loanDate; }

    public void setLoanDate(LocalDate loanDate) {this.loanDate = loanDate; }

    public int getNumberOfYears() { return numberOfYears; }

    public void setNumberOfYears(int numberOfYears) { this.numberOfYears = numberOfYears;}

    public double getLoanAmount() { return loanAmount;}

    public void setLoanAmount(double loanAmount) { this.loanAmount = loanAmount; }

    public void printInfo(){
        System.out.println("Annual interest rate is "+ annualInterestRate);
        System.out.println("Number of years is "+ numberOfYears);
        System.out.println("Loan Amount is "+ loanAmount);
        System.out.println("Loan Date is "+ loanDate.toString());
    }
}
