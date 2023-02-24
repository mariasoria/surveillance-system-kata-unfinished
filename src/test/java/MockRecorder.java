import static org.assertj.core.api.Assertions.assertThat;

class MockRecorder implements Recorder {
    private RecordedImage recordedImage;

    public void assertThatStoreImageWasCalledWith(RecordedImage image) {
        assertThat(this.recordedImage).isEqualTo(image);
    }

    @Override
    public void storeImage(RecordedImage image) {
        this.recordedImage = image;
    }
}
