
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		getNum(101,200);		
	}
	
	public static void getNum(int a,int b){	
		int q = 0;
		StringBuilder z = new StringBuilder("分别是:"); 
		for(int x=a; x<=b ;++x){
			for(int y=2; y<a; ++y){
				if(x%y ==0){
					q++;
					z.append(x+",");
					break;
				}
			}
		}
		System.out.print(a+"-"+b+"间总共有"+q+"个素数,");
		System.out.println(z);
	}
}
