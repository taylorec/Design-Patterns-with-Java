public interface UniversityEmailHandler {

    public void setNextEmailHandler(UniversityEmailHandler emailHandler);

    public void processEmailHandler(String emailText);

}
