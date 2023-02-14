package monopoly;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Player {
	
	String name;
	
	static int kasa=20000 ;
	int bakiye=1500;
	int mevcutDurak=0;
	//int index=0;
	
	Duraklar [] sahipOlunanTapular = new Duraklar[39];
	
	int sahipolunankamubinası=0;
	int sahipolunaniskelesayisi=0;

//	public Player (String name) {
//	this.name=name;
//	}
	{
		for (int i=0;i<39;i++) {
			this.sahipOlunanTapular[i] = Duraklar.ZZZ;
		}
	}
	
	public boolean isFullSet  (Duraklar durak) {
		int sayac=0;
		for (int i=0;i<this.sahipOlunanTapular.length;i++) {
		
			if (this.sahipOlunanTapular[i].renk==durak.renk)
				sayac++;
		}
		
		
		if (durak.renk=="KAHVERENGİ" && sayac==2) 
			return true;
		else if (durak.renk=="MAVİ" && sayac==2) 
			return true;
		else if (durak.renk=="YEŞİL" && sayac==3) 
			return true;
		else if (durak.renk=="KIRMIZI" && sayac==3) 
			return true;
		else if (durak.renk=="SARI" && sayac==3) 
			return true;
		else if (durak.renk=="TURUNCU" && sayac==3) 
			return true;
		else if (durak.renk=="PEMBE" && sayac==3) 
			return true;
		else if (durak.renk=="TURKUVAZ" && sayac==3) 
			return true;
		else return false;
	
		
	}
	
	
	public int zarat() throws InterruptedException {
		  
		   Random r=new Random(); //random sınıfı
		   int zar1=r.nextInt(1, 7);
		   int zar2=r.nextInt(1, 7);
		   int zarsonuc = zar1+zar2;
		   Thread.sleep(1000);	
		   System.out.println(this.name + "Zar Atıyor.");
		   Thread.sleep(1000);
		   System.out.println("Zar1: " +zar1 + " Zar2: "+zar2);
		   Thread.sleep(1000);
		   System.out.println(zarsonuc + " kadar ileri gidilecek");
		   return zarsonuc;
		  
		  
		  
		  }
	
	
	public void calculatePricesStations (Duraklar durak) throws InterruptedException {
		
		Scanner sc = new Scanner (System.in);
		
		int index=0;
		for (int i = 0; i < this.sahipOlunanTapular.length; i++) {
		   if (this.sahipOlunanTapular[i] == null) {
		       index = i;
		       Thread.sleep(1000);
		       System.out.println(i + " adet tapunuz var");
		       break;
		   }
		}
		
			if (this.sahipOlunanTapular[0]!=Duraklar.ZZZ) 
				Arrays.sort(this.sahipOlunanTapular);
			if ( (Arrays.binarySearch(this.sahipOlunanTapular, durak)<0)&&durak.sahibi==null ) 
			{
				Thread.sleep(1000);
				System.out.println(durak.name() + " Çıktı, almak istiyor musun?");
				char onay= sc.next().charAt(0);
				if (onay=='e'||onay=='E') {
					this.bakiye-=durak.tapuFiyat;
					Player.kasa+=durak.tapuFiyat;
					this.sahipOlunanTapular[index]=durak;
					durak.sahibi=this;
					this.sahipolunaniskelesayisi++;
					Thread.sleep(1000);
					System.out.println(this.name +" 'den" + durak.tapuFiyat + " TL kasaya aktarıldı. Kasa:" + Player.kasa);
					System.out.println("ödeme sonrası mevcut bakiyeniz:" + this.name +" "+ this.bakiye);
				}
			}
		
			else if (durak.sahibi==this) {
				
				System.out.println("Buradaki  istasyonunuz zaten sizin");
			
			}
				else 
				  {
					if (this.sahipolunaniskelesayisi==1) {
						
						
						Thread.sleep(1000);
						System.out.println("İskele kirası ödeyeceksiniz. Bakiyeniz" + this.name +" "+ this.bakiye);
							this.bakiye-=durak.kira;
							Thread.sleep(1000);
							System.out.println("ödeme sonrası mevcut bakiyeniz:" + this.name +" "+ this.bakiye);
							Thread.sleep(1000);
							System.out.println("Tapu Sahibinin Ödeme Öncesi Bakiyesi:" + durak.sahibi.name + " "+ durak.sahibi.bakiye);
							durak.sahibi.bakiye+=durak.kira;
							Thread.sleep(1000);
							System.out.println("Tapu Sahibinin Ödeme Sonrası Bakiyesi:" + durak.sahibi.name + " "+ durak.sahibi.bakiye);
						}
					else 
						if (this.sahipolunaniskelesayisi==2) {
							
							
							Thread.sleep(1000);
							System.out.println("İskele kirası ödeyeceksiniz. Bakiyeniz" + this.name +" "+ this.bakiye);
								this.bakiye-=durak.ikiistasyon;
								Thread.sleep(1000);
								System.out.println("ödeme sonrası mevcut bakiyeniz:" + this.name +" "+ this.bakiye);
								Thread.sleep(1000);
								System.out.println("Tapu Sahibinin Ödeme Öncesi Bakiyesi:" + durak.sahibi.name + " "+ durak.sahibi.bakiye);
								durak.sahibi.bakiye+=durak.ikiistasyon;
								Thread.sleep(1000);
								System.out.println("Tapu Sahibinin Ödeme Sonrası Bakiyesi:" + durak.sahibi.name + " "+ durak.sahibi.bakiye);
							}
						else 
							if (this.sahipolunaniskelesayisi==3) {
								
								
								Thread.sleep(1000);
								System.out.println("İskele kirası ödeyeceksiniz. Bakiyeniz" + this.name +" "+ this.bakiye);
									this.bakiye-=durak.üçistasyon;
									Thread.sleep(1000);
									System.out.println("ödeme sonrası mevcut bakiyeniz:" + this.name +" "+ this.bakiye);
									Thread.sleep(1000);
									System.out.println("Tapu Sahibinin Ödeme Öncesi Bakiyesi:" + durak.sahibi.name + " "+ durak.sahibi.bakiye);
									durak.sahibi.bakiye+=durak.üçistasyon;
									Thread.sleep(1000);
									System.out.println("Tapu Sahibinin Ödeme Sonrası Bakiyesi:" + durak.sahibi.name + " "+ durak.sahibi.bakiye);
								}
							else 
								if (this.sahipolunaniskelesayisi==4) {
									
									
									Thread.sleep(1000);
									System.out.println("İskele kirası ödeyeceksiniz. Bakiyeniz" + this.name +" "+ this.bakiye);
										this.bakiye-=durak.dörtistasyon;
										Thread.sleep(1000);
										System.out.println("ödeme sonrası mevcut bakiyeniz:" + this.name +" "+ this.bakiye);
										Thread.sleep(1000);
										System.out.println("Tapu Sahibinin Ödeme Öncesi Bakiyesi:" + durak.sahibi.name + " "+ durak.sahibi.bakiye);
										durak.sahibi.bakiye+=durak.dörtistasyon;
										Thread.sleep(1000);
										System.out.println("Tapu Sahibinin Ödeme Sonrası Bakiyesi:" + durak.sahibi.name + " "+ durak.sahibi.bakiye);
									}
				  }
	}
	
	public void calculatePricesGovernment (Duraklar durak, int zarsonuc) throws InterruptedException {
	Scanner sc = new Scanner (System.in);
		
		int index=0;
		for (int i = 0; i < this.sahipOlunanTapular.length; i++) {
		   if (this.sahipOlunanTapular[i] == null) {
		       index = i;
		       Thread.sleep(1000);
		       System.out.println(i + " adet tapunuz var");
		       break;
		   }
		}
		
			if (this.sahipOlunanTapular[0]!=Duraklar.ZZZ) 
				Arrays.sort(this.sahipOlunanTapular);
			if ( (Arrays.binarySearch(this.sahipOlunanTapular, durak)<0)&&durak.sahibi==null ) 
			{
				Thread.sleep(1000);
				System.out.println(durak.name() +" Çıktı, almak istiyor musun?");
				char onay= sc.next().charAt(0);
				if (onay=='e'||onay=='E') {
					this.bakiye-=durak.tapuFiyat;
					Player.kasa+=durak.tapuFiyat;
					//this.sahipOlunanTapular[index]=durak;
					durak.sahibi=this;
					sahipolunankamubinası++;
					Thread.sleep(1000);
					System.out.println(this.name +" 'den" + durak.tapuFiyat + " TL kasaya aktarıldı. Kasa:" + Player.kasa);
					System.out.println("ödeme sonrası mevcut bakiyeniz:" + this.name +" "+ this.bakiye);
				}
			}
			else if (durak.sahibi==this) {
				
				System.out.println("Buradaki  Kamu Kuruluşu zaten sizin");
			
			}
			
			else 
			  {
				if (this.sahipolunankamubinası==1) {
					
					
					Thread.sleep(1000);
					System.out.println(durak.name() +" kirası ödeyeceksiniz. Bakiyeniz" + this.name +" "+ this.bakiye);
						this.bakiye-=zarsonuc*4;
						Thread.sleep(1000);
						System.out.println("ödeme sonrası mevcut bakiyeniz:" + this.name +" "+ this.bakiye);
						Thread.sleep(1000);
						System.out.println("Tapu Sahibinin Ödeme Öncesi Bakiyesi:" + durak.sahibi.name + " "+ durak.sahibi.bakiye);
						durak.sahibi.bakiye+=zarsonuc*4;
						Thread.sleep(1000);
						System.out.println("Tapu Sahibinin Ödeme Sonrası Bakiyesi:" + durak.sahibi.name + " "+ durak.sahibi.bakiye);
					}
				else 
					if (this.sahipolunankamubinası==2) {
						
						
						Thread.sleep(1000);
						System.out.println(durak.name() + " kirası ödeyeceksiniz. Bakiyeniz" + this.name +" "+ this.bakiye);
							this.bakiye-=zarsonuc*10;
							Thread.sleep(1000);
							System.out.println("ödeme sonrası mevcut bakiyeniz:" + this.name +" "+ this.bakiye);
							Thread.sleep(1000);
							System.out.println("Tapu Sahibinin Ödeme Öncesi Bakiyesi:" + durak.sahibi.name + " "+ durak.sahibi.bakiye);
							durak.sahibi.bakiye+=zarsonuc*10;
							Thread.sleep(1000);
							System.out.println("Tapu Sahibinin Ödeme Sonrası Bakiyesi:" + durak.sahibi.name + " "+ durak.sahibi.bakiye);
						}
					
			  }
			
	}
	
	public void calculatePrices (Duraklar durak) throws InterruptedException {
		
		Scanner sc = new Scanner (System.in);
		
		int index=0;
		for (int i = 0; i < this.sahipOlunanTapular.length; i++) {
		   if (this.sahipOlunanTapular[i] == null) {
		       index = i;
		       Thread.sleep(1000);
		       System.out.println(i + " adet tapunuz var");
		       break;
		   }
		}
		
			if (this.sahipOlunanTapular[0]!=Duraklar.ZZZ) 
				Arrays.sort(this.sahipOlunanTapular);
			if ( (Arrays.binarySearch(this.sahipOlunanTapular, durak)<0)&&durak.sahibi==null ) 
			{
				Thread.sleep(1000);
				System.out.println(durak.name() +" Çıktı, almak istiyor musun?");
				char onay= sc.next().charAt(0);
				if (onay=='e'||onay=='E') {
					this.bakiye-=durak.tapuFiyat;
					Player.kasa+=durak.tapuFiyat;
					this.sahipOlunanTapular[index]=durak;
					durak.sahibi=this;
					Thread.sleep(1000);
					System.out.println(this.name +" 'den" + durak.tapuFiyat + " TL kasaya aktarıldı. Kasa:" + Player.kasa);
					System.out.println("ödeme sonrası mevcut bakiyeniz:" + this.name +" "+ this.bakiye);
				}
			}
			
			else if (durak.sahibi==this) {
				Thread.sleep(1000);
				System.out.println("Burada Tapunuz var. ev satın almak istermisiniz ?");
				char onay= sc.next().charAt(0);
				if (onay=='e'||onay=='E') {
					this.bakiye-=durak.evbedel;
					Thread.sleep(1000);
					System.out.println("ödeme sonrası mevcut bakiyeniz:" + this.name +" "+ this.bakiye);
					durak.sahipOlunanEvSayisi++;
									}
			}
				else 
				  {
					if (durak.sahipOlunanEvSayisi==0) {
						
						if (this.isFullSet(durak)) {
							Thread.sleep(1000);
							System.out.println("TamSet Arsa kirası ödeyeceksiniz. Bakiyeniz" + this.name +" "+ this.bakiye);
								this.bakiye-=durak.tamset;
								Thread.sleep(1000);
								System.out.println("ödeme sonrası mevcut bakiyeniz:" + this.name +" "+ this.bakiye);
								Thread.sleep(1000);
								System.out.println("Tapu Sahibinin Ödeme Öncesi Bakiyesi:" + durak.sahibi.name + " "+ durak.sahibi.bakiye);
								durak.sahibi.bakiye+=durak.tamset;
								Thread.sleep(1000);
								System.out.println("Tapu Sahibinin Ödeme Sonrası Bakiyesi:" + durak.sahibi.name + " "+ durak.sahibi.bakiye);
							
						}
						else {
						Thread.sleep(1000);
						System.out.println("Arsa kirası ödeyeceksiniz. Bakiyeniz" + this.name +" "+ this.bakiye);
							this.bakiye-=durak.kira;
							Thread.sleep(1000);
							System.out.println("ödeme sonrası mevcut bakiyeniz:" + this.name +" "+ this.bakiye);
							Thread.sleep(1000);
							System.out.println("Tapu Sahibinin Ödeme Öncesi Bakiyesi:" + durak.sahibi.name + " "+ durak.sahibi.bakiye);
							durak.sahibi.bakiye+=durak.kira;
							Thread.sleep(1000);
							System.out.println("Tapu Sahibinin Ödeme Sonrası Bakiyesi:" + durak.sahibi.name + " "+ durak.sahibi.bakiye);
						}
					if (durak.sahipOlunanEvSayisi==1) {
					Thread.sleep(1000);
					System.out.println("1 ev kirası ödeyeceksiniz. Bakiyeniz" + this.name +" "+ this.bakiye);
						this.bakiye-=durak.ev1kira;
						Thread.sleep(1000);
						System.out.println("ödeme sonrası mevcut bakiyeniz:" + this.name +" "+ this.bakiye);
						Thread.sleep(1000);
						System.out.println("Tapu Sahibinin Ödeme Öncesi Bakiyesi:" + durak.sahibi.name + " "+ durak.sahibi.bakiye);
						durak.sahibi.bakiye+=durak.ev1kira;
						Thread.sleep(1000);
						System.out.println("Tapu Sahibinin Ödeme Sonrası Bakiyesi:" + durak.sahibi.name + " "+ durak.sahibi.bakiye);
					}
					else if (durak.sahipOlunanEvSayisi==2) {
						Thread.sleep(1000);
						System.out.println("2 ev kirası ödeyeceksiniz. Bakiyeniz" + this.name +" "+ this.bakiye);
						this.bakiye-=durak.ev2kira;
						Thread.sleep(1000);
						System.out.println("ödeme sonrası mevcut bakiyeniz:" + this.name +" "+ this.bakiye);
						Thread.sleep(1000);
						System.out.println("Tapu Sahibinin Ödeme Öncesi Bakiyesi:" + durak.sahibi.name + " "+ durak.sahibi.bakiye);
						durak.sahibi.bakiye+=durak.ev2kira;
						Thread.sleep(1000);
						System.out.println("Tapu Sahibinin Ödeme Sonrası Bakiyesi:" + durak.sahibi.name + " "+ durak.sahibi.bakiye);
					}
					else if (durak.sahipOlunanEvSayisi==3) {
						Thread.sleep(1000);
						System.out.println("3 ev kirası ödeyeceksiniz. Bakiyeniz" + this.name +" "+ this.bakiye);
						this.bakiye-=durak.ev3kira;
						Thread.sleep(1000);
						System.out.println("ödeme sonrası mevcut bakiyeniz:" + this.name +" "+ this.bakiye);
						Thread.sleep(1000);
						System.out.println("Tapu Sahibinin Ödeme Öncesi Bakiyesi:" + durak.sahibi.name + " "+ durak.sahibi.bakiye);
						durak.sahibi.bakiye+=durak.ev3kira;
						Thread.sleep(1000);
						System.out.println("Tapu Sahibinin Ödeme Sonrası Bakiyesi:" + durak.sahibi.name + " "+ durak.sahibi.bakiye);
				}
					else if (durak.sahipOlunanEvSayisi==4) {
						
						Thread.sleep(1000);
						System.out.println("4 ev kirası ödeyeceksiniz. Bakiyeniz" + this.name +" "+ this.bakiye);
						this.bakiye-=durak.ev4kira;
						Thread.sleep(1000);
						System.out.println("ödeme sonrası mevcut bakiyeniz:" + this.name +" "+ this.bakiye);
						Thread.sleep(1000);
						System.out.println("Tapu Sahibinin Ödeme Öncesi Bakiyesi:" + durak.sahibi.name + " "+ durak.sahibi.bakiye);
						durak.sahibi.bakiye+=durak.ev4kira;
						Thread.sleep(1000);
						System.out.println("Tapu Sahibinin Ödeme Sonrası Bakiyesi:" + durak.sahibi.name + " "+ durak.sahibi.bakiye);
				}
					
			
			}
			}
		}
	
	
	
	public void play () throws InterruptedException {
		
				
		
							
			int zardegeri= zarat();
			Thread.sleep(1000);
			System.out.println("mevcut durak: " + this.mevcutDurak);			
			this.mevcutDurak	= this.mevcutDurak + zardegeri;
			Thread.sleep(1000);
			System.out.println("Varılan durak: " + this.mevcutDurak);		
			
			if (this.mevcutDurak>39) {
				Thread.sleep(1000);
				System.out.println("Haritanın sonuna geldiniz. Başa Dönülüyor");
				this.mevcutDurak=(mevcutDurak%39);
				Thread.sleep(1000);
				System.out.println("mevcut durak: " + this.mevcutDurak);	
		//	this.bakiye+=1500;
			}
			
			
			
			switch (this.mevcutDurak) {
			
						
			case 0: {
				//this.bakiye+=1500;
			
			}
			
						
			case 1: calculatePrices (Duraklar.KASIMPAŞA);break;
			case 2: System.out.println("KAMU FONU ŞİMDİLİK PAS GEÇİLİYOR");// KAMUFONU;break;
			case 3: calculatePrices (Duraklar.DOLAPDERE);break;
			case 4: {
				this.bakiye-=200;
				Player.kasa+=200;
				
				Thread.sleep(1000);
				System.out.println(this.name +" 'den" + 200 + " TL kasaya aktarıldı. Kasa : "+ Player.kasa);
			};break;
			case 5: calculatePricesStations (Duraklar.HAYDARPAŞATREN);break;
			case 6: calculatePrices (Duraklar.SULTANAHMET);break;
			case 7: System.out.println("ŞANS çıktı ŞİMDİLİK PAS GEÇİLİYOR");break; //calculatePrices (Duraklar.ŞANS);break;
			case 8: calculatePrices (Duraklar.KARAKÖY);break;
			case 9: calculatePrices (Duraklar.SİRKECİ);break;
			case 10: System.out.println("MİSAFİR çıktı ŞİMDİLİK PAS GEÇİLİYOR");break; //calculatePrices (Duraklar.MİSAFİR);break;
			case 11: calculatePrices (Duraklar.BEYOĞLU);break;
			case 12: calculatePricesGovernment (Duraklar.ELEKTRİKİDARESİ,zardegeri);break;
			case 13: calculatePrices (Duraklar.BEŞİKTAŞ);break;
			case 14: calculatePrices (Duraklar.TAKSİM);break;
			case 15: calculatePricesStations (Duraklar.KADIKÖYVAPUR);break;
			case 16: calculatePrices (Duraklar.HARBİYE);break;
			case 17: System.out.println("KAMU FONU ŞİMDİİLİK PAS GEÇİLİYOR");break; //calculatePrices (Duraklar.KAMUFONU2);break;
			case 18: calculatePrices (Duraklar.ŞİŞLİ);break;
			case 19: calculatePrices (Duraklar.MECİDİYEKÖY);break;
			case 20: calculatePrices (Duraklar.OTOPARK);break;
			case 21: calculatePrices (Duraklar.BOSTANCI);break;
			case 22: System.out.println("ŞANS çıktı ŞİMDİLİK PAS GEÇİLİYOR");break; //calculatePrices (Duraklar.ŞANS2);break;
			case 23: calculatePrices (Duraklar.ERENKÖY);break;
			case 24: calculatePrices (Duraklar.CADDEBOSTAN);break;
			case 25: calculatePricesStations (Duraklar.KABATAŞVAPUR);break;
			case 26: calculatePrices (Duraklar.NİŞANTAŞI);break;
			case 27: calculatePrices (Duraklar.TEŞVİKİYE);break;
			case 28: calculatePricesGovernment (Duraklar.SULARİDARESİ,zardegeri);break;
			case 29: calculatePrices (Duraklar.MAÇKA);break;
			case 30: System.out.println("KODES çıktı ŞİMDİLİK PAS GEÇİLİYOR");break; //calculatePrices (Duraklar.KODES);break;
			case 31: calculatePrices (Duraklar.LEVENT);break;
			case 32: calculatePrices (Duraklar.ETİLER);break;
			case 33: System.out.println("KAMUFONU çıktı ŞİMDİLİK PAS GEÇİLİYOR");break; //calculatePrices (Duraklar.KAMUFONU3);break;
			case 34: calculatePrices (Duraklar.BEBEK);break;
			case 35: calculatePricesStations (Duraklar.SİRKECİTREN);break;
			case 36: System.out.println("ŞANS çıktı ŞİMDİLİK PAS GEÇİLİYOR");break; //calculatePrices (Duraklar.ŞANS3);break;
			case 37: calculatePrices (Duraklar.TARABYA);break;
			case 38: {
				this.bakiye-=100;
				Player.kasa+=100;
				
				Thread.sleep(1000);
				System.out.println(this.name +" 'den" + 100 + " TL kasaya aktarıldı. Kasa :" + Player.kasa);
			};break;
			case 39: calculatePrices (Duraklar.YENİKÖY);break;
			
			

			};


	}
			
}




		
	


