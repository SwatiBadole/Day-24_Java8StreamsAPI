package com.API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamOperation {


	public static void main(String[] args) {
	
        IntStream.of(1,3,4,5,6).forEach(System.out::println);
        System.out.println("------------------------------------");
      
        List<Integer> integers =Arrays.asList(1,2,3,4,5,6,7,8,9,8,9);
       integers.stream().filter(t -> t % 2 == 0).distinct().forEach(t ->System.out.println("print="+t)); 
       
       System.out.println("--------------------------------------");
       integers.stream().map(t->t*t).distinct().forEach(t ->System.out.println("print="+t));
       
       System.out.println("-------------------------------------- ");
       List<String> nameList =new ArrayList<>();
       nameList.add("swati");
       nameList.add("");
       nameList.add("def");
       nameList.add("mona");
       nameList.add("sona");
       nameList.add("");
       nameList.add("meena");
       nameList.add("siya");

      long count= nameList.stream().filter(name ->name.isEmpty()).count();
       System.out.println("number of Empty Strings =" +count);
       
       System.out.println("-----------------------------------------");
       
      IntStream.iterate(5, n ->n+5).limit(10).forEach(t ->System.out.println("table of 5 ="+t));       
      System.out.println("------------------------------------------"); 
      nameList.stream().sorted().forEach(t ->System.out.println("print="+t));
       
      System.out.println("--------------------------------------------");
      integers.stream().sorted().distinct().forEach(t ->System.out.println(t));
      
      System.out.println("---------------------------------------------");
      //integers.stream().sorted(n1,n2)->n2.compareTo(n1)).forEach
      integers.stream().sorted((n1,n2)->n2.compareTo(n1)).distinct().forEach(System.out::println);
	}

}
