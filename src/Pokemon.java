public abstract class Pokemon {
  String nome;
  double hp,at,df,vl;

    public Pokemon(String nome, double hp, double at, double df, double vl) {
        this.nome = nome;
        this.hp = hp;
        this.at = at;
        this.df = df;
        this.vl = vl;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getAt() {
        return at;
    }

    public void setAt(double at) {
        this.at = at;
    }

    public double getDf() {
        return df;
    }

    public void setDf(double df) {
        this.df = df;
    }

    public double getVl() {
        return vl;
    }

    public void setVl(double vl) {
        this.vl = vl;
    }
    
    public String toString(){
        String nome = "Nome: "+getNome()+"\n";
        String hp = "Vida: "+getHp()+"\n";
        String at = "Ataque: "+getAt()+"\n";
        String df = "Defesa: "+getDf()+"\n";
        String vl = "Velocidade: "+getVl()+"\n";
        
        return nome+hp+at+df+vl;
    }
    
    public abstract void habilidadeEspecial();
    
  
  

}