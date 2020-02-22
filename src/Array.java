public class Array {
    static int sockMerchant(int n, int[] ar) {
        if (n <= 0)
            return 0;
        boolean[] status = new boolean[n];
        int count = 0;
        for (int i = 0 ; i < n ; i++)
        {
            for (int j = i; j < n ; j++)
            {
                if (ar[i] == ar[j] && status[i] == false && status[j] == false && i != j)
                {
                    status[i] = true;
                    status[j] = true;
                    count++;
                }
            }
        }
        return count;
    }
    static int hourglassSum(int[][] arr) {
        int result = 0, max;
        max = 0;
        max = arr[0][0] + arr[0][1] + arr[0][2] + arr[1][1] + arr[2][2] + arr[2][0] + arr[2][1];
       for (int i = 0 ; i < 6 - 2; i++)
       {
           for (int j = 0 ; j < 6 - 2; j++)
           {
                result = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j+2] + arr[i+2][j] + arr[i+2][j+1];
               if (max < result)
               {
                   max = result;
               }
           }

       }
        return max;
    }
}
