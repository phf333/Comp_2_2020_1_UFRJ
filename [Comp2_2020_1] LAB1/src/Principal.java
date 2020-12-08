import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Principal {


    public static void main(String[] args){

        System.out.println("Digite a seguir o DRE e a nota do aluno \n" + "Para Finalizar digite um DRE qualquer seguido de uma nota negativa, DRE -1");
        long dre;
        float nota=0;
        int totaldenotas=0;
        float notamaisalta=0;
        float somadasnotas=0;
        long alunocomnotamaisalta=0;


        Scanner scanner = new Scanner(System.in);
        while (nota>=0) {
            System.out.println("Digite DRE e a nota do aluno:");
            dre = scanner.nextLong(); nota = scanner.nextFloat();


            if (nota >= 0.0) {

                if (nota>notamaisalta){
                    notamaisalta=nota;
                    alunocomnotamaisalta=dre;
                }
                totaldenotas++;
                somadasnotas+=nota;

            } else {
                System.out.printf("%d notas digitadas \n",totaldenotas);
                float x;
                x=somadasnotas/totaldenotas;
                System.out.printf("media da turma %.2f \n",x);
                System.out.println("DRE com maior media " + alunocomnotamaisalta);

                }

            }

        }
    }



