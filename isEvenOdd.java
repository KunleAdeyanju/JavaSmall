boolean isEven(int x){ if(x % 2 == 0){ return true;}else{return false;}}
isEven(5)
boolean isOdd(int x){ if(x % 2 == 1){return true;}else{return false;}}
isOdd(5)
int i =1;
 while(i <= 10) { System.out.println(i + " % 2 = " + i % 2); i++;}
void printOddEven(){ int i = 1; while(i <= 10){if(isEven(i)){System.out.println(i + " is even");}else{System.out.println(i + " is odd");} i++;}}
printOddEven()
void printEven(){ int i = 1; while(i <= 10){if(isEven(i)){System.out.println(i + " is even");} i++;}}
printEven()
isEven(13)