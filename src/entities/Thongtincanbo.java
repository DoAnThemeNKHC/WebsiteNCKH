package entities;
// Generated Dec 21, 2016 10:56:54 AM by Hibernate Tools 5.2.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Thongtincanbo generated by hbm2java
 */
@Entity
@Table(name = "thongtincanbo", catalog = "detainckh")
public class Thongtincanbo implements java.io.Serializable {

	private String maCanBo;
	private String hoTen;
	private String email;
	private String sdt;
	private String donViCongTac;
	private String chucVu;
	private String ngaySinh;
	private String gioiTinh;
	private String cmnd;
	private String diaChi;
	private String tknganHang;
	private String chiNhanh;
	private Set<Phancongnghiemthu> phancongnghiemthus = new HashSet<Phancongnghiemthu>(0);
	private Set<Detai> detais = new HashSet<Detai>(0);
	private Set<Phancongphanbien> phancongphanbiens = new HashSet<Phancongphanbien>(0);
	private Set<Diemdanhgia> diemdanhgias = new HashSet<Diemdanhgia>(0);

	public Thongtincanbo() {
	}

	public Thongtincanbo(String maCanBo) {
		this.maCanBo = maCanBo;
	}

	public Thongtincanbo(String maCanBo, String hoTen, String email, String sdt, String donViCongTac, String chucVu,
			String ngaySinh, String gioiTinh, String cmnd, String diaChi, String tknganHang, String chiNhanh,
			Set<Phancongnghiemthu> phancongnghiemthus, Set<Detai> detais, Set<Phancongphanbien> phancongphanbiens,
			Set<Diemdanhgia> diemdanhgias) {
		this.maCanBo = maCanBo;
		this.hoTen = hoTen;
		this.email = email;
		this.sdt = sdt;
		this.donViCongTac = donViCongTac;
		this.chucVu = chucVu;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.cmnd = cmnd;
		this.diaChi = diaChi;
		this.tknganHang = tknganHang;
		this.chiNhanh = chiNhanh;
		this.phancongnghiemthus = phancongnghiemthus;
		this.detais = detais;
		this.phancongphanbiens = phancongphanbiens;
		this.diemdanhgias = diemdanhgias;
	}

	@Id

	@Column(name = "MaCanBo", unique = true, nullable = false, length = 50)
	public String getMaCanBo() {
		return this.maCanBo;
	}

	public void setMaCanBo(String maCanBo) {
		this.maCanBo = maCanBo;
	}

	@Column(name = "HoTen", length = 50)
	public String getHoTen() {
		return this.hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	@Column(name = "Email", length = 50)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "SDT", length = 50)
	public String getSdt() {
		return this.sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	@Column(name = "DonViCongTac", length = 50)
	public String getDonViCongTac() {
		return this.donViCongTac;
	}

	public void setDonViCongTac(String donViCongTac) {
		this.donViCongTac = donViCongTac;
	}

	@Column(name = "ChucVu", length = 50)
	public String getChucVu() {
		return this.chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	@Column(name = "NgaySinh", length = 50)
	public String getNgaySinh() {
		return this.ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	@Column(name = "GioiTinh", length = 50)
	public String getGioiTinh() {
		return this.gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	@Column(name = "CMND", length = 50)
	public String getCmnd() {
		return this.cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	@Column(name = "DiaChi", length = 50)
	public String getDiaChi() {
		return this.diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Column(name = "TKNganHang", length = 50)
	public String getTknganHang() {
		return this.tknganHang;
	}

	public void setTknganHang(String tknganHang) {
		this.tknganHang = tknganHang;
	}

	@Column(name = "ChiNhanh", length = 50)
	public String getChiNhanh() {
		return this.chiNhanh;
	}

	public void setChiNhanh(String chiNhanh) {
		this.chiNhanh = chiNhanh;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "thongtincanbo")
	public Set<Phancongnghiemthu> getPhancongnghiemthus() {
		return this.phancongnghiemthus;
	}

	public void setPhancongnghiemthus(Set<Phancongnghiemthu> phancongnghiemthus) {
		this.phancongnghiemthus = phancongnghiemthus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "thongtincanbo")
	public Set<Detai> getDetais() {
		return this.detais;
	}

	public void setDetais(Set<Detai> detais) {
		this.detais = detais;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "thongtincanbo")
	public Set<Phancongphanbien> getPhancongphanbiens() {
		return this.phancongphanbiens;
	}

	public void setPhancongphanbiens(Set<Phancongphanbien> phancongphanbiens) {
		this.phancongphanbiens = phancongphanbiens;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "thongtincanbo")
	public Set<Diemdanhgia> getDiemdanhgias() {
		return this.diemdanhgias;
	}

	public void setDiemdanhgias(Set<Diemdanhgia> diemdanhgias) {
		this.diemdanhgias = diemdanhgias;
	}

}