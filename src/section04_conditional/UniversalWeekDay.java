package section04_conditional;

public class UniversalWeekDay {
    public static void main(String[] args) {
        var day = 1;

        boolean isMondayFirst = true;

        int internalDay = day;

        if(!isMondayFirst){
            internalDay--;
            if (internalDay == 0) {
                internalDay = 7;
            }
        }


        String result;

        if(internalDay == 1){
            result = "Monday";
        }else if(internalDay == 2){
            result = "Tuesday";
        }else if(internalDay == 3){
            result = "Wednesday";
        }else if(internalDay == 4){
            result = "Thursday";
        }else if(internalDay == 5){
            result = "Friday";
        }else if(internalDay == 6){
            result = "Saturday";
        }else if(internalDay == 7){
            result = "Sunday";
        }else{
            result = "Uncorrect day: " + internalDay;
        }
        System.out.println(result);
    }
}
