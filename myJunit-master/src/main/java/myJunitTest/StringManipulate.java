package myJunitTest;


public class StringManipulate {

	public String man(String input)
	{
		String ans="";
		for(int i=0;i<2&&i<input.length();i++)
		{
			if(input.charAt(i)!='a'&&input.charAt(i)!='A')
				ans+=input.charAt(i);
		}
		if(input.length()>2)
			ans+=input.substring(2,input.length());
		return ans;
	}
}
