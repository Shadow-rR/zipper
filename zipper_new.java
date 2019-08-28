import java.util.*;
class zipper
{
	public static boolean val_len(String s1,String s2,String s3)
	{
		if(s3.length()==(s1.length()+s2.length()))
		return true;
		else 
		return false;
	}
	
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		int i,j,t,f=0,p1,p2,l1,l2,l3;
		String s1,s2,s3;
		t=in.nextInt();
		for(i=0;i<t;i++)
		{
			f=0;
			s1=in.next();
			s2=in.next();
			s3=in.next();
			if(val_len(s1,s2,s3))
			{
				p1=0;p2=0;f=0;
				l1=s1.length();
				l2=s2.length();l3=s3.length();
				s1=s1+" ";s2=s2+" ";
				char c1[]=s1.toCharArray();
				char c2[]=s2.toCharArray();
				char c3[]=s3.toCharArray();
				for(j=0;j<l3;j++)
				{
					if(p1<l1-1&&p2==p1)
					{
						if(c3[j]!=c2[p2]&&c3[j]!=c1[p1])
						{
							
							f=1;break;
			
						}
						else if(c3[j]==c2[p2]&&c3[j]==c1[p1])
						{
							String s=s3.substring(j);
							int i1=s.indexOf(c1[p1+1]);
							int i2=s.indexOf(c2[p2+1]);
							if((i1-j)<(i2-j))
							{
								p1++;}
							else
							{
								
							p2++;}
						}
						else if(c3[j]==c2[p2])
						{
							
						p2++;}
						else
						{
							
						p1++;}
					}
					else if(p2<=p1)
					{
						if(c3[j]==c2[p2])
						{
							
						p2++;}
						else if(c3[j]==c1[p1])
						{
							
						p1++;}
						else
						{
							f=1;break;
						}
					}
					else 
					{
						if(c3[j]==c1[p1])
						{
							
						p1++;}
						else if(c3[j]==c2[p2])
						{
							
						p2++;}
						else
						{
							f=1;break;
						}
					}
				}
				if(f==0)
				System.out.println("Data Set "+(i+1)+":Yes");
				else
				System.out.println("Data Set "+(i+1)+":No");
			}
			else
			System.out.println("Data Set "+(i+1)+":No");
		}
	}
}
    