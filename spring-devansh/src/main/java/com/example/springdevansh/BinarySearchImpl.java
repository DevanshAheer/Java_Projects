package com.example.springdevansh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortingImp Sort;

    public BinarySearchImpl(SortingImp Sort)
    {
        super();
        this.Sort = Sort;
    }

    public void binarySearchImp(int[] A, int noToSearch)
    {
        int x = Sort.SortImp(A, noToSearch);
        System.out.println(x);
    }

}
