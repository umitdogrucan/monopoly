package monopoly;


public enum Duraklar {
	BAŞLANGIÇ,KASIMPAŞA,ZZZ,KAMUFONU,DOLAPDERE,GELİRVERGİSİ,HAYDARPAŞATREN,SULTANAHMET,ŞANS,
	KARAKÖY,SİRKECİ,MİSAFİR,BEYOĞLU,ELEKTRİKİDARESİ,BEŞİKTAŞ,
	TAKSİM,KADIKÖYVAPUR,HARBİYE,KAMUFONU2,ŞİŞLİ,
	MECİDİYEKÖY,OTOPARK,BOSTANCI,
	ŞANS2,ERENKÖY,CADDEBOSTAN,KABATAŞVAPUR,
	NİŞANTAŞI,TEŞVİKİYE,SULARİDARESİ,MAÇKA,KODES,
	LEVENT,ETİLER,KAMUFONU3,BEBEK,SİRKECİTREN,
	ŞANS3,TARABYA,LÜKSVERGİSİ,YENİKÖY;
	
	
	int kira;
	int tapuFiyat;
	int ev1kira;
	int ev2kira;
	int ev3kira;
	int ev4kira;
	int otelkira;
	int evbedel;
	int otelbedel;
	int tamset;
	String renk;
	int ikiistasyon;
	int üçistasyon;
	int dörtistasyon;
	int sahipOlunanEvSayisi;
	Player sahibi;

