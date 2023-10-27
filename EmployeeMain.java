package FileHandling;



	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.ObjectOutputStream;

	public class EmployeeMain {

		public static void main(String[] args) throws IOException {
			Employee e1=new Employee(12,"gayathri","kknagar");
			Employee e2=new Employee(13,"ravi","srinagar");
			Employee e3=new Employee(14,"hari","jeyanagar");
		 FileOutputStream fout=new FileOutputStream("output.txt");
		 ObjectOutputStream out=new ObjectOutputStream(fout);
		 out.writeObject(e1);
		 out.writeObject(e2);

		 out.writeObject(e3);
		 out.close();

		}

	}

