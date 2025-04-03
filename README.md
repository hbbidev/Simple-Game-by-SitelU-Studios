Berikut kode README.md siap pakai untuk GitHub (simpan sebagai `README.md`):

```markdown
# 🎮 Game Petualangan Teks: "Mimpi di Hutan Gelap"

![Java](https://img.shields.io/badge/Java-17-blue?logo=java)
![Lisensi](https://img.shields.io/badge/Lisensi-MIT-green)

Game petualangan berbasis teks dengan cerita bercabang di mana setiap pilihan menentukan nasib karakter! Dibuat dengan Java.

## 📖 Sinopsis
Bang Opik terbangun di hutan gelap misterius tanpa tahu bagaimana cara keluar. Jelajahi hutan, hadapi hantu, dan temukan harta karun - semua dalam mimpi yang tidak terduga!

## ✨ Fitur
- **10 Adegan Unik** dengan akhir berbeda
- **Sistem HP & XP**: Pilihan memengaruhi kesehatan dan poin pengalaman
- **Jalur Acak** menggunakan `Random`
- **5+ Ending Berbeda**
- Cek status dengan perintah `INFO`
```

## 🛠️ Cara Instal
1. **Clone repositori**:
   ```bash
   git clone https://github.com/username/text-adventure-game.git
   cd text-adventure-game
   ```

2. **Kompilasi & Jalankan**:
   ```bash
   javac *.java
   java Main
   ```

## 🕹️ Cara Bermain
| Perintah | Aksi                          |
|----------|-------------------------------|
| A/B/C/D/E| Pilih opsi yang tersedia      |
| INFO     | Tampilkan status karakter     |
| CTRL+C   | Keluar dari game              |

Contoh:
```
Bang Opik berada di hutan yang gelap 👻...
A: Maju
B: Berbalik
C: Panggil bantuan
D: Buka Maps
E: Berteriak

Pilihan (A/B/C/D/E atau INFO): A
```

## 📁 Struktur Kode
```plaintext
├── Character.java    # Kelas karakter (HP, XP, item)
├── Scene.java        # Kelas adegan dan pilihan
├── Story.java        # Manajemen alur cerita
└── Main.java         # Inisialisasi game
```

## 🎭 Ending Potensial
- 🏆 Dapatkan 271 Triliun dari pemerintah
- 👻 Terjebak selamanya dengan hantu
- 🔋 Kehabisan baterai di tengah hutan
- 💀 Game Over karena HP habis
- 🛌 Terbangun dari mimpi

## 🤝 Berkontribusi
1. Fork repositori
2. Buat branch baru:
   ```bash
   git checkout -b fitur-baru
   ```
3. Commit perubahan:
   ```bash
   git commit -m "Tambahkan fitur keren"
   ```
4. Push ke GitHub:
   ```bash
   git push origin fitur-baru
   ```
5. Buat Pull Request

## 📜 Lisensi
Dilisensikan di bawah [MIT License](LICENSE).

---

**Selamat Bermain!** ✨  
_Jangan lupa screenshot ending favoritmu!_
```

Beberapa catatan:
1. Ganti `https://github.com/username/text-adventure-game.git` dengan URL repo Anda
2. Sesuaikan bagian "Berkontribusi" jika perlu
3. Tambahkan screenshot game jika tersedia
4. File siap digunakan langsung di GitHub (format markdown valid)
