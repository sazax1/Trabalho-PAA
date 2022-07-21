import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PokeAgenda {
  
    Set<Pokemon> listaCompleta = new HashSet<>();
    Set<PokemonTipoAgua> listaAgua = new HashSet<>();
    Set<PokemonTipoFogo> listaFogo = new HashSet<>();
    Set<PokemonTipoGrama> listaGrama = new HashSet<>();
    Set<Venenoso> listaVenenoso = new HashSet<>();
    Set<Lutador> listaLutador = new HashSet<>();
    Set<Voador> listaVoador = new HashSet<>();
    Iterator<Pokemon> iterator = listaCompleta.iterator();
    
    public void addAgua(PokemonTipoAgua pa){
        listaCompleta.add(pa);
        listaAgua.add(pa);
    }
    
    public void addFogo(PokemonTipoFogo pa){
        listaCompleta.add(pa);
        listaFogo.add(pa);
    }
    
    public void addGrama(PokemonTipoGrama pa){
        listaCompleta.add(pa);
        listaGrama.add(pa);
    }
    
    public void addVenenoso(Venenoso pa){
        listaCompleta.add((Pokemon) pa);
        listaVenenoso.add(pa);
    }
    
    public void addLutador(Lutador pa){
        listaCompleta.add((Pokemon) pa);
        listaLutador.add(pa);
    }
    
    public void addVoador(Voador pa){
        listaCompleta.add((Pokemon) pa);
        listaVoador.add(pa);
    }
    
    public void mostrar(Pokemon p){
    if(listaCompleta.contains(p)){
        System.out.println("Nome: "+p.getNome()+"\n");
        System.out.println("Vida: "+p.getHp()+"\n");
        System.out.println("Ataque: "+p.getAt()+"\n");
        System.out.println("Defesa: "+p.getDf()+"\n");
        System.out.println("Velocidade: "+p.getVl()+"\n");
    }else{
        System.out.println("Pokemon não encontrado!");
    }
    }
    
    public void mostrarTodos(){
        System.out.println("Todos os Pokemons:");
        System.out.println(listaCompleta.toString());
        
    }
    
    public void mostrarAgua(){
        System.out.println("Pokemons Tipo Agua:");
        System.out.println(listaAgua.toString());
    }
    
    public void mostrarFogo(){
        System.out.println("Pokemons Tipo Fogo:");
        System.out.println(listaFogo.toString());
    }
    
    public void mostrarGrama(){
        System.out.println("Pokemons Tipo Grama:");
        System.out.println(listaGrama.toString());
    }
    
    public void mostrarVoador(){
        System.out.println("Pokemons Tipo Voador:");
        System.out.println(listaVoador.toString());
    }
    
    public void mostrarVenenoso(){
        System.out.println("Pokemons Tipo Venenoso:");
        System.out.println(listaVenenoso.toString());
    }
    
    public void mostrarLutador(){
        System.out.println("Pokemons Tipo Lutador:");
        System.out.println(listaLutador.toString());
    }
    
}
    