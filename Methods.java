import java.util.Scanner;

public class Methods {

    public void app(int numStudents) {
        Scanner scan = new Scanner(System.in);
        String FORMATTING = "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=";
        String SPACES_FORMATTING = "                     ";
        Student[] students = new Student[numStudents];

        // Cadastro dos alunos
        for(int cont = 0 ; cont < students.length ; cont++) {
            students[cont] = new Student();

            System.out.print("Digite o nome do aluno " + (cont + 1) + ": ");
            students[cont].name = scan.next(); 

            System.out.print("Digite a idade do aluno " + (cont + 1) + ": ");
            students[cont].age = scan.nextInt();

            // Formatação
            System.out.println(FORMATTING);
            
        }

        // Formatação    
        System.out.println();
        System.out.println(SPACES_FORMATTING + "ALUNOS CADASTRADOS");
        System.out.println();

        // Loop para retornar o os dados dos alunos cadastrados
        for(int cont = 0 ; cont < students.length ; cont++) {
            System.out.println("Aluno " + (cont + 1) + " -> " + students[cont].name + ", " + students[cont].age + " anos");
            System.out.println(FORMATTING);
        }

        // Formatação        
        System.out.println();
        System.err.println(SPACES_FORMATTING + "ALUNO MAIS VELHO CADASTRADO");
        System.out.println();

        // Chama o método que retorna o aluno mais velho
        older(students);

        System.out.println(FORMATTING);

        // Formatação
        System.out.println();
        System.err.println(SPACES_FORMATTING + "ALUNO MAIS NOVO CADASTRADO");
        System.out.println();

        // Chama o método que retorna o aluno mais novo
        newest(students);

        // Formatação
        System.out.println(FORMATTING);

        // Formatação        
        System.out.println();
        System.err.println(SPACES_FORMATTING + "ALUNOS ORDENADOS POR IDADE");
        System.out.println();

        // Chama os método que ordena e retorna o vetor ordenado por idade
        sortByAge(students);
        vectorReader(students);

        // Formatação
        System.out.println(FORMATTING);
        
        // Finaliza o Scanner
        scan.close();
    }

    // Método que retorna o aluno mais velho
    public void older(Student[] students) {
        int higherIndex = 0;

        for(int cont = 1 ; cont < students.length ; cont++) {
            if(students[cont].age > students[higherIndex].age) {
                higherIndex = cont;
            }
        }

        System.out.println("O aluno(a) mais velho(a) é " + students[higherIndex].name + " com " + students[higherIndex].age + " anos!!");
    }

    // Método que retorna o aluno mais novo
    public void newest(Student[] students) {
        int minorIndex = 0;

        for(int cont = 1 ; cont < students.length ; cont++) {
            if(students[cont].age < students[minorIndex].age) {
                minorIndex = cont;
            }
        }

        System.out.println("O aluno(a) mais novo(a) é " + students[minorIndex].name + " com " + students[minorIndex].age + " anos!!");
    }

    // Método que retorna o vetor ordenado por idade
    public Student[] sortByAge(Student[] students) {       
        for (int bubbleNumber = 0; bubbleNumber < students.length; bubbleNumber++) {

            for (int j = 0; j < students.length - 1; j++) {
                if (students[j].age > students[j + 1].age) {

                    int dataSwapAge = students[j].age;
                    String dataSwapName = students[j].name;

                    students[j].age = students[j + 1].age;
                    students[j].name = students[j + 1].name;
                    
                    students[j + 1].age = dataSwapAge;
                    students[j + 1].name = dataSwapName;
                }
            }
        }
        return students;
    }

    // Método que retorna os dados de um vetor de forma legível
    public void vectorReader(Student[] students) {
        for(int cont = 0 ; cont < students.length ; cont++) {
            System.out.print("Aluno " + (cont + 1) + " -> ");
            System.out.print(students[cont].getName() + ", " + students[cont].getAge() + " anos ");
            System.out.println();
        }
    }
}