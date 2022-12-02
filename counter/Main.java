
/*
 * Modify the code below so that 
 * 
 * 1. So that numbers less than 10 are padded when printed 
 * i.e. 01 : 59 : 59 rather than 1 : 59 : 59
 *
 * 2. So that the time includes miliseconds 
 * e.g. 01 : 59 : 59 : 999
*/

public class Main {

    public static void main(String[] args) {
          Counter hours = new Counter(24, 1);
          Counter mins = new Counter(60, 59);
          Counter sec = new Counter(60, 58);
          Counter mil = new Counter(1000, 998);
  
          int i = 0;
          while(i < 10){
            String hours_print = String.valueOf(hours.getCount());
            String mins_print = String.valueOf(mins.getCount());
            String sec_print = String.valueOf(sec.getCount());
            String mil_print = String.valueOf(mil.getCount());
            if(hours.getCount()<10)
            {
                hours_print = "0" + hours_print;
            }
            if(mins.getCount()<10)
            {
                mins_print = "0" + mins_print;
            }
            if(sec.getCount()<10)
            {
                sec_print = "0" + sec_print;
            }
            if(mil.getCount()<10)
            {
                mil_print = "0" + mil_print;
            }
            System.out.println(hours_print + " : " + 
                                mins_print + " : " + 
                                sec_print + " : " +
                                mil_print);
                
            mil.tick();
            if(mil.getCount() == 0)
            {
                sec.tick();
                if(sec.getCount() == 0)
                {
                    mins.tick();
                    if(mins.getCount() == 0){
                                hours.tick();
                            }
                }
            }
    
                i++;
            }
    }
  }