    package com.iamoperand;

    import java.util.Arrays;
    import java.util.Scanner;

    /**
     * Created by iamoperand on 21/8/17.
     */
    public class Ques1 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int N = scanner.nextInt();
            int K = scanner.nextInt();

            int[] X = new int[N];
            int[] Y = new int[N];
            for(int i=0; i<N; i++){
                X[i] = scanner.nextInt();
            }
            for(int i=0; i<N; i++){
                Y[i] = scanner.nextInt();
            }

            int[] distance = new int[N];
            for(int i=0; i<N; i++){
                distance[i] = (int) Math.ceil(Math.sqrt(Math.pow(X[i], 2) + Math.pow(Y[i], 2)));
            }

            Arrays.sort(distance);
            System.out.println(distance[K-1]);
        }
    }