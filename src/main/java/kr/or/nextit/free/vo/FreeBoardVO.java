package kr.or.nextit.free.vo;

public class FreeBoardVO {

	private String boNo;                    /* �� ��ȣ */
	private String boTitle;                 /* �� ���� */
	private String boCategory;              /* �� �з� �ڵ� */
	private String boWriter;                /* �ۼ��ڸ� */
	private String boPass;                  /* ��й�ȣ */
	private String boContent;               /* �� ���� */
	private String boIp;                    /* ����� IP */
	private int boHit;                      /* ��ȸ�� */
	private String boRegDate;               /* ��� ���� */
	private String boModDate;               /* ���� ���� */
	private String boDelYn;                 /* ���� ���� */
	private String boDelId;                 /* ���� ��ü */
	private String boDelDate;               /* ���� �ð� */
	
	
	private String boCategoryNm;					 
	
	private String rnum; 
	
	public String getRnum() {
		return rnum;
	}
	public void setRnum(String rnum) {
		this.rnum = rnum;
	}
	public String getBoCategoryNm() {
		return boCategoryNm;
	}
	public void setBoCategoryNm(String boCategoryNm) {
		this.boCategoryNm = boCategoryNm;
	}
	
	
	public String getBoNo() {
		return boNo;
	}
	public void setBoNo(String boNo) {
		this.boNo = boNo;
	}
	public String getBoTitle() {
		return boTitle;
	}
	public void setBoTitle(String boTitle) {
		this.boTitle = boTitle;
	}
	public String getBoCategory() {
		return boCategory;
	}
	public void setBoCategory(String boCategory) {
		this.boCategory = boCategory;
	}
	public String getBoWriter() {
		return boWriter;
	}
	public void setBoWriter(String boWriter) {
		this.boWriter = boWriter;
	}
	public String getBoPass() {
		return boPass;
	}
	public void setBoPass(String boPass) {
		this.boPass = boPass;
	}
	public String getBoContent() {
		return boContent;
	}
	public void setBoContent(String boContent) {
		this.boContent = boContent;
	}
	public String getBoIp() {
		return boIp;
	}
	public void setBoIp(String boIp) {
		this.boIp = boIp;
	}
	public int getBoHit() {
		return boHit;
	}
	public void setBoHit(int boHit) {
		this.boHit = boHit;
	}
	public String getBoRegDate() {
		return boRegDate;
	}
	public void setBoRegDate(String boRegDate) {
		this.boRegDate = boRegDate;
	}
	public String getBoModDate() {
		return boModDate;
	}
	public void setBoModDate(String boModDate) {
		this.boModDate = boModDate;
	}
	public String getBoDelYn() {
		return boDelYn;
	}
	public void setBoDelYn(String boDelYn) {
		this.boDelYn = boDelYn;
	}
	public String getBoDelId() {
		return boDelId;
	}
	public void setBoDelId(String boDelId) {
		this.boDelId = boDelId;
	}
	public String getBoDelDate() {
		return boDelDate;
	}
	public void setBoDelDate(String boDelDate) {
		this.boDelDate = boDelDate;
	}
	@Override
	public String toString() {
		return "FreeBoardVO [boNo=" + boNo + ", boTitle=" + boTitle + ", boCategory=" + boCategory + ", boWriter="
				+ boWriter + ", boPass=" + boPass + ", boContent=" + boContent + ", boIp=" + boIp + ", boHit=" + boHit
				+ ", boRegDate=" + boRegDate + ", boModDate=" + boModDate + ", boDelYn=" + boDelYn + ", boDelId="
				+ boDelId + ", boDelDate=" + boDelDate + ", boCategoryNm=" + boCategoryNm + ", rnum=" + rnum + "]";
	}
 
	
	

	 
	
	
	
}
