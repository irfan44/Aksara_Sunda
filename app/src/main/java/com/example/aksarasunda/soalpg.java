package com.example.aksarasunda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.LinkedList;

public class soalpg extends AppCompatActivity {
    TextView kuis;
    RadioGroup rg;
    RadioButton PilihanA, PilihanB, PilihanC, PilihanD;
    int nomor = 0;
    public static int hasil, benar, salah;
    LinkedList<String> pertanyaan_kuis;
    LinkedList<String>pilihan_jawaban;
    LinkedList<String>jawaban_benar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soalpg);
        kuis = (TextView) findViewById(R.id.kuis);
        rg = (RadioGroup) findViewById(R.id.pilihan);
        PilihanA = (RadioButton) findViewById(R.id.pilihanA);
        PilihanB = (RadioButton) findViewById(R.id.pilihanB);
        PilihanC = (RadioButton) findViewById(R.id.pilihanC);
        PilihanD = (RadioButton) findViewById(R.id.pilihanD);

        //pertanyaan kuis
        pertanyaan_kuis = new LinkedList<String>();
        pertanyaan_kuis.add("1. Dalam Aksara Sunda yang melambangkan bunyi vokal adalah");
        pertanyaan_kuis.add("2. Rarangken adalah istilah untuk");
        pertanyaan_kuis.add("3. Angka dalam Aksara Sunda ditulis dari");
        pertanyaan_kuis.add("4. Berapa banyak Aksara Ngalgena dari bunyi serapan");
        pertanyaan_kuis.add("5. lambang bentuk konsonan dalam Aksara Sunda adalah");

        //pilihan jawaban
        pilihan_jawaban = new LinkedList<String>();
        pilihan_jawaban.add("Aksara Swara");
        pilihan_jawaban.add("Aksara Ngalagena");
        pilihan_jawaban.add("Rarangken");
        pilihan_jawaban.add("Pengtuasi");
        pilihan_jawaban.add("Lambang Vokalisasi");
        pilihan_jawaban.add("Bentuk Konsonan");
        pilihan_jawaban.add("Angka");
        pilihan_jawaban.add("Penyambung");
        pilihan_jawaban.add("Kanan ke kiri");
        pilihan_jawaban.add("Kiri ke kanan");
        pilihan_jawaban.add("Atas ke bawah");
        pilihan_jawaban.add("Tidak ada yang benar");
        pilihan_jawaban.add("2");
        pilihan_jawaban.add("3");
        pilihan_jawaban.add("4");
        pilihan_jawaban.add("5");
        pilihan_jawaban.add("Pengtuasi");
        pilihan_jawaban.add("Aksara Ngalagena");
        pilihan_jawaban.add("Akasara Swara");
        pilihan_jawaban.add("Rarangken");

        //jawaban benar
        jawaban_benar = new LinkedList<String>();
        jawaban_benar.add("Aksara Swara");
        jawaban_benar.add("Lambang Vokalisasi");
        jawaban_benar.add("Kiri ke kanan");
        jawaban_benar.add("5");
        jawaban_benar.add("Aksara Ngalagena");
        kuis.setText(pertanyaan_kuis.get(nomor));
        PilihanA.setText(pilihan_jawaban.get(0));
        PilihanB.setText(pilihan_jawaban.get(1));
        PilihanC.setText(pilihan_jawaban.get(2));
        PilihanD.setText(pilihan_jawaban.get(3));

        rg.check(0);
        benar = 0;
        salah = 0;
    }

    public void next(View view) {
        if (PilihanA.isChecked() || PilihanB.isChecked() || PilihanC.isChecked() || PilihanD.isChecked()) {

            RadioButton jawaban_user = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
            String ambil_jawaban_user = jawaban_user.getText().toString();
            rg.check(0);
            if (ambil_jawaban_user.equalsIgnoreCase(jawaban_benar.get(nomor))) benar++;
            else salah++;
            nomor++;
            if (nomor < pertanyaan_kuis.size()) {
                kuis.setText(pertanyaan_kuis.get(nomor));
                PilihanA.setText(pilihan_jawaban.get((nomor * 4) + 0));
                PilihanB.setText(pilihan_jawaban.get((nomor * 4) + 1));
                PilihanC.setText(pilihan_jawaban.get((nomor * 4) + 2));
                PilihanD.setText(pilihan_jawaban.get((nomor * 4) + 3));

            } else {
                hasil = benar * 20;
                Intent selesai = new Intent(getApplicationContext(), hasilsoalpg.class);
                startActivity(selesai);
            }
        }
        else {
            Toast.makeText(this,"Kamu Jawab Dulu",Toast.LENGTH_LONG).show();
        }
    }
}
