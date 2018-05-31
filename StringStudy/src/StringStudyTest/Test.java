package StringStudyTest;

import java.util.Arrays;

import StringStudy.MyString;

public class Test {
	public static void main(String[] args) {
		char[] cs = new char[] {'a','b','c','d','e'};
		MyString ms1 = new MyString();
		MyString ms2 = new MyString(cs);
		
		System.out.println(ms1.length());
		System.out.println(ms2.length());
		
		ms1.print();
		ms2.print();
		
		MyString ms3 = new MyString(new char[] {'f','g','h'});
		MyString ms4 = ms2.concat(ms3);
		ms4.print();
		
		ms2.subString(2).print();
		//System.out.println(ms2.subString(2));
		
		MyString ms5 = ms2.subString(2, 4);
		ms5.print();
		
		ms2.contains('a');
		
		ms2.indexOf('c');
		
		MyString ms6 = new MyString(new char[]{'a','a','a','.','b','b','b','.','c','c','c',});
		for (int i = 0; i < ms6.split('.').length; i++) {
			ms6.split('.')[i].print();
		}
	}
}
