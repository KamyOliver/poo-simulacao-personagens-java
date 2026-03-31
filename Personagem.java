public class Personagem {
    String nome;
    int energia = 10;
    int fome = 0;
    int sono = 0;
    //contrutor padrao
    public Personagem(){
        energia = 10;
        fome = 0;
        sono = 0;
    }
    public Personagem(String nome){
        this(); // o () do this é os parametros q ele vai procurar para achar qual construtor chamar, no caso o personagem() nao o personagem(jsjsjsdjj)
        this.nome = nome;
    }
//proxima linha (construtor) 
    public Personagem(String nome, int energia, int fome, int sono){
        this.nome = nome;
        setEnergia(energia);
        setFome(fome);
        setSono(sono);
    }
    //setter
    public void setEnergia(int e){
        if (e >= 0 && e <= 10)
        energia = e;
    }

    public void setFome(int fome) {
        if (fome >= 0 && fome <= 10)
        this.fome = fome;
    }

    public void setSono(int sono) {
        if (sono >= 0 && sono <= 10)
        this.sono = sono;
    }

    void cacar(){

        if(energia >=2){
            energia = energia - 2;    
            System.out.println(nome + " caçando. . .");
        }

        else {
            System.out.println(nome + "sem energia pra caçar. . .");
        }

        if (fome < 10)
            fome ++;

        sono = Math.min(sono + 1, 10);
    }

    void comer(){
        if(fome > 0){
            System.out.printf("%s comendo. . .\n", nome);
            --fome;
            energia = energia < 10 ? energia + 1 : energia;
        }
        else {
            System.out.printf("%s sem fome. . .\n", nome);
        }
    }

    void dormir(){
        switch(sono){
            case 0:
                System.out.printf("%s sem sono. . .\n", nome);
                break;
            default:
                System.out.print(nome + " dormindo. . .\n");
                sono--;
                energia = Math.min(energia + 1, 10);
                break;
        }
    }
   // void exibirEstado(){
      //  System.out.printf("%s: e: %d, f: %d, s: %d\n", nome, energia, fome, sono);
   // }
    @Override
    public String toString() {
        return String.format(" %s: e: %d, f: %d, s: %d", nome, energia, fome, sono);
    }
}