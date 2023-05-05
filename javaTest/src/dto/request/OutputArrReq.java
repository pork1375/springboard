package dto.request;

public class OutputArrReq {

    private int arr;

    public int getArr() {
        return arr;
    }

    public void setArr(int arr) {
        this.arr = arr;
    }

    public OutputArrReq(int arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "OutputArr{" +
                "arr=" + arr +
                '}';
    }
}
