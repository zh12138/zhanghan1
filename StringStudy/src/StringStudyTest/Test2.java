package StringStudyTest;

public class Test2 {
	public static void main(String[] args) {
		String str1 = new String("aaa");//s1指向堆内存创建的新空间
		String str2 = new String("aaa");//s2指向堆内存创建的新空间
		String str3 = "aaa";//查找常量池是否有"aaa",如果有则让s3指向，没有则创建
		String str4 = "aaa";//查找常量池是否有"aaa",如果有则让s4指向，没有则创建
		
		System.out.println(str1 == str2);//false s1和s2中引用的地址是不同的空间
		System.out.println(str1 == str3);//false s1指向堆空间，s3指向常量池
		System.out.println(str3 == str4);//true s3和s4引用的同是常量池中的相同数据空间
	}
}
