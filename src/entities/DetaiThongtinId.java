package entities;
// Generated Dec 21, 2016 10:56:54 AM by Hibernate Tools 5.2.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DetaiThongtinId generated by hbm2java
 */
@Embeddable
public class DetaiThongtinId implements java.io.Serializable {

	private String maDeTai;
	private String linhVuc;
	private String loaiHinhCoBan;
	private String coQuanChuTri;
	private String tinhHinhTrongNuoc;
	private String tinhHinhNgoaiNuoc;
	private String cacCongTrinhLienQuan;
	private String tinhCapThiet;
	private String mucTieu;
	private String phuongPhapNghienCuu;
	private String loaiSanPham;
	private String diaChiUngDung;
	private String kinhPhi;

	public DetaiThongtinId() {
	}

	public DetaiThongtinId(String maDeTai, String linhVuc, String loaiHinhCoBan, String coQuanChuTri,
			String tinhHinhTrongNuoc, String tinhHinhNgoaiNuoc, String cacCongTrinhLienQuan, String tinhCapThiet,
			String mucTieu, String phuongPhapNghienCuu, String loaiSanPham, String diaChiUngDung, String kinhPhi) {
		this.maDeTai = maDeTai;
		this.linhVuc = linhVuc;
		this.loaiHinhCoBan = loaiHinhCoBan;
		this.coQuanChuTri = coQuanChuTri;
		this.tinhHinhTrongNuoc = tinhHinhTrongNuoc;
		this.tinhHinhNgoaiNuoc = tinhHinhNgoaiNuoc;
		this.cacCongTrinhLienQuan = cacCongTrinhLienQuan;
		this.tinhCapThiet = tinhCapThiet;
		this.mucTieu = mucTieu;
		this.phuongPhapNghienCuu = phuongPhapNghienCuu;
		this.loaiSanPham = loaiSanPham;
		this.diaChiUngDung = diaChiUngDung;
		this.kinhPhi = kinhPhi;
	}

	@Column(name = "MaDeTai")
	public String getMaDeTai() {
		return this.maDeTai;
	}

	public void setMaDeTai(String maDeTai) {
		this.maDeTai = maDeTai;
	}

	@Column(name = "LinhVuc")
	public String getLinhVuc() {
		return this.linhVuc;
	}

	public void setLinhVuc(String linhVuc) {
		this.linhVuc = linhVuc;
	}

	@Column(name = "LoaiHinhCoBan")
	public String getLoaiHinhCoBan() {
		return this.loaiHinhCoBan;
	}

	public void setLoaiHinhCoBan(String loaiHinhCoBan) {
		this.loaiHinhCoBan = loaiHinhCoBan;
	}

	@Column(name = "CoQuanChuTri")
	public String getCoQuanChuTri() {
		return this.coQuanChuTri;
	}

	public void setCoQuanChuTri(String coQuanChuTri) {
		this.coQuanChuTri = coQuanChuTri;
	}

	@Column(name = "TinhHinhTrongNuoc")
	public String getTinhHinhTrongNuoc() {
		return this.tinhHinhTrongNuoc;
	}

	public void setTinhHinhTrongNuoc(String tinhHinhTrongNuoc) {
		this.tinhHinhTrongNuoc = tinhHinhTrongNuoc;
	}

	@Column(name = "TinhHinhNgoaiNuoc")
	public String getTinhHinhNgoaiNuoc() {
		return this.tinhHinhNgoaiNuoc;
	}

	public void setTinhHinhNgoaiNuoc(String tinhHinhNgoaiNuoc) {
		this.tinhHinhNgoaiNuoc = tinhHinhNgoaiNuoc;
	}

	@Column(name = "CacCongTrinhLienQuan")
	public String getCacCongTrinhLienQuan() {
		return this.cacCongTrinhLienQuan;
	}

	public void setCacCongTrinhLienQuan(String cacCongTrinhLienQuan) {
		this.cacCongTrinhLienQuan = cacCongTrinhLienQuan;
	}

	@Column(name = "TinhCapThiet")
	public String getTinhCapThiet() {
		return this.tinhCapThiet;
	}

	public void setTinhCapThiet(String tinhCapThiet) {
		this.tinhCapThiet = tinhCapThiet;
	}

	@Column(name = "MucTieu")
	public String getMucTieu() {
		return this.mucTieu;
	}

	public void setMucTieu(String mucTieu) {
		this.mucTieu = mucTieu;
	}

	@Column(name = "PhuongPhapNghienCuu")
	public String getPhuongPhapNghienCuu() {
		return this.phuongPhapNghienCuu;
	}

	public void setPhuongPhapNghienCuu(String phuongPhapNghienCuu) {
		this.phuongPhapNghienCuu = phuongPhapNghienCuu;
	}

	@Column(name = "LoaiSanPham")
	public String getLoaiSanPham() {
		return this.loaiSanPham;
	}

	public void setLoaiSanPham(String loaiSanPham) {
		this.loaiSanPham = loaiSanPham;
	}

	@Column(name = "DiaChiUngDung")
	public String getDiaChiUngDung() {
		return this.diaChiUngDung;
	}

	public void setDiaChiUngDung(String diaChiUngDung) {
		this.diaChiUngDung = diaChiUngDung;
	}

	@Column(name = "KinhPhi")
	public String getKinhPhi() {
		return this.kinhPhi;
	}

