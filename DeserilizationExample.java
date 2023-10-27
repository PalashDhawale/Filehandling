package FileHandling;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserilizationExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fin=new FileInputStream("output.txt");
		ObjectInputStream oin=new ObjectInputStream(fin);
		Employee e=(Employee) oin.readObject();

       System.out.println(e.geteId());	
       System.out.println(e.geteName());		

       System.out.println(e.getAddress());	
       System.out.println("================");
   	Employee e1=(Employee) oin.readObject();

    System.out.println(e1.geteId());	
    System.out.println(e1.geteName());		

    System.out.println(e1.getAddress());		



	}

}