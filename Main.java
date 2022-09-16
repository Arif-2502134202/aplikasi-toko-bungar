import java.util.Scanner;  // Import class yang diperlukan dari library java
import java.text.*;

class Main {
	
	//fungsi utama 
	public static void main(String[] args) {
		String decimalPattern = "##,###.##";
		DecimalFormat myFormatter = new DecimalFormat(decimalPattern);
	
		Scanner myObj = new Scanner(System.in);  
		//Header
		String lineHeader = "*";
		String lineSpace = "-";
		System.out.println(" ");
		System.out.println(lineHeader.repeat(47));
		System.out.println("      Selamat Datang di Restoran BUNGAR        ");
		System.out.println(lineHeader.repeat(47));
		System.out.println(" ");
		System.out.print(" Pesan Untuk Berapa Orang  : ");
		int jumlahOrang = myObj.nextInt();
		myObj.nextLine();
		System.out.println(" ");
		System.out.println(lineSpace.repeat(47));
		System.out.print(" Pesanan Atas Nama : ");
		String namaCustomer = myObj.nextLine();  
		
		String namaMenu1 = "Nasi Goreng Spesial";
		String namaMenu2 = "Ayam Bakar Spesial";
		String namaMenu3 = "Steak Sirloin Spesial";
		String namaMenu4 = "Kwetiaw Spesial";
		String namaMenu5 = "Kambing Guling Spesial";
		
		double hargaMenu1 = 9999.99;
		double hargaMenu2 = 12345.67;
		double hargaMenu3 = 21108.40;
		double hargaMenu4 = 13579.13;
		double hargaMenu5 = 98765.43;
		
		//Daftar Menu
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" Daftar Menu "); 
	
		System.out.println(lineSpace.repeat(47));
		System.out.format("%4s %-27s %2s %11s %2s", "No." , "Nama Menu" , "@", "Harga.", "\n");		
		System.out.println(lineSpace.repeat(47));
		System.out.format("%4s %-27s %2s %11s %2s", "1." , namaMenu1 , "@", myFormatter.format(hargaMenu1),"\n");		
		System.out.format("%4s %-27s %2s %11s %2s", "2." , namaMenu2 , "@", myFormatter.format(hargaMenu2),"\n");		
		System.out.format("%4s %-27s %2s %11s %2s", "3." , namaMenu3 , "@", myFormatter.format(hargaMenu3),"\n");		
		System.out.format("%4s %-27s %2s %11s %2s", "4." , namaMenu4 , "@", myFormatter.format(hargaMenu4),"\n");
		System.out.format("%4s %-27s %2s %11s %2s", "5." , namaMenu5 , "@", myFormatter.format(hargaMenu5),"\n");	
		System.out.println(lineSpace.repeat(47));
		System.out.println(" ");
		// input jumlah pesanan
		System.out.println(" Pesanan Anda : [ Batas Pesanan 0-10 ]");
		System.out.println(" ");
		System.out.format("%16s %-25s %2s "," Jumlah Pesanan ", namaMenu1 , ": ");
		int jumlahMenu1 = myObj.nextInt();
		myObj.nextLine();
		System.out.format("%16s %-25s %2s "," Jumlah Pesanan ", namaMenu2, ": ");
		int jumlahMenu2 = myObj.nextInt();
		myObj.nextLine();
		System.out.format("%16s %-25s %2s "," Jumlah Pesanan ", namaMenu3, ": ");
		int jumlahMenu3 = myObj.nextInt();
		myObj.nextLine();
		System.out.format("%16s %-25s %2s "," Jumlah Pesanan ", namaMenu4, ": ");
		int jumlahMenu4 = myObj.nextInt();
		myObj.nextLine();
		System.out.format("%16s %-25s %2s "," Jumlah Pesanan ", namaMenu5, ": ");
		int jumlahMenu5 = myObj.nextInt();
		myObj.nextLine();
		
