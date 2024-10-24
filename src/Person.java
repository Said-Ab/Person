public class Person {
    private String name;
    private String designation;
    public Person(){}
    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String getDesignation(){
        return designation;
    }
    public void learn (){
        System.out.println("Learn english");
    }
    public void walk(){
        System.out.println("can walk");
    }
    public void eat(){
        System.out.println("can eat");
    }

    @Override
    public String toString() {
        return
                "name: " + name +
                "\ndesignation: " + designation
                ;
    }
}
