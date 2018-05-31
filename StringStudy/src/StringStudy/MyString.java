package StringStudy;

public final class MyString {
	//F-属性
	//成员变量,用来存储字符串内容，不利用对象引用直接修改此变量，而是通过方法来影响这个值，故设置为private
	private final char[] content;
	
	//C-构造器
	//无参构造方法
	public MyString() {
		content = new char[0];//创建一个长度为0的char[]数组作为默认值
	}
	
	//带有初始内容的字符串构造器
	public MyString(char[] c) {
		this.content = c;
	}
	
	//M-方法
	//连接字符串：将指定字符连接到此字符串的结尾
	public MyString concat(MyString str) {
		//拼接this.content和str.content
		//创建新的newChar[],长度为两个插入数组长度之和
		char[] newChar = new char[this.content.length+str.content.length];
		for (int i = 0; i < newChar.length; i++) {
			if (i < this.content .length) {
				newChar[i] = this.content[i];
			} else {
				newChar[i] = str.content[i-this.content.length];
			}
		}
		return new MyString(newChar);
	}
	
	//替换字符：返回一个新的字符串，它是通过newChar替换此字符串中出现的所有oldChar得到的
	public MyString replace(char oldChar,char newChar) {
		char[] newStr = new char[this.content.length];
		for (int i = 0; i < content.length; i++) {
			if(this.content[i] == oldChar) {
				this.content[i] = newChar; 
			}
		}
		return null;
	}
	
	//判断包含字符：当且仅当此字符串包含指定的char值时，返回true
	public boolean contains(char c) {
		for (int i = 0; i < content.length; i++) {
			if(this.content[i] == c) {
				System.out.println("true");;
			}
		}
		return true;
	}
	
	//分割字符串：根据给定字符，拆分此字符串
	public MyString[] split(char c) {
		//要知道最终被拆分成几个字符串，首先要知道字符出现的次数
		int appears = 0;
		for (int i = 0; i < content.length; i++) {
			if(this.content[i] == c) {
				appears++;
			}
		}
		
		//判断appears是否大于0
		if(appears > 0) {//如果appears大于0，则需要创建结果数组，并以此截取字符串赋值给结果数组
			MyString[] mystring = new MyString[appears + 1];
			int count = 0;//已截取次数，和字符出现次数相等
			int loc = 0;//已截取部分的末位
			for (int i = 0; i < this.content.length; i++) {
				if(this.content[i] == c) {
					//找到截取符，开始截取
					mystring[count] = this.subString(loc, i);
					count++;//截取次数+1
					loc = i+1;//
					if(count == appears) {
						mystring[count] = this.subString(loc);
						break;
					}
				}
			}
			return mystring;
		}else {
			//如果等于0，则返回原数组
			MyString[] myString = new MyString[1];
			myString[0] = this;
			return myString;
		}
	}
	
	//获取字符位置：返回给定字符在字符串中的位置，默认0位第一位
	public int indexOf(char c) {
		for (int i = 0; i < content.length; i++) {
			if(this.content[i] == c) {
				System.out.println(i);;
			}
		}
		return -1;
	}
	
	//获取字符串的长度length():返回当前字符串拥有的字符数
	public int length() {
		return this.content.length;
	}
	
	//打印字符串print():打印当前字符串内容到控制台
	public void print() {
		for (int i = 0; i < content.length; i++) {
			System.out.print(content[i]);//逐个输出字符
		}
		System.out.println();//最后输出一个换行
	}
	
	//截取字符串substring(int beginIndex)：返回一个新的字符串，它是此字符串的一个子字符串，从指定索引处的字符开始直到此字符末尾
	public MyString subString(int beginIndex) {
		return subString(beginIndex, this.content.length);
	}
	
	//截取指定区间字符串substring(int beginIndex,int endIndex):返回一个新的字符串，它是此字符串的一个子字符串，
	//从指定索引处的字符开始直到指定索引处字符结束，字符串长度为endIndex-beginIndex
	public MyString subString(int beginIndex,int endIndex) {
		char[] newStr = new char[endIndex-beginIndex];//前闭后开
		int count = 0;
		for (int i = beginIndex; i < endIndex; i++) {
			newStr[count] = this.content[i];
			count++;
		}
		return new MyString(newStr);
	}
	
	
}
