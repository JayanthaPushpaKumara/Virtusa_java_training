import java.util.*;

class mirredTest{
	public static void main(String[] args){
		String var = "aaaaaaaa";
		char[] charArray = var.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		int arrayLen = charArray.length;
		
		for(int i=0;i<arrayLen;i++){
			if (i!=arrayLen-1){
				if (charArray[i]==charArray[i+1]){
					int a = i;
					int b = i+1;
					while(b!=arrayLen && a>-1 && charArray[a]==charArray[b]){
						stack.push(charArray[b]);
						a--;
						b++;
					}
					
					if(stack.size()>=3){						
						while(!stack.empty()){System.out.print(stack.pop());}
						System.out.println();
					}
					stack.clear();					
				}
			}
		}
	}
}
