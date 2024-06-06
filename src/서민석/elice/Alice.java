package 서민석.elice;

public class Alice {
    public int height;
    public String place;

    public Juice juice;
    public Alice(int height, String place) {
        this.height = height;
        this.place = place;
    }

    public void takeJuice(Juice juice){
        System.out.println("앨리스:주스를 마셔볼까?");
        this.juice = juice;
        System.out.println("현재 키:"+this.height);
    }
    public void drink(){
        System.out.println("앨리스:주스를 마셔보자");
        int quantity = 50;
        this.height -=juice.drink(quantity);
        System.out.println("현재 키:"+this.height);
        System.out.println("현재 위치:"+this.place);
        if(juice.quantity==0) {
            juice = null;
        }
    }

    public void passDoor(LittleDoor door){
        System.out.println("앨리스:정원으로 가보자");
        boolean open = door.validHeight(this.getHeight());
        if(open){
            this.place="아름다운정원";
            System.out.println("앨리스:우와 정원이다");
            System.out.println("현재 위치:"+this.place);
        }
        else{
            System.out.println("앨리스:문이너무 작아");
            System.out.println("현재 위치:"+this.place);
        }
    }
    public int getHeight() {
        return height;
    }

    public String getPlace() {
        return place;
    }
}
