class Demo{
	public static int CompareString(String str1,String str2){
		int s1 = (int)str1.charAt(0);
		int s2 = (int)str2.charAt(0);
		return s1-s2;
	}
	public static void main(String[] args){
		String str1 = "CAT";
		String str2 = "CAT";
		int num = CompareString(str1,str2);
		if(num>0)
			System.out.println("First String is Greater");
		else
			if(num==0)
				System.out.println("Both String are equal");
			else	
				System.out.println("First String is Smaller");
	}
}