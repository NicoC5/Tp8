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
        int i;
        for(i=0;i<4;i++){
            matriz[0][i]=(i+1)*3;
        }
        for(i=0;i<3;i++){
            matriz[1][i]=15+i*3;
        }
        for(i=0;i<5;i++){
            matriz[2][i]=24+i*3;
        }
        for(i=0;i<2;i++){
            matriz[3][i]=39+i*3;
        }
    }
}
