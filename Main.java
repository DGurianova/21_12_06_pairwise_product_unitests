public class Main {
    public static void main(String[] args) {
        PairwiseProblem pairwiseProblem = new PairwiseProblem();

        System.out.println(pairwiseProblem.solve(new int[]{1, 2}));//2
        System.out.println(pairwiseProblem.solve(new int[]{1, 10, 2}));//20
        System.out.println(pairwiseProblem.solve(new int[]{100000, 100000}));//10000000000
        System.out.println(pairwiseProblem.solve(new int[]{0, 100000}));//0
        System.out.println(pairwiseProblem.solve(new int[]{1}));//0

        System.out.println(pairwiseProblem.solveTwo(new int[]{1, 2}));//2
        System.out.println(pairwiseProblem.solveTwo(new int[]{1, 10, 2}));//20
        System.out.println(pairwiseProblem.solveTwo(new int[]{100000, 100000}));//10000000000
        System.out.println(pairwiseProblem.solveTwo(new int[]{0, 100000}));//0
        System.out.println(pairwiseProblem.solveTwo(new int[]{100000,12,10,3,5,8,9}));//1200000
        System.out.println(pairwiseProblem.solveTwo(new int[]{0, 0, 0, 0}));//0
        try {
            System.out.println(pairwiseProblem.solveTwo(new int[]{1}));//illegal argument -> error
        } catch (IllegalArgumentException e) {
            System.out.println("Error");
        }
        try {
            System.out.println(pairwiseProblem.solveTwo(new int[]{}));//illegal argument ->error 2 The argument is wrong, must be length 2 and more
        } catch (IllegalArgumentException e) {
            System.out.println("Error 2" + e.getMessage());
        }
        System.out.println(pairwiseProblem.solveTwo(new int[]{9, 8, 100000, 12}));//1200000
    }
}
