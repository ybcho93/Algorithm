import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;
import java.io.*;

class Pair implements Comparable<Pair> {
    int first;
    int second;

    public Pair(int first, int second) {
        super();
        this.first = first;
        this.second = second;
    }

    @Override
    public int compareTo(Pair p) {
        if (this.first == p.first)
            return Integer.compare(this.second, p.second);
        else
            return Integer.compare(this.first, p.first);
    }
}

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException{
        int index;
        int first, second;
        int tempFirst, tempLast;
        int result=0;
        ArrayList<Pair> list = new ArrayList<Pair>() ;    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        index = Integer.parseInt(br.readLine());

        for(int i =0; i<index; i++){
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            first = Integer.parseInt(st.nextToken());
            second = Integer.parseInt(st.nextToken());

            list.add(new Pair(first, second));
        }

        Collections.sort(list);

        // sorting 잘 됐는지 확인
        // for( Pair pair : list) {
        // System.out.println(pair.first+" "+pair.second);
        // }

        tempFirst = list.get(0).first;
        tempLast = list.get(0).second;
        for (int i=1; i<index; i++) {
            // 이번 요소의 첫번째가 현재 마지막보다 작으면
            if (list.get(i).first <= tempLast){
                tempLast = Math.max(list.get(i).second, tempLast);
            } else {
                result = result + (tempLast-tempFirst);
                
                tempFirst = list.get(i).first;
                tempLast = list.get(i).second;
            }
        }
        result = result + (tempLast-tempFirst);

        System.out.println(result);
    }

}

