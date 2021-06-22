public class Palindrome{
  static int Count(char str[], int n)
    {
        
    int temp[][] = new int[n][n];
	boolean P[][] = new boolean[n][n];
 	for (int i = 0; i < n; i++)
           P[i][i] = true;
        for (int i = 0; i < n - 1; i++) {
            if (str[i] == str[i + 1]) {
                P[i][i + 1] = true;
                temp[i][i + 1] = 1;
            }
        }
 
       
        for (int k = 2; k < n; k++) {
            for (int i = 0; i < n - k; i++) {
                int j = k + i;
 
                if (str[i] == str[j] && P[i + 1][j - 1])
                    P[i][j] = true;
 
                if (P[i][j] == true)
                    temp[i][j] = temp[i][j - 1] + temp[i + 1][j]
                               + 1 - temp[i + 1][j - 1];
                else
                    temp[i][j] = temp[i][j - 1] + temp[i + 1][j]
                               - temp[i + 1][j - 1];
            }
        }
 
        
        return temp[0][n - 1];
    }
 
  public static void main(String[] args) {

    	String str = "abbabab";
        System.out.println(
            Count(str.toCharArray(), str.length()));
	
  }
}