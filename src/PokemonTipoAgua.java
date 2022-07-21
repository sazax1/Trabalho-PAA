public class PokemonTipoAgua extends Pokemon{

    public PokemonTipoAgua(String nome, double hp, double at, double df, double vl) {
        super(nome, hp, at, df, vl);
    }
    
    public void JatoDeAgua(){
        System.out.println(getNome()+" utilizou Jato de Agua"+"\n");
    }
    
    public void habilidadeEspecial(){
        System.out.println("Aumenta HP quando sofre ataque de agua");
        hp = hp+10;
    }
  

}