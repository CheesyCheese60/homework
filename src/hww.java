public class hww {
    static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        int StudentAmount = 0;
        System.out.println("enter the amount of students");
        StudentAmount = scanner.nextInt();
        scanner.nextLine(); // this has to be here for some reason??
        String base[][] = new String[StudentAmount][2];
        System.out.println("would you like to add all students?\nif yes type \"y\" else type \"n\"");
        if("y".equals(scanner.nextLine())){
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
            + "[2] <- search for a student\n"
            + "[3] <- delete a student\n"
            + "[4] <- count the amount of students\n"
            + "[5] <- view all students\n"
            + "[6] <- change a student\n"
            + "[7] <- leave the system\n");
            int command = scanner.nextInt();
            scanner.nextLine();
            switch (command) {
                case 1:
                    add(base);
                    break;
                case 2:
                    search(base);
                    break;
                case 3:
                    delete(base);
                    break;
                case 4:
                    count(base);
                    break;
                case 5:
                    view(base);
                    break;
                case 6:
                    change(base);
                    break;
                case 7:
                    break;
                default:
                    break;
            }
            if(command==7){
                break;
            }
            view(base);
        }
    }
    static void change(String b[][]){
        System.out.println("enter the student id:");
        String id = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < b.length; i++) {
            if(b[i][0]==null){
                continue;
            }
            if(id.equals(b[i][0])){
                System.out.println("enter the new student id:");
                b[i][0]=scanner.nextLine();
                System.out.println("enter the new student name:");
                b[i][1]=scanner.nextLine();
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("student not found");
        }
    }
    static void count(String b[][]){
        int count = 0;
        for (int i = 0; i < b.length; i++) {
            if(b[i][0]==null){
                continue;
            }
            count++;
        }
        System.out.println("there are " + count + " students in the system");
    }
    static void delete(String b[][]){
        System.out.println("enter the student id:");
        String id = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < b.length; i++) {
            if(b[i][0]==null){
                continue;
            }
            if(id.equals(b[i][0])){
                b[i][0]=null;
                b[i][1]=null;
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("student not found");
        }
    }
    static void search(String b[][]){
        System.out.println("enter the student id:");
        String id = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < b.length; i++) {
            if(b[i][0]==null){
                continue;
            }
            if(id.equals(b[i][0])){
                System.out.println("the student name is: " + b[i][1]);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("student not found");
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
        boolean full = true;
        for (int i = 0; i < b.length; i++) {
            if (b[i][0]==null) {
                full = false;
                System.out.println("enter the student id:");
                b[i][0]=scanner.nextLine();
            if("0".equals(b[i][0])){
                System.out.print("id cannot be 0 ");
                i=i-1;
                continue;
            }
                System.out.println("enter the student name:");
                b[i][1]=scanner.nextLine();
                break;
            }
        }
       if(full){
        System.out.println("the system is full");
       } 
    }
    static void addall(String b[][]){
        for (int i = 0; i < b.length; i++) {
            System.out.println("enter the student id:");
            b[i][0]=scanner.nextLine();
            if("0".equals(b[i][0])){
                System.out.println("id cannot be 0 ");
                i=i-1;
                continue;
            }
            System.out.println("enter the student name");
            b[i][1]=scanner.nextLine();
        }
    }
}
