package java.org.cars.example;

public class SBIBank implements Bank{

    @Override
    public float calculateInterest(float loanAmnt) {
        return (loanAmnt*11)/100;//11%
    }
}
