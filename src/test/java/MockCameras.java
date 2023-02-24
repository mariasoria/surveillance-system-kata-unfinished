class MockCameras implements Cameras {
    private CameraListener listener;

    public void simulateEventWith(RecordedImage image) {
        this.listener.onRecordedImage(image);
    }

    @Override
    public void subscribe(CameraListener listener) {
        this.listener = listener;
    }
}
