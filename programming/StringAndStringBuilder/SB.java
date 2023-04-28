package programming.StringAndStringBuilder;

/*
Strings had a drawback which was you cannot mutate or update a string. Every time you will mutate
or update the string a new object will be created in the memory. This causes extra usage of the memory.
To overcome this drawback we needed a sort of data type in which you can update the string without
creating a new object . In java the answer is StringBuilder which created only 1 object, and only
it gets updated every time.No extra memory is used. The reference also remains the same & it doesn't change.
 */
public class SB {
	public static void main(String[] args) {
    String str="";
	for(int i=0;i<26;i++){
	 char ch = (char)('a'+i);
	 str+=ch;
	}

	System.out.println(str);

	StringBuilder sb = new StringBuilder();
	for(int i=0;i<26;i++){
		char ch = (char)('a'+i);
		sb.append(ch);
	    }
		System.out.println(sb);
	}
	/*
	Doing the same problem with string will create new object every time so extra memory is used
	and time complexity also increases but with string builder no extra object is created and
	time complexity is also less the string approach;
	 */
}
