
public class Driver {
      private int counter = 5;
      private Integer[] listofNumber = new Integer();
	public static void main(String[] args) {

		for (int i=0; i<counter; i++){
				System.out.println("Hello world from Java Programming");
				listOfNumber[i]= ++i;
		}
		for(Integer list : listOfNumber){
				System.out.println(list);
		}
		
	}

}
