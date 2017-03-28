import java.util.Scanner;
public class Pilihan{
	Scanner input = new Scanner(System.in);
	int N,max,min,jumlah;
	char pilih;
	int[] array = new int[100];
	
	public static void main(String[] args){
		Pilihan tampil = new Pilihan();
		tampil.isi();
	}
	
	public void isi(){
		System.out.println("pilihan A nilai Minimum");
		System.out.println("pilihan B nilai Maximum");
		System.out.println("Masukan banyak nilai : ");
		N = input.nextInt();
		System.out.println("Masukan pilihan (A/B): ");
		pilih = input.next().charAt(0);
		masukdata();
		if(pilih == 'A'){
			pilihanA();
			System.out.println("Nilai Minimum : "+min);
		}
		else if (pilih == 'B'){
			pilihanB();
			System.out.println("Nilai Maksimum : "+max);
		}
		else if ((pilih != 'A') || (pilih != 'B')){
			System.out.println("Salah memasukan pilihan");
		}
		System.out.println("Jumlah yang sering muncul = "+jumlah);
	}
	void masukdata(){
		int i;
		for (i=0;i<N;i++){
			System.out.printf("Masukan Data ke = ");
			array[i] = input.nextInt();
		}
	}
	
	void pilihanA(){
		int i;
		min = array[0];
		for (i=0;i<N;i++){
			if (min > array[i])
				min = array[i];
		}
		for (i=0;i<N;i++){
			if(min == array[i])
				jumlah++;
		}
	}
	
	void pilihanB(){
		int i;
		max=array[0];
		for (i=0;i<N;i++){
			if (max < array[i])
				max = array[i];
		}
		
		for (i=0;i<N;i++){
			if (max == array[i])
				jumlah++;
		}
	}
}
