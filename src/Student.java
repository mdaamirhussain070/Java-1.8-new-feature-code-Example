public class Student {

    private int id;
    private String name;
    private int mob;


    public Student(int id, String name, int mob) {
        if (id > 0 && id < 100) {
            this.id = id;
            this.name = name;
            this.mob = mob;
            System.out.println("Object Created");
        } else throw new IdNotFoundExceptio("ID Not found Kindly check");
            System.out.println("Object not created");

    }
    public void show(){
        System.out.println(id+"  "+name+"  "+mob);
    }
}
