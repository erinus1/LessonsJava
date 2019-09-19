package Module6_4;

public class Passport {
    public String seria;
    public int number;

    public Passport(String seria, int number) {
        this.seria = seria;
        this.number = number;
    }

   
    public boolean equals(Passport passport) {
        if (passport == this)
            return true;
        if (passport == null || passport.getClass() != passport.getClass())
            return false;

        Passport p = (Passport) passport;
        if (number != p.number) return false;
        return seria.equals(p.seria);
    }
    @Override
    public int hashCode(){
       int result = seria.hashCode();
       result = 31*result + number;
       return result;
    }
}