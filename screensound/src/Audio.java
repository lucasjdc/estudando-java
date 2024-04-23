public class Audio implements Classificacao {
    private String title;
    private String artist;
    private int duration;
    private boolean playing;
    private int classificacao;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void play() {
        if (!this.playing) {
            System.out.println("Playing " + this.title + " by " + this.artist);
            this.playing = true;
        } else {
            System.out.println("Audio is already playing.");
        }
    }

    public void stop() {
        if (this.playing) {
            System.out.println("Stopped playing " + this.title);
        } else {
            System.out.println("Audio is not currently playing.");
        }
    }

    @Override
    public void classificar(int estrelas) {
        this.classificacao = estrelas;
        System.out.println("Classificação atualizada para " + estrelas + "estrelas.");


    }

    @Override
    public int obterClassificacao() {
        return classificacao;
    }
}
