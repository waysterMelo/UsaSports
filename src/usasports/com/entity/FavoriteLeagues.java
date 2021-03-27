package usasports.com.entity;
// Generated Mar 27, 2021, 3:22:00 PM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "favorite_leagues", catalog = "fanatics")
public class FavoriteLeagues implements java.io.Serializable {

	private Integer id;
	private String league;
	private byte[] image;

	public FavoriteLeagues() {
	}

	public FavoriteLeagues(String league) {
		this.league = league;
	}

	public FavoriteLeagues(String league, byte[] image) {
		this.league = league;
		this.image = image;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "league", nullable = false, length = 100)
	public String getLeague() {
		return this.league;
	}

	public void setLeague(String league) {
		this.league = league;
	}

	@Column(name = "image")
	public byte[] getImage() {
		return this.image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

}
