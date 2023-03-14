package loggingChainResponsibility;

public class InfoLogProcessor extends LogProcessor{


    public InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(int logType, String message) {
        if (logType == INFO){
            System.out.println("INFO: " + message);
        }else {
            super.log(logType, message);
        }
    }
}
