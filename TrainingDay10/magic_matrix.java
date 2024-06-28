import java.util.*;
public class magic_matrix {
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int mat[][]=new int[n][n];
int a = 0,b = n/2;
mat[a][b]=1;
for(int i=2;i<=(n*n);i++)
{
	if(a==n)
		a=n-1;
	else
		a--;
	if(b==n-1)
		b=0;
	if(mat[a][b]!=0)
	{
		if(a==n-1)
			a=1;
		else
			a=a+2;
		if(b==0) b=n-1;
		else b--;
	}
	mat[a][b]=1;
}
}
}
