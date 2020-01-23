public class ProgramRaner {
    public static void main(String[] args) {
        JavaSingltone.getJavaSingltone().addLogInfo("First.log");
        JavaSingltone.getJavaSingltone().addLogInfo("Secand.log");
        JavaSingltone.getJavaSingltone().addLogInfo("four.log");

        JavaSingltone.getJavaSingltone().showLogFile();
    }
}
