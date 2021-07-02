import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

public class Collection {
   
   static class Calender{
      
   }
   
   public static void main(String[] args) throws NumberFormatException, IOException {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int[] day = {30,31,28,29};
      List<Integer> list = new LinkedList<>();
      
      for (int i = 0; i < day.length; i++) {
         list.add(day[i]);
      }
      
      Calendar cal = Calendar.getInstance();
      
      //윤년은 4로나누어떨어지는 해 2월 29일까지 있음
      int month = cal.get(Calendar.MONTH) + 1;
      int year = cal.get(Calendar.YEAR);
      
      if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 ||month ==12) {
         System.out.println(year+"년 "+month+" 월 " + list.get(1)+" 일");
      }
      else if(month==2) {
         //윤년이라면
         if(year%4==0) {
            System.out.println(year+"년 "+month+" 월 " + list.get(3)+" 일");
         }else {
            System.out.println(year+"년 "+month+" 월 " + list.get(2)+" 일");
         }
      }else {
         System.out.println(year+"년 "+month+" 월 " + list.get(0)+" 일");
      }
   }
}