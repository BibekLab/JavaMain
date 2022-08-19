public class SecondAndMinute {

    private static final String ERROR_MESSAGE="Invalid Value";
    public static String getDurationString(int firstParameter, int secondParameter){
        if(firstParameter >= 0 && (secondParameter >=0 && secondParameter <=59)){
            int hours = firstParameter / 60;
            int minutes =  firstParameter % 60;
            String hourString = hours + "h";
            if (hours < 10){
                hourString = "0" + hourString;
            }
            String minuteString = minutes + "m";
            if (minutes < 10){
                minuteString = "0" + minuteString;
            }
            String secondsString = secondParameter + "s";
            if (secondParameter < 10){
                secondsString = "0" + secondsString;
            }
            return (firstParameter + " minutes and " + secondParameter+" seconds is "+ hourString + " " +minuteString + " "+ secondsString);
        }
        return ERROR_MESSAGE;
    }

    public static String getDurationString(int seconds){
        if(seconds < 0){
            return ERROR_MESSAGE;
        }
        int minutes = seconds /60;
        int remainingSeconds = seconds % 60;
        return (getDurationString(minutes,remainingSeconds));
    }

    public static void main(String[] args) {
        int seconds = -3650;
        System.out.println(getDurationString(seconds));
        System.out.println(getDurationString(250,36));

    }

}

