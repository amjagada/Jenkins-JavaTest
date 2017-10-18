public class rectangulator{
	public static void main(String args[])
	{
		int length = Integer.parseInt(args[0]);
		int width = Inte  ger.parseInt(args[1]);
		
		rectangle myRect = new rectangle(length,width);
		
		String output = String.format("**** Rectangle Data ****\n\nLength: %d\nWidth: %d\nArea: %d\nPerimeter: %d\n",myRect.length,myRect.width,myRect.getArea(),myRect.getPerimeter());
		
		System.out.println(output);
	}
}