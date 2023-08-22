package aaa.model;

import lombok.Data;

@Data
public class Exer3Member {
	String dbid, dbpw, dbPname;

	public Exer3Member(String dbid, String dbpw, String dbPname) {
		super();
		this.dbid = dbid;
		this.dbpw = dbpw;
		this.dbPname = dbPname;
	}
}
 