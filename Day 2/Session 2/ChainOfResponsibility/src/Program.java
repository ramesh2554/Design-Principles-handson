import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LeaveRequest leaveRequest=new LeaveRequest();
		leaveRequest.setEmployeeName("RAMESH");
		System.out.println("Enter no_of_days for your leave");
		int days=sc.nextInt();
		leaveRequest.setLeaveDays(days);
		ILeaveRequestHandler supervisor=new Supervisor();
		supervisor.HandleRequest(leaveRequest);

	}

}
