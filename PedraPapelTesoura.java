import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[]args){
        while (true) {
            JogarPPT();   
        }
        
    }
    
    public static void JogarPPT(){
        Scanner ppt = new Scanner(System.in);
        System.out.println("escolha: pedra, papel ou tesoura");
        String escolha = ppt.nextLine();


        double EscolhaPPT = (Math.random()*3)+1;
        double Combate = Math.floor( EscolhaPPT);
        String Combatee = String.valueOf(Combate);
         if(escolha.contains("pedra") && Combate == 1){
            System.out.println("voce venceu");
         }else{
            System.out.println("tu perdeu");
         }
              
       }
        
}



