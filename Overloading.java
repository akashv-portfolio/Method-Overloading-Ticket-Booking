public class Ticket{
        public static void main(String[] args) {
        ticketbooking t=new ticketbooking();
        t.book("Akash");
        t.book("Akash",20);
        t.book("Akash",20,"F17");
    }
}

class ticketbooking{
    void book(String Name){
        System.out.println("Ticket booked for:"+Name);
    }

    void book(String Name,int Age){
        System.out.println("Ticket booked for Name:"+Name+",Age"+Age);
    }

    void book(String Name,int Age,String SeatNo){
        System.out.println("Ticket booked for Name:"+Name+",Age:"+Age+",SeatNo:"+SeatNo);
    }
}

