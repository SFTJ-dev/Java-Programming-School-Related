public class CompoundInterestCalculator {
    private double principal;
    private double rate;
    private int timeCompounded;
    private int years;

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setTimeCompounded(int timeCompounded) {
        this.timeCompounded = timeCompounded;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public double getPrincipal() {
        return principal;
    }

    public double getRate() {
        return rate;
    }

    public int getTimeCompounded() {
        return timeCompounded;
    }

    public int getYears() {
        return years;
    }

    public double computeCompoundInterest() {
        return principal * Math.pow(1 + rate / timeCompounded, timeCompounded * years);
    }
}
