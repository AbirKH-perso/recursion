package org.learning.problems;

public class TourOfHanoi {

    public static String showMoves(int n, char start, char dest, char temp){
        if(n==1){
            return "move disk 1 from peg "+ start +"to peg "+ dest +"\n";
        }else {
            return showMoves(n-1,start,temp,dest) +
                    "move disk "+n+" from peg "+ start +"to peg "+ dest +"\n" +
                    showMoves(n-1,temp,dest,start);
        }
    }

    public static void main(String[] args) {
        System.out.println(showMoves(3,'S','D','T'));
    }
}