		System.out.println(" ");		
		System.out.println(" ");
		System.out.println(" Tekan ENTER untuk menyelesaikan pesanan");
		String enter = myObj.nextLine();
		System.out.println(lineSpace.repeat(47));
				
		double totalMenu1 = hargaMenu1 * jumlahMenu1; 
		double totalMenu2 = hargaMenu2 * jumlahMenu2; 
		double totalMenu3 = hargaMenu3 * jumlahMenu3; 
		double totalMenu4 = hargaMenu4 * jumlahMenu4; 
		double totalMenu5 = hargaMenu5 * jumlahMenu5; 
		
		double totalPembelian = totalMenu1 + totalMenu2 + totalMenu3 + totalMenu4 + totalMenu5;
		float persenDiskon = 10;
		double jumlahDiskon = totalPembelian / persenDiskon;
		double grandTotal = totalPembelian - jumlahDiskon;
		double perOrang = grandTotal / jumlahOrang;
		
		//Daftar Pembelian
		System.out.println(" ");
		System.out.println(" Selamat Menikmati makanan Anda... : ");
		System.out.println(" ");
		System.out.println(" Pembelian : ");
		
		System.out.println(lineSpace.repeat(78));
		System.out.format("%4s %-25s %2s %11s %11s %6s %11s %2s", " 1." , namaMenu1 , jumlahMenu1, " Porsi * Rp.", 
		myFormatter.format(hargaMenu1), " = Rp.", myFormatter.format(totalMenu1), "\n");		
		System.out.format("%4s %-25s %2s %11s %11s %6s %11s %2s", " 2." , namaMenu2 , jumlahMenu2, " Porsi * Rp.", 
		myFormatter.format(hargaMenu2), " = Rp.", myFormatter.format(totalMenu2), "\n");	
		System.out.format("%4s %-25s %2s %11s %11s %6s %11s %2s", " 3." , namaMenu3 , jumlahMenu3, " Porsi * Rp.", 
		myFormatter.format(hargaMenu3), " = Rp.", myFormatter.format(totalMenu3), "\n");		
		System.out.format("%4s %-25s %2s %11s %11s %6s %11s %2s", " 4." , namaMenu4 , jumlahMenu4, " Porsi * Rp.", 
		myFormatter.format(hargaMenu4), " = Rp.", myFormatter.format(totalMenu4), "\n");		
		System.out.format("%4s %-25s %2s %11s %11s %6s %11s %2s", " 5." , namaMenu5 , jumlahMenu5, " Porsi * Rp.", 
		myFormatter.format(hargaMenu5), " = Rp.", myFormatter.format(totalMenu5), "+\n");
		
		//Jumlah Total dan Diskon
		System.out.println(lineSpace.repeat(78));
		System.out.format("%-40s %24s %11s %2s"," Jumlah Total Pembelian", "= Rp.", myFormatter.format(totalPembelian), "\n");		
		System.out.format("%-40s %24s %11s %2s"," Disc. " + persenDiskon + " % ( Masa Promo )", "= Rp.", myFormatter.format(jumlahDiskon), "-\n");
		System.out.println(lineSpace.repeat(78));
		System.out.format("%-40s %24s %11s %2s"," Total Pembelian setelah Diskon " + persenDiskon + " %", "= Rp.", myFormatter.format(grandTotal), "\n");	
		System.out.format("%-40s %24s %11s %2s"," Pembelian per Orang ( untuk " + jumlahOrang + " ) orang", "= Rp.", myFormatter.format(perOrang), "\n");
		//footer
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("~                      Terima Kasih atas kunjungan Anda                      ~");
		System.out.println(" ");
		System.out.println("                        .. Tekan ENTER untuk keluar                           ");
		System.out.println(lineHeader.repeat(78));
		String closeProgram = myObj.nextLine();
		if (closeProgram == ""){System.exit(0);}
	}
}
