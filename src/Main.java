public class Main {
    public static void main (String[] args){


        String[] instruments = new String[] {"gitara","truba","garaban"};

        for (int i = 0; i< instruments.length; i++){
            System.out.println("Play " + instruments[i] + ", with ");

            gitara gitaras = new gitara();
            gitaras.play();


            bararaban bararabans = new bararaban();
            bararabans.play();

            truba trubas = new truba();
            trubas.play();

        }
    }
}