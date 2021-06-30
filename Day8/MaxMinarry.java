package com.maxmin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxMin { 
  public static void main(String[] args) { 
    ArrayList<Integer> num = new ArrayList();
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    
    for(int i=0;i<5;i++)
    {
    	num.add(sc.nextInt());
    }
    
    int max = Collections.max(num);
    int min = Collections.min(num);
    
    //System.out.println("The max num is:"+max);
    //System.out.println("The min num is:"+min);
   
    Collections.sort(num);
    for(int i=0;i<num.size();i++)
    {
    	Collections.sort(num);
    }
    System.out.println("The min num is:"+num.get(0));
    System.out.println("The max num  is:"+num.get(num.size()-1));

  }
}
