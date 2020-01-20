public class JavaSingltone {
    private static JavaSingltone javaSingltone;
    private static String logFile = "This is Log file";

    public static JavaSingltone getJavaSingltone(){
        if (javaSingltone == null){
            javaSingltone == new JavaSingltone();
        }
        return javaSingltone;
    }

    private JavaSingltone(){

    }
    public void addLogInfo(String logInfo){
        logFile += logInfo +"/n";
    }

    public void showLogFile(){
        System.out.println(logFile);
    }

}
