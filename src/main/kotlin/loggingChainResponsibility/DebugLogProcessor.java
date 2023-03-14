package loggingChainResponsibility;

public class DebugLogProcessor extends LogProcessor{
    public DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }


    @Override
    public void log(int logType, String message) {
        if (logType == DEBUG){
            System.out.println("DEBUG: " + message);
        }else {
            super.log(logType, message);
        }
    }
}
