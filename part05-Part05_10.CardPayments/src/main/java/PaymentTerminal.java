
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
        // register initially has 1000 euros of money
    }

    public double eatAffordably(double payment) {
        double affordableMeal = 2.50;
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (affordableMeal <= payment) {
            this.money = this.money + affordableMeal;
            this.affordableMeals = this.affordableMeals + 1;
            return payment - affordableMeal;
            
            
        }
        return payment;
    }

    public double eatHeartily(double payment) {
        double heartyMeal = 4.30;
        if (heartyMeal <= payment) {
            this.money = this.money + heartyMeal;
            this.heartyMeals = this.heartyMeals + 1;
            return payment - heartyMeal;
            
        }        
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        return payment;
    }

    public boolean eatAffordably(PaymentCard card) {
        double affordableMeal = 2.50;
        if (card.balance() >= affordableMeal) {
            card.takeMoney(affordableMeal);
            this.affordableMeals = this.affordableMeals + 1;
            return true;
                       
        }
        return false;
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
    }

    public boolean eatHeartily(PaymentCard card) {
        double heartyMeal = 4.30;
        if (card.balance() >= heartyMeal) {
            card.takeMoney(heartyMeal);
            this.heartyMeals = this.heartyMeals + 1;
            return true;
                       
        }
        return false;
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
    }
    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            this.money = this.money + sum;        
        }


    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
