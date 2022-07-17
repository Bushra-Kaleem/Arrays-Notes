public class setMatrixZerosBetterApproach {
    public void setZeroes(int[][] matrix) {
        boolean[] ro=new boolean[matrix.length];
        boolean[] co=new boolean[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    ro[i]=true;
                    co[j]=true;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(ro[i] || co[j])
                    matrix[i][j]=0;
            }
        }
    }
}