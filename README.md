```markdown
# 🎮 Adventure Game Text Based: "Mimpi di Hutan Gelap"

![Java](https://img.shields.io/badge/Java-17-blue?logo=java)
![Lisensi](https://img.shields.io/badge/Lisensi-MIT-green)

Game petualangan berbasis teks dengan cerita bercabang di mana setiap pilihan menentukan nasib karakter! Dibuat dengan Java.

## 📖 Synopsis
Bang Opik terbangun di hutan gelap misterius tanpa tahu bagaimana cara keluar. Jelajahi hutan, hadapi hantu, dan temukan harta karun - semua dalam mimpi yang tidak terduga!

## ✨ Feature
- **10 Adegan Unik** dengan akhir berbeda
- **Sistem HP & XP**: Pilihan memengaruhi kesehatan dan poin pengalaman
- **Jalur Acak** menggunakan `Random`
- **5+ Ending Berbeda**
- Cek status dengan perintah `INFO`
```

## 🛠️ How to Install
1. **Clone repositori**:
   ```bash
   git clone https://github.com/hbbidev/Simple-Game-by-SitelU-Studios.git
   cd Simple-Game-by-SitelU-Studios/src
   ```

2. **Run & Compile**:
   ```bash
   javac *.java
   java Main
   ```

## 🕹️ How to Play
| Command  | Action                        |
|----------|-------------------------------|
| A/B/C/D/E| Select Choices                |
| INFO     | See Character status          |
| CTRL+C   | Exit game                     |

Example:
```
Bang Opik berada di hutan yang gelap 👻...
A: Maju
B: Berbalik
C: Panggil bantuan
D: Buka Maps
E: Berteriak

Pilihan (A/B/C/D/E atau INFO): A
```

## 📁 Structure code
```plaintext
├── Character.java    # Kelas karakter (HP, XP, item)
├── Scene.java        # Kelas adegan dan pilihan
├── Story.java        # Manajemen alur cerita
└── Main.java         # Inisialisasi game
```

## 🎭 Potential Ending
- 🏆 Dapatkan 271 Triliun dari pemerintah
- 👻 Terjebak selamanya dengan hantu
- 🔋 Kehabisan baterai di tengah hutan
- 💀 Game Over karena HP habis
- 🛌 Terbangun dari mimpi

## 📊 Inter Scene Relationship Diagram
![Diagram Hubungan Antar Scene](src/Diagram_Scene.svg)

## 🤝 Contributed
1. Fork repositori
2. Create new Branch:
   ```bash
   git checkout -b fitur-baru
   ```
3. Commit Change:
   ```bash
   git commit -m "Tambahkan fitur keren"
   ```
4. Push to GitHub:
   ```bash
   git push origin fitur-baru
   ```
5. Create Pull Request

## 📜 Lisence
Licensed under [MIT License](LICENSE).

---

**Happy Play** ✨  
_Don't forget to ScreenShot your Favorite Ending!_
```
