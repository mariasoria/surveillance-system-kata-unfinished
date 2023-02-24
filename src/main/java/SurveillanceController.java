class SurveillanceController {
    private final Recorder recorder;
    private final Cameras cameras;

    private SurveillanceController(Recorder recorder, Cameras cameras) {
        this.recorder = recorder;
        this.cameras = cameras;
    }

    public static SurveillanceController create(Recorder recorder, Cameras cameras) {
        var surveillanceController = new SurveillanceController(recorder, cameras);
        surveillanceController.subscribeToEvents();
        return surveillanceController;
    }

    private void subscribeToEvents() {

    }
}

