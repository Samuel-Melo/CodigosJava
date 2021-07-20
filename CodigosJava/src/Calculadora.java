import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
	
         Scanner sc = new Scanner(System.in);
    
        int rsp;
        int[] calc= {0, 0};
            
        System.out.println("---Calculadora---");
        for(int c=0; c<2;c++) {
            System.out.printf("Informe o %d número: ", c+1);
            calc[c] = sc.nextInt();     
                sc.nextLine();
            }
            System.out.print("Qual calculo deseja fazer?\n[1]Soma\n[2]Subtração\n[3]Divisão\n[4]Multiplicação\nResposta: ");
            rsp = sc.nextInt();
            
        switch(rsp) {
        case 1:
            System.out.printf("%d + %d = %d", calc[0], calc[1], soma(calc[0], calc[1]));
            break;
         case 2:
            System.out.printf("%d - %d = %d", calc[0], calc[1], subtracao(calc[0], calc[1]));
            break;
        case 3:
                System.out.printf("%d / %d = %d", calc[0], calc[1], divisao(calc[0], calc[1]));
           break;
        case 4:
            System.out.printf("%d X %d = %d", calc[0], calc[1], multiplicacao(calc[0], calc[1]));
            break;
        default:
           System.out.printf("Valor invalido!");
        }
        }
            
    static int soma(int x, int y) {
            return x+y;
    }
    static int subtracao(int x, int y) {
        return x-y;
    }
    static int divisao(int x, int y) {
            return x/y;
    }
    static int multiplicacao(int x, int y) {
            return x+y;
    }
}

