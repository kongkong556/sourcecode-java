
public class WorkingWithString {

    public static void main(String[] args) {
        String name = "Kongdumri";
        int age = 22;
        String result = name + " " + age; //1
        
        StringBuffer buffer = new StringBuffer(); //2
        buffer.append(name).append(" ").append(age);
        
        StringBuilder builder = new StringBuilder(); //3
        builder.append(name).append(" ").append(age);
        
        String result2 = String.format("%s %d", name, age); //4
        
        System.out.println(result);
        System.out.println(buffer);
        System.out.println(builder);
        System.out.println(result2);
        int a = 0; 
        int b = 0;
        int c = 0;
        
        a = c++;
        b = ++a;
        c++;
        b = ++c + a++;
        a = --b + c++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        int exponent = 2;
        int x1 = 2;
        int x2 = 0;
        int y1 = 1;
        int y2 = 0;
        int z1 = 3;
        int z2 = 6;
        int num1 = (x1 - x2);
        int num2 = (y1 - y2);
        int num3 = (z1 - z2);
        double sum1 = Math.pow(num1, exponent);
        double sum2 = Math.pow(num2, exponent);
        double sum3 = Math.pow(num3, exponent);
        double distance = Math.sqrt(sum1+sum2+sum3);
        System.out.println(distance);
        
    }

}
