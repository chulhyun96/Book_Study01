package 서민석.court;

import 설지수.chapter4.King;

public class Court {
    public void trialStart(Judge judge) {
        System.out.println("법원:재판해주세요");
        judge.startTrial();
    }
    public Judge Judge(String name){
        System.out.println("법원:"+name+"이 판사입니다.");
        return FactoryJudge.createJudge(name);
    }
}
