
public class BridgeDriver {

    public static void main(String[] args) {

        System.out.println("\n\nMedication Administering System\n");

        // administer antibiotic pills to adult
        System.out.println("Adult Patient:");
        Medicine antibiotic = new Antibiotic();
        Patient adultPatient = new Adult(antibiotic);
        adultPatient.selectPatient(2);
        adultPatient.modifyMedication(2, 2);

        // administer pain relief pills to child
        System.out.println("\n\nChild Patient:");
        Medicine painRelief = new PainRelief();
        Patient childPatient = new Child(painRelief);
        childPatient.selectPatient(4);
        childPatient.modifyMedication(4, -2);

        System.out.println("\n\n");
    }
}
