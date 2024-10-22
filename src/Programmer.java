public class Programmer extends Person{
    String companyName;

    public Programmer(){}

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public void code(){
        System.out.println("can code");
    }

    @Override
    public String toString() {
        return  "Programmer\n"+super.toString()+
                "\ncompanyName: " + companyName
                ;
    }
}
