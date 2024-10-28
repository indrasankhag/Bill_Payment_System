import java.util.*;
class Bill_Payment_System{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("==================================================================================");
		System.out.println("                                                                                  ");
		System.out.println("__          __  _                             _          _ __  __            _                  ");
		System.out.println("\\ \\        / / | |                           | |        (_)  \\/  |          | |              ");
		System.out.println(" \\ \\  /\\  / /__| | ___  ___  _ __ ___   ___  | |_ ___    _| \\  / | __ _ _ __| |_            ");
		System.out.println("  \\ \\/  \\/ / _ \\ |/  __/ _ \\| '_ ` _ \\ / _ \\ | __/ _ \\  | | |\\/| |/ _` | '__| __|      ");
 		System.out.println("   \\  /\\  /  __/ |  (_| (_) | | | | | |  __/ | || (_) | | | |  | | (_| | |  | |_              ");
		System.out.println("    \\/  \\/ \\___|_|\\___ \\___/|_| |_| |_|\\___|  \\__\\___/  |_|_|  |_|\\__,_|_|   \\__|     ");
		System.out.println("                                                                                  ");
		System.out.println("==================================================================================");
		System.out.println("                                                                                  ");

		System.out.print("Enter Customer Phone Number - ");
		String tp=input.nextLine();
		System.out.println("                                                                                  ");
		System.out.print("Enter Customer Name         - ");
		String name=input.nextLine();
		System.out.println("                                                                                  ");
		System.out.println("                                                                                  ");
		System.out.println("==================================================================================");
		System.out.println("                                                                                  ");

		System.out.print("Basmathi Qty(Kg) - ");
		int bq=input.nextInt();
		System.out.println("                                                                                  ");

		System.out.print("Dhal Qty(Kg)     - ");
		int dq=input.nextInt();
		System.out.println("                                                                                  ");

		System.out.print("Sugar Qty(Kg)    - ");
		int sq=input.nextInt();
		System.out.println("                                                                                  ");

		System.out.print("Highland Qty     - ");
		int hq=input.nextInt();
		System.out.println("                                                                                  ");

		System.out.print("Yoghurt Qty      - ");
		int yq=input.nextInt();
		System.out.println("                                                                                  ");

		System.out.print("Flour Qty(Kg)    - ");
		int fq=input.nextInt();
		System.out.println("                                                                                  ");

		System.out.print("Soap Qty         - ");
		int soq=input.nextInt();
		System.out.println("                                                                                  ");
		
		double bp,dp,sp,hp,yp,fp,sop;
		bp=250.00;
		dp=180.00;
		sp=150.00;
		hp=1200.00;
		yp=50.00;
		fp=120.00;
		sop =160.00;

		double dbq=bq;
		double ddq=dq;
		double dsq=sq;
		double dhq=hq;
		double dyq=yq;
		double dfq=fq;
		double dsoq=soq;

		double bt,dt,st,ht,yt,ft,sot;
		bt=dbq*bp;
		dt=ddq*dp;
		st=dsq*sp;
		ht=dhq*hp;
		yt=dyq*yp;
		ft=dfq*fp;
		sot=dsoq*sop;
	
		double Total=bt+dt+st+ht+yt+ft+sot;
		double Discount=Total*10/100;
		double Price=Total-Discount;
	
		System.out.println("+--------------------------------------------------------------------------------+");
		System.out.println("|                        _   __  __          ______ _______                      |");
		System.out.println("|                       (_) |  \\/  |   /\\   |  __  \\__   __|                     |");      
		System.out.println("|                        _  | \\  / |  /  \\  | |__)  | | |                        |");
		System.out.println("|                       | | | |\\/| | / /\\ \\ |  __  /  | |                        |");
		System.out.println("|                       | | | |  | |/ ____ \\| |  \\ \\  | |                        |");
		System.out.println("|                       |_| |_|  |_/_/    \\_\\_|   \\_\\ |_|                        |");
		System.out.println("|                            225,Galle Road,Panadura.                            |");
		System.out.println("|                                                                                |");
		System.out.println("+--------------------------------------------------------------------------------+");
		System.out.printf("|                               # Tel   : %-39s|\n",tp);
		System.out.printf("|                               # Name  : %-39s|\n",name);
		System.out.println("+-----------------+-----------------+--------------------+-----------------------+");
		System.out.println("|                 |       Qty       |     unit price     |         Price         |");
		System.out.println("+-----------------+-----------------+--------------------+-----------------------+");                                                       
		System.out.printf("| #Basmathi       |       %-10d|       %-13.1f|         %-14.1f|\n",bq,bp,bt);
		System.out.println("|                 |                 |                    |                       |");
		System.out.printf("| #Dhal           |       %-10d|       %-13.1f|         %-14.1f|\n",dq,dp,dt);
		System.out.println("|                 |                 |                    |                       |");
		System.out.printf("| #Sugar          |       %-10d|       %-13.1f|         %-14.1f|\n",sq,sp,st);
		System.out.println("|                 |                 |                    |                       |");
		System.out.printf("| #Highland       |       %-10d|       %-13.1f|         %-14.1f|\n",hq,hp,ht);
		System.out.println("|                 |                 |                    |                       |");
		System.out.printf("| #Yoghurt        |       %-10d|       %-13.1f|         %-14.1f|\n",yq,yp,yt);
		System.out.println("|                 |                 |                    |                       |");
		System.out.printf("| #flour          |       %-10d|       %-13.1f|         %-14.1f|\n",fq,fp,ft);
		System.out.println("|                 |                 |                    |                       |");
		System.out.printf("| #Soap           |       %-10d|       %-13.1f|         %-14.1f|\n",soq,sop,sot);
		System.out.println("|                 |                 |                    |                       |");
		System.out.println("+-----------------+-----------------+--------------------+-----------------------+");
		System.out.printf("|                                   |   Total            |         %-14.1f|\n",Total);
		System.out.println("|                                   +--------------------+-----------------------+");
		System.out.printf("|                                   |   Discount(10%%)    |         %-14.1f|\n",Discount);
		System.out.println("|                                   +--------------------+-----------------------+");
		System.out.printf("|                                   |   Price            |         %-14.1f|\n",Price);
		System.out.println("+-----------------------------------+--------------------+-----------------------+");
		System.out.println();
		System.out.print("Enter Customer Provided Amount : ");
		double cash = input.nextDouble();
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		double temp = cash - Price;
		int change = (int)temp;
		
