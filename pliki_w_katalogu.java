import java.io.File;
import java.util.ArrayList;
interface pliki
{
    ArrayList nazwa (File plik);
}
public class dzien_ostateczny {
    public static void main(String[] args) {
        File plikczek = new File("C:\\Users\\Joanna Bulwan\\Desktop\\folder");

        pliki lala = (plik) -> {
            String[] pomoc = plik.list();
            ArrayList lista_plikow = new ArrayList();
            for (int i = 0; i < pomoc.length ; i++) {
                if ( plik.listFiles()[i].isDirectory()==false)
                    lista_plikow.add(plik.list()[i]);
            }
            return lista_plikow;
        };
        System.out.println(lala.nazwa(plikczek));
    }
}
