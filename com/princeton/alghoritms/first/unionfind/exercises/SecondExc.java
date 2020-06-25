package princeton.alghoritms.first.unionfind.exercises;

public class SecondExc {
    private int[] id;
    private int[] sz;
    private int[] max;

    public SecondExc(int N) {
        id = new int[N];
        sz = new int[N];
        max = new int[N];

        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 1;
            max[i] = i;
        }
    }

    private int root(int i) {
        while (i != id[i]) {
            id[i] = id[id[i]]; // path compression
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);

        if (i == j) {
            return;
        }

        // weighted
        if (sz[i] < sz[j]) {
            id[i] = j;
            max[j] = max[j] > max[i] ? max[j] : max[i];
            sz[j] += sz[i];
        } else {
            id[j] = i;
            max[i] = max[i] > max[j] ? max[i] : max[j];
            sz[i] += sz[j];
        }
    }

    public int find(int i) {
        return max[root(i)];
    }

    public static void main(String[] args) {
        SecondExc secondExc = new SecondExc(10);
        secondExc.union(0, 1);
        secondExc.union(1, 9);
        secondExc.union(1, 2);
        System.out.println(secondExc.find(0));
    }
}
