public class test {
	public static void main(String[] args) {

		String str = "";
		if(str=="") {
			System.out.println(str);
		}
		else {
		System.out.println("111");
		}
	}

	public static String arrToStr(String[] arr, String symbol, String symbol1)
	{
	    StringBuffer sb = new StringBuffer();
	    if (arr != null && arr.length > 0)
	    {
	          for(int i=0;i<arr.length;i++) {
	        	if((i+1)%3!=0) { 	
	            sb.append(arr[i]);
	            sb.append(symbol);
	        	}
	        	else {
	        		sb.append(arr[i]);
	        	    sb.append(symbol1);
	        	}         
	          }
	        if (sb.length() > 0)
	        {
	            sb = sb.deleteCharAt(sb.length() - 1);
	        }
	    }
	    return sb.toString();
	}
	
}
