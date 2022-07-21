import java.util.HashSet;
import java.util.Set;

public class TrabalhoPOO {
    public static void main(String[] args) {
       PokeAgenda pa = new PokeAgenda();
       
       Bulbasauro b1 = new Bulbasauro("Bulbasauro 1",100,10,10,5);
       Bulbasauro b2 = new Bulbasauro("Bulbasauro 2",100,10,10,5);
       
       ((PokeAgenda)pa).addVenenoso(b1);
       ((PokeAgenda)pa).addGrama(b1);
       ((PokeAgenda)pa).addVenenoso(b2);
       ((PokeAgenda)pa).addGrama(b2);
       
       Charizard c1 = new Charizard("Charizard 1",100,10,10,5);
       Charizard c2 = new Charizard("Charizard 2",100,10,10,5);
       
       ((PokeAgenda)pa).addVoador(c1);
       ((PokeAgenda)pa).addFogo(c1);
       ((PokeAgenda)pa).addVoador(c2);
       ((PokeAgenda)pa).addFogo(c2);
       
       Blaziken bl1 = new Blaziken("Blaziken 1",100,10,10,5);
       Blaziken bl2 = new Blaziken("Blaziken 2",100,10,10,5);
       
       ((PokeAgenda)pa).addLutador(bl1);
       ((PokeAgenda)pa).addFogo(bl1);
       ((PokeAgenda)pa).addLutador(bl2);
       ((PokeAgenda)pa).addFogo(bl2);
       
       Poliwrath p1 = new Poliwrath("Poliwrath 1",100,10,10,5);
       Poliwrath p2 = new Poliwrath("Poliwrath 2",100,10,10,5);
       
       ((PokeAgenda)pa).addLutador(p1);
       ((PokeAgenda)pa).addAgua(p1);
       ((PokeAgenda)pa).addLutador(p2);
       ((PokeAgenda)pa).addAgua(p2);
       
       Zubat z1 = new Zubat("Zubat 1",100,10,10,5);
       Zubat z2 = new Zubat("Zubat 2",100,10,10,5);
       
       ((PokeAgenda)pa).addVoador(z1);
       ((PokeAgenda)pa).addVenenoso(z1);
       ((PokeAgenda)pa).addVoador(z2);
       ((PokeAgenda)pa).addVenenoso(z2);
       
        ((PokeAgenda)pa).mostrarAgua();
        System.out.println("\n");
        ((PokeAgenda)pa).mostrarFogo();
        System.out.println("\n");
        ((PokeAgenda)pa).mostrarGrama();
        System.out.println("\n");
        ((PokeAgenda)pa).mostrarLutador();
        System.out.println("\n");
        ((PokeAgenda)pa).mostrarVenenoso();
        System.out.println("\n");
        ((PokeAgenda)pa).mostrarVoador();
        System.out.println("\n");
        ((PokeAgenda)pa).mostrarTodos(); 
    }

}
