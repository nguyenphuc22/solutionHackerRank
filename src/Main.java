import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/phuc/IdeaProjects/solutionHackerRank/src/data.txt"));
            String number = bufferedReader.readLine();
            String value = bufferedReader.readLine();
            String[] arrayValue;
            arrayValue = value.split(" ");
            int[] ar = new int[Integer.parseInt(number)];
            for (int i = 0 ; i < ar.length;i++)
            {
                ar[i] = Integer.parseInt(arrayValue[i]);
            }
            int count = Array.sockMerchant(Integer.parseInt(number),ar);
            System.out.println(count);
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}