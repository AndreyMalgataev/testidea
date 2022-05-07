package hw1t2;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start(int failedTaskNumber) {
        for (int i = 0; i < 100; i++) {
            StringBuilder sb = new StringBuilder("Task " + (i + 1) + " is ");
            if (i + 1 != failedTaskNumber) {
                sb.append("done");
                callback.onDone(sb.toString());
            } else {
                sb.append("failed");
                errorCallback.onError(sb.toString());
            }
        }
    }

}
