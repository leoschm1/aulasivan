package Aula5;

public class Aula {

	public String inverter(String s) {
		char[] chars = s.toCharArray();
		char[] chars2 = new char[chars.length];

		int count = (chars.length - 1);

		for (char c : chars) {
			System.out.println(c);
			chars2[count] = c;
			count--;
		}
		return new String(chars2);
	}

}
