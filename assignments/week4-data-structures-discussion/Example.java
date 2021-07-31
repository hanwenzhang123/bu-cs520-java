import java.util.*;

public class Example {

    public static void main(String[] args) {
        List<String> bucketList = new ArrayList<>();
        bucketList.add("Visit Alaska");
        bucketList.add("Visit Hawaii");
        bucketList.add("Visit China");
        bucketList.set(2, "Visit Japan");   //replace visit China

        for (String list : bucketList) {
            System.out.println(list);
        }

        Set<String> codingJournal = new LinkedHashSet<>();
        codingJournal.add("2/10/2021");
        codingJournal.add("5/11/2021");
        codingJournal.add("7/31/2021");

        //Check whether have studied on that date
        System.out.println(codingJournal.contains("7/30/2021"));    //false
        System.out.println(codingJournal.contains("7/31/2021"));    //true

        //Traversing the LinkedHashSet
        Iterator<String> trace = codingJournal.iterator();
		while(trace.hasNext()) {                 //elements iterate in insertion order
			System.out.println(trace.next());   //printout dates that have logged for learning to code 
		}
        /*
        2/10/2021
        5/11/2021
        7/31/2021
        */
        
        Map<String, ArrayList<String>> BU = new HashMap<>();
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("SQL");
        ArrayList<String> classes = new ArrayList<>();
        classes.add("CS520");
        classes.add("CS669");
        BU.put("Languages", languages);
        BU.put("Classes", classes);

        System.out.println(BU.get("Languages"));    //[Java, SQL]
        System.out.println(BU.get("Classes"));  //[CS520, CS669]

    }
}
