public class hww {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int StudentAmount = 0;
        System.out.println("enter the amount of students");
        StudentAmount = scanner.nextInt();
        scanner.nextLine(); // this has to be here for some reason??
        String base[][] = new String[StudentAmount][2];
        System.out.println("enter the student ids");
        for (int i = 0; i < base.length; i++) {
            base[i][0]=scanner.nextLine();
        }
        System.out.println("now enter the names");
        for (int i = 0; i < base.length; i++) {
            base[i][1]=scanner.nextLine();
        } 
        for (int i = 0; i < StudentAmount; i++) {
            System.out.println("["+ (i + 1) + "] student id " + base[i][0] + " their name is " + base[i][1]);
        }
    }
}
