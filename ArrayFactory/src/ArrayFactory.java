public class ArrayFactory {
    private int size;

    public ArrayFactory(int X){
        this.size = X;
    }

    public int[] oneDimension(){
        return new int[size];
    }

    public int[][] twoDimension(){
        return new int[size][size];
    }

    public int[][] Matrix(){
        int[][] temp = twoDimension();
        for( int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(i==j) {
                    temp[i][j] = 1;
                }else{
                    temp[i][j]=0;
                }
            }
        }
        return temp;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
