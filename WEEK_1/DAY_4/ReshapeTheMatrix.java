class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        if(r*c!=m*n)return mat;
        int[][] p=new int[r][c];
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                q.add(mat[i][j]);
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                p[i][j]=q.remove();
                if(q.size()==0)break;
            }
            if(q.size()==0)break;
        }
        return p;
    }
}
