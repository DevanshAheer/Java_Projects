package com.example.springdevansh;

import org.springframework.stereotype.Component;

//@Component
public interface SortingImp {

    public default int SortImp(int[] A, int noToSearch) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == noToSearch) {
                return A[i];
            } //else return -1;
        }
        return 0;
    }
}
