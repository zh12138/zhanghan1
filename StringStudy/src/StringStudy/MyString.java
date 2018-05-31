package StringStudy;

public final class MyString {
	//F-����
	//��Ա����,�����洢�ַ������ݣ������ö�������ֱ���޸Ĵ˱���������ͨ��������Ӱ�����ֵ��������Ϊprivate
	private final char[] content;
	
	//C-������
	//�޲ι��췽��
	public MyString() {
		content = new char[0];//����һ������Ϊ0��char[]������ΪĬ��ֵ
	}
	
	//���г�ʼ���ݵ��ַ���������
	public MyString(char[] c) {
		this.content = c;
	}
	
	//M-����
	//�����ַ�������ָ���ַ����ӵ����ַ����Ľ�β
	public MyString concat(MyString str) {
		//ƴ��this.content��str.content
		//�����µ�newChar[],����Ϊ�����������鳤��֮��
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
	
	//�滻�ַ�������һ���µ��ַ���������ͨ��newChar�滻���ַ����г��ֵ�����oldChar�õ���
	public MyString replace(char oldChar,char newChar) {
		char[] newStr = new char[this.content.length];
		for (int i = 0; i < content.length; i++) {
			if(this.content[i] == oldChar) {
				this.content[i] = newChar; 
			}
		}
		return null;
	}
	
	//�жϰ����ַ������ҽ������ַ�������ָ����charֵʱ������true
	public boolean contains(char c) {
		for (int i = 0; i < content.length; i++) {
			if(this.content[i] == c) {
				System.out.println("true");;
			}
		}
		return true;
	}
	
	//�ָ��ַ��������ݸ����ַ�����ִ��ַ���
	public MyString[] split(char c) {
		//Ҫ֪�����ձ���ֳɼ����ַ���������Ҫ֪���ַ����ֵĴ���
		int appears = 0;
		for (int i = 0; i < content.length; i++) {
			if(this.content[i] == c) {
				appears++;
			}
		}
		
		//�ж�appears�Ƿ����0
		if(appears > 0) {//���appears����0������Ҫ����������飬���Դ˽�ȡ�ַ�����ֵ���������
			MyString[] mystring = new MyString[appears + 1];
			int count = 0;//�ѽ�ȡ���������ַ����ִ������
			int loc = 0;//�ѽ�ȡ���ֵ�ĩλ
			for (int i = 0; i < this.content.length; i++) {
				if(this.content[i] == c) {
					//�ҵ���ȡ������ʼ��ȡ
					mystring[count] = this.subString(loc, i);
					count++;//��ȡ����+1
					loc = i+1;//
					if(count == appears) {
						mystring[count] = this.subString(loc);
						break;
					}
				}
			}
			return mystring;
		}else {
			//�������0���򷵻�ԭ����
			MyString[] myString = new MyString[1];
			myString[0] = this;
			return myString;
		}
	}
	
	//��ȡ�ַ�λ�ã����ظ����ַ����ַ����е�λ�ã�Ĭ��0λ��һλ
	public int indexOf(char c) {
		for (int i = 0; i < content.length; i++) {
			if(this.content[i] == c) {
				System.out.println(i);;
			}
		}
		return -1;
	}
	
	//��ȡ�ַ����ĳ���length():���ص�ǰ�ַ���ӵ�е��ַ���
	public int length() {
		return this.content.length;
	}
	
	//��ӡ�ַ���print():��ӡ��ǰ�ַ������ݵ�����̨
	public void print() {
		for (int i = 0; i < content.length; i++) {
			System.out.print(content[i]);//�������ַ�
		}
		System.out.println();//������һ������
	}
	
	//��ȡ�ַ���substring(int beginIndex)������һ���µ��ַ��������Ǵ��ַ�����һ�����ַ�������ָ�����������ַ���ʼֱ�����ַ�ĩβ
	public MyString subString(int beginIndex) {
		return subString(beginIndex, this.content.length);
	}
	
	//��ȡָ�������ַ���substring(int beginIndex,int endIndex):����һ���µ��ַ��������Ǵ��ַ�����һ�����ַ�����
	//��ָ�����������ַ���ʼֱ��ָ���������ַ��������ַ�������ΪendIndex-beginIndex
	public MyString subString(int beginIndex,int endIndex) {
		char[] newStr = new char[endIndex-beginIndex];//ǰ�պ�
		int count = 0;
		for (int i = beginIndex; i < endIndex; i++) {
			newStr[count] = this.content[i];
			count++;
		}
		return new MyString(newStr);
	}
	
	
}
