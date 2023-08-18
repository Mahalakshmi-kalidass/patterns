class XPatterns{
public static void main(String[] args){
 xPatternNormal(5);
    numberedXPattern(5);
    snakePattern(3);
    americanFlag(9);
}
public static void xPatternNormal(int n){
    for(int i = 0;i<n;i++){
      for(int j = 0;j<n;j++){
        if(i==j){
          System.out.print("*");
        }
       else if(i+j == n-1){
         System.out.print("*");
       }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  public static void numberedXPattern(int n){
    /*
      5        1
        4    2
          3               right diagonal --> i+j == n+1
        2    4            left diagonal --> i==j
      1        5
    */
    int middle = (n+1)/2;
    System.out.println(middle);
    for (int i = 1;i<=n;i++){
      for(int j =1;j<=n;j++){
       
        if(i<middle && i == j){
          System.out.print(n+1 - i);
        }
        else if(i < middle && i+j == n+1){
            System.out.print(i);
        }
          else if(i == middle && j== middle){
            System.out.print(middle);
          }
        else if( i > middle && i == j ){
          System.out.print(j);
        }
        else if( i > middle && i+j == n+1){
          System.out.print(j);
        }
        
        else{
              System.out.print(" ");
        }
      
          
        
        
        
      }
      System.out.println();
    }
  }

  public static void snakePattern(int n){
    int counter =1;
    for(int i = 1 ;i<=n;i++){
        for(int j = 1;j<=n;j++){
          if(i%2==1){
            System .out.print(counter++);
            //when j is equal to n while i is odd add n-1 then decrement the counter when i is even
            if(j==n){
              counter+=n-1; //2
            }
          }
          else if(i %2==0){
             System .out.print(counter--);
            if(j==n){
              counter+=n+1; //4
            }
          }
          
        }
      System.out.println();
      }
      
      
    }

  public static void americanFlag(int n ){
    int m = n/2;
    
    for(int i = 0;i<n;i++){
      for(int j = 0;j<n ;j++){
        if(i ==m ){ // horizontal middle line
          System.out.print("* ");
        }
        else if(i==j){ //left diagonal
          System.out.print("* ");
        }
        else if(i+j == n-1){//right diagonal
          System.out.print("* ");
        }
        else if(j == m ){ //vertical middle line
          System.out.print("* ");
        }
        else{
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }

}
