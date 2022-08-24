
import java.io.*;
import java.util.*;
public class WordsFrequency {
            public static void main(String[] args)
            {
              if(args.length == 0){
                 System.out.println("Input is Missing.");
                return;
              }
                //"the cat is in the bag"
                String str = args[0];
                Map<String, Integer> hashMap = new HashMap<>();

                String[] words = str.split(" ");

                for (String word : words) {


                    Integer integer = hashMap.get(word);

                    if (integer == null)

                        hashMap.put(word, 1);

                    else {

                        hashMap.put(word, integer + 1);
                    }
                }
                List<Map.Entry<String, Integer> > list =
                        new LinkedList<Map.Entry<String, Integer> >(hashMap.entrySet());

                Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
                    public int compare(Map.Entry<String, Integer> o1,
                                       Map.Entry<String, Integer> o2)
                    {
                        return (o2.getValue()).compareTo(o1.getValue());
                    }
                });
              for(Map.Entry<String, Integer> entrylist : list){
                System.out.println(entrylist.getValue() + " "+ entrylist.getKey());
              }
            }
        }