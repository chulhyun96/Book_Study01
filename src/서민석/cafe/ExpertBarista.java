package 서민석.cafe;

public class ExpertBarista implements Barista{
    @Override
    public String makeCoffee(String name) {
        System.out.println("얼티밋 절대형태 장갑괴뢰 앱솔루트 메카"+name+"완성");
        return "얼티밋 절대형태 장갑괴뢰 앱솔루트 메카"+name;
    }
}

