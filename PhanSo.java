package exercise01;

import java.util.Scanner;

public class PhanSo {
	
	private int tuSo;
	private int mauSo;
	
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap tu so: ");
		this.tuSo = scanner.nextInt();
		
		while(this.mauSo == 0) {
			System.out.println("Nhap mau so: ");
			this.mauSo = scanner.nextInt();
		}
	}
	
	public void xuat() {
		System.out.println("Phan so: " + this.tuSo + "/" + this.mauSo);
	}
	
	public float setValue() {
		float phanSo = 0;
		
		phanSo = (float) this.tuSo / (float) this.mauSo;
		
		return phanSo;	
	}
	
	public float cong(float phanSo1, float phanSo2) {
		float tong = 0;
		
		tong = phanSo1 + phanSo2;
		
		return tong;
	}
	
	public float tru(float phanSo1, float phanSo2) {
		float hieu = 0;
		
		hieu = phanSo1 - phanSo2;
		
		return hieu;
	}
	
	public float nhan(float phanSo1, float phanSo2) {
		float tich = 0;
		
		tich = phanSo1 * phanSo2;
		
		return tich;
	}
	
	public float chia(float phanSo1, float phanSo2) {
		float thuong = 0;
		
		thuong = phanSo1 / phanSo2;
		
		return thuong;
	}
	
	public int getTuSo() {
		return tuSo;
	}
	
	public void setTuSo(int tuSo) {
		this.tuSo = tuSo;
	}
	
	public int getMauSo() {
		return mauSo;
	}
	
	public void setMauSo(int mauSo) {
		this.mauSo = mauSo;
	}
}
