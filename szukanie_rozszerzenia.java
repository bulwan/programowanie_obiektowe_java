import java.io.File;
import java.util.ArrayList;
interface pliki
{
    ArrayList nazwa (File plik, String rozsz);
}
public class dzien_ostateczny {
    public static void main(String[] args) {
        File plikczek = new File("C:\\Users\\Joanna Bulwan\\Desktop\\folder");

        pliki lala = (plik, rozsz) -> {

            String[] pomoc = plik.list();
            ArrayList lista_plikow = new ArrayList();
            for (int i = 0; i < pomoc.length ; i++) {
                if ( plik.listFiles()[i].isDirectory()==false)
                    lista_plikow.add(plik.list()[i]);
            }

            for (int i=0; i<lista_plikow.size(); i++)
            {
                int dlugosc_rozszerzenia = rozsz.length()-1;
                int pomoc_rozsz = 0;
                for (int j=dlugosc_rozszerzenia; j>=0; j--)
                {
                    if(lista_plikow.get(i).toString().charAt(j)==rozsz.charAt(dlugosc_rozszerzenia-pomoc_rozsz))
                    {
                        pomoc_rozsz++;
                        if(pomoc_rozsz==dlugosc_rozszerzenia);
                            System.out.println(lista_plikow.get(i));
                    }
                }
            }

            return lista_plikow;
        };
        System.out.println(lala.nazwa(plikczek, ".rar"));
    }
}
