// for-each 배열 순서대로 읽기

package javatutorials;

public class array4 {

	public static void main(String[] args) {
		String[] members = { "최진혁", "최유빈", "한이람"};
		for (String e : members){
			//       콜론 뒤의 데이터값을 동작할때 마다 하나씩
			//     e에 담아주세요
			System.out.println(e+"이 상담을 받았습니다");
			System.out.println(e+"이 상담을 받았습니다");
		}

	}

}


/* 실행
최진혁이 상담을 받았습니다
최유빈이 상담을 받았습니다
한이람이 상담을 받았습니다
*/
