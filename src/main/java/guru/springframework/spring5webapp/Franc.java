package guru.springframework.spring5webapp;

public class Franc {

    private int amount;

    public Franc(int amount){
        this.amount = amount;
    }

    Franc times(int multiplier){
        //amount = amount * 2 ;

        return new Franc(amount * multiplier);
    }

    public boolean equals (Object object){
        Franc franc = (Franc) object;

        return amount == franc.amount;
    }
}
