package java.org.cars.example;

public class HDFCBank implements Bank{
    @Override
    public float calculateInterest(float loanAmnt) {
        return (loanAmnt*8)/100;//8%
    }
}
