public class Personagem2 {
    String nome;
    int energia = 5;
    int fome = 9;
    int sono = 2;

    void cacar(){
      if (energia >= 2){
        System.out.println(nome + " caçando");
        energia = energia - 2;
      }
      else{
        System.out.println(nome + "esta sem energia pra caçar");
      }
      if (fome<10){
        fome++;
      }
      if(sono<10){
        sono++;
      }
    }

    void comer(){
      if (fome>0){
        System.out.println(nome + " comendo");
        fome--;
      }
      else{
        System.out.println(nome + "esta sem fome");
      }
    }

    void dormir(){
        if (sono>0){
            System.out.println(nome + "esta dormindo");
            sono--;
            energia = Math.min(energia + 1, 10);
        }
        else{
            System.out.println(nome + "esta sem sono");
        }
    }

    @Override
    public String toString() {
        return String.format(" %s: e: %d, f: %d, s: %d", nome, energia, fome, sono);
    }

    
}
