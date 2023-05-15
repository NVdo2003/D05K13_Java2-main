package day4.design_pattern.baitap.bai7_1;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Doctor", true, "Premium");
        double serviceExpense = 100.0;
        double productExpense = 50.0;

        Visit visit = new Visit(customer, serviceExpense, productExpense);
        System.out.println(visit);

        double totalExpense = visit.getTotalExpense();
        System.out.println("Total Expense: $" + totalExpense);
    }
}
