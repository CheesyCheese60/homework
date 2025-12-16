public class hww {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int StudentAmount = 0;
        System.out.println("enter the amount of students");
        StudentAmount = scanner.nextInt();
        scanner.nextLine(); // this has to be here for some reason??
        String base[][] = new String[StudentAmount][2];
//        addall(base); 
        view(base); 
        while (true) {
            System.out.println("Student Management System\n1. to add student type \"add\" \nto leave type \"exit\"");
            String command = scanner.nextLine();
            if(command == "add"){
                add(base);
            }
            else if(command == "exit"){
                break;
            }
            else{
                System.out.println("invalid command");
            }
            view(base);
        }
   }
    static void view(String b[][]){
        for (int i = 0; i < b.length; i++) {
            
                System.out.println("student id: " + b[i][0] + " name: " + b[i][1]);
            
        }
    }
    static void add(String b[][]){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        for (int i = 0; i < b.length; i++) {
            if (b[i][0]==null) {
                System.out.println("enter the student id:");
                b[i][0]=scanner.nextLine();
                System.out.println("enter the name id:");
                b[i][1]=scanner.nextLine();
                break;
            }
        }
    }
    static void addall(String b[][]){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("enter the student ids");
        for (int i = 0; i < b.length; i++) {
            b[i][0]=scanner.nextLine();
        }
        System.out.println("now enter the names");
        for (int i = 0; i < b.length; i++) {
            b[i][1]=scanner.nextLine();
        }
    }
}
