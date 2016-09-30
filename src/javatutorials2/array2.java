// .length 는 배열의 원소 개수

package javatutorials2;

public class array2 {

	public static void main(String[] args) {
	// String[] classGroup = { "최진혁", "최유빈", "한이람", "이고잉"};
		String[] classGroup = new String[4];
	//		문자열 배열 정의      = 인스턴스 생성[4개(length)]
		classGroup[0] = "최진혁";  // [0] = "" 정의
		System.out.println(classGroup.length);  // 배열.배열이 담을수 있는 원소의 개수(4)
		//	length =[] 안에 몇개가 담겨질 수 있느냐, 담겨 있느냐
		//	원소 개수
		
		/* length = 4
		 * element = 최진혁,최유빈,한이람,이구잉
		 * index = 0,1,2,3
		 */
		
		classGroup[1] = "최유빈";  
		System.out.println(classGroup.length);  
		classGroup[2] = "한이람";  
		System.out.println(classGroup.length);
		classGroup[3] = "이고잉";  
		System.out.println(classGroup.length);
	}

}

/* 컴파일 실행 : 
		4
		4
		4
		4		*/