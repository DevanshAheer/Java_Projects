package com.example.springdevansh;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSort implements SortingImp{
    public int SortImp(int[] A, int noToSearch) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == noToSearch) {
                System.out.println("Inside the QuickSort...");
                return A[i];
            } //else return -1;
        }
        return 0;
    }
}
