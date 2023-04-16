/*
The loan functional design pattern can be used to create resource-aware applications
to control how the resources are used.

File-processing workflow
https://static.packt-cdn.com/products/9781789809770/graphics/assets/af228e3f-206f-43b3-b283-ce41f77cdb31.png
 */
public class FileToProcess {

    // constructor
    public FileToProcess() {
    }

    public FileToProcess openFile() {
        System.out.println("\nFile opened for processing");
        return this;
    }

    public FileToProcess processMetaData() {
        System.out.println("\tProcessing metadata. . .");
        return this;
    }

    public FileToProcess analyzeHeader() {
        System.out.println ("\tAnalyzing header. . .");
        return this;
    }

    public FileToProcess checkSpelling() {
        System.out.println("\tChecking spelling. . . ");
        return this;
    }

    public FileToProcess checkGrammar() {
        System.out.println("\tChecking grammar. . . ");
        return this;
    }

    public void closeFile() {
        System.out.println("File closed");
    }
}
