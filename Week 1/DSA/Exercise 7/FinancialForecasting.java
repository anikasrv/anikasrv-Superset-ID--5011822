public class FinancialForecasting {
    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
        // Base case: If no years are left, return the present value
        if (years == 0) {
            return presentValue;
        } else {
            // Recursive case: Calculate future value for one year and call recursively for remaining years
            return calculateFutureValue(presentValue * (1 + growthRate), growthRate, years - 1);
        }
    }

    public static void main(String[] args) {
        double presentValue = 1000.0;
        double growthRate = 0.05; // 5% growth rate
        int years = 10;

        double futureValue = calculateFutureValue(presentValue, growthRate, years);
        System.out.println("Future Value after " + years + " years: $" + futureValue);
    }
}
