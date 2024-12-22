import org.opencv.core.*;
import org.opencv.imgproc.Imgproc;
import org.opencv.videoio.VideoCapture;
import org.opencv.highgui.HighGui;

public class SignLanguageDetector {
    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    public static void main(String[] args) {
        VideoCapture camera = new VideoCapture(0);
        if (!camera.isOpened()) {
            System.out.println("Error: Camera not accessible");
            return;
        }

        Mat frame = new Mat();
        HandGestureRecognizer recognizer = new HandGestureRecognizer();

        while (true) {
            if (camera.read(frame)) {
                Core.flip(frame, frame, 1);

                Mat handRegion = recognizer.detectHand(frame);
                String gesture = recognizer.recognizeGesture(handRegion);

                Imgproc.putText(frame, "Detected: " + gesture, new Point(10, 50),
                        Imgproc.FONT_HERSHEY_SIMPLEX, 1, new Scalar(0, 255, 0), 2);

                HighGui.imshow("Sign Language Detection", frame);
            }

            if (HighGui.waitKey(1) == 27) { // Exit on ESC key
                break;
            }
        }

        camera.release();
        HighGui.destroyAllWindows();
    }
}