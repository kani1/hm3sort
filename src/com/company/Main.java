package com.company;

import java.util.Arrays;

public class Main {

      public static void main(String[] args) {
          int[] array = new int[]{2, 3, 1, 4, 9, 6, 7, 5};

Arrays.sort(array);

          boolean isSorted = false;
          int temp;
          while (!isSorted) {
              isSorted = true;
              for (int i = 1; i < array.length - 1; i++)
                  if (array[i] > array[i + 1]) {
                      temp = array[i];
                      array[i] = array[i + 1];
                      array[i + 1] = temp;
                      isSorted = false;

                  }
          }
          System.out.println(Arrays.toString(array));
      }

  }








