public class Singer extends Person{
    private String bandName;

    public Singer(){}

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
    public void sing(){
        System.out.println("can sing");

    }

    @Override
    public String toString() {
        return  "Singer\n"+super.toString()+
                "\nbandName: " + bandName
              ;
    }
}
