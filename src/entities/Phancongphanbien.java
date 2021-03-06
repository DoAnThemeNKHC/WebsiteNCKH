package entities;
// Generated Dec 21, 2016 10:56:54 AM by Hibernate Tools 5.2.0.CR1

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Phancongphanbien generated by hbm2java
 */
@Entity
@Table(name = "phancongphanbien", catalog = "detainckh")
public class Phancongphanbien implements java.io.Serializable {

	private PhancongphanbienId id;
	private Detai detai;
	private Thongtincanbo thongtincanbo;
	private Date ngayPhanBien;

	public Phancongphanbien() {
	}

	public Phancongphanbien(PhancongphanbienId id, Detai detai, Thongtincanbo thongtincanbo) {
		this.id = id;
		this.detai = detai;
		this.thongtincanbo = thongtincanbo;
	}

	public Phancongphanbien(PhancongphanbienId id, Detai detai, Thongtincanbo thongtincanbo, Date ngayPhanBien) {
		this.id = id;
		this.detai = detai;
		this.thongtincanbo = thongtincanbo;
		this.ngayPhanBien = ngayPhanBien;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "maDeTai", column = @Column(name = "MaDeTai", nullable = false)),
			@AttributeOverride(name = "maCanBo", column = @Column(name = "MaCanBo", nullable = false, length = 50)) })
	public PhancongphanbienId getId() {
		return this.id;
	}

	public void setId(PhancongphanbienId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaDeTai", nullable = false, insertable = false, updatable = false)
	public Detai getDetai() {
		return this.detai;
	}

	public void setDetai(Detai detai) {
		this.detai = detai;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaCanBo", nullable = false, insertable = false, updatable = false)
	public Thongtincanbo getThongtincanbo() {
		return this.thongtincanbo;
	}

	public void setThongtincanbo(Thongtincanbo thongtincanbo) {
		this.thongtincanbo = thongtincanbo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "NgayPhanBien", length = 0)
	public Date getNgayPhanBien() {
		return this.ngayPhanBien;
	}

	public void setNgayPhanBien(Date ngayPhanBien) {
		this.ngayPhanBien = ngayPhanBien;
	}

}
