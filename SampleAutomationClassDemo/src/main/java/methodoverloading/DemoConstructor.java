package methodoverloading;


public class DemoConstructor {
		// TODO Auto-generated method stub
		int a,b,c=0;
		public  DemoConstructor( int a,int b)
		{
			//System.out.println("display");
			 c=a+b;
			
		}
	public void print() {
		System.out.println(c);
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			DemoConstructor cd=new  DemoConstructor (3,5);
			 cd.print();

	}

}
