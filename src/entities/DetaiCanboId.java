package entities;
// Generated Dec 21, 2016 10:56:54 AM by Hibernate Tools 5.2.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DetaiCanboId generated by hbm2java
 */
@Embeddable
public class DetaiCanboId implements java.io.Serializable {

	private String maDeTai;
	private String maCanBo;
	private String trangThai;

	public DetaiCanboId() {
	}

	public DetaiCanboId(String maDeTai, String maCanBo, String trangThai) {
		this.maDeTai = maDeTai;
		this.maCanBo = maCanBo;
		this.trangThai = trangThai;
	}

	@Column(name = "MaDeTai")
	public String getMaDeTai() {
		return this.maDeTai;
	}

	public void setMaDeTai(String maDeTai) {
		this.maDeTai = maDeTai;
	}

	@Column(name = "MaCanBo", length = 50)
	public String getMaCanBo() {
		return this.maCanBo;
	}

	public void setMaCanBo(String maCanBo) {
		this.maCanBo = maCanBo;
	}

	@Column(name = "TrangThai")
	public String getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DetaiCanboId))
			return false;
		DetaiCanboId castOther = (DetaiCanboId) other;

		return ((this.getMaDeTai() == castOther.getMaDeTai()) || (this.getMaDeTai() != null
				&& castOther.getMaDeTai() != null && this.getMaDeTai().equals(castOther.getMaDeTai())))
				&& ((this.getMaCanBo() == castOther.getMaCanBo()) || (this.getMaCanBo() != null
						&& castOther.getMaCanBo() != null && this.getMaCanBo().equals(castOther.getMaCanBo())))
				&& ((this.getTrangThai() == castOther.getTrangThai()) || (this.getTrangThai() != null
						&& castOther.getTrangThai() != null && this.getTrangThai().equals(castOther.getTrangThai())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getMaDeTai() == null ? 0 : this.getMaDeTai().hashCode());
		result = 37 * result + (getMaCanBo() == null ? 0 : this.getMaCanBo().hashCode());
		result = 37 * result + (getTrangThai() == null ? 0 : this.getTrangThai().hashCode());
		return result;
	}

}