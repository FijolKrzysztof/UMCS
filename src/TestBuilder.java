public class TestBuilder {
    int a1, a2, a3, a4;

    public TestBuilder(int a1, int a2, int a3, int a4) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
    }

    @Override
    public String toString() {
        return "TestBuilder{" +
                "a1=" + a1 +
                ", a2=" + a2 +
                ", a3=" + a3 +
                ", a4=" + a4 +
                '}';
    }

    public static class Builder {
        int a1 = 0, a2 = 0, a3 = 0, a4 = 0;

        public Builder setA1(int a1) {
            this.a1 = a1;
            return this;
        }

        public Builder setA2(int a2) {
            this.a2 = a2;
            return this;
        }

        public Builder setA3(int a3) {
            this.a3 = a3;
            return this;
        }

        public Builder setA4(int a4) {
            this.a4 = a4;
            return this;
        }

        public TestBuilder build() {
            return new TestBuilder(this.a1, this.a2, this.a3, this.a4);
        }
    }
}
