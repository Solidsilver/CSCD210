public class Riemann {
	public static void main(String[] args) {
		System.out.println(varFill("3x+x^2-54+sqrt(x-1)", 'x', "3-2"));
	}

	public static String varFill(String equation, char var, String varValue) {
		for (int i = 0; i < equation.length(); i++) {
			if (equation.charAt(i) == var) {
				equation = equation.substring(0, i) + "(" + varValue + ")" + equation.substring(i+1);
			}
		}

		return equation;
	}
}