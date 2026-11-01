public class CompareBufferBuilder {
    public static void main(String[] args) {
        int iterations = 1000000;
        long startBuffer = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbuf.append("a");
        }
        long endBuffer = System.nanoTime();
        long bufferDuration = endBuffer - startBuffer;

        long startBuilder = System.nanoTime();
        StringBuilder sbuild = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sbuild.append("a");
        }
        long endBuilder = System.nanoTime();
        long builderDuration = endBuilder - startBuilder;

        System.out.println("StringBuffer Time: " + bufferDuration + " ns");
        System.out.println("StringBuilder Time: " + builderDuration + " ns");
    }
}