		System.out.println("                   +---------------------+--------------------+                   ");
		System.out.printf("                   |     Net Amount      |          %-10.1f|\n",Price);
		System.out.println("                   +---------------------+--------------------+                   ");
		System.out.printf("                   |     Cash            |          %-10.1f|\n",cash);
		System.out.println("                   +---------------------+--------------------+                   ");
		System.out.printf("                   |     Change          |          %-10d|\n",change);
		System.out.println("                   +---------------------+--------------------+                   ");
		
		System.out.println();
		System.out.println();
		System.out.println();

		int r5000 = change/5000;
		int m5000 = change%5000;
		
		int r2000 = m5000/2000;
		int m2000 = m5000%2000;
		
		int r1000 = m2000/1000;
		int m1000 = m2000%1000;

		int r500 = m1000/500;
		int m500 = m1000%500;

		int r100 = m500/100;
		int m100 = m500%100;
		
		int r50 = m100/50;
		int m50 = m100%50;

		int r20 = m50/20;
		int m20 = m50%20;

		int r10 = m20/10;
		int m10 = m20%10;

		int r5 = m10/5;
		int m5 = m10%5;

		int r2 = m5/2;
		int m2 = m5%2;

		int r1 = m2/1;
		
		int no_notes = r5000+r2000+r1000+r500+r100+r50+r20;
		int no_coins = r10+r5+r2+r1;
		
		System.out.println("                   +---------------------+--------------------+                   ");
		System.out.println("                   |        Value        |        No          |                   ");
		System.out.println("                   +---------------------+--------------------+                   ");
		System.out.printf("                   |       Rs.5000       |          %-10d|\n",r5000);
		System.out.println("                   |---------------------|--------------------|                   ");
		System.out.printf("                   |       Rs.2000       |          %-10d|\n",r2000);
		System.out.println("                   |---------------------|--------------------|                   ");
		System.out.printf("                   |       Rs.1000       |          %-10d|\n",r1000);
		System.out.println("                   |---------------------|--------------------|                   ");
		System.out.printf("                   |       Rs.500        |          %-10d|\n",r500);
		System.out.println("                   |---------------------|--------------------|                   ");
		System.out.printf("                   |       Rs.100        |          %-10d|\n",r100);
		System.out.println("                   |---------------------|--------------------|                   ");
		System.out.printf("                   |       Rs.50         |          %-10d|\n",r50);
		System.out.println("                   |---------------------|--------------------|                   ");
		System.out.printf("                   |       Rs.20         |          %-10d|\n",r20);
		System.out.println("                   |---------------------|--------------------|                   ");
		System.out.printf("                   |       Rs.10         |          %-10d|\n",r10);
		System.out.println("                   |---------------------|--------------------|                   ");
		System.out.printf("                   |       Rs.5          |          %-10d|\n",r5);
		System.out.println("                   |---------------------|--------------------|                   ");
		System.out.printf("                   |       Rs.2          |          %-10d|\n",r2);
		System.out.println("                   |---------------------|--------------------|                   ");
		System.out.printf("                   |       Rs.1          |          %-10d|\n",r1);
		System.out.println("                   +---------------------+--------------------+                   ");
		System.out.printf("                   |   No of Notes       |          %-10d|\n",no_notes);
		System.out.println("                   +---------------------+--------------------+                   ");
		System.out.printf("                   |   No of Coins       |          %-10d|\n",no_coins);
		System.out.println("                   +---------------------+--------------------+                   ");

		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("                          THANK YOU FOR SHOPPING WITH US                          ");
		System.out.println("----------------------------------------------------------------------------------");
	}
}
