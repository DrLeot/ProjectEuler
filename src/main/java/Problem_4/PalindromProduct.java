package Problem_4;

public class PalindromProduct implements Comparable<PalindromProduct>{

    final Integer factorA;
    final Integer factorB;
    final Integer sum;

    public PalindromProduct(int factorA, int factorB, int sum) {
        this.factorA = factorA;
        this.factorB = factorB;
        this.sum = sum;
    }

    public Integer getSum(){
        return this.sum;
    }

    @Override
    public int compareTo(PalindromProduct o) {
        return sum.compareTo(o.getSum());
    }

    @Override
    public String toString() {
        return factorA+" * "+factorB+" = "+sum;
    }
}
