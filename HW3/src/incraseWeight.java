public interface incraseWeight {
    void increaseWeight(int n);

    default int aIsAplusB(int a, int b) {
        return a += b;
    }
}
