// .length �� �迭�� ���� ����

package javatutorials2;

public class array2 {

	public static void main(String[] args) {
	// String[] classGroup = { "������", "������", "���̶�", "�̰���"};
		String[] classGroup = new String[4];
	//		���ڿ� �迭 ����      = �ν��Ͻ� ����[4��(length)]
		classGroup[0] = "������";  // [0] = "" ����
		System.out.println(classGroup.length);  // �迭.�迭�� ������ �ִ� ������ ����(4)
		//	length =[] �ȿ� ��� ����� �� �ִ���, ��� �ִ���
		//	���� ����
		
		/* length = 4
		 * element = ������,������,���̶�,�̱���
		 * index = 0,1,2,3
		 */
		
		classGroup[1] = "������";  
		System.out.println(classGroup.length);  
		classGroup[2] = "���̶�";  
		System.out.println(classGroup.length);
		classGroup[3] = "�̰���";  
		System.out.println(classGroup.length);
	}

}

/* ������ ���� : 
		4
		4
		4
		4		*/