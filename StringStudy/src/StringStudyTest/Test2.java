package StringStudyTest;

public class Test2 {
	public static void main(String[] args) {
		String str1 = new String("aaa");//s1ָ����ڴ洴�����¿ռ�
		String str2 = new String("aaa");//s2ָ����ڴ洴�����¿ռ�
		String str3 = "aaa";//���ҳ������Ƿ���"aaa",���������s3ָ��û���򴴽�
		String str4 = "aaa";//���ҳ������Ƿ���"aaa",���������s4ָ��û���򴴽�
		
		System.out.println(str1 == str2);//false s1��s2�����õĵ�ַ�ǲ�ͬ�Ŀռ�
		System.out.println(str1 == str3);//false s1ָ��ѿռ䣬s3ָ������
		System.out.println(str3 == str4);//true s3��s4���õ�ͬ�ǳ������е���ͬ���ݿռ�
	}
}
