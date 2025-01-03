
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition){
        Money money = new Money(this.euros + addition.euros, this.cents + addition.cents);
        
        return money;
    }
    
    public boolean lessThan(Money compared){
        if(this.euros() == compared.euros()){
            if(this.cents() == compared.cents()){
                return false;
            }
            else if (this.cents() < compared.cents()){
                return true;
            }
        } else if (this.euros() < compared.euros()){
            return true;
        }
        return false;
    }
    
    public Money minus(Money decreaser){
        int euros = this.euros() - decreaser.euros(), cents = this.cents() - decreaser.cents();
        
        if(this.euros() - decreaser.euros() < 0){
            euros = 0;
        } 
        
        if(this.cents() - decreaser.cents() < 0){
            cents = 0;
        }
        
        Money money = new Money(euros, cents);
        
        return money;
    }
}
