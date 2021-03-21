
public class HR implements ILeaveRequestHandler {
	private ILeaveRequestHandler nextHandler=null;
	@Override
	public void HandleRequest(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
		int ld=leaveRequest.getLeaveDays();
		if(ld>=7)
		System.out.println("You are requesting for more than 7 days so you Meet HR for your Leave Request ");
		else
			System.out.println("Leave Approved By HR for :: "+leaveRequest.getEmployeeName());
	}

}
