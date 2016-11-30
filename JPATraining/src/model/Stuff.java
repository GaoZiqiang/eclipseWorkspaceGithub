package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the stuff database table.
 * 
 */
@Entity
@NamedQuery(name="Stuff.findAll", query="SELECT s FROM Stuff s")
public class Stuff implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="STUFF_ID_GENERATOR", sequenceName="SEQ_STUFF_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="STUFF_ID_GENERATOR")
	private Integer id;

	private String name;

	private String password;

	public Stuff() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}