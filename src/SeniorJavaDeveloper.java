public class SeniorJavaDeveloper extends DeveloperDecorator {

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String codeRewu(){
        return "Write Senior Code";
    }
    @Override
    public String makeJob(){
        return super.makeJob() +codeRewu();
    }
}
