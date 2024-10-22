public class Dancer extends Person{
    String groupName;
    public Dancer(){}

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public void dance(){
        System.out.println("can dance");
    }

    @Override
    public String toString() {
        return "Dancer\n" +
                 super.toString()+
                "\ngroupName: " + groupName
                ;
    }
}
