import java.util.Scanner;
public class Holas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Matriz Suma de Diagonal Principal.\n");
        System.out.print("Inserta numero Filas: ");
        int nFilas=sc.nextInt();
        System.out.print("Inserta numero Columnas: ");
        int nColumnas=sc.nextInt();
        
        int [][] matriz = new int [nFilas][nColumnas];
                
        System.out.println("Guardar Matriz: ");
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nColumnas; j++){
                System.out.print("Matriz: ["+i+"]["+j+"]: ");
                matriz[i][j]=sc.nextInt();
            }
        }
        //Matriz Original 
        System.out.println("\nMatriz Original: ");
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nColumnas; j++){
                System.out.print("["+matriz[i][j]+"]" + " ");
            }
                System.out.println();
        }
        
        //Suma Diagonal Principal
        System.out.println("\nSuma Diagonal Principal:");
        int sumaDiagonal=0;
        for(int i=0, j=0; i<matriz.length; i++, j++){
            sumaDiagonal += matriz[i][j];
            System.out.println("["+matriz[i][j]+"]" + " ");
        }
        System.out.println("La suma de la Matriz principal es: "+sumaDiagonal);
    }
}