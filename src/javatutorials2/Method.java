/* method �� define(�����), call (ȣ��,���)
 * ��Ȱ��, �ڵ差��, �������� ����
 * �Ű�����(parameter), ����(argument)
 public : ����Ŭ������ ���ٴ� �����Ͽ� ��� Ŭ�������� �� �޼ҵ带 ��밡��
 	void  : ��ȯ�ϰڴ� (Return)
numbering() : �޼ҵ� �̸�
define �޼ҵ�(�μ�) �μ��� ������ ȣ��κ��� �޼ҵ�()�� �μ� ������ ���ƾ���
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
		//						�Ű�����(parameter)
		int i = init;
		while (i < limit) {
			System.out.println(i);
			i++;
		}
	}
	

	
	
	
	public static void main(String[] args) {
/*					    �޼ҵ�
 * 
 */
		numbering(); // numbering �޼ҵ� ȣ��
		numbering(3, 5); // numbering(init, limit)
		//       ����(argument)
	}
	
}
