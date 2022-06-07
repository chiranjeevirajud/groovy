class Example {
   static void main(String[] args) {
      int[] array = [0,1,2,3,4,5,6,7,8,9];
		
      for(int i in array) {
         if(i == 2)
         continue;
         println(i);
         
      }
   }
}
/*
class Example {
   static void main(String[] args) {
      int[] array = [0,1,2,3,4,5,6,7,8,9];
		
      for(int i in array) {
         if(i == 2)
         continue;
         if(i == 7)
         continue;
         println(i);
         
      }
   }
}
*/