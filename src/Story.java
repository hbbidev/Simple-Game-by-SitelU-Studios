import java.util.Scanner;

public class Story {
    private Scene startScene;
    private Character player;
    private Scanner scanner;

    public Story(Scene startScene, Character player) {
        this.startScene = startScene;
        this.player = player;
        this.scanner = new Scanner(System.in);
    }

    public void synopsisStory(){
        String[] AwalMula_Cerita = {"Bang Opik, seorang pemuda biasa, tiba-tiba terbangun di tengah hutan gelap yang penuh misteri", "Suara gemeresik dedaunan dan bayangan aneh mengelilinginya, sementara kabut tebal menyelimuti setiap sudut", "Tidak ada ingatan bagaimana ia sampai di sana—yang ia tahu, ia harus segera menemukan jalan keluar sebelum kegelapan menyergap.", "Di depan matanya, dua pilihan mengintai: ", "maju menyusuri jalur tak dikenal atau berbalik menghadapi bayangan yang bergerak", "Setiap langkah menentukan nasibnya:\n", "  - Harta karun mungkin tersembunyi di balik pepohonan, tetapi siapa yang menjamin itu bukan jebakan?", "  - Sosok hantu tiba-tiba muncul, memaksanya memilih antara melawan atau kabur.", "  - Peta di handphone menunjuk lokasi mencurigakan, tapi baterai hampir habis!\n", "Dengan kesehatan yang terus terkikis dan pengalaman yang diperoleh dari keputusan bijak, Bang Opik harus bertahan dari ancaman alam, makhluk gaib, dan ketidakpastian", "Namun, semakin dalam ia menjelajah, semakin ia bertanya: Apakah ini nyata... atau hanya mimpi?", "Pilihan ada di tanganmu. Setiap jawaban menentukan akhir cerita—keluar dengan selamat, kaya raya, atau terjebak selamanya di dalam mimpi yang gelap..."};
        System.out.print("\033[H\033[2J");
        System.out.flush();
        for(int i=0; i<AwalMula_Cerita.length; i++){
            String kata = AwalMula_Cerita[i];
            String[] ArrayKata = kata.split("");
            for(int j=0; j<ArrayKata.length; j++){
                System.out.print(ArrayKata[j]);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("");
        }
        String loadingString = "Memuat Game";
        for (int i = 0; i < 3; i++) {
            System.out.print("\r" + loadingString);
            loadingString += ".";
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
        for (int i = 0; i < 10; i++) {
            System.out.print("\r" + loadingString);
            loadingString += ".";
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public void start() {
        synopsisStory();
        play();
    }

    public void play() {
        Scene currentScene = startScene;

        while (currentScene != null) {
            currentScene.displayScene();
            System.out.print("Pilihan (A/B/C/D/E atau INFO untuk status): ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("INFO")) {
                System.out.println("Nama: " + player.getName());
                System.out.println("Health: " + player.getHealth());
                System.out.println("EXP: " + player.getXP());
                continue;
            }

            Scene nextScene = currentScene.makeChoice(choice, player);
            if (player.getHealth() <= 0) {
                System.out.println("Game Over! Kamu kehabisan health.");
                break;
            }

            if (nextScene == null) {
                System.out.println("Kamu Terbangun!! dan ternyata Semua itu hanyalah mimpi belaka");
                break;
            } else {
                currentScene = nextScene;
            }

        }
        System.out.println("Terima kasih telah bermain!");
    }
}