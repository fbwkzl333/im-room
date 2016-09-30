package javatutorials2;

public class Method2 {
	public static String numbering(int init, int limit) {
		//		  Data타입  메소드 이름
		int i = init;
		String output = "";
		while (i < limit){
			output += i;
			i++;
		}
		return output;
	}
	
	
	public static void main(String[] args) {
		//		 void 받는다 = 메소드들의 리턴한 값을 담는다.
		String result = numbering(1, 5);
		// numbering메소드의 return 값을 result로 받음
		System.out.println(result);
	}

}

/* 실행
 * 1234
 */
