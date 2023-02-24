import java.util.Objects;

class RecordedImage {

    private final long timeStamp;

    public RecordedImage(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public static RecordedImage snapshot() {
        return new RecordedImage(System.currentTimeMillis());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RecordedImage)) return false;
        RecordedImage that = (RecordedImage) o;
        return timeStamp == that.timeStamp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeStamp);
    }
}
