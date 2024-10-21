public class FizzBuzz{
    public static int[] solution(int number) {
      int n[] =new int[3];
      number -=1;
      while (number > 0){
        if (number % 3 == 0 && number%5 != 0){
          n[0]++;
          number -= 1;
        }
        else if (number %5 == 0 && number%3!=0){
          n[1]++;
          number -=1;
        }
        else if (number %5 ==0 && number%3 == 0){
          n[2]++;
          number -=1;
        }
          else{ number -=1;}
      }
      return n;
    }
}
