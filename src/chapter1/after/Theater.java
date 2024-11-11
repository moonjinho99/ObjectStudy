package chapter1.after;

//극장
public class Theater {

	private TicketSeller ticketSeller;
	
	public Theater(TicketSeller ticketSeller)
	{
		this.ticketSeller = ticketSeller;
	}
	//1. 관객의 초대장을 확인하여 티켓, 현금을 처리하는 로직을 TicketSeller(판매원)으로 이동
	public void enter(Audience audience)
	{
		//2.Theater는 TicketSeller가 sellTO 메시지를 이해하고 응답한다는 사실만 알고있다
		ticketSeller.sellTo(audience);
	}
}
