public class OddEvenPrinter {
    private String label;
    private int start;
    private int end;
    public OddEvenPrinter(String label, int start, int end) {
        this.label = label;
        this.start = start;
        this.end = end;
    }
    public void print1() {
        for (int i = 1; i <= 1000; i += 2) {
            System.out.println("Odd : " + i);
        }
    }
    public void print2() {
        for (int i = 2; i <= 1000; i += 2) {
            System.out.println("Even: " + i);
        }
    }

    public String getLabel() {
        return label;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }
}
