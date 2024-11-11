package chapter1.after;

//관람객
public class Audience {

	private Bag bag;
	
	public Audience(Bag bag) {
		this.bag = bag;
	}
	
//	public Bag getBag() {
//		return bag;
//	}
	
	
	//관람객이 가방안에 초대장이 들어있는지 스스로 확인
	//Bag을 private로 선언했기 떄문에 외부에서 Bag에 접근할 수 없다
	public Long buy(Ticket ticket)
	{
		//1. Bag의 인터페이스에만 의존
		return bag.hold(ticket);
		
//		if(bag.hasInvitation())
//		{
//			bag.setTicket(ticket);
//			return 0L;
//		} else {
//			bag.setTicket(ticket);
//			bag.minusAmount(ticket.getFee());
//			return ticket.getFee();
//		}
	}
}
