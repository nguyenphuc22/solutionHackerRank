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
}
