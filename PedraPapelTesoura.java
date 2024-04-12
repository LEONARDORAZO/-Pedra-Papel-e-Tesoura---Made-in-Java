import java.util.Scanner;

public class PedraPapelTesoura {
    public static int PontosJ = 0, PontosIA = 0;
    public static void main(String[]args){
       int rodada = 1;
        while (rodada < 4) {
            JogarPPT();
            rodada += 1;   
        }
        System.out.println("placar :" + " JOGADOR - " + PontosJ + " |" + " IA - " + PontosIA);
    }
    
    public static void JogarPPT(){
        Scanner ppt = new Scanner(System.in);
        System.out.println("escolha: pedra, papel ou tesoura");
        String escolha = ppt.nextLine();


        double EscolhaPPT = (Math.random()*3)+1;
        double Combate = Math.floor( EscolhaPPT);
        int CombatePpt = (int)Combate;

    switch (CombatePpt) {
        case 1:
            if(escolha.contains("pedra") && Combate == 1){ System.out.println("você venceu"); PontosJ += 1; System.out.println("Placar : " + PontosJ + " VS " + PontosIA);}
            if (escolha.contains("papel") && Combate == 1){ System.out.println("tu perdeu"); PontosIA += 1; System.out.println("Placar : " + PontosJ + " VS " + PontosIA);}
            if(escolha.contains("tesoura") && Combate == 1){ System.out.println("tu perdeu"); PontosIA += 1; System.out.println("Placar : " + PontosJ + " VS " + PontosIA);}
            break;
        case 2:
            if(escolha.contains("pedra") && Combate == 2){ System.out.println("tu perdeu"); PontosIA += 1; System.out.println("Placar : " + PontosJ + " VS " + PontosIA);}
            if (escolha.contains("papel") && Combate == 2){ System.out.println("você venceu"); PontosJ += 1; System.out.println("Placar : " + PontosJ + " VS " + PontosIA);}
            if(escolha.contains("tesoura") && Combate == 2){ System.out.println("tu perdeu"); PontosIA += 1; System.out.println("Placar :" + PontosJ + " VS " + PontosIA);}
                break;
        case 3: 
            if(escolha.contains("pedra") && Combate == 3){ System.out.println("tu perdeu"); PontosIA += 1; System.out.println("Placar : " + PontosJ + " VS " + PontosIA);}
            if (escolha.contains("papel") && Combate == 3){ System.out.println("tu perdeu"); PontosIA += 1; System.out.println("Placar : " + PontosJ + " VS " + PontosIA);}
            if(escolha.contains("tesoura") && Combate == 3){ System.out.println("você venceu"); PontosJ += 1; System.out.println("Placar : " + PontosJ + " VS " + PontosIA);}
             break;
        }
     



        }

}
        




