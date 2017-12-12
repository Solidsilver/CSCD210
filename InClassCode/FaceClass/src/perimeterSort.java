import java.util.Comparator;

public class perimeterSort implements Comparator<Face> {
	public int compare(Face f1, Face f2) {
		Double per1 = f1.getPerimiter();
		Double per2 = f2.getPerimiter();
		return per1.compareTo(per2);
	}
}
