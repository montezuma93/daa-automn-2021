public class Application {

        public static void main(String args[])
        {
            System.out.println("Hello World");

            String nameZumGeben = "alex";
            int alterZumGeben = 18;

            Gitarrenspieler alex = new Gitarrenspieler(nameZumGeben, alterZumGeben);
            System.out.println(alex.getAlter());
            System.out.println(alex.getName());
            alex.setName("Peter");
            System.out.println(alex.getName());
            alex.setAlter(20);
            System.out.println(alex.getAlter());

            Gitarrenspieler rahimi = new Gitarrenspieler("rahimi", 22);
            rahimi.birthday();
            System.out.println(rahimi.getAlter());

            Klavierspieler viktor = new Klavierspieler("viktor", 27);
            viktor.birthday();
            System.out.println(viktor.getAlter());

            viktor.playInstrument();
        }

}
