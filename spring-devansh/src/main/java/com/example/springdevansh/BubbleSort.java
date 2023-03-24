package com.example.springdevansh;

import org.springframework.stereotype.Component;

@Component
public class BubbleSort implements SortingImp{
    public int SortImp(int[] A, int noToSearch) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == noToSearch) {
                System.out.println("Inside the BubbleSort...");
                return A[i];
            } //else return -1;
        }
        return 0;
    }
}
