package programming.RecursionString;

public class SkipChar {
	public static void main(String[] args) {
		System.out.println(skipChar("kjhkjhjhk",'k',""));
		System.out.println(skipChar("kjhkjhjhk",'j'));

	}
	public static String skipChar(String str, char skip, String ans){
		if(str.length()==0){
			return ans;
		}

		char fchar = str.charAt(0);
		if(fchar==skip){
			ans += skipChar(str.substring(1),skip,ans);
		}else{
			ans = fchar + skipChar(str.substring(1),skip,ans);
		}
		return ans;
	}
	public static String skipChar(String str, char skip){
         if(str.length()==0){
			 return "";
         }

		char fchar = str.charAt(0);
		if(fchar==skip){
			return skipChar(str.substring(1),skip);
		}else {
			return fchar + skipChar(str.substring(1),skip);
		}
	}
}
