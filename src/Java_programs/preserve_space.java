package Java_programs;

public class preserve_space {
	public static void main(String[] args) {
		String s="Myself sruthi, looking for job change";
		char[] c=s.toCharArray();
		int start=0, end=c.length-1;
		while(start<end) {
			if(c[start]==' ') {
				start++;
				continue;
			}
				else if(c[end]==' ') {
					end--;
					continue;
				}
					else {
						char temp=c[start];
						c[start]=c[end];
						c[end]=temp;
						start++;
						end--;
					}
		}
		System.out.println(c);
		String s1=new String(c);
		System.out.println(s1);
				
		}
	}

