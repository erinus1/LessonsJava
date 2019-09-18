package Module6_4;

public class Passport {
    public String seria;
    public int number;

    public Passport(String seria, int number) {
        this.seria = seria;
        this.number = number;
    }

    public boolean equals(Passport passport) {
        if (passport == this) {
            return true;
        }
        if (passport == null || passport.getClass() != this.getClass()) {
            return false;
        }

        Passport passport1 = (Passport) passport;
        return (this.getClass() == passport1.getClass() || passport1 != null && passport1.equals(passport));
    }


}