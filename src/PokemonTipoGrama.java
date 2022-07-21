public class PokemonTipoGrama extends Pokemon{

    public PokemonTipoGrama(String nome, double hp, double at, double df, double vl) {
        super(nome, hp, at, df, vl);
    }
    
    public void FolhaNavalha(){
        System.out.println(getNome()+" utilizou Folha Navalha"+"\n");
    }
    
    public void habilidadeEspecial(){
        System.out.println("Aumenta defesa quando luta sobre a grama");
        df = df+10;
    }
  

}