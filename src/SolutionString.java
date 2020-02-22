public class SolutionString {
    static long repeatedString(String s, long n) {

        long    count = 0,
                number = n / s.length(),
                counthalt = 0;
        int numberTmp = (int) (n % s.length());
        for (int i = 0 ; i < s.length() ; i++)
        {
            if (s.charAt(i) == 'a')
            {
                count++;
            }
            if ( i < numberTmp)
            {
                if (s.charAt(i) == 'a')
                {
                    counthalt++;
                }
            }
        }
        long result = count * number + counthalt;
        return result;
    }
}
