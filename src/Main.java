public class Main {
    public static void main(String[] args) {
Dancer dancer=new Dancer();
dancer.setName("Dias");
dancer.setDesignation("Dancer");
dancer.setGroupName("WWW");
        System.out.println("\n"+dancer);
dancer.learn();
dancer.walk();
dancer.eat();
Singer singer = new Singer();
singer.setName("Bek");
singer.setDesignation("Singer");
singer.setBandName("OOP");
        System.out.println("\n"+singer);

singer.learn();
singer.walk();
singer.eat();
Programmer programmer=new Programmer();
programmer.setName("Mira");
programmer.setDesignation("Coder");
programmer.setCompanyName("Microsoft");
        System.out.println("\n"+programmer);

programmer.learn();
programmer.walk();
programmer.eat();





















    }
}