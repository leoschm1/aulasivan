public class Q1{
	public boolean q1(int[] n){

		if([0] == n[n.lenght -1]){
			return true;
		} 
		return false;
	}
}

//Se fossem strings
public class Q2{
	public boolean q2(String[] n){

		if([0].equals(n[n.lenght -1]){
			return true;
		} 
		return false;
	}
}

@TESTQ1

public class Q1Test {

	@Test
	public void Q1Test(){
		//Instanciar objeto
		Q1 q = new Q1();
		int[] n = {2,6,6,9,2};
		boolean result = q.q1(n);
		Assert.assertTrue(result);
	}
}


public class Q2{

	public int[] q2(int[] n){

		int m[] = new int[n.lenght];

		int counter = n.lenght -1;
		for(int i : m){
			m[counter] =1;
			counter--;
		}
		return m;
	}
}


public class Q2Test {
	@Test

	public void Q2Test(){
		Q2 q = newQ2(){
			int[] n = {1,2,3};
			int[] result = q.q2(n);
			int[] expected = {3,2,1};

			Assert.assertArraysEquals(expected, result);
		}
	}
}


public class Q3{

	public boolean q3 (int[] n){
		int soma = 0;
		for (int i : n){
			if(i == 3){
				soma = soma +i;
			}
		}
		return soma == 9;
	}
}


public class Q3Test(){

	@Test
	public void q3Test(){

		Q3 q = new Q3();
		int[] n = {3,5,3,2,2,3};
		boolean result q.q3(n);
		Assert.assertTrue(result);
	}
}


public class Q4 {

	public int q4(int[] n){

		int result = n[0];

		for(i : n){

			if(i < result){
				result = i;
			}
		}
		return result;
	}
}


public class Q4Test(){

	@Test
	public void q4Test(){

		Q4 q = new Q4();
		int[] n = {3,5,3,2,2,3};
		int result q.q4(n);
		Assert.assertTrue(result == 2);
	}
}
