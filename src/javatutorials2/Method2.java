package javatutorials2;

public class Method2 {
	public static String numbering(int init, int limit) {
		//		  DataŸ��  �޼ҵ� �̸�
		int i = init;
		String output = "";
		while (i < limit){
			output += i;
			i++;
		}
		return output;
	}
	
	
	public static void main(String[] args) {
		//		 void �޴´� = �޼ҵ���� ������ ���� ��´�.
		String result = numbering(1, 5);
		// numbering�޼ҵ��� return ���� result�� ����
		System.out.println(result);
	}

}

/* ����
 * 1234
 */
