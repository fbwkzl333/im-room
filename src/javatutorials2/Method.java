/* method �� define(�����), call (ȣ��,���)
 * ��Ȱ��, �ڵ差��, �������� ����
 */

package javatutorials2;

public class Method {
	public static void numbering(){
/* public : ����Ŭ������ ���ٴ� �����Ͽ� ��� Ŭ�������� �� �޼ҵ带 ��밡��
 	void  : ��ȯ�ϰڴ� (Return)
numbering() : �޼ҵ� �̸�
ffff
define �޼ҵ�(�μ�) �μ��� ������ ȣ��κ��� �޼ҵ�()�� �μ� ������ ���ƾ���
 */
		int i = 0;
		while ( i <10 ) {
			System.out.println(i);
			i++;
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
/*					    �޼ҵ�
 * 
 */
		numbering(); // numbering �޼ҵ� ȣ��
	}
	
}
