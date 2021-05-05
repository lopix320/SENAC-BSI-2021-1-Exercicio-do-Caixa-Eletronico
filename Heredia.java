/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heredia;
import java.util.Scanner;
/**
 *
 * @author gabri
 */
public class Heredia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int notas = 0, qnt = 0, valor, i = 0, a = 0, b = 0,c = 0, d = 0, e = 0, f = 0, g = 0;
        System.out.println("Digite o valor a ser sacado?");
        valor = leitor.nextInt();
        while(!(qnt == valor)){
            if(qnt < valor){
                qnt += 100;
                i++;
            }
            if(qnt > valor){
                qnt -= 100;
                i--;
                if(qnt < valor){
                    qnt += 50;
                    b++;
                    if(qnt > valor){
                        qnt -= 50;
                        b--;
                        if(qnt < valor){
                            qnt += 20;
                            d++;
                            if(qnt > valor ){
                                qnt -= 20;
                                d--;
                                if(qnt < valor){
                                    qnt += 10;
                                    e++;
                                    if(qnt > valor){
                                        qnt -= 10;
                                        e--;
                                        if(qnt < valor){
                                            qnt += 5;
                                            f++;
                                            if(qnt > valor){
                                                qnt -= 5;
                                                f--;
                                                if(qnt < valor){
                                                    qnt += 2;
                                                    g++;
                                                    if(qnt > valor){
                                                        qnt -= 2;
                                                        g--;
                                                        if(qnt < valor){
                                                            qnt += 1;
                                                            c++;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Das notas que você pode sacar, você sacou: " + i + " notas de 100\n" +  b + " notas de 50\n" + d + " notas de 20\n" + e + " notas de 10\n" + f + " notas de 5\n" + g + " notas de 2\n" + c + " notas de 1");
        
    }
    
}
