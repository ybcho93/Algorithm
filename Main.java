import java.io.*;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        int N, Q;
        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        Q = Integer.parseInt(st.nextToken());
        LinkedList<Integer>[] adjList = new LinkedList[N+1];

        for(int i=0; i<=N; i++) {
            adjList[i] = new LinkedList<Integer>(); 
        }

    }
}


/* 인접행렬로 표현해서 풀어보려했는데 실패. 짱구가 안 굴러감
import java.io.*;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    // N은 영상 개수, Q는 질문 수
    static int N, Q;
    static int[][] givenUsado;
    static int[][] calculatedUsado;
    static int bestUsado;
    static Queue<Integer> queueFrom = new LinkedList<>();
    static Queue<Integer> queueTo = new LinkedList<>();

    public static void calculateUsado(int from, int to) {
        int tempFrom, tempTo;

        for (int j=from; j<N; j++) {
            if(givenUsado[from][j]!=0 && givenUsado[from][j]<bestUsado) {
                    bestUsado = givenUsado[from][j];
                    queueFrom.add(from);
                    queueTo.add(j);
            }            
        }
        while(!queueFrom.isEmpty()) {
            tempFrom = queueFrom.poll();
            tempTo = queueTo.poll();
            if()
        }
    }

    public static void main(String[] args) throws IOException {
        
        
        int from, to, usado;
        int tempInt;
        int [] usadoNorm;
        int [] clipNum;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        Q = Integer.parseInt(st.nextToken());

        // 유사도 배열 초기화
        givenUsado = new int[N][N];
        calculatedUsado = new int[N][N];
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                givenUsado[i][j] = 0;
                calculatedUsado[i][j] = 0;
            }
        }

        // 유사도 받아 넣기
        for(int i=0; i<N-1; i++){
            st = new StringTokenizer(br.readLine(), " ");
            from = Integer.parseInt(st.nextToken());
            to = Integer.parseInt(st.nextToken());
            usado = Integer.parseInt(st.nextToken());

            // 유사도 배열은 오른쪽 윗부분만 사용할 예정
            if(from>to) {
                tempInt = to;
                to = from;
                from = tempInt;
            }
            givenUsado[from][to] = usado;
        }

        // 문제 저장해두기
        usadoNorm = new int[Q];
        clipNum = new int[Q];
        for(int i=0; i<Q; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            usadoNorm[i] = Integer.parseInt(st.nextToken());
            clipNum[i] = Integer.parseInt(st.nextToken());
        }

        // 유사도 계산 해 넣기
        for(int i=0; i<N; i++) {
            for (int j =i; j<N; j++){
                if(i==j) {
                    continue;
                }

                if(givenUsado[i][j]!=0) {
                    calculatedUsado[i][j] = givenUsado[i][j];
                }

                bestUsado=1000000001;
                calculateUsado(i, j);
            }
        }
    }
}
 */