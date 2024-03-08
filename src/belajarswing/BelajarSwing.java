package belajarswing;

import javax.swing.*;

/**
 *
 * @author rafli
 */

// Membuat class KotakFrame yang mewarisi class JFrame
class KotakFrame extends JFrame {
    // Menginisiasi objek tulisan
    JLabel tulisan = new JLabel("Halo Dunia! :)");
    
    // Menginisiasi objek tombol
    JButton tombolLogin = new JButton("Login");
    
    // Membuat sebuah array bertipe string 
    // yang akan digunakan sebagai pilihan pada dropdown
    String[] semester = {
        "Semester 1",
        "Semester 2",
        "Semester 3",
        "Semester 4",
        "Semester 5",
        "Semester 6",
        "Semester 7",
        "Semester 8"
    };
    // Menginisiasi objek dropdown
    JComboBox pilihanSemester = new JComboBox(semester);
    
    // Menginisiasi objek input text
    JTextField inputNama = new JTextField();
    
    // Menginisiasi objek tulisan untuk label pada input text
    JLabel labelInputNama = new JLabel("Nama Lengkap");
    
    // Menginisiasi objek radio button
    JRadioButton pilihLaki = new JRadioButton("Laki-laki");
    JRadioButton pilihPerempuan = new JRadioButton("Perempuan");
            
    KotakFrame() {
        // Membuat agar frame dapat terlihat dilayar ketika program dijalankan
        setVisible(true);
        
        // Mengatur ukuran frame dengan ukuran 720x480 px
        setSize(720, 480);
        
        // Menambahkan judul "Belajar bikin Frame" pada Frame
        // yang terletak di bagian atas frame
        setTitle("Belajar bikin Frame");
        
        // Men-setting supaya ketika kita pencet tombol "silang", 
        // maka program akan berhenti
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Menentukan layout yang akan digunakan pada frame
        // Dalam hal ini, kita menggunakan null layout.
        setLayout(null);
        
        // Menambahkan komponen "tulisan" ke dalam frame
        add(tulisan);
        
        // Memposisikan komponen "tulisan" pada frame
        // Posisi komponen "tulisan":
        // 210px dari kiri (sumbu x)
        // 54px dari atas (sumbu y)
        // Panjang komponen 150px
        // Tinggi komponen 24px
        tulisan.setBounds(210, 20, 150, 24);
        
        // Menambahkan komponen "tombolLogin" ke dalam frame
        add(tombolLogin);
        // Memposisikan komponen "tombolLogin" pada frame
        tombolLogin.setBounds(210, 54, 400, 80);
        
        // Menambahkan komponen "pilihanSemester" ke dalam frame
        add(pilihanSemester);
        // Memposisikan komponen "pilihanSemester" pada frame
        pilihanSemester.setBounds(370, 20, 320, 24);
        
        // Menambahkan komponen "inputNama" ke dalam frame
        add(inputNama);
        // Memposisikan komponen "inputNama" pada frame
        inputNama.setBounds(210, 144, 120, 32);
        
        // Menambahkan komponen "labelInputNama" ke dalam frame
        add(labelInputNama);
        // Memposisikan komponen "labelInputNama" pada frame
        labelInputNama.setBounds(100, 144, 100, 32);
        
        // Mengelompokkan radio button ke dalam 1 kelompok
        // Hal ini bertujuan agar user hanya dapat menekan salah satu radio button
        ButtonGroup pilihJenisKelamin = new ButtonGroup();
        pilihJenisKelamin.add(pilihLaki);
        pilihJenisKelamin.add(pilihPerempuan);
                
        // Menambahkan komponen "pilihLaki" ke dalam frame
        add(pilihLaki);
        // Memposisikan komponen "pilihLaki" pada frame
        pilihLaki.setBounds(210, 186, 100, 32);
        
        // Menambahkan komponen "pilihPerempuan" ke dalam frame
        add(pilihPerempuan);
        // Memposisikan komponen "pilihPerempuan" pada frame
        pilihPerempuan.setBounds(320, 186, 160, 32);
    }
}

public class BelajarSwing {
    public static void main(String[] args) {
//        // Inisiasi frame
//        JFrame kotakFrame = new JFrame();
//        
//        // Buat nampilin frame
//        kotakFrame.setVisible(true);
//        
//        // Ngasih ukuran default dari frame
//        kotakFrame.setSize(480, 720);
//        
//        // Ngasih judul di frame
//        kotakFrame.setTitle("Belajar Bikin Frame");
//        
//        // Membuat supaya kalo frame ditutup, programnya berhenti
//        kotakFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
          // Membuat Frame dengan cara menginisiasi class KotakFrame 
          // yang telah dibuat di atas.
          KotakFrame kotakFrame = new KotakFrame();
    }
    
}
