public class indirectgraph {
  private   int[][] adjmatrix;
   private int V;
   private int e;
    public  indirectgraph(int nodes){
        this.V=nodes;
        this.e=0;
      this.adjmatrix=new int[nodes][nodes];
  }
  public void addedges(int v, int u){
        this.adjmatrix[u][v]=1;
        this.adjmatrix[v][u]=1;
        e++;
  }

    public static void main(String[] args) {
        indirectgraph ingraph=new indirectgraph(4);
        ingraph.addedges(0,1);
        ingraph.addedges(1,2);
        ingraph.addedges(2,3);
        ingraph.addedges(3,4);
    }
}
