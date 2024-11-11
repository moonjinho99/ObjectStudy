package chapter1.after;

//판매원
public class TicketSeller {

	private TicketOffice ticketOffice;
	
	public TicketSeller(TicketOffice ticketOffice) {
		this.ticketOffice = ticketOffice;
	}
	
//	public TicketOffice getTicketOffice() {
//		return ticketOffice;
//	}
	
	//TicketOffice는 private로 선언되어있기 때문에 TicketSeller에서만 접근이 가능 -> 캡슐화
	public void sellTo(Audience audience) {
			
		//1. 가방을 확인하는 로직을 Audience로 이동 
//		if(audience.getBag().hasInvitation())
//		{
//			Ticket ticket = ticketOffice.getTicket();
//			audience.getBag().setTicket(ticket);
//		} else {
//			Ticket ticket = ticketOffice.getTicket();
//			audience.getBag().minusAmount(ticket.getFee());
//			ticketOffice.plusAmount(ticket.getFee());
//			audience.getBag().setTicket(ticket);
//		}
		
		//2.Audience의 buy 메서드만 호출
		//가방을 소유한 사실을 알 필요가 없음
		//ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket()));
		
		//3. TicketSeller가 TicketOffice의 인터페이스에만 의존
		ticketOffice.sellTicketTo(audience);
	}
}
