package javaapplication1;

public class MyNumbers {

    private int[] numbers;
    private int length_max;
    private int length=0;

    public MyNumbers(int length) {
        this.length_max = length;
        int[] array = new int[length_max];
        this.numbers = array;

    }

    private boolean reachLengthMax() {

        if (this.numbers[(length_max)-1] == 0) {
            return false;
        } else {
            System.out.println("No more place in the list");
        }
        return true;

    }

    private boolean haveNumbers() {

        
            if (this.numbers[0] != 0)
                return true;
            else
        
        System.out.println("No number in the list");
        return false;
    }

    private static int getIndex() {

        int a = TestMyNumbers.getValue("Enter Index");

        if (a > 0 && a < 7) {
            return a-1;
        } else 
            if (a == 0) 
                System.out.println("There is not such an index in the list");
                return -1;
            
            
        

    }

    private int[] getIndexes() {

        int[] indexes = new int[2];
        indexes[0] = getIndex();
        indexes[1] = getIndex();
        if (indexes[0] == -1 || indexes[1] == -1) {
            System.out.println("there are no index ");
        }
        return indexes;   //?????????????
    }

    private static int[] removeZeros(int[] array) {
        int len = 0;
        for (int i = 0, j = 0; i < array.length; i++) {

            if (array[i] != 0) {
                len++;
            }
        }
        int[] array2 = new int[len];

        for (int i = 0, j = 0; i < array.length; i++) {

            if (array[i] != 0) {
                array2[j] = array[i];
                j++;

            }

        }

        return array2;
    }
    
    
   private int[] greater(int[] arr1, int[]arr2){
       
       if(arr1.length>arr2.length)
           return arr1;
       if(arr2.length<arr2.length)
           return arr2;
       if(arr1.length==arr2.length){
           for(int i =0; i<arr1.length; i++){
               if(arr1[i]>arr2[i])
                   return arr1;     
              
               else if(arr1[i]==arr2[i])
                  i++;
               else 
                   if(arr1[i]<arr2[i])
                       return arr2;
                   
           }
          
       }
       
      return arr1; //????????????
   }
    private int getInt(int[] arr){
        int number=0;
        for(int i=1; i<arr.length; i++){
           number=arr[i-1]*10;
           number=arr[i];   
        }
        
        return number;
    
   }
    
    
    private int[] getArray(int sum){
        
        for(int i=1; i<arr.length; i++){
           number=arr[i-1]*10;
           number=arr[i];   
        }
        
        return ; //????????????????
    
   }
    private int[] addition(int[] arr1, int[] arr2){
        int sum;
       sum= getInt(arr1)+getInt(arr2);
        getArray(sum);
       return sum; 
    }

    
    public void display(){   
        System.out.println("Numbers:");
        if(haveNumbers()){
            for(int i = 0; i<this.length; i++){
            
            System.out.println((i+1) + ".  " + numbers[i]);}
            
                System.out.println("Menu:\n" +
" 1. Add a number\n" +
" 2. Remove a number\n" +
" 3. Addition\n" +
" 4. Subtraction\n" +
" 5. Multiplication\n" +
" 6. Exit");
            
        }
        else
        
            System.out.println("- "  +'\n'+"Menu:\n" +
" 1. Add a number\n" +
" 2. Remove a number\n" +
" 3. Addition\n" +
" 4. Subtraction\n" +
" 5. Multiplication\n" +
" 6. Exit" );
        
        }
        
    public void addNumber(){
        if(!reachLengthMax()){
            
         int a=TestMyNumbers.getValue("Enter a number: ");
          this.numbers[this.length]=a;
            this.length++;
            System.out.println("\n");
        }
        else
               System.out.println("- No more place in the list - " + "\n");
        
    }
    
    
    public void removeNumber(){
        int x=0;
        if(!haveNumbers())
            System.out.println("There are no any number.");
        else
            x = getIndex();
            if(x != -1)
             for(int i=x+1; i<this.length; i++)
                 this.numbers[i-1]=this.numbers[i];
                   this.length--;
                    System.out.println("\n");
    }
    public void addition(){
        int[] a=new int[2];
        a=getIndexes();
        
        this.numbers[this.length]=this.numbers[a[0]]+this.numbers[a[1]];
        this.length++;
         System.out.println("\n");
    }
    public void subtraction(){
        int[] a=new int[2];
        a=getIndexes();
        if(this.numbers[a[0]]>=this.numbers[a[1]]){
        this.numbers[this.length]=this.numbers[a[0]]-this.numbers[a[1]];
        this.length++;
        }
        else if(this.numbers[a[0]]<this.numbers[a[1]]){
        this.numbers[this.length]=this.numbers[a[1]]-this.numbers[a[0]];
        this.length++;
        }
         System.out.println("\n");
        
    }
    public void multiplication(){
       int[] a=new int[2];
        a=getIndexes();
        
        this.numbers[this.length]=this.numbers[a[0]]*this.numbers[a[1]];
        this.length++; 
         System.out.println("\n");
        
        
    }
            
    
    
    
}

