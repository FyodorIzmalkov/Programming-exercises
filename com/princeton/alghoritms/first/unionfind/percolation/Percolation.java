package princeton.alghoritms.first.unionfind.percolation;

public class Percolation {
//    private int size;
//    private int[] id;
//    private int[] sz;
//    private boolean[] isOpen;
//
//    // creates n-by-n grid, with all sites initially blocked
//    public Percolation(int n) {
//        if (n < 0) {
//            throw new IllegalArgumentException();
//        }
//        this.size = n;
//        int arraySize = n * n - 1;
//        id = new int[arraySize];
//        sz = new int[arraySize];
//        isOpen = new boolean[arraySize];
//
//        for (int i = 0; i < arraySize; i++) {
//            id[i] = i;
//            sz[i] = 1;
//            isOpen[i] = false;
//        }
//    }
//
//    // opens the site (row, col) if it is not open already
//    public void open(int row, int col) {
//        checkIndices(row, col);
//    }
//
//    // is the site (row, col) open?
//    public boolean isOpen(int row, int col) {
//        checkIndices(row, col);
//    }
//
//    // is the site (row, col) full?
//    public boolean isFull(int row, int col) {
//        checkIndices(row, col);
//    }
//
//    // returns the number of open sites
//    public int numberOfOpenSites() {
//        return 0;
//    }
//
//    // does the system percolate?
//    public boolean percolates() {
//
//    }
//
//    private void checkIndices(int row, int col) {
//        if (row < 1 || row > size || col < 1 || col > size) {
//            throw new IllegalArgumentException();
//        }
//    }
//
//    // test client (optional)
//    public static void main(String[] args) {
//
//    }
}
