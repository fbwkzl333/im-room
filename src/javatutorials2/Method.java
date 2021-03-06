/* method 의 define(만든다), call (호출,사용)
 * 재활용, 코드량↓, 유지보수 유리
 * 매개변수(parameter), 인자(argument)
 public : 상위클래스가 같다는 전제하에 모든 클래스들은 이 메소드를 사용가능
 	void  : 반환하겠다 (Return)
numbering() : 메소드 이름
define 메소드(인수) 인수의 개수는 호출부분의 메소드()안 인수 개수는 같아야함
 */
 

package javatutorials2;

public class Method {
	public static void numbering(){
		int i = 0;
		while ( i <10 ) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void numbering(int init, int limit) {
		//						매개변수(parameter)
		int i = init;
		while (i < limit) {
			System.out.println(i);
			i++;
		}
	}
	

	
	
	
	public static void main(String[] args) {
/*					    메소드
 * 
 */
		numbering(); // numbering 메소드 호출
		numbering(3, 5); // numbering(init, limit)
		//       인자(argument)
	}
	
}
