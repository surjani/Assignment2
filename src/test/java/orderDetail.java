

public class orderDetail {

	public int toolId;

	public String customerName;

	public orderDetail(int toolId, String customerName) {
		this.toolId = toolId;
		this.customerName = customerName;
	}

	public orderDetail() {
	}

	public int getToolId() {
		return toolId;
	}

	public String getCustomerName() {
		return customerName;
	}

}
