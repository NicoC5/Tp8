package tp8;
//@author Nicolas
public class Matriz {
    int[][]matriz= new int[4][];
    public Matriz() {
    }
    public void armar(){
        matriz[0]=new int[4];
        matriz[1]=new int[3];
        matriz[2]=new int[5];
        matriz[3]=new int[2];
        int i=0,j=0,k=1;
        for(i=0;i<matriz.length;i++){
            System.out.print("[ ");
            for(j=0;j<matriz[i].length;j++){
                matriz[i][j]=3*k;
                k++;
                System.out.print(matriz[i][j]);
                if(j<(matriz[i].length-1)){
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}
