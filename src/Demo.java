import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
    int a[][],b[][];
    int i,j,n,m,nz=0,z=0,r=0,c=0;
        System.out.println("Enter the row and column of matrix");
        Scanner sc = new Scanner(System.in);

        n=sc.nextInt();
        m=sc.nextInt();

        a = new int[n][m];
        b = new int[n][m];

        for (i=0;i<n;i++){
            for (j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }

        for (i=0;i<n;i++){
            for (j=0;j<m;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (i=0; i<n; i++){
            int cnt=0;
            for (j=0;j<m; j++) {
                if (a[i][j]!=0) {
                    b[i][cnt] = a[i][j];
                    cnt++;
                }
            }
            for(int k=cnt; k<m; k++){
                b[i][k]=0;
            }
        }

        for (r=0;r<n;r++){
            for (c=0;c<m;c++){
                System.out.print(b[r][c]+" ");
            }
            System.out.println();
        }
    }
}
/*
* For 3*3 matrix --:
*Input:
0 0 1
0 1 0
0 1 1
Output:
1 0 0
1 0 0
1 1 0
*/
