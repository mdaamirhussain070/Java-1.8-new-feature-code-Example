package collection;

import java.util.HashSet;
import java.util.Set;

public class Emp {

    int id;
    String name;


    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    public int hashCode(){
        System.out.println("called");
        return id;
    }

    public boolean equals(Object o){
      //  if(!o.equals(null)){
            Emp e=(Emp)o;
            if(this.id==e.id){
                return true;
            }
            else {
                return false;
            }
     //   }
    //    return false;

    }
}

class Test{
    public static void main(String[] args) {

        Emp e1=new Emp(111,"RAM");
        Emp e2=new Emp(111,"RAM");
        Emp e3=new Emp(111,"RAM");
        Emp e4=new Emp(111,"RAM");

        Set<Emp> s= new HashSet<Emp>();

        s.add(e1);
        s.add(e2);
        s.add(e3);
        s.add(e4);

        System.out.println(s);

        String s1="aamir";
        String ss2="aamir1";
        System.out.println(s1.equals(ss2));

    }
}