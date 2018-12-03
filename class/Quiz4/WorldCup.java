import java.util.Random;
import java.util.HashMap;
import java.util.Set;
public class WorldCup{
 public static void main(String[]args){
  HashMap<Long,String> hashMap =new HashMap<>();
  hashMap.put(1L, "Uruguay");
  hashMap.put(2L, "Russia");
  hashMap.put(3L, "Saudi Arabia");
  hashMap.put(4L, "Egypt");
  hashMap.put(5L, "Spain");
  hashMap.put(6L, "Portugal");
  hashMap.put(7L, "Iran");
  hashMap.put(8L, "Morocco");
  hashMap.put(9L, "France");
  hashMap.put(10L, "Denmark");
  hashMap.put(11L, "Peru");
  hashMap.put(12L, "Australia");
  hashMap.put(13L, "Croatia");
  hashMap.put(14L, "Argentina");
  hashMap.put(15L, "Nigeria");
  hashMap.put(16L, "Iceland");
  hashMap.put(17L, "Brazil");
  hashMap.put(18L, "Switzerland");
  hashMap.put(19L, "Serbia");
  hashMap.put(20L, "Costa Rica");
  hashMap.put(21L, "Sweden");
  hashMap.put(22L, "Mexico");
  hashMap.put(23L, "South Korea");
  hashMap.put(24L, "Germany");
  hashMap.put(25L, "Belgium");
  hashMap.put(26L, "England");
  hashMap.put(27L, "Tunisia");
  hashMap.put(28L, "Panama");
  hashMap.put(29L, "Colombia");
  hashMap.put(30L, "Japan");
  hashMap.put(31L, "Senegal");
  hashMap.put(32L, "Poland");

Set<Long> keys = hashMap.keySet();
for(Long i : keys){
    System.out.println(i + " : " + hashMap.get(i));
}

 }
}



