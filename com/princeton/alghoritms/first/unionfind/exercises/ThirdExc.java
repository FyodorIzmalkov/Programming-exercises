package princeton.alghoritms.first.unionfind.exercises;

public class ThirdExc {
    private int[] id;
    private int[] sz;
    private int[] actualList;
    private int N;

    public ThirdExc(int N) {
        this.N = N;
        id = new int[N];
        sz = new int[N];
        actualList = new int[N];

        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 1;
            actualList[i] = i;
        }
    }

    private int root(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);

        // weighted
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
            actualList[i] = j;
        }
    }

    public void remove (int i){
        union(i, i + 1);
    }

    public int successor(int i){
        return actualList[root(i + 1)];
    }


    public static void main(String[] args) {
        ThirdExc thirdExc = new ThirdExc(10);
        thirdExc.remove(5);
        thirdExc.remove(6);
        System.out.println(thirdExc.successor(4));
        thirdExc.remove(4);
        System.out.println(thirdExc.successor(3));
        System.out.println(thirdExc.successor(8));
    }
}
