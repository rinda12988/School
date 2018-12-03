public class Name {
    private String firstName;
    private String lastName;

    public Name(String first, String last) {
        firstName = first;
        lastName = last;
    }
   
	public String toString() {
        return firstName + " " + lastName;
    }

    public int compareTo(Name n) {
        int lastComp = n.lastName.compareTo(n.lastName);
        if (lastComp != 0)
            return lastComp;
        else
            return firstName.compareTo(firstName);
    }
}