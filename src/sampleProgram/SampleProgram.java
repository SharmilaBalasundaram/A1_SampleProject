package sampleProgram;

public class SampleProgram {

	// constructor test
		public static int i;
		public static int j;
		
		public static String a;
		
		SampleProgram(){
			i=5;
			j=5;
			a="Vcentry";
		}
		
		SampleProgram(int i,int j,String a){
		this.i=i;
		this.j=j;
		this.a=a;
		}
		
		public static void main(String[] args) {
			
		
			int k=i+j;
			System.out.println(k);
			System.out.println(a);
			
			SampleProgram x=new SampleProgram();
			int m=i+j;
			System.out.println(m);
			System.out.println(a);
			
			SampleProgram y=new SampleProgram(10,10,"Guindy");
			int n=i+j;
			System.out.println(n);
			System.out.println(a);

		}
		
		
	}



