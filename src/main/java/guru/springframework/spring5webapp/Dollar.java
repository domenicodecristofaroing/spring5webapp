package guru.springframework.spring5webapp;

public class Dollar {
    private int amount;

    public Dollar(int amount){
   this.amount = amount;
    }

    Dollar times(int multiplier){
     //amount = amount * 2 ;

     return new Dollar(amount * multiplier);
    }

    public boolean equals (Object object){
        Dollar dollar = (Dollar) object;

        return amount == dollar.amount;
    }
}
