/*
The purpose of the chain of responsibility design pattern involves senders and receivers.
Specifically, the chain of responsibility design pattern calls for the decoupling of the
sender and receiver. Objects can be sent to a series of receivers without the sender being
concerned about which receiver handles the request. The request is sent along a chain of receivers and
only one of them will process the request. Let's look at some examples of this.

UML Class Diagrams
https://static.packt-cdn.com/products/9781789809770/graphics/assets/b01b82eb-c69a-4cc2-83d9-47fddaa551b2.png
https://static.packt-cdn.com/products/9781789809770/graphics/assets/935ad32e-29a0-467c-a13e-27a5805e73de.png
*/
public abstract class MainEmailHandler implements UniversityEmailHandler {

    private UniversityEmailHandler theNextHandlerInTheChain;

    public void setNextEmailHandler(UniversityEmailHandler emailHandler) {
        theNextHandlerInTheChain = emailHandler;
    }

    public void processEmailHandler(String emailText) {

        // starting value
        boolean keyWordFound = false;

        // check for a matching keyword in emailText
        if (keyWords().length == 0) {
            keyWordFound = true;
        } else {
            for (String oneKeyWord : keyWords()) {
                if (emailText.indexOf(oneKeyWord) >= 0) {
                    keyWordFound = true;  // change value if match is found
                    break; // leave loop if match is found
                }
            }
        }

        // check to see if email can be processed by the current
        // email handler based on keyword match
        if (keyWordFound) {
            processEmailHandler(emailText);
        } else {
            // pass along the chain if the email is not processed
            // by the current email handler
            theNextHandlerInTheChain.processEmailHandler(emailText);
        }
    }

    public static void handleEmail(String emailText) {
        UniversityEmailHandler academic = new AcademicEmailHandler();
        UniversityEmailHandler alumni = new AlumniEmailHandler();
        UniversityEmailHandler advising = new AdvisingEmailHandler();
        UniversityEmailHandler finance = new FinanceEmailHandler();
        UniversityEmailHandler hr = new HREmailHandler();
        UniversityEmailHandler admin = new AdminEmailHandler();

        // setup chain direction
        academic.setNextEmailHandler(alumni);
        alumni.setNextEmailHandler(advising);
        advising.setNextEmailHandler(finance);
        finance.setNextEmailHandler(hr);
        hr.setNextEmailHandler(admin);
        // we do not need to set the next email handler after admin
        // because it is the end of the chain of responsibility

        // this line will start the chain
        academic.processEmailHandler(emailText);
    }
    protected abstract String[] keyWords();
    protected abstract void processEmailFinal(String emailText);
}
