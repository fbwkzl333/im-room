package javatutorials2;

public class Array_method {
	public static String[] bMebers(){
		String[] member = {"ȫ�浿","�۸۸�","���̸�","������","�������̟�"};
		return member;
	}
	
	public static void main(String[] args) {
		String[] member = bMebers();
		
		for(int i=0; i <member.length; i++)
		{
		System.out.println(member[i]);
		}
	}

}
