import java.util.HashMap;
import java.util.Map;

public class Ac_35_HashMap {
    public static void main(String[] args) {
//        HashMap creation...
//        Country(Key)  , Population(Value)
          HashMap<String , Integer> map = new HashMap<>();

//          Insertion...
        map.put("India" , 125);
        map.put("China" , 140);
        map.put("America" , 30);
        map.put("Dubai" , 10);
        map.put("South Korea" , 40);

//        print HashMap...
        System.out.println(map);

//        Updating values...
        map.put("India", 135); // Update values...
        System.out.println("Updating values in same keys in this Map...");
        System.out.println(map);

//        Searching Keys...
        if (map.containsKey("India")){
            System.out.println("Yes \"Key\" is Present in this Map...");
        }else {
            System.out.println("\"Key\" is Not Present in this Map...");
        }

//        getting Values...
        System.out.println("\"India\" contains this Values: " + map.get("India")); // key exists...
        System.out.println("\"Nepal\" contains this Values: " + map.get("Nepal")); // key can't exists...

//        Iteration...
        System.out.println("-------Print Key With values-------");
        for (Map.Entry<String , Integer> e: map.entrySet()){
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
            System.out.println(e);
        }

//        Deletion...
        System.out.println("-------Delete map Items------");
        if (map.containsKey("China")){
            map.remove("China");
            System.out.println("Remove \"China\"");
            System.out.println(map);
        }else {
            System.out.println("already deleted");
        }

    }
}
