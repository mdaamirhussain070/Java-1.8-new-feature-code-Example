public class SingletoClass{

    private static SingletoClass singletoClass=null;


 private  SingletoClass(){
        System.out.println("Constructor called");
        }
    public static  SingletoClass getSingletoClass(){
       synchronized (SingletoClass.class) {if(singletoClass==null) {
           singletoClass = new SingletoClass();
       }

        }
        return singletoClass;
    }
}

