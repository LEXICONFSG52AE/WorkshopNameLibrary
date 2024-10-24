public class WorkshopArrayAndString {

    private String[] names;
    private int count;

    public WorkshopArrayAndString(int size) {
        names = new String[size];
        count = 0;
    }
    public void addName(String firstName, String lastName) {
        if (count < names.length) {
            names[count] = formatName(firstName, lastName);
            count++;
        } else {
            System.out.println("error massage, its good for you in bad days..");
        }
    }

    private String formatName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public void printNames() {
        for (int i = 0; i < count; i++) {
            System.out.println(names[i]);
        }
    }

    public static void main(String[] args) {
        WorkshopArrayAndString storage = new WorkshopArrayAndString(1);
        storage.addName("Erik", "Svensson");

        storage.printNames();
    }
}
