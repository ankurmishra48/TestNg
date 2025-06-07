package Testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersEx1 implements ITestListener {

  public void onTestStart(ITestResult result) {
    System.out.println("Test case execution is going to start: " + result.getName());
  }

  public void onTestSuccess(ITestResult result) {
    System.out.println("Test case execution PASSED: " + result.getName());
  }

  public void onTestFailure(ITestResult result) {
    System.out.println("Test case execution FAILED: " + result.getName());
  }

  // ✅ Corrected Method Name (Fixed Typo)
  public void onTestSkipped(ITestResult result) {
    System.out.println("Test case execution SKIPPED: " + result.getName());
  }

  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    System.out.println("Test case failed within allowed percentage: " + result.getName());
  }

  public void onStart(ITestContext context) {
    System.out.println("Before Everything - Test Suite Starting");
  }

  public void onFinish(ITestContext context) {
    System.out.println("After Everything - Test Suite Finished");
  }
}
