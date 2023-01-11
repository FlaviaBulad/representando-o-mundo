public class App {
    public static void main(String[] args) throws Exception {

        Student student = new Student();

        student.setName("Flavia Bulad");
        student.setEmail("flaviabulad@email.com");
        student.getAddress().setStreet("Rua 1");
        student.getAddress().setCity("São Paulo");
        student.getAddress().setState("SP");
        student.getAddress().setZip("12345-678");
        student.getAddress().setCountry("Brasil");
        student.getCourse().setName("Java");
        student.getCourse().setMentor("Frank Rocha");

        System.out.println("");
        System.out.println("Responde aí - dados de um aluno:");
        System.out.println("\n Nome: " + student.getName() + "\n Email: " + student.getEmail() + "\n Endereço: " + student.getAddress().getStreet() + ", " + student.getAddress().getCity() + ", " + student.getAddress().getState() + ", " + student.getAddress().getZip() + ", " + student.getAddress().getCountry() + "\n Curso: " + student.getCourse().getName() + "\n Mentor: " + student.getCourse().getMentor());
        
    }
}
