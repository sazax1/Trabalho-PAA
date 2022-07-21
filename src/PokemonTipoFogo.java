public class PokemonTipoFogo extends Pokemon{

    public PokemonTipoFogo(String nome, double hp, double at, double df, double vl) {
        super(nome, hp, at, df, vl);
    }
  
    public void LançaChamas(){
        System.out.println(getNome()+" utilizou Lança Chamas"+"\n");
    }
    
    public void habilidadeEspecial(){
        System.out.println("Aumenta potência de ataque quando luta sobre a grama");
        at = at+10;
    }
    
    

}