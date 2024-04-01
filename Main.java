import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Methods methods = new Methods();

        System.out.print("Digite a quantidade de alunos a serem cadastrados: ");
        int numStudents = scan.nextInt();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        methods.app(numStudents);

        scan.close();
    }
}
