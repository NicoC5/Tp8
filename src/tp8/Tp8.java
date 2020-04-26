package tp8;
//@author Nicolas
public class Tp8 {
    
    public static void main(String[] args) {
        int i,j;
        Matriz m= new Matriz();
        m.armar();
        System.out.println("Los valores pares de las siguientes filas son");
        for(i=0;i<4;i++){
            System.out.print("Fila "+(i+1)+"->");
            for(j=0;j<m.matriz[i].length;j++){
                if(m.matriz[i][j]%2==0){
                    System.out.print(m.matriz[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
