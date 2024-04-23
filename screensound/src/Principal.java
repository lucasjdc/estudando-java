//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.setTitle("Bohemian Rhapsody");
        musica1.setArtist("Queen");
        musica1.setDuration(6);

        musica1.play();

        musica1.stop();
    }
}