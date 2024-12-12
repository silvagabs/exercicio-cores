
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArcoIris {
    public static void main(String[] args) {

        Set<String> minhasCores = new HashSet<>();
          minhasCores.add("Amarelo");
          minhasCores.add("Azul");
          minhasCores.add("Vermelho");
          minhasCores.add("Laranja");
          minhasCores.add("Anil");
          minhasCores.add("Roxo");
          minhasCores.add("Verde");

          /* exiba todas as cores uma abaixo da outra */

          System.out.println("As cores do arco-iris são:\n");
         
          for (String cor1 : minhasCores) {
            System.out.println(cor1);
          }

          /* a quantidade de cores q o arco iris tem */

          System.out.println("-------------------------");

          System.out.println("O arco-iris tem " + minhasCores.size() + " cores.");

          System.out.println("-------------------------");

          /* exiba as cores em ordem alfabetica */

          Set<String> minhasCores2 = new TreeSet<>(minhasCores); 

          System.out.println("Ordem alfabética:\n");

          for (String cor2 : minhasCores2) {
            System.out.println(cor2);
          }
          System.out.println("-------------------------");

          /* exiba as cores na ordem inversa da que foi informada */

          System.out.println("Ordem inversa:\n");
          
          List<String> lista=new ArrayList<>(minhasCores2);
          Collections.reverse(lista);
          for (String cor3 : lista) {
            System.out.println(cor3);
          }
          /* exiba todas as cores que começam com a letra 'V' */

          System.out.println("-------------------------");

          /* remova todas as cores que nao começam com a letra 'V' */

          char letraV= 'V';

          minhasCores.removeIf(minhaCor->minhaCor.startsWith(String.valueOf(letraV)));
          for (String minhaCor : minhasCores) {
            System.out.println(minhaCor);
          }

          /* limpe o conjunto */

          minhasCores.clear();

          /* confira se o conjunto esta vazio */

          System.out.println("-------------------------");

          System.out.println("O conjunto esta vazio? " + minhasCores.isEmpty());
    }

}
        

