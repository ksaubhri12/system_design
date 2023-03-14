package loggingChainResponsibility;

public class main {

    public static void main(String[] args) {
        ErrorLogProcessor errorLogProcessor = new ErrorLogProcessor(null);
        InfoLogProcessor infoLogProcessor = new InfoLogProcessor(errorLogProcessor);
        DebugLogProcessor debugLogProcessor = new  DebugLogProcessor(infoLogProcessor);


        LogProcessor logProcessor = new DebugLogProcessor(new InfoLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(LogProcessor.ERROR, "ERROR MESSAGE SHOULD PRINT");
        logProcessor.log(LogProcessor.INFO, "INFO MESSAGE WILL COME");
        logProcessor.log(LogProcessor.DEBUG, "DEBUG MESSAGE CHAIN");

    }
}