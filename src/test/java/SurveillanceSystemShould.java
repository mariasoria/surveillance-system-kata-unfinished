import org.junit.jupiter.api.Test;


class SurveillanceSystemShould {

    @Test
    public void record_images_upon_movement_detection() {
        var recorder = new MockRecorder();
        var cameras = new MockCameras();
        var surveillanceController = SurveillanceController.create(recorder, cameras);
        RecordedImage recordedImage = RecordedImage.snapshot();
        cameras.simulateEventWith(recordedImage);

        recorder.assertThatStoreImageWasCalledWith(recordedImage);
    }
}