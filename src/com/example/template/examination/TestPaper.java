package com.example.template.examination;

public class TestPaper {
    public void question1() {
        System.out.println("地球上最大的爬行动物是【】\nA.北方大蜥蜴 B.棱皮龟 C.盐水鳄 D.科莫多龙");
        System.out.println("答案:" + answer1());
    }

    protected String answer1() {
        return "";
    }

    public void question2() {
        System.out.println("海水中含量最多的元素是【】\nA.氧 B.钠 C.氢 D.钙");
        System.out.println("答案:" + answer2());
    }

    protected String answer2() {
        return "";
    }
}
