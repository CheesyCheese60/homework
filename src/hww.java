public class hww {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int StudentAmount = 0;
        System.out.println("enter the amount of students");
        StudentAmount = scanner.nextInt();
        scanner.nextLine(); // this has to be here for some reason??
        String base[][] = new String[StudentAmount][2];
        System.out.println("would you like to add all students?\nif yes type \"y\" else type \"n\"");
        if(scanner.nextLine().charAt(0)=='y'){
            addall(base);
        } else {
            System.out.println("enter number of students to add or 0 to see the menu");
            int x = scanner.nextInt();
            if(x!=0){
                for (int i = 0; i < x; i++) {
                    add(base);
                }
            }
        }
        view(base); 
        while (true) {
            System.out.println("\t\tStudent Management System\n"
            +"enter of a function to use it\n"
            + "[1] <- add a student\n"
            + "[7] <- leave the system\n");
            int command = scanner.nextInt();
            if(command == 1){
                add(base);
            }
            else if(command == 7){
                break;
            }
            else{
                System.out.println("invalid command");
            }
            view(base);
        }
   }
    static void view(String b[][]){
        int count = 0;
        for (int i = 0; i < b.length; i++) {
            if(b[i][0]==null){
                continue;
            }
            count++; 
            System.out.println("student id: " + b[i][0] + " name: " + b[i][1]);
        }
        if (count==0) {
           System.out.println("no students currently in the system");
        }
    }
    static void add(String b[][]){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        for (int i = 0; i < b.length; i++) {
            if (b[i][0]==null) {
                System.out.println("enter the student id:");
                b[i][0]=scanner.nextLine();
            if(b[i][0]=="0"){
                System.out.print("id cannot be 0 ");
                i=i-1;
                continue;
            }
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
            if(b[i][0]=="0"){
                System.out.print("id cannot be 0 ");
                i=i-1;
                continue;
            }
        }
        System.out.println("now enter the names");
        for (int i = 0; i < b.length; i++) {
            b[i][1]=scanner.nextLine();
        }
    }
}
