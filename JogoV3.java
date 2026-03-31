import java.util.Random;
public class JogoV3 {
    public static void main(String[] args) throws Exception {
        //1. caçar
        //2. comer
        //3. dormir
        var gerador = new Random();
        var p1 = new Personagem("Valdines");

        var p2 = new Personagem("Cleber", 5, 9, 2);
       
        var p3 = new Personagem("Joli", 5, 5, 5);

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
            int oQueFazer2 =  gerador.nextInt(1, 11);
            switch(oQueFazer2){
                case 1, 2, 3, 4, 5, 6:
                    p2.cacar();
                    break;
                case 7, 8:
                    p2.comer();
                    break;
                case 9, 10:
                    p2.dormir();
                    break;
            }
           // p1.exibirEstado();
            System.out.println(p2);
            System.out.println("===================================");
            Thread.sleep(8000);
        }
        }
    }