package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StreamImplement{
    public static void main(String[] args) {
        // List<Integer> list = List.of(1,2,8,3,6);/// this is immutable list
        // System.out.println(list);

        List<Integer> list = new ArrayList<>(); // mutable list
        list.add(3);
        list.add(1);
        list.add(5);
        list.add(10);
        list.add(30);
        // System.out.println(list);

        // List<Integer> lis =  Arrays.asList(23,45,12,35,65);// immutable list
        // System.out.println(lis);


        // find list of even number without using stream

        List<Integer> lis2 = new ArrayList<>();
        // for(Integer i: list){
        //     if(i%2 == 0){
        //         lis2.add(i);
        //     }
        // }

        // System.out.println(lis2);

        // find list of even number using stream

        // Stream<Integer> strm = list.stream(); here, we are creating object of stream function
        // System.out.println(strm);
        // List<Integer> list3 = strm.filter(e->e%2==0).collect(Collectors.toList());
        // System.out.println(list3);

        List<Integer> list4 = list.stream().filter(e->e%2 == 0).collect(Collectors.toList());
        // System.out.println(list4);{

        // now creating object stream
        // 1st. blank
        // Stream<Object> emptyStream = Stream.empty();
        // emptyStream.forEach(e->{
        //     System.out.println(e);
        // });

        // 2nd. 
        String names[] = {"Aqil","Sk Chaudhary", "Sufi", "Shruti"};
        Stream<String> strm = Stream.of(names);

        List<String> nNames = strm.filter(e-> e.startsWith("S")).collect(Collectors.toList());
        // System.out.println(nNames);

        //3rd by using builder().build()

        // Stream<Object> stm = Stream.builder( ).build();

        // filter and map()
        List<Integer> nlist = list.stream().map(e-> e*e).collect(Collectors.toList());
        // System.out.println(nlist);
        // System.out.println(list);

        // use of method refferencing
            // nlist.forEach(System.out :: println);

        // sorted
        // list.stream().sorted().forEach(System.out :: println);

        //min
        Integer inVal = list.stream().min((x,y)->x.compareTo(y)).get();
        // System.out.println(inVal);

        // max
        Integer max = list.stream().max((x,y)->x.compareTo(y)).get();
        // System.out.println(max);




        // Stream interview question 
        //1st find out all even numbers exist in the collection
        //Question 1st
        List<Integer> lst = Arrays.asList(12,5,68,4,12,78,100,120,32,33,53);
        Stream<Integer> stream = lst.stream();
        List<Integer> lst2 = stream.filter(e-> e%2 == 0).collect(Collectors.toList());
        // System.out.println(lst2);

        //Question 2nd  return list starting with 1
        List<Integer> lst3 = List.of(10,5,15,33,22,12,18);
        List<Integer> lst4 = lst3.stream().filter(e->(e >=10 && e<=19)).collect(Collectors.toList());
        // System.out.println(lst4);

        // lst3.stream().map(e-> e+"").filter(e->e.startsWith("1")).forEach(System.out::println);

        //Question 3rd find duplicate using stream

        List<Integer> lst5 = Arrays.asList(10,20,5,45,10,33,5,10,20);
        Set<Integer> st = new HashSet<>();
        // lst5.stream().filter(e-> !st.add(e)).forEach(System.out::println);

        //Question 4rth find the first element of the list
        List<Integer> lst6 = List.of(12,33,15,5,4);

        // lst6.stream().filter(e-> e == lst6.get(0)).forEach(System.out::println);
        // lst6.stream().findFirst().ifPresent(System.out::println);
        // int val = lst6.stream().findFirst().get();
        // System.out.println(val);

        
        // Question 5th find total number of element in list
        int val2 = (int) lst6.stream().count();
        System.out.println(val2);

        








        

    }
}