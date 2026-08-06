class Matrix {
    int Mtrx[][];
    int n;
    Matrix(int Mtrx[][]){
        this.Mtrx = Mtrx;
        n = Mtrx.length;
    }

    public void Transpose(){
        int newMtrx[][] = new int[n][n];
        for(int i =0; i<n; i++){
            for(int j=0;j<n; j++){
                newMtrx[i][j] = Mtrx[j][i];
            }
        }
        Mtrx = newMtrx;
    }

    @Override
    public String toString(){
        String s = "";
        for(int i =0; i<n; i++){
            for(int j=0;j<n; j++){
                s=s+ Mtrx[i][j]+" ";
            }
            s+="\n";
        }
        return s;
    }
}
