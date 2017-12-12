import java.util.Random;
import java.util.Arrays;
public class FaceTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Face[] faces = new Face[5];
		Random rnd = new Random();
		for (int i = 0; i < faces.length; i++) {
			faces[i] = new Face(rnd.nextInt(20), rnd.nextInt(20), rnd.nextInt(20), rnd.nextInt(20), rnd.nextInt(20), rnd.nextInt(20), rnd.nextInt(20), rnd.nextInt(20), rnd.nextInt(20));
			
		}
		/*printArray(faces);
		Arrays.sort(faces, new perimeterSort());
		printArray(faces);*/
		
		String[] names = {"Larry", "Bill", "Tom", "Brian", "Wes"};
		System.out.println(linearSearch(names, "Brian"));
		System.out.println(linearSearch(faces, new Face(3, 4, 30, 1, 44, 4.22, 4, 3, 1)));
		
	}
	
	public static int linearSearch(Comparable[] a, Comparable obj) {
		for (int ix = 0; ix < a.length; ix++) {
			if (a[ix].compareTo(obj) == 0) {
				return ix;
			}
		}
		return -1;
	}
	
	public static void printArray(Face[] fc) {
		for (int ix = 0; ix < fc.length; ix++) {
			System.out.println(fc[ix]);
		}
		System.out.println();
	}

}
