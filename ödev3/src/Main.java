public class Main {

    public static void main(String[] args) {
Instructor Emre = new Instructor();
Emre.name="Emre";

Student kamil = new Student();
kamil.name="Kamil";

UserManager userManager=new UserManager();
userManager.add(Emre);
userManager.add(kamil);
    }
}
