package main.Module6_4;

public class Passport {
    public String seria;
    public int number;

    public Passport(String seria, int number) {
        this.seria = seria;
        this.number = number;
    }
   
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (o == null || o.getClass() != this.getClass())
            return false;

        Passport p = (Passport) o;
        if (number != p.number) return false;
        return seria.equals(p.seria);
    }

    @Override
    public int hashCode(){
       int result = seria.hashCode();

       return 31 * result + number;
    }
}