	static {
		KASIMPAŞA.kira=2;
		KASIMPAŞA.tapuFiyat=60;
		KASIMPAŞA.ev1kira=10;
		KASIMPAŞA.ev2kira=30;
		KASIMPAŞA.ev3kira=90;
		KASIMPAŞA.ev4kira=160;
		KASIMPAŞA.otelkira=250;
		KASIMPAŞA.evbedel=50;
		KASIMPAŞA.otelbedel=250;
		KASIMPAŞA.tamset=4;
		KASIMPAŞA.renk="KAHVERENGİ";
		
		ZZZ.kira=2;
		ZZZ.tapuFiyat=60;
		ZZZ.ev1kira=10;
		ZZZ.ev2kira=30;
		ZZZ.ev3kira=90;
		ZZZ.ev4kira=160;
		ZZZ.otelkira=250;
		ZZZ.evbedel=50;
		ZZZ.otelbedel=250;
		ZZZ.tamset=4;
		ZZZ.renk="KAHVERENGİ";
		
		DOLAPDERE.kira=4;
		DOLAPDERE.tapuFiyat=60;
		DOLAPDERE.ev1kira=20;
		DOLAPDERE.ev2kira=60;
		DOLAPDERE.ev3kira=180;
		DOLAPDERE.ev4kira=320;
		DOLAPDERE.otelkira=450;
		DOLAPDERE.evbedel=50;
		DOLAPDERE.otelbedel=250;
		DOLAPDERE.tamset=8;
		DOLAPDERE.renk="KAHVERENGİ";
		
		HAYDARPAŞATREN.kira=25;
		HAYDARPAŞATREN.ikiistasyon=50;
		HAYDARPAŞATREN.üçistasyon=100;
		HAYDARPAŞATREN.dörtistasyon=200;
		HAYDARPAŞATREN.tapuFiyat=200;
		
		KADIKÖYVAPUR.kira=25;
		KADIKÖYVAPUR.ikiistasyon=50;
		KADIKÖYVAPUR.üçistasyon=100;
		KADIKÖYVAPUR.dörtistasyon=200;
		KADIKÖYVAPUR.tapuFiyat=200;
		
		KABATAŞVAPUR.kira=25;
		KABATAŞVAPUR.ikiistasyon=50;
		KABATAŞVAPUR.üçistasyon=100;
		KABATAŞVAPUR.dörtistasyon=200;
		KABATAŞVAPUR.tapuFiyat=200;
		
		SİRKECİTREN.kira=25;
		SİRKECİTREN.ikiistasyon=50;
		SİRKECİTREN.üçistasyon=100;
		SİRKECİTREN.dörtistasyon=200;
		SİRKECİTREN.tapuFiyat=200;

		SULARİDARESİ.tapuFiyat=150;
		ELEKTRİKİDARESİ.tapuFiyat=150;
		
		SULTANAHMET.kira=6;
		SULTANAHMET.tapuFiyat=100;
		SULTANAHMET.ev1kira=30;
		SULTANAHMET.ev2kira=90;
		SULTANAHMET.ev3kira=270;
		SULTANAHMET.ev4kira=400;
		SULTANAHMET.otelkira=550;
		SULTANAHMET.evbedel=50;
		SULTANAHMET.otelbedel=250;
		SULTANAHMET.tamset=12;
		SULTANAHMET.renk="TURKUVAZ";
		
		KARAKÖY.kira=6;
		KARAKÖY.tapuFiyat=100;
		KARAKÖY.ev1kira=30;
		KARAKÖY.ev2kira=90;
		KARAKÖY.ev3kira=270;
		KARAKÖY.ev4kira=400;
		KARAKÖY.otelkira=550;
		KARAKÖY.evbedel=50;
		KARAKÖY.otelbedel=250;
		KARAKÖY.tamset=12;
		KARAKÖY.renk="TURKUVAZ";
		
		SİRKECİ.kira=8;
		SİRKECİ.tapuFiyat=120;
		SİRKECİ.ev1kira=40;
		SİRKECİ.ev2kira=100;
		SİRKECİ.ev3kira=300;
		SİRKECİ.ev4kira=450;
		SİRKECİ.otelkira=600;
		SİRKECİ.evbedel=50;
		SİRKECİ.otelbedel=250;
		SİRKECİ.tamset=16;
		SİRKECİ.renk="TURKUVAZ";
		
		BEYOĞLU.kira=10;
		BEYOĞLU.tapuFiyat=140;
		BEYOĞLU.ev1kira=50;
		BEYOĞLU.ev2kira=150;
		BEYOĞLU.ev3kira=450;
		BEYOĞLU.ev4kira=625;
		BEYOĞLU.otelkira=750;
		BEYOĞLU.evbedel=10;
		BEYOĞLU.otelbedel=500;
		BEYOĞLU.tamset=20;
		BEYOĞLU.renk="PEMBE";
		
		BEŞİKTAŞ.kira=10;
		BEŞİKTAŞ.tapuFiyat=140;
		BEŞİKTAŞ.ev1kira=50;
		BEŞİKTAŞ.ev2kira=150;
		BEŞİKTAŞ.ev3kira=450;
		BEŞİKTAŞ.ev4kira=625;
		BEŞİKTAŞ.otelkira=750;
		BEŞİKTAŞ.evbedel=100;
		BEŞİKTAŞ.otelbedel=500;
		BEŞİKTAŞ.tamset=20;
		BEŞİKTAŞ.renk="PEMBE";
		
		TAKSİM.kira=12;
		TAKSİM.tapuFiyat=160;
		TAKSİM.ev1kira=60;
		TAKSİM.ev2kira=180;
		TAKSİM.ev3kira=500;
		TAKSİM.ev4kira=700;
		TAKSİM.otelkira=900;
		TAKSİM.evbedel=100;
		TAKSİM.otelbedel=500;
		TAKSİM.tamset=24;
		TAKSİM.renk="PEMBE";
		

		
		HARBİYE.kira=14;
		HARBİYE.tapuFiyat=180;
		HARBİYE.ev1kira=70;
		HARBİYE.ev2kira=200;
		HARBİYE.ev3kira=550;
		HARBİYE.ev4kira=750;
		HARBİYE.otelkira=950;
		HARBİYE.evbedel=100;
		HARBİYE.otelbedel=500;
		HARBİYE.tamset=28;
		HARBİYE.renk="TURUNCU";
		
		ŞİŞLİ.kira=14;
		ŞİŞLİ.tapuFiyat=180;
		ŞİŞLİ.ev1kira=70;
		ŞİŞLİ.ev2kira=200;
		ŞİŞLİ.ev3kira=550;
		ŞİŞLİ.ev4kira=750;
		ŞİŞLİ.otelkira=950;
		ŞİŞLİ.evbedel=100;
		ŞİŞLİ.otelbedel=500;
		ŞİŞLİ.tamset=28;
		ŞİŞLİ.renk="TURUNCU";
		
		MECİDİYEKÖY.kira=16;
		MECİDİYEKÖY.tapuFiyat=200;
		MECİDİYEKÖY.ev1kira=80;
		MECİDİYEKÖY.ev2kira=220;
		MECİDİYEKÖY.ev3kira=600;
		MECİDİYEKÖY.ev4kira=800;
		MECİDİYEKÖY.otelkira=1000;
		MECİDİYEKÖY.evbedel=100;
		MECİDİYEKÖY.otelbedel=500;
		MECİDİYEKÖY.tamset=32;
		MECİDİYEKÖY.renk="TURUNCU";
		
		BOSTANCI.kira=18;
		BOSTANCI.tapuFiyat=220;
		BOSTANCI.ev1kira=90;
		BOSTANCI.ev2kira=250;
		BOSTANCI.ev3kira=700;
		BOSTANCI.ev4kira=875;
		BOSTANCI.otelkira=1050;
		BOSTANCI.evbedel=150;
		BOSTANCI.otelbedel=750;
		BOSTANCI.tamset=36;
		BOSTANCI.renk="KIRMIZI";
		
		ERENKÖY.kira=18;
		ERENKÖY.tapuFiyat=220;
		ERENKÖY.ev1kira=90;
		ERENKÖY.ev2kira=250;
		ERENKÖY.ev3kira=700;
		ERENKÖY.ev4kira=875;
		ERENKÖY.otelkira=1050;
		ERENKÖY.evbedel=150;
		ERENKÖY.otelbedel=750;
		ERENKÖY.tamset=36;
		ERENKÖY.renk="TURUNCU";
		
		CADDEBOSTAN.kira=20;
		CADDEBOSTAN.tapuFiyat=240;
		CADDEBOSTAN.ev1kira=100;
		CADDEBOSTAN.ev2kira=300;
		CADDEBOSTAN.ev3kira=750;
		CADDEBOSTAN.ev4kira=925;
		CADDEBOSTAN.otelkira=1100;
		CADDEBOSTAN.evbedel=150;
		CADDEBOSTAN.otelbedel=750;
		CADDEBOSTAN.tamset=40;
		CADDEBOSTAN.renk="KIRMIZI";
		

		NİŞANTAŞI.kira=22;
		NİŞANTAŞI.tapuFiyat=260;
		NİŞANTAŞI.ev1kira=110;
		NİŞANTAŞI.ev2kira=330;
		NİŞANTAŞI.ev3kira=800;
		NİŞANTAŞI.ev4kira=975;
		NİŞANTAŞI.otelkira=1150;
		NİŞANTAŞI.evbedel=150;
		NİŞANTAŞI.otelbedel=750;
		NİŞANTAŞI.tamset=44;
		NİŞANTAŞI.renk="SARI";
		
		TEŞVİKİYE.kira=22;
		TEŞVİKİYE.tapuFiyat=260;
		TEŞVİKİYE.ev1kira=110;
		TEŞVİKİYE.ev2kira=330;
		TEŞVİKİYE.ev3kira=800;
		TEŞVİKİYE.ev4kira=975;
		TEŞVİKİYE.otelkira=1150;
		TEŞVİKİYE.evbedel=150;
		TEŞVİKİYE.otelbedel=750;
		TEŞVİKİYE.tamset=44;
		TEŞVİKİYE.renk="SARI";
		
		MAÇKA.kira=24;
		MAÇKA.tapuFiyat=280;
		MAÇKA.ev1kira=120;
		MAÇKA.ev2kira=360;
		MAÇKA.ev3kira=850;
		MAÇKA.ev4kira=1025;
		MAÇKA.otelkira=1200;
		MAÇKA.evbedel=150;
		MAÇKA.otelbedel=750;
		MAÇKA.tamset=48;
		MAÇKA.renk="SARI";
		
		LEVENT.kira=26;
		LEVENT.tapuFiyat=300;
		LEVENT.ev1kira=130;
		LEVENT.ev2kira=390;
		LEVENT.ev3kira=900;
		LEVENT.ev4kira=1100;
		LEVENT.otelkira=1275;
		LEVENT.evbedel=200;
		LEVENT.otelbedel=1000;
		LEVENT.tamset=104;
		LEVENT.renk="YEŞİL";
		
		ETİLER.kira=26;
		ETİLER.tapuFiyat=300;
		ETİLER.ev1kira=130;
		ETİLER.ev2kira=900;
		ETİLER.ev3kira=900;
		ETİLER.ev4kira=1100;
		ETİLER.otelkira=1275;
		ETİLER.evbedel=200;
		ETİLER.otelbedel=1000;
		ETİLER.tamset=104;
		ETİLER.renk="YEŞİL";
		
		BEBEK.kira=28;
		BEBEK.tapuFiyat=320;
		BEBEK.ev1kira=150;
		BEBEK.ev2kira=450;
		BEBEK.ev3kira=1000;
		BEBEK.ev4kira=1200;
		BEBEK.otelkira=1400;
		BEBEK.evbedel=200;
		BEBEK.otelbedel=1000;
		BEBEK.tamset=56;
		BEBEK.renk="YEŞİL";
		
		
		TARABYA.kira=35;
		TARABYA.tapuFiyat=350;
		TARABYA.ev1kira=175;
		TARABYA.ev2kira=500;
		TARABYA.ev3kira=1100;
		TARABYA.ev4kira=1300;
		TARABYA.otelkira=1500;
		TARABYA.evbedel=200;
		TARABYA.otelbedel=1000;
		TARABYA.tamset=70;
		TARABYA.renk="MAVİ";
		
		YENİKÖY.kira=50;
		YENİKÖY.tapuFiyat=400;
		YENİKÖY.ev1kira=200;
		YENİKÖY.ev2kira=600;
		YENİKÖY.ev3kira=1400;
		YENİKÖY.ev4kira=1700;
		YENİKÖY.otelkira=2000;
		YENİKÖY.evbedel=200;
		YENİKÖY.otelbedel=1000;
		YENİKÖY.tamset=100;
		YENİKÖY.renk="MAVİ";
		
		
		
		
	}

}

