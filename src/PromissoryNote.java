import java.util.ArrayList;
import java.util.HashMap;

public class PromissoryNote {
    private String name;
    private HashMap<String, Double> loans;

    public PromissoryNote (String name) {
        this.name = name;
        this.loans = new HashMap<>();
    }

    public void setLoan (String toWhose, double value) {
        this.loans.put(toWhose, value);
    }

    public double howMuchIsTheDebt (String whose) {
        if (this.loans.containsKey(whose)) {
            return this.loans.get(whose);
        }
        return 0;
    }

}
