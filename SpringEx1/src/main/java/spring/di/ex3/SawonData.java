package spring.di.ex3;

public class SawonData {
	private String sawonName;
	private int pay;
	private String ipsaday;
	
	
	public SawonData() {
		
	}
	
	//������� ������ ����
	public SawonData(String name) {
		sawonName = name;
	}


	
	//�޿�, �Ի��� setter����
	
	public int getPay() {
		return pay;
	}

	public String getSawonName() {
		return sawonName;
	}

	public void setSawonName(String sawonName) {
		this.sawonName = sawonName;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public String getIpsaday() {
		return ipsaday;
	}

	public void setIpsaday(String ipsaday) {
		this.ipsaday = ipsaday;
	}
}
