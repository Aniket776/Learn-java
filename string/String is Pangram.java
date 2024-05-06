class Demo{
	public static void main(String[] args){
		String str = "the quick brown fox jumps over the lazy dog";
		int count = 0;
		for(int i=97;i<=122;i++){
			for(int j=0;j<str.length();j++){
				if(((int)str.charAt(j))==i){
					count++;
					break;
				}
			}
		}
		if(count==26)
			System.out.println("String is Panagram");
		else
			System.out.println("It is Not Panagram");
	}
}