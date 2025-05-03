import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Character player = new Character("Bang Opik", 100);
        Scene scene1 = new Scene(
            player.getName() + " berada di hutan yang gelap 👻, " + player.getName() + " sendirian dan ketakutan. Lalu " + player.getName() + "...",
            false,
            "Maju", 0, 10,
            "Berbalik", 30, 0,
            "Panggil bantuan", 15, 0,
            "Buka Maps", 0, 10,
            "Berteriak", 50, 0
        );

        Scene scene2 = new Scene(
            player.getName() + " melihat dua jalan, lalu " + player.getName() + "...",
            false,
            "Jalan kiri", 0, 10,
            "Jalan kanan", 0, 20,
            "Diam di tempat", 100, 0,
            "Mundur", 10, 10,
            "Menyusuri hutan", 10, 0
        );

        Scene scene3 = new Scene(
            player.getName() + " menemukan harta karun yang dibungkus dengan peti emas, Sepertinya harta karun itu peninggalan dari kerajaan yang sangat kaya. Lalu " + player.getName(),
            false,
            "Ambil harta itu", 0, 50,
            "Tinggalkan", 0, 0,
            "Hancurkan", 0, 10,
            "Laporkan ke pemerintah", 0, 10,
            "Tidak terpengaruh", 0, 10
        );

        Scene scene4 = new Scene(
            player.getName() + " bertemu sesosok hantu, " + player.getName() + " tiba-tiba merinding karena melihatnya. Lalu " + player.getName() + "...",
            false,
            "Berteriak", 0, 50,
            "Berlari", 10, 0,
            "Berbalik", 0, 10,
            "Membaca doa", 0, 10,
            "Pingsan di tempat", 100, 0
        );

        Scene scene5 = new Scene(
            player.getName() + " menunggu bantuan, dan " + player.getName() + "...",
            false,
            "Tetap mencari jalan", 0, 10,
            "Tetap menunggu", 0, 20,
            "Membuka handphone", 0, 20,
            "Terus berjalan sambil menunggu", 10, 0,
            "Tidur", 5, 20
        );

        Scene scene6 = new Scene(
            player.getName() + " menemukan pos penjaga di Maps, pos itu terlihat beda karena sepi pengunjung. Lalu " + player.getName() + "...",
            false,
            "Pergi ke sana", 0, 50,
            "Lanjutkan perjalanan", 0, 0,
            "Menutup Maps", 0, 10,
            "Mencari bantuan", 0, 0,
            "Mundur", 20, 0
        );

        Scene scene7 = new Scene(
            player.getName() + " tidak mendapat sinyal karena " + player.getName() + " berada di tengah hutan. Lalu " + player.getName() + "...",
            false,
            "Lanjut berjalan mengandalkan kompas", 0, 50,
            "Lanjut berjalan mencari sinyal", 0, 0,
            "Diam di tempat menunggu keajaiban", 0, 10,
            "Mengirimkan kode SOS", 0, 0,
            "Mundur", 20, 0
        );

        Scene scene8 = new Scene(
            player.getName() +" menemukan sebuah goa. Lalu " + player.getName() + "...",
            false,
            "Masuk", 0, 50,
            "Mengecek handphone", 0, 0,
            "Buang air", 0, 10,
            "Memeriksa handphone", 0, 10,
            "Tidak terpengaruh", 0, 10
        );

        Scene scene9 = new Scene(
            "Harta itu diambil pemerintah, " + player.getName() + " diselamatkan dan diberi hadiah 271T. Lalu " + player.getName() + "...",
            false,
            "Berfoya-foya dengan hadiah yang diberikan", 0, 50,
            "Mencoba memulai usaha", 0, 0,
            "Menolak hadiah", 0, 10,
            "Istirahat karena kelelahan", 0, 10,
            "Menyimpan uang tersebut", 0, 10
        );

        Scene scene10 = new Scene(
            "Wah!! Ternyata handphone " + player.getName() + " kehabisan baterai! Lalu " + player.getName() + "...",
            false,
            "Lanjut berjalan", 0, 50,
            "Menunggu keajaiban", 0, 0,
            "Mencari power bank", 0, 10,
            "Bingung", 0, 10,
            "Balik", 0, 10
        );
        scene1.setOption(scene2, scene4, scene5, (rand.nextBoolean() ? scene6 : scene7), scene4);
        scene2.setOption(scene3, (rand.nextBoolean() ? scene8 : scene4), scene4, scene1, scene4);
        scene3.setOption(scene4, scene8, scene4, scene9, scene2);
        scene4.setOption(null, scene2, scene8, scene2, null);
        scene5.setOption(scene2, scene4, scene10, scene2, null);
        scene6.setOption(scene7, (rand.nextBoolean() ? scene2 : scene8), scene4, scene5, null);
        scene7.setOption(scene8, scene10, scene4, scene5, scene4);
        scene8.setOption(scene2, scene10, scene4, scene4, scene7);
        scene9.setOption(null, null, null, null, null);
        scene10.setOption(scene2, scene6, scene2, null, scene2);
        

        Story story = new Story(scene1, player);
        story.start();
    }
}