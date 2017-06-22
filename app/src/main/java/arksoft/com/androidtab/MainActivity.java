package arksoft.com.androidtab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Tabları oluşturmak için anasınıf olan TabHostu kullanırız
        TabHost tablar=(TabHost) findViewById(R.id.tabhost);
        tablar.setup();

        TabHost.TabSpec tabOzellikleri=tablar.newTabSpec("tag1");
        //Tabların içeriğini set ediyoruz buraya linear layoutların id'si gelecek

        //Tabımınızın bulundugu layoutu içerik olarak ayarlıyoruz
        tabOzellikleri.setContent(R.id.tab1);
        //Tabın üzerinde gözükecek ismi belirliyoruz
        tabOzellikleri.setIndicator("1.Tab");
        //tabımızı tab hosta ekliyoruz
        tablar.addTab(tabOzellikleri);

        //2.tabı ekliyoruz
        tabOzellikleri=tablar.newTabSpec("tag2");
        tabOzellikleri.setContent(R.id.tab2);
        tabOzellikleri.setIndicator("2.tab");
        tablar.addTab(tabOzellikleri);


        //3.tabı ekliyoruz
        tabOzellikleri=tablar.newTabSpec("tag3");
        tabOzellikleri.setContent(R.id.tab3);
        tabOzellikleri.setIndicator("3.tab");
        tablar.addTab(tabOzellikleri);
    }


}
