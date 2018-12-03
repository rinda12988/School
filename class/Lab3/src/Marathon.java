public class Marathon {
    public static void main(String[] args) {
        String[] names = {
            "Elena",
            "Thomas",
            "Hamilton",
            "Suzie",
            "Phil",
            "Matt",
            "Alex",
            "Emma",
            "John",
            "James",
            "Jane",
            "Emily",
            "Daniel",
            "Neda",
            "Aaron",
            "Kate"
        };

        int[] times = {
            341,
            273,
            278,
            329,
            445,
            402,
            388,
            275,         
            243,
            334,
            412,
            393,
            299,
            343,
            317,
            265
        };

        int min = 0;
        for (int i = 1; i < names.length; i++) { 
            if (times[i] < times[min]) { //Checking the minimum value out of 16 elements
                min = i;
            }
        }

        int minutes = times[min] / 60;
        int seconds = times[min] - (minutes * 60);

        System.out.println(String.format("Fastest runner was %1$s with a time of %2$d:%3$02d", names[min], minutes, seconds));
        // After %, the number means the order of parameters. After $, the first 0 means "pad with zeros" and the 2 means "use two digits."   
    }
}