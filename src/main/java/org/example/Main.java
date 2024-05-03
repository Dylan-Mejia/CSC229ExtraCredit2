package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] a = {3,5,2,10,4,15};
        int largestNum = Integer.MIN_VALUE;
        int secondLargestNum = Integer.MIN_VALUE;
        int smallestNum = Integer.MAX_VALUE;
        int secondSmallestNum = Integer.MAX_VALUE;
        int ratio;

        for(int i : a){
            if(i > largestNum) {
                secondLargestNum = largestNum;
                largestNum = i;
            } else if (i > secondLargestNum) {
                secondLargestNum = i;
            }
            if (i < smallestNum) {
                secondSmallestNum = smallestNum;
                smallestNum = i;
            }
            else if (i < secondSmallestNum){
                secondSmallestNum = i;
        }
        }
        ratio = (largestNum + secondLargestNum) / (smallestNum + secondSmallestNum);
        System.out.println("The ratio is (" + largestNum + "+" + secondLargestNum + ") / (" + smallestNum + "+" + secondSmallestNum + ") = " + ratio);

        }
    }
