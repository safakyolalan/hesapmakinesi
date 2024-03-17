package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    protected TextView sonuc=null;
    protected Button sifirla,yuzebol,geri,bol,yedi,sekiz,dokuz,carpma,dort,bes,alti,cikarma,bir,iki,uc,toplama,ciftsifir,sifir,nokta,esittir;
    protected double sayi1=0,sayi2=0;
    protected String sayitespiti="",isarettespiti="";
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sifirla=findViewById(R.id.sifirla);
        yuzebol=findViewById(R.id.yuzebol);
        geri=findViewById(R.id.geri);
        bol=findViewById(R.id.bol);
        yedi=findViewById(R.id.yedi);
        sekiz=findViewById(R.id.sekiz);
        dokuz=findViewById(R.id.dokuz);
        carpma=findViewById(R.id.carpma);
        dort=findViewById(R.id.dort);
        bes=findViewById(R.id.bes);
        alti=findViewById(R.id.alti);
        cikarma=findViewById(R.id.cikarma);
        bir=findViewById(R.id.bir);
        iki=findViewById(R.id.iki);
        uc=findViewById(R.id.uc);
        toplama=findViewById(R.id.toplama);
        ciftsifir=findViewById(R.id.ciftsifir);
        sifir=findViewById(R.id.sifir);
        nokta=findViewById(R.id.nokta);
        esittir=findViewById(R.id.esittir);
        sonuc=findViewById(R.id.sonuc);
    }

    public void click(View view) {
        int id= view.getId();
        if(id == R.id.sifirla){
            sonuc.setText(" ");
        }
        else if(id == R.id.yuzebol){
            sayi1=Double.valueOf(String.valueOf(sonuc.getText()));
            sonuc.setText(String.valueOf(sonuc.getText())+yuzebol.getText());
        }
        else if(id == R.id.geri){
           if(sonuc.getText().length()>0){
               String backspace=null;
               StringBuilder stringBuilder= new StringBuilder(sonuc.getText());
               stringBuilder.deleteCharAt(sonuc.getText().length()-1);
               backspace=stringBuilder.toString();
               sonuc.setText(backspace);
           }

        }
        else if(id == R.id.bol){
            sayi1=Double.valueOf(String.valueOf(sonuc.getText()));
            sonuc.setText(String.valueOf(sonuc.getText())+bol.getText());
        }
        else if(id==R.id.yedi){
            sayitespiti += String.valueOf(yedi.getText());
            sonuc.setText(String.valueOf(sonuc.getText())+yedi.getText());
        }
        else if(id==R.id.sekiz){
            sayitespiti += String.valueOf(sekiz.getText());
            sonuc.setText(String.valueOf(sonuc.getText())+sekiz.getText());
        }
        else if(id==R.id.dokuz){
            sayitespiti += String.valueOf(dokuz.getText());
            sonuc.setText(String.valueOf(sonuc.getText())+dokuz.getText());
        }
        else if(id==R.id.carpma){
            sayi1=Double.valueOf(String.valueOf(sonuc.getText()));
            sonuc.setText(String.valueOf(sonuc.getText())+carpma.getText());
        }
        else if(id==R.id.dort){
            sayitespiti += String.valueOf(dort.getText());
            sonuc.setText(String.valueOf(sonuc.getText())+dort.getText());
        }
        else if(id==R.id.bes){
            sayitespiti += String.valueOf(bes.getText());
            sonuc.setText(String.valueOf(sonuc.getText())+bes.getText());
        }
        else if(id==R.id.alti){
            sayitespiti += String.valueOf(alti.getText());
            sonuc.setText(String.valueOf(sonuc.getText())+alti.getText());
        }
        else if(id==R.id.cikarma){
            sayi1=Double.valueOf(String.valueOf(sonuc.getText()));
            sonuc.setText(String.valueOf(sonuc.getText())+cikarma.getText());
        }
        else if(id==R.id.bir){
            sayitespiti += String.valueOf(bir.getText());
            sonuc.setText(String.valueOf(sonuc.getText())+bir.getText());

        }
        else if(id==R.id.iki){
            sayitespiti += String.valueOf(iki.getText());
            sonuc.setText(String.valueOf(sonuc.getText())+iki.getText());

        }
        else if(id==R.id.uc){
            sayitespiti += String.valueOf(uc.getText());
            sonuc.setText(String.valueOf(sonuc.getText())+uc.getText());

        }
        else if(id==R.id.toplama){
            sayi1=Double.valueOf(String.valueOf(sonuc.getText()));
            sonuc.setText(String.valueOf(sonuc.getText())+toplama.getText());

        }
        else if(id==R.id.ciftsifir){
            sayitespiti += String.valueOf(ciftsifir.getText());
            sonuc.setText(String.valueOf(sonuc.getText())+ciftsifir.getText());

        }
        else if(id==R.id.sifir){
            sayitespiti += String.valueOf(sifir.getText());
            sonuc.setText(String.valueOf(sonuc.getText())+sifir.getText());

        }
        else if(id==R.id.nokta){
            sayitespiti += String.valueOf(nokta.getText());
            sonuc.setText(String.valueOf(sonuc.getText())+nokta.getText());

        }
        else if(id==R.id.esittir){
            if(Objects.equals(isarettespiti, String.valueOf(yuzebol.getText()))){
                sayi1=sayi1/100;
                sonuc.setText(String.valueOf(sayi1));}
            else {
                sayi2 = Double.valueOf(sayitespiti);
                if (isarettespiti == String.valueOf(toplama.getText())) {
                    sonuc.setText(String.valueOf(sayi1 + sayi2));
                } else if (isarettespiti == String.valueOf(cikarma.getText())) {
                    sonuc.setText(String.valueOf(sayi1 - sayi2));
                } else if (isarettespiti == String.valueOf(carpma.getText())) {
                    sonuc.setText(String.valueOf(sayi1 * sayi2));
                } else if (isarettespiti == String.valueOf(bol.getText())) {
                    sonuc.setText(String.valueOf(sayi1 / sayi2));
                }
            }






        }
        if(id == R.id.yuzebol|| id==R.id.bol|| id==R.id.cikarma || id==R.id.toplama || id==R.id.carpma){
            sayitespiti="";
            if(id == R.id.yuzebol)
                isarettespiti=String.valueOf(yuzebol.getText());
            else if(id == R.id.bol)
                isarettespiti=String.valueOf(bol.getText());
            else if(id == R.id.cikarma)
                isarettespiti=String.valueOf(cikarma.getText());
            else if(id == R.id.toplama)
                isarettespiti=String.valueOf(toplama.getText());
            else if(id == R.id.carpma)
                isarettespiti=String.valueOf(carpma.getText());}




    }
}