	public void setKinhPhi(String kinhPhi) {
		this.kinhPhi = kinhPhi;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DetaiThongtinId))
			return false;
		DetaiThongtinId castOther = (DetaiThongtinId) other;

		return ((this.getMaDeTai() == castOther.getMaDeTai()) || (this.getMaDeTai() != null
				&& castOther.getMaDeTai() != null && this.getMaDeTai().equals(castOther.getMaDeTai())))
				&& ((this.getLinhVuc() == castOther.getLinhVuc()) || (this.getLinhVuc() != null
						&& castOther.getLinhVuc() != null && this.getLinhVuc().equals(castOther.getLinhVuc())))
				&& ((this.getLoaiHinhCoBan() == castOther.getLoaiHinhCoBan())
						|| (this.getLoaiHinhCoBan() != null && castOther.getLoaiHinhCoBan() != null
								&& this.getLoaiHinhCoBan().equals(castOther.getLoaiHinhCoBan())))
				&& ((this.getCoQuanChuTri() == castOther.getCoQuanChuTri())
						|| (this.getCoQuanChuTri() != null && castOther.getCoQuanChuTri() != null
								&& this.getCoQuanChuTri().equals(castOther.getCoQuanChuTri())))
				&& ((this.getTinhHinhTrongNuoc() == castOther.getTinhHinhTrongNuoc())
						|| (this.getTinhHinhTrongNuoc() != null && castOther.getTinhHinhTrongNuoc() != null
								&& this.getTinhHinhTrongNuoc().equals(castOther.getTinhHinhTrongNuoc())))
				&& ((this.getTinhHinhNgoaiNuoc() == castOther.getTinhHinhNgoaiNuoc())
						|| (this.getTinhHinhNgoaiNuoc() != null && castOther.getTinhHinhNgoaiNuoc() != null
								&& this.getTinhHinhNgoaiNuoc().equals(castOther.getTinhHinhNgoaiNuoc())))
				&& ((this.getCacCongTrinhLienQuan() == castOther.getCacCongTrinhLienQuan())
						|| (this.getCacCongTrinhLienQuan() != null && castOther.getCacCongTrinhLienQuan() != null
								&& this.getCacCongTrinhLienQuan().equals(castOther.getCacCongTrinhLienQuan())))
				&& ((this.getTinhCapThiet() == castOther.getTinhCapThiet())
						|| (this.getTinhCapThiet() != null && castOther.getTinhCapThiet() != null
								&& this.getTinhCapThiet().equals(castOther.getTinhCapThiet())))
				&& ((this.getMucTieu() == castOther.getMucTieu()) || (this.getMucTieu() != null
						&& castOther.getMucTieu() != null && this.getMucTieu().equals(castOther.getMucTieu())))
				&& ((this.getPhuongPhapNghienCuu() == castOther.getPhuongPhapNghienCuu())
						|| (this.getPhuongPhapNghienCuu() != null && castOther.getPhuongPhapNghienCuu() != null
								&& this.getPhuongPhapNghienCuu().equals(castOther.getPhuongPhapNghienCuu())))
				&& ((this.getLoaiSanPham() == castOther.getLoaiSanPham())
						|| (this.getLoaiSanPham() != null && castOther.getLoaiSanPham() != null
								&& this.getLoaiSanPham().equals(castOther.getLoaiSanPham())))
				&& ((this.getDiaChiUngDung() == castOther.getDiaChiUngDung())
						|| (this.getDiaChiUngDung() != null && castOther.getDiaChiUngDung() != null
								&& this.getDiaChiUngDung().equals(castOther.getDiaChiUngDung())))
				&& ((this.getKinhPhi() == castOther.getKinhPhi()) || (this.getKinhPhi() != null
						&& castOther.getKinhPhi() != null && this.getKinhPhi().equals(castOther.getKinhPhi())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getMaDeTai() == null ? 0 : this.getMaDeTai().hashCode());
		result = 37 * result + (getLinhVuc() == null ? 0 : this.getLinhVuc().hashCode());
		result = 37 * result + (getLoaiHinhCoBan() == null ? 0 : this.getLoaiHinhCoBan().hashCode());
		result = 37 * result + (getCoQuanChuTri() == null ? 0 : this.getCoQuanChuTri().hashCode());
		result = 37 * result + (getTinhHinhTrongNuoc() == null ? 0 : this.getTinhHinhTrongNuoc().hashCode());
		result = 37 * result + (getTinhHinhNgoaiNuoc() == null ? 0 : this.getTinhHinhNgoaiNuoc().hashCode());
		result = 37 * result + (getCacCongTrinhLienQuan() == null ? 0 : this.getCacCongTrinhLienQuan().hashCode());
		result = 37 * result + (getTinhCapThiet() == null ? 0 : this.getTinhCapThiet().hashCode());
		result = 37 * result + (getMucTieu() == null ? 0 : this.getMucTieu().hashCode());
		result = 37 * result + (getPhuongPhapNghienCuu() == null ? 0 : this.getPhuongPhapNghienCuu().hashCode());
		result = 37 * result + (getLoaiSanPham() == null ? 0 : this.getLoaiSanPham().hashCode());
		result = 37 * result + (getDiaChiUngDung() == null ? 0 : this.getDiaChiUngDung().hashCode());
		result = 37 * result + (getKinhPhi() == null ? 0 : this.getKinhPhi().hashCode());
		return result;
	}

}
