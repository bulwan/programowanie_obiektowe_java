import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class zadanie2 {
    public static void luckySort(ArrayList<String> strings, Comparator<String> comp)
    {
        boolean pomoc=false;

        while (pomoc!=true)
        {
            pomoc = true;
            Collections.shuffle(strings);
            for (int i=0; i<strings.size()-1; i++)
            {
                if (comp.compare(strings.get(i), strings.get(i+1))>=0)
                    pomoc = false;
            }
            System.out.println("." + strings);
        }
        System.out.println(strings);
    }
    public static void main(String[] args) {
        ArrayList<String> jakkolwiek = new ArrayList<String>();
        jakkolwiek.add("A");
        jakkolwiek.add("B");
        jakkolwiek.add("C");
        jakkolwiek.add("D");
        Comparator<String> nowy = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(o2))
                    return 0;
                else if (o1.compareTo(o2)>0)
                    return 1;
                else
                    return -1;
            }
        };
        luckySort(jakkolwiek, nowy);

//        for (int i=0; i<jakkolwiek.size()-1; i++)
//        {
//            if (nowy.compare(jakkolwiek.get(i), jakkolwiek.get(i+1))<=0)
//                System.out.println("a");
//
//        }


    }
}
