import java.util.Random;
public class JogoV2 {
    public static void main(String[] args) throws Exception {
        //1. caçar
        //2. comer
        //3. dormir
        var gerador = new Random();
        var p1 = new Personagem();
        p1.nome = "Breno";
        while(true){
            int oQueFazer =  gerador.nextInt(1, 4);
            switch(oQueFazer){
                case 1:
                    p1.cacar();
                    break;
                case 2:
                    p1.comer();
                    break;
                case 3:
                    p1.dormir();
                    break;
            }
           // p1.exibirEstado();
            System.out.println(p1);
            System.out.println("===================================");
            Thread.sleep(8000);
        }
    }
}
