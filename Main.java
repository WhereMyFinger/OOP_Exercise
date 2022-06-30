package exercise01;

public class Main {
	
	public static void main(String[] args) {
		PhanSo phanSo1 = new PhanSo();
		
		phanSo1.nhap();
		phanSo1.xuat();
		
		PhanSo phanSo2 = new PhanSo();
		
		phanSo2.nhap();
		phanSo2.xuat();
		
		PhanSo phanSo3 = new PhanSo();
		
		System.out.println("Tong: " + phanSo3.cong(phanSo1.setValue(), phanSo2.setValue()));
		System.out.println("Hieu: " + phanSo3.tru(phanSo1.setValue(), phanSo2.setValue()));
		System.out.println("Tich: " + phanSo3.nhan(phanSo1.setValue(), phanSo2.setValue()));
		System.out.println("Thuong: " + phanSo3.chia(phanSo1.setValue(), phanSo2.setValue()));		
	}
}
