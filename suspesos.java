public class MyClass {
    public static void main(String[] args) {
    float[] arrayNotes = {2f, 5.5f, 9f, 10f, 4.9f, 8f, 8.5f, 7f}; 
    for(int i = 0; i < arrayNotes.length; i++) {
    System.out.println(i+". és: " + arrayNotes[i]); }
    //Número  de suspesos
        int count = 0;
        for (int j = 0; j < arrayNotes.length; j++) {
            if (arrayNotes[j] < 5) {
                count++;
            }
        }
        System.out.println("Hi ha" + count + "suspesos.");
    }
}
