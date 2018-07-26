
public class WorkingWithStringLoop {

    public static void main(String[] args) {
        String name = "Kongdumri2018";
        System.out.println(name.substring(1));
        System.out.println(name.substring(5, 9));
          while(name.length()>0) {
              System.out.println(name.substring(1));
              name = name.substring(1);
              
          }
    }
}
