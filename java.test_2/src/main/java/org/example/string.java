//package org.example;
//public class string {
//    public static class SecondLargestFinder {
//        public static void findSecondLargest(int[] numbers) {
//            int larger = Integer.MIN_VALUE;
//            int secondLarger = Integer.MIN_VALUE;
//            for (int num : numbers) {
//                if (num>larger) {
//                    secondLarger =larger;
//                    larger = num;
//                } else if (num>secondLarger && num != larger) {
//                    secondLarger = num;
//                }
//            }
//            System.out.println("Second Larger: " + secondLarger);
//        }
//
//        public static void main(String[] args) {
//            int[] numbers = {10, 20, 5, 8, 15};
//            int result = findSecondLargest(numbers);
//            System.out.println("Second Largest: " + result);
//        }
//    }
//}
