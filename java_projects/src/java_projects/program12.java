package java_projects;


public class program12 //extends program11
{
	public static void main(String[] args)
	{
		System.out.println(larger());
		System.out.println(smaller());
		System.out.print(diagnolsum());
		minmaxincolumn();
		//program11 p=new program11();
		//p.pyramid(); //pyramid()
		program11.pyramid();
	}

//largest number in a matrix

public static int larger()
{
	
int a[][]= {{12,13,4},{12,23,43},{12,43,21}};
int num = a[0][0];
for(int i=0;i<3;i++) 	//rows
{
	for(int j=0;j<3;j++)
	{
		if(num<a[i][j])
			num=a[i][j];
	}
}
return num;
}

//smallest number in a matrix

public static int smaller()
{
	
int a[][]= {{12,13,4},{12,23,43},{12,43,21}};
int num = a[0][0];
for(int i=0;i<3;i++) 	//rows
{
	for(int j=0;j<3;j++)
	{
		if(num>a[i][j])
			num=a[i][j];
	}
}
return num;
}

//diagnol sum
public static int diagnolsum()
{
	
int a[][]= {{12,13,4},{12,23,43},{12,43,21}};
int sum=0;
for(int i=0;i<3;i++) 	//rows
{
	for(int j=0;j<3;j++)
	{
		if(i==j)
			sum=sum+a[i][j];
	}
}
return sum;
}

public static void minmaxincolumn() {
	int a[][]= {{12,13,4},{12,23,43},{12,43,21}};
	int num = a[0][0];
	int column = 0;
	for(int i=0;i<3;i++) 	//rows
	{
		for(int j=0;j<3;j++)
		{
			if(num>a[i][j]) {
				num=a[i][j];
				column=j;
			}
		}
	}
	System.out.println(num);
	int k=0; //rows iteration
	int num1=a[0][column];
	while(k<3)
	{
		if(num<a[k][column])
			num=a[k][column];
		k++;
	}
	System.out.println(num);
}

}
