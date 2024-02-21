import org.testng.ITestListener;
import org.testng.ITestResult;

public class Watcher implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Started");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Failed");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Success");
    }
}
