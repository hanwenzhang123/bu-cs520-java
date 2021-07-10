logical operation
- the if keyword performs a truth test
  if (x==4) //... then do something
- the truth test ccan be a negative testt
  if(x=!4)
  if(!(x==4))
! - opposite value of a booleaen
&& - AND
|| - OR
  if((x==4 && y<12) || z>=2)
the block of code is within {}, only execute if the condition is true
  {} optional if only one thing exist in the next line
  
else - otherwise
  if (x==4) {
   x=7;
  } else if (x=20){
   x=38;
  } else (x>20) {
   x=100;
   }

Convert string to an integer using Parse 
int age = Integer.parseInt(input);

switch - need break at the end

FOR loop
for (initial statement, test, final statement)
  
for(int i=1; i<=10; i++){
  System.out.printf("Loop #%d%n", 1);
  for(int j=50; j<=60; j++){
    System.out.printf("Sub-Loop #%d%n", 1);
  }
}

WHILE loop

int x = 1;
while(x<=10){
  System.out.println("Loop #" + x);
  x++;
}

int x = 4;
while(x<20){
  System.out.printf("x = %d%n", x++);  //4-19
}

int x = 4;
while(x<20){
  System.out.printf("x = %d%n", ++x);  //5-20
}

DO WHILE loops - do at least once

int x = 44;
do {
  System.out.println("x = %d%n", x++);  //44
} while x(x<20);

Break and continue
  break - cause the current loop to stop abruptly
  continue - cause the loop to skip the code underneath it
  
