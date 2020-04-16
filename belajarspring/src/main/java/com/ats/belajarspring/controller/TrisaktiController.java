package com.ats.belajarspring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TrisaktiController {

	@RequestMapping(value="trisaktidaftar")
	public String methodPanggilDaftar() {
		
		String html ="trisakti/daftar";
		return html;
		
	}
	
	@RequestMapping(value="trisaktihasil")
	public String methodPanggilHasil(HttpServletRequest request, Model model) {
		
		//mengambil data dari frontend ke backend
		String nama_lengkap = request.getParameter("daftar_nama_lengkap");
		String tempat_lahir = request.getParameter("daftar_tempat_lahir");
		String tanggal_lahir = request.getParameter("daftar_tanggal_Lahir");
		String jenis_kelamin = request.getParameter("daftar_jenis_kelamin");
		String agama = request.getParameter("daftar_agama");
		String telp = request.getParameter("daftar_telp");
		String hp = request.getParameter("daftar_hp");
		String kewarganegaraan = request.getParameter("daftar_kewarganegaraan");
		String nik = request.getParameter("daftar_nik");
		String golongan_darah = request.getParameter("daftar_golongan_darah");
		String tinggal = request.getParameter("daftar_tinggal");
		String anak_ke = request.getParameter("daftar_anak_ke");
		String dari = request.getParameter("daftar_dari");
		String status_nikah = request.getParameter("daftar_status_nikah");
		String email = request.getParameter("daftar_email");
		String kode_verifikasi_email = request.getParameter("daftar_kode_verifikasi_email");
		String alamat = request.getParameter("daftar_alamat");
		String rt = request.getParameter("daftar_rt");
		String rw = request.getParameter("daftar_rw");
		String provinsi = request.getParameter("daftar_provinsi");
		String kab_kota = request.getParameter("daftar_kab_kota");
		String kecamatan = request.getParameter("daftar_kecamatan");
		String kel_desa = request.getParameter("daftar_kel_desa");
		String nama_sekolah = request.getParameter("daftar_nama_sekolah");
		String tahun_lulus = request.getParameter("daftar_tahun_lulus");
		String bidang_peminatan = request.getParameter("daftar_bidang_peminatan");
		String nilai_rapot = request.getParameter("daftar_nilai_rapot");
		String alumni = request.getParameter("daftar_alumni");
		String nim_asal = request.getParameter("daftar_nim_asal");
		String tahun_lulus_2 = request.getParameter("daftar_tahun_lulus_2");
		String perguruan_tinggi_asal = request.getParameter("daftar_perguruan_tinggi_asal");
		String jurusan_jenjang = request.getParameter("daftar_jurusan_jenjang");
		String nama_ayah = request.getParameter("daftar_nama_ayah");
		String keadaan_ayah = request.getParameter("daftar_keadaan_ayah");
		String tempat_lahir_ayah = request.getParameter("daftar_tempat_lahir_ayah");
		String tanggal_lahir_ayah = request.getParameter("daftar_tanggal_lahir_ayah");
		String nama_ibu = request.getParameter("daftar_nama_ibu");
		String keadaan_ibu = request.getParameter("daftar_keadaan_ibu");
		String tempat_lahir_ibu = request.getParameter("daftar_tempat_lahir_ibu");
		String tanggal_lahir_ibu = request.getParameter("daftar_tanggal_lahir_ibu");
		String telp_2 = request.getParameter("daftar_telp_2");
		String hp_orang_tua = request.getParameter("daftar_hp_orang_tua");
		String email_orang_tua = request.getParameter("daftar_email_orang_tua");
		String pendidikan_orang_tua = request.getParameter("daftar_pendidikan_orang_tua");
		String pekerjaan_orang_tua = request.getParameter("daftar_pekerjaan_orang_tua");
		String penghasilan_orang_tua = request.getParameter("daftar_penghasilan_orang_tua");
		String tanggungan = request.getParameter("daftar_tanggungan");
		String alamat_orang_tua = request.getParameter("daftar_alamat_orang_tua");
		String rt_2 = request.getParameter("daftar_rt_2");
		String rw_2 = request.getParameter("daftar_rw_2");
		String kab_kota_2 = request.getParameter("daftar_kab_kota_2");
		String kecamatan_2 = request.getParameter("daftar_kecamatan_2");
		String kel_desa_2 = request.getParameter("daftar_kel_desa_2");
		String kode_pos = request.getParameter("daftar_kode_pos");
		String informasi_sptp = request.getParameter("daftar_informasi_sptp");
		String stp_trisakti_prioritas = request.getParameter("daftar_stp_trisakti_prioritas");
		String ukuran_almamater = request.getParameter("daftar_ukuran_almamater");
		String ukuran_sepatu = request.getParameter("daftar_ukuran_sepatu");
		
		System.out.println(nama_lengkap);
		System.out.println(tempat_lahir);
		System.out.println(tanggal_lahir);
		System.out.println(jenis_kelamin);
		System.out.println(agama);
		System.out.println(telp);
		System.out.println(hp);
		System.out.println(kewarganegaraan);
		System.out.println(nik);
		System.out.println(golongan_darah);
		System.out.println(tinggal);
		System.out.println(anak_ke);
		System.out.println(dari);
		System.out.println(status_nikah);
		System.out.println(email);
		System.out.println(kode_verifikasi_email);
		System.out.println(alamat);
		System.out.println(rt);
		System.out.println(rw);
		System.out.println(provinsi);
		System.out.println(kab_kota);
		System.out.println(kecamatan);
		System.out.println(kel_desa);
		System.out.println(nama_sekolah);
		System.out.println(tahun_lulus);
		System.out.println(bidang_peminatan);
		System.out.println(nilai_rapot);
		System.out.println(alumni);
		System.out.println(nim_asal);
		System.out.println(tahun_lulus_2);
		System.out.println(perguruan_tinggi_asal);
		System.out.println(jurusan_jenjang);
		System.out.println(nama_ayah);
		System.out.println(keadaan_ayah);
		System.out.println(tempat_lahir_ayah);
		System.out.println(tanggal_lahir_ayah);
		System.out.println(nama_ibu);
		System.out.println(keadaan_ibu);
		System.out.println(tempat_lahir_ibu);
		System.out.println(tanggal_lahir_ibu);
		System.out.println(telp_2);
		System.out.println(hp_orang_tua);
		System.out.println(email_orang_tua);
		System.out.println(pendidikan_orang_tua);
		System.out.println(pekerjaan_orang_tua);
		System.out.println(penghasilan_orang_tua);
		System.out.println(tanggungan);
		System.out.println(alamat_orang_tua);
		System.out.println(rt_2);
		System.out.println(rw_2);
		System.out.println(kab_kota_2);
		System.out.println(kecamatan_2);
		System.out.println(kel_desa_2);
		System.out.println(kode_pos);
		System.out.println(informasi_sptp);
		System.out.println(stp_trisakti_prioritas);
		System.out.println(ukuran_almamater);
		System.out.println(ukuran_sepatu);
		
		//mengambil data dari backend ke frontend
		model.addAttribute("hasil_nama_lengkap", nama_lengkap);
		model.addAttribute("hasil_tempat_lahir", tempat_lahir);
		model.addAttribute("hasil_tanggal_lahir", tanggal_lahir);
		model.addAttribute("hasil_jenis_kelamin", jenis_kelamin);
		model.addAttribute("hasil_agama", agama);
		model.addAttribute("hasil_telp", telp);
		model.addAttribute("hasil_hp", hp);
		model.addAttribute("hasil_kewarganegaraan", kewarganegaraan);
		model.addAttribute("hasil_nik", nik);
		model.addAttribute("hasil_golongan_darah", golongan_darah);
		model.addAttribute("hasil_tinggal", tinggal);
		model.addAttribute("hasil_anak_ke", anak_ke);
		model.addAttribute("hasil_dari", dari);
		model.addAttribute("hasil_status_nikah", status_nikah);
		model.addAttribute("hasil_email", email);
		model.addAttribute("hasil_kode_verifikasi_email", kode_verifikasi_email);
		model.addAttribute("hasil_alamat", alamat);
		model.addAttribute("hasil_rt", rt);
		model.addAttribute("hasil_rw", rw);
		model.addAttribute("hasil_provinsi", provinsi);
		model.addAttribute("hasil_kab_kota", kab_kota);
		model.addAttribute("hasil_kecamatan", kecamatan);
		model.addAttribute("hasil_kel_desa", kel_desa);
		model.addAttribute("hasil_nama_sekolah", nama_sekolah);
		model.addAttribute("hasil_tahun_lulus", tahun_lulus);
		model.addAttribute("hasil_bidang_peminatan", bidang_peminatan);
		model.addAttribute("hasil_nilai_rapot", nilai_rapot);
		model.addAttribute("hasil_alumni", alumni);
		model.addAttribute("hasil_nim_asal", nim_asal);
		model.addAttribute("hasil_tahun_lulus_2", tahun_lulus_2);
		model.addAttribute("hasil_perguruan_tinggi_asal", perguruan_tinggi_asal);
		model.addAttribute("hasil_jurusan_jenjang", jurusan_jenjang);
		model.addAttribute("hasil_nama_ayah", nama_ayah);
		model.addAttribute("hasil_keadaan_ayah", keadaan_ayah);
		model.addAttribute("hasil_tempat_lahir_ayah", tempat_lahir_ayah);
		model.addAttribute("hasil_tanggal_lahir_ayah", tanggal_lahir_ayah);
		model.addAttribute("hasil_nama_ibu", nama_ibu);
		model.addAttribute("hasil_keadaan_ibu", keadaan_ibu);
		model.addAttribute("hasil_tempat_lahir_ibu", tempat_lahir_ibu);
		model.addAttribute("hasil_tanggal_lahir_ibu", tanggal_lahir_ibu);
		model.addAttribute("hasil_telp_2", telp_2);
		model.addAttribute("hasil_hp_orang_tua", hp_orang_tua);
		model.addAttribute("hasil_email_orang_tua", email_orang_tua);
		model.addAttribute("hasil_pendidikan_orang_tua", pendidikan_orang_tua);
		model.addAttribute("hasil_pekerjaan_orang_tua", pekerjaan_orang_tua);
		model.addAttribute("hasil_penghasilan_orang_tua", penghasilan_orang_tua);
		model.addAttribute("hasil_tanggungan", tanggungan);
		model.addAttribute("hasil_alamat_orang_tua", alamat_orang_tua);
		model.addAttribute("hasil_rt_2", rt_2);
		model.addAttribute("hasil_rw_2", rw_2);
		model.addAttribute("hasil_kab_kota_2", kab_kota_2);
		model.addAttribute("hasil_kecamatan_2", kecamatan_2);
		model.addAttribute("hasil_kel_desa_2", kel_desa_2);
		model.addAttribute("hasil_kode_pos", kode_pos);
		model.addAttribute("hasil_informasi_sptp", informasi_sptp);
		model.addAttribute("hasil_stp_trisakti_prioritas", stp_trisakti_prioritas);
		model.addAttribute("hasil_ukuran_almamater", ukuran_almamater);
		model.addAttribute("hasil_ukuran_sepatu", ukuran_sepatu);
		
		String html ="trisakti/hasil";
		return html;
		
	}
}
