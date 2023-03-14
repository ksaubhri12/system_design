package loggingChainResponsibility;

abstract public class LogProcessor {


    static int DEBUG = 1;

    public LogProcessor(LogProcessor nextLogProcessor) {
        this.nextLogProcessor = nextLogProcessor;
    }

    static int INFO = 2;
    static int ERROR = 3;

    LogProcessor nextLogProcessor;


    public void log(int logType, String message) {
        if (nextLogProcessor != null) {
            nextLogProcessor.log(
                    logType, message
            );
        }
    }


}
