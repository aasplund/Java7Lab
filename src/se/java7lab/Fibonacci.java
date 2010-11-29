/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package se.java7lab;

import java.util.concurrent.RecursiveTask;

/**
 *
 * @author anders
 */
    public class Fibonacci extends RecursiveTask<Integer> {

        final int n;

        public Fibonacci(int n) {
            this.n = n;
        }

        @Override
        protected Integer compute() {
            if (n <= 1) {
                return n;
            }
            Fibonacci f1 = new Fibonacci(n - 1);
            f1.fork();
            Fibonacci f2 = new Fibonacci(n - 2);
            return f2.compute() + f1.join();
        }
        
        public static void main(String args[]) {
            Fibonacci fib = new Fibonacci(10);
            System.out.println(fib.compute());
        }
    }
