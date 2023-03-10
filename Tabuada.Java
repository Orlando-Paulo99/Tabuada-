import java.util.Scanner;

public class Tabuada {

  public static void main(String[] args) {
  int valor;
  
  Scanner teclado= new Scanner(System.in);
  
  System.out.println("Olá,Bem-vindo ao Word Number");
  
  System.out.println("Qual operação deseja saber?");
  System.out.println("[1]-Soma\n[2]-Subtração\n[3]-Multiplicação\n[4]-Divisão");
  
 int user1=teclado.nextInt();
 
 if (user1== 1){
   System.out.println("Digite um número");
   valor=teclado.nextInt();
   for (int i=0;i<10;i++){
     System.out.println(valor+"+"+i+"="+(valor+i));
   }
   
 }
 
 else if(user1== 2){
   System.out.println("Digite um número");
   valor=teclado.nextInt();
   for (int s=0;s<10;s++){
     System.out.println(valor+"-"+s+"="+(valor-s));
     
   }
 }
  
  else if(user1== 3){
   System.out.println("Digite um número");
   valor=teclado.nextInt();
   for (int m=0;m<10;m++){
     System.out.println(valor+"*"+m+"="+(valor*m));
     
   }
 }
 
 else if(user1== 4){
   System.out.println("Digite um número");
   valor=teclado.nextInt();
   for (int d=0;d<10;d++){
     System.out.println(valor+"/"+d+"="+(valor/d));
     
   }
 }
  
  
 else{
   System.out.println("Apenas 1,2,3 ou 4");
 }
  
  
  
  teclado.close();
  
  
  
  
  
  
  }

}
