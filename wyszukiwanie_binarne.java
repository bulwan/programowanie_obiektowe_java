public class szukanie_binarne {
    public static <T extends Comparable<T>> boolean szukanie(T[] tablica, T szukana)
    {
        int poczatek = 0;
        int koniec = tablica.length;
        while(poczatek<=koniec)
        {
            int middle = poczatek + koniec /2;
            if(tablica[middle].compareTo(szukana)==0)
            {
                System.out.println(middle);
                return true;
            }

            else if (tablica[middle].compareTo(szukana)<0)
                poczatek++;
            else
                koniec--;

        }
        return false;

    }

    public static void main(String[] args) {
        Integer[] liczby = new Integer[5];
        liczby[0] = 1;
        liczby[1] = 5;
        liczby[2] = 10;
        liczby[3] = 13;
        liczby[4] = 17;
        System.out.println(szukanie(liczby, 10));

    }
}

