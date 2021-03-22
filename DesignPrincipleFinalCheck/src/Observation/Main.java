package Observation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Observer Ramesh=new Admin("Ramesh");
		Observer Ramesh2=new Admin("Ramesh2");
		Observer Ramesh3=new Admin("Ramesh3");
		
		INotificationService notificationService=new NotificationService();
		notificationService.addSubscriber(Ramesh);
		notificationService.addSubscriber(Ramesh2);
		notificationService.addSubscriber(Ramesh3);
		notificationService.notifySubscriber();
		notificationService.removeSubscriber(Ramesh3);
		
		

	}

}
