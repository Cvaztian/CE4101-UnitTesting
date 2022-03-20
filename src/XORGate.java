public class XORGate {
    private boolean input1, input2;
    private boolean output;

    public XORGate(boolean input1, boolean input2) {
        this.input1 = input1;
        this.input2 = input2;
        xorBits();
    }

    public boolean xorBits() {
        this.output = (input1 ^ input2);
        return this.output;
    }

    public boolean isInput1() {
        return input1;
    }

    public void setInput1(boolean input1) {
        this.input1 = input1;
        xorBits();
    }

    public boolean isInput2() {
        return input2;
    }

    public void setInput2(boolean input2) {
        this.input2 = input2;
        xorBits();
    }

    public boolean isOutput() {
        return output;
    }

}
