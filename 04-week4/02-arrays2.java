//Arrays in Methods
// Return an array of the specified size
public static int[] initData(int size) {
       int[] data = new int[size];
       for (int i = 0; i < data.length; i++) {
           data[i] = (int) (Math.random() * 100);
  } //initializes the array values with random integers between 0 and 100 and returns the array as the result of the method.
   return data;
} 

// Return the maximum value of the specified array
   public static int findMax(int[] values) {
       int max = values[0];
       for (int i = 1; i < values.length; i++) {
           if (values[i] > max) {
               max = values[i];
           }
}
return max; }

// Increment each value in the array by the specified step
   public static void incrementData(int[] values, int step) {
       for (int i = 0; i < values.length; i++) {
           values[i] = values[i] + step;
} }

// Create a new clone of the specified array
   public static int[] copyData(int[] values) {
       int[] newValues = new int[values.length];
       for (int i = 0; i < values.length; i++) {
           newValues[i] = values[i];
       }
       return newValues;
   }


// Print the values of the array 10 elements per row
   public static void printData(String header, int[] values) {
       System.out.println("-------" + header + "-------");
       System.out.println("The array values are: ");
       for (int i = 0; i < values.length; i++) {
           System.out.print("  " + values[i]);
           if ((i + 1) % 10 == 0) {
               System.out.println();
           }
    }
       System.out.println();
}


//Two-Dimensional Arrays
Arrays may be nested within other arrays to create multiple dimensions.
  
The array is declared with the [ ][ ] notation;
each set of brackets represents one dimension and we could refer to these as the "outer" array and the "inner" array. 
  
 // Declare a two-dimensional array
   int[][] data = new int[2][3];
   System.out.printf("First Dimension = %d\n", data.length);
   System.out.printf("Second Dimension = %d\n", data[0].length);
   // Initialize the array
   data[0][0] = 10;
   data[0][1] = 20;
   data[0][2] = 30;
   data[1][0] = 100;
   data[1][1] = 200;
   data[1][2] = 300;

  int[][] data = { {10, 20, 30}, {100, 200, 300} };
   System.out.printf("First Dimension = %d\n", data.length);  //2
   System.out.printf("Second Dimension = %d\n", data.length); //3

// Declare an array of integer values
   int size = 10;
   int[][] timesTable = new int[size][size];
   for (int row = 0; row < size; row++) {
       for (int col = 0; col < size; col++) {
           timesTable[row][col] = (row + 1) * (col + 1);
       }
}

//3 legend
   for (int row = 0; row < size; row++) {
       for (int col = 0; col < size; col++) {
           System.out.printf("%3d", timesTable[row][col]);
       }
       System.out.println();
   }


   // "for-each" loop style
   for (int[] row : timesTable) {
       for (int data : row) {
           System.out.printf("%3d", data);
}
       System.out.println();
   }


//Irregular Arrays
  
   // Declare an array of integer values
   int size = 10;
   // Allocate the first dimension
   int[][] patternTable = new int[size][];


   for (int row = 0; row < size; row++) {
       // Allocate the space for each row
       patternTable[row] = new int[row + 1];
       for (int col = 0; col < patternTable[row].length; col++) {
           patternTable[row][col] = col + 1;
} }


   System.out.println("Using the for-each construct");
   for (int[] row : patternTable) {
       for (int data : row) {
           System.out.printf("%3d ", data);
}
       System.out.println();
   }
