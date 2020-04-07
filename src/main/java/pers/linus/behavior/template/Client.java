package main.java.pers.linus.behavior.template;

/**
 * 模板模式（template）
 * 当类的行为可以抽出一个模板，让用户自定义实现该模板方法，模板方法必须写成final
 */
public class Client {
    public static void main(String[] args) {
        Game footballGame = new FootballGame();
        Game basketballGame = new BasketballGame();

        footballGame.play();
        basketballGame.play();
    }
}
