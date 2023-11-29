package Section10;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    private Branch findBranch(String name) {
        for (Branch i : branches) {
            if (i.getName().equals(name)) {
                return i;
            }
        }
        return null;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch tempBranch = findBranch(branchName);
        if (tempBranch == null) {
            return false;
        }
        return tempBranch.newCustomer(customerName, initialTransaction);
    }

    public boolean addBranch(String name) {
        if (findBranch(name) != null) {
            return false;
        }
        this.branches.add(new Branch(name));
        return true;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch existingBranch = findBranch(branchName);
        if (existingBranch == null) {
            return false;
        }
        return existingBranch.addCustomerTransaction(customerName, transaction);
    }

    public boolean listCustomers(String branchName, boolean flag) {
        Branch existingBranch = findBranch(branchName);
        if (existingBranch == null) {
            return false;
        }
        int counter = 1;
        System.out.println("Section10.Customer details for branch " + existingBranch.getName());
        for (Customer i : existingBranch.getCustomers()) {
            System.out.println("Section10.Customer: " + i.getName() + "[" + counter + "]");
            counter += 1;
            if (flag) {
                System.out.println("Transactions");
                int cc = 1;
                for (Double y : i.getTransactions()) {
                    System.out.println("[" + cc + "] Amount " + y);
                    cc += 1;
                }
            }
        }
        return true;
    }
}
