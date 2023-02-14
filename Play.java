package monopoly;

import java.util.Scanner;

public class Play {

	public static void main(String[] args) throws InterruptedException {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Oyunu kaç kişi oynamak istiyorsunuz?");
		int playernumber=sc.nextInt();
		
		Player[] playerArray = new Player[playernumber];
		
		for (int i=0;i<playernumber;i++) {
			System.out.println(i+1+"'nci oyuncunun ismini giriniz");
			String playername=sc.next();
			playerArray[i] = new Player();
			playerArray[i].name = playername;
			
		}
	
		while (playerArray[0].bakiye!=0||playerArray[1].bakiye!=0) {
		for (int i=0;i<playerArray.length;i++) {
		System.out.println(playerArray[i].name + "Oynuyor");
		Thread.sleep(1000);	
		playerArray[i].play();
		}

}
	}
}
