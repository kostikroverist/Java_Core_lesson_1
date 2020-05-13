package ua.striy.lgs;

public class application {
	

		public static void main(String[] args) {
			byte a =105;
			short b = 11123;
			int c=12341245;
			long d = 242415353;
			char e = 0;
			float g=35;
			double r=305;
			boolean j=true;
			
			System.out.println("Byte= "+ Byte.MAX_VALUE);
			System.out.println("Byte= "+ Byte.MIN_VALUE);
			System.out.println("short= "+ Short.MIN_VALUE);
			System.out.println("short= "+ Short.MAX_VALUE);
			System.out.println("long= "+ Long.MIN_VALUE);
			System.out.println("long= "+ Long.MAX_VALUE);
			System.out.println("float= "+ Float.MIN_VALUE);
			System.out.println("float= "+ Float.MAX_VALUE);
			System.out.println("double= "+ Double.MIN_VALUE);
			System.out.println("double= "+ Double.MAX_VALUE);
			
			System.out.println();
			
			int [] array = {23,54,2,1,22,87,94,57,-23 ,233};
			 int max=array[0];
			 int min=array[0];
			 for(int i =0;i< array.length;i++) {
				 if(array[i]>max){
					 max=array[i];
				 }
				 else if(array[i]<min) {
					 min=array[i];
				 }
				 
			 }
			 System.out.println( max + " " + min );
		}
	}

