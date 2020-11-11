package epam.ninthTask.functionTg.entity;

public class NineTaskFunc {
    private double segmentA;
    private double segmentB;
    private double stepH;

    public NineTaskFunc(int segmentA, int segmentB, double stepH) {
        this.segmentA = segmentA;
        this.segmentB = segmentB;
        this.stepH = stepH;
    }

    public double getSegmentA() {
        return segmentA;
    }

    public void setSegmentA(int segmentA) {
        this.segmentA = segmentA;
    }

    public double getSegmentB() {
        return segmentB;
    }

    public void setSegmentB(int segmentB) {
        this.segmentB = segmentB;
    }

    public double getStepH() {
        return stepH;
    }

    public void setStepH(double stepH) {
        this.stepH = stepH;
    }

    @Override
    public String toString() {
        return "segment [a,b] = [" + segmentA +
                ","+segmentB+"], and step h = " + stepH;
    }
}
