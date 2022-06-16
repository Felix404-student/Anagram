
public  class AndTest {

	public static Boolean are_anagrams(String a, String b){
		if (a.length() != b.length()){
			return false;
		}
		int length = a.length();

		int A = 0;
		int B = 0;

		for (int i = 0; i<length; ++i){
			A += (int)a.charAt(i) - 64;
			B += (int)b.charAt(i) - 64;
		}

		if(A == B){
			return true;
		}
		return false;
	}
}
