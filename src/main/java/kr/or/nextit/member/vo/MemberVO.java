package kr.or.nextit.member.vo;

import java.util.List;

import kr.or.nextit.common.vo.UserRoleVO;

public class MemberVO {

	
	private String memId;                   /* ȸ�����̵� */
	private String memPass;                 /* ȸ����й�ȣ */
	private String memName;                 /* ȸ���̸� */
	private String memBir;                  /* ȸ��������� */
	private String memZip;                  /* ȸ�������ȣ */
	private String memAdd1;                 /* ȸ���ּ� */
	private String memAdd2;                 /* ȸ�����ּ� */
	private String memHp;                   /* ȸ����ȭ��ȣ */
	private String memMail;                 /* ȸ���̸��� */
	private String memJob;                  /* ȸ������ */
	private String memHobby;                /* ȸ����� */
	private int memMileage;                 /* ȸ�����ϸ��� */
	private String memDelYn;                /* ȸ���������� */
	private String memJoinDate;             /* ȸ�������� */
	private String memEditDate;             /* ȸ������������ */
	private String memPassNew;                     
	private String rememberMe;
	private List<UserRoleVO> userRoleList;
	private String rnum;
	 
	public String getRnum() {
		return rnum;
	}
	public void setRnum(String rnum) {
		this.rnum = rnum;
	}
	public List<UserRoleVO> getUserRoleList() {
		return userRoleList;
	}
	public void setUserRoleList(List<UserRoleVO> userRoleList) {
		this.userRoleList = userRoleList;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMemPass() {
		return memPass;
	}
	public void setMemPass(String memPass) {
		this.memPass = memPass;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public String getMemBir() {
		return memBir;
	}
	public void setMemBir(String memBir) {
		this.memBir = memBir;
	}
	public String getMemZip() {
		return memZip;
	}
	public void setMemZip(String memZip) {
		this.memZip = memZip;
	}
	public String getMemAdd1() {
		return memAdd1;
	}
	public void setMemAdd1(String memAdd1) {
		this.memAdd1 = memAdd1;
	}
	public String getMemAdd2() {
		return memAdd2;
	}
	public void setMemAdd2(String memAdd2) {
		this.memAdd2 = memAdd2;
	}
	public String getMemHp() {
		return memHp;
	}
	public void setMemHp(String memHp) {
		this.memHp = memHp;
	}
	public String getMemMail() {
		return memMail;
	}
	public void setMemMail(String memMail) {
		this.memMail = memMail;
	}
	public String getMemJob() {
		return memJob;
	}
	public void setMemJob(String memJob) {
		this.memJob = memJob;
	}
	public String getMemHobby() {
		return memHobby;
	}
	public void setMemHobby(String memHobby) {
		this.memHobby = memHobby;
	}
	public int getMemMileage() {
		return memMileage;
	}
	public void setMemMileage(int memMileage) {
		this.memMileage = memMileage;
	}
	public String getMemDelYn() {
		return memDelYn;
	}
	public void setMemDelYn(String memDelYn) {
		this.memDelYn = memDelYn;
	}
	public String getMemJoinDate() {
		return memJoinDate;
	}
	public void setMemJoinDate(String memJoinDate) {
		this.memJoinDate = memJoinDate;
	}
	public String getMemEditDate() {
		return memEditDate;
	}
	public void setMemEditDate(String memEditDate) {
		this.memEditDate = memEditDate;
	}
	public String getMemPassNew() {
		return memPassNew;
	}
	public void setMemPassNew(String memPassNew) {
		this.memPassNew = memPassNew;
	}
	public String getRememberMe() {
		return rememberMe;
	}
	public void setRememberMe(String rememberMe) {
		this.rememberMe = rememberMe;
	}
	@Override
	public String toString() {
		return "MemberVO [memId=" + memId + ", memPass=" + memPass + ", memName=" + memName + ", memBir=" + memBir
				+ ", memZip=" + memZip + ", memAdd1=" + memAdd1 + ", memAdd2=" + memAdd2 + ", memHp=" + memHp
				+ ", memMail=" + memMail + ", memJob=" + memJob + ", memHobby=" + memHobby + ", memMileage="
				+ memMileage + ", memDelYn=" + memDelYn + ", memJoinDate=" + memJoinDate + ", memEditDate="
				+ memEditDate + ", memPassNew=" + memPassNew + ", rememberMe=" + rememberMe + ", userRoleList="
				+ userRoleList + ", rnum=" + rnum + "]";
	}
 
	
	
}
