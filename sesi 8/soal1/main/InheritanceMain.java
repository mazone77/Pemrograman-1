package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import model.Employee;
import model.Student;

public class InheritanceMain {

	public static void main(String[] args) throws ParseException {
		Student s = new Student();
		s.setNim("4510210040");
		s.setNama("Mas Agung Kurniawan");
		s.setAlamat("Jl. Menteng Atas No. 26");
		s.setTglLahir(new SimpleDateFormat("dd-MM-yyyy").parse("18-05-1992"));
		s.setNoHp("089652013812");

		Employee e = new Employee();
		e.setNip("4510210019");
		e.setNama("Stive johan jackson");
		e.setAlamat("Jl. H.Ramli no. 16");
		e.setTglLahir(new SimpleDateFormat("dd-MM-yyyy").parse("10-05-1992"));
		e.setNoHp("081708245139");

		showData(s);
		System.out.println("\n=================================\n");
		showData(e);
	}

	static void showData(Student s) {
		System.out.println("Class Student");
		System.out.println("NIM : " + s.getNim());
		System.out.println("Nama : " + s.getNama());
		System.out.println("Alamat : " + s.getAlamat());
		System.out.println("Tgl Lahir : " + new SimpleDateFormat("dd MMMM yyyy").format (s.getTglLahir()));
		System.out.println("No HP : " + s.getNoHp());
	}

	static void showData(Employee e) {
		System.out.println("Class Employee");
		System.out.println("NIP : " + e.getNip());
		System.out.println("Nama : " + e.getNama());
		System.out.println("Alamat : " + e.getAlamat());
		System.out.println("Tgl Lahir : " + new SimpleDateFormat("dd MMMM yyyy").format (e.getTglLahir()));
		System.out.println("No HP : " + e.getNoHp());
	}
}