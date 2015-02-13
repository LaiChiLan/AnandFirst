package entity;

public class WeiXin {
	public String  CLEARANCEID;
	public String  MATCODE;
	public String  SUBMITUNIT;
	public String  BATCHNO	 ;
	public String  PAYMENT ;
	public String  FOLDERNO;
	public String  DRAWDATE;
	public String  SIGNDATE;
	public String  COMPNAME;
	public String  PASSWORD;
	public String  RASCLIENTID ;
	public String  FULLNAME ;
	public String  WEIXINID	;
	public String  STATUS ;
	public String getCLEARANCEID() {
		return CLEARANCEID;
	}
	public String getMATCODE() {
		return MATCODE;
	}
	public String getSUBMITUNIT() {
		return SUBMITUNIT;
	}
	public String getBATCHNO() {
		return BATCHNO;
	}
	public String getPAYMENT() {
		return PAYMENT;
	}
	public String getFOLDERNO() {
		return FOLDERNO;
	}
	public String getDRAWDATE() {
		return DRAWDATE;
	}
	public String getSIGNDATE() {
		return SIGNDATE;
	}
	public String getCOMPNAME() {
		return COMPNAME;
	}
	public String getPASSWORD() {
		return PASSWORD;
	}
	public String getRASCLIENTID() {
		return RASCLIENTID;
	}
	public String getFULLNAME() {
		return FULLNAME;
	}
	public String getWEIXINID() {
		return WEIXINID;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setCLEARANCEID(String cLEARANCEID) {
		CLEARANCEID = cLEARANCEID;
	}
	public void setMATCODE(String mATCODE) {
		MATCODE = mATCODE;
	}
	public void setSUBMITUNIT(String sUBMITUNIT) {
		SUBMITUNIT = sUBMITUNIT;
	}
	public void setBATCHNO(String bATCHNO) {
		BATCHNO = bATCHNO;
	}
	public void setPAYMENT(String pAYMENT) {
		PAYMENT = pAYMENT;
	}
	public void setFOLDERNO(String fOLDERNO) {
		FOLDERNO = fOLDERNO;
	}
	public void setDRAWDATE(String dRAWDATE) {
		DRAWDATE = dRAWDATE;
	}
	public void setSIGNDATE(String sIGNDATE) {
		SIGNDATE = sIGNDATE;
	}
	public void setCOMPNAME(String cOMPNAME) {
		COMPNAME = cOMPNAME;
	}
	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
	public void setRASCLIENTID(String rASCLIENTID) {
		RASCLIENTID = rASCLIENTID;
	}
	public void setFULLNAME(String fULLNAME) {
		FULLNAME = fULLNAME;
	}
	public void setWEIXINID(String wEIXINID) {
		WEIXINID = wEIXINID;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	
	@Override
	public String toString() {
		String str = "";
		str += "<clearanceformview>";
		str += "<clearanceid><![CDATA["+ CLEARANCEID + "]]></clearanceid>";
		str += "<matcode><![CDATA["+ MATCODE + "]]></matcode>";
		str += "<submitunit><![CDATA["+ SUBMITUNIT + "]]></submitunit>";
		str += "<batchno><![CDATA["+ BATCHNO + "]]></batchno>";
		str += "<folderno><![CDATA["+ FOLDERNO + "]]></folderno>";
		str += "<status><![CDATA["+ STATUS + "]]></status>";
		str += "<fullname><![CDATA["+ FULLNAME +"]]></fullname>";
		str += "<drawdate><![CDATA["+ DRAWDATE + "]]></drawdate>";
		str += "<signdate><![CDATA["+ SIGNDATE + "]]></signdate>";
		str += "</clearanceformview>";
		return str;
	}
	
}
