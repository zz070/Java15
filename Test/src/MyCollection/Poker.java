package MyCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Card{
    private String rank;  //花色
    private String suit;    //花色

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    //复写toString方法
    @Override
    public String toString(){
        return "["+this.suit+this.rank+"]";
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
}
public class Poker {
    public static void main(String[] args) {
        //创建一副牌
        List<Card> poker = createPoker();
        System.out.println("一副新的扑克牌：");
        System.out.print(poker);
        System.out.println();
        //打乱牌的顺序，直接使用 Collections.shuffle 方法
        //还有一种简单的办法: 从后往前遍历 List, 取出当前元素, 再生成一个随机位置.
        Collections.shuffle(poker);
        System.out.println("经过洗牌的扑克牌：");
        System.out.print(poker);
        System.out.println();
        //创建玩家
        List<List<Card>> player = new ArrayList<>();
        //创建3个匿名对象
        player.add(new ArrayList<Card>());
        player.add(new ArrayList<Card>());
        player.add(new ArrayList<Card>());
        //发牌，每个玩家五张牌，三个玩家
        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                List<Card> players = player.get(j);
                // remove 表示删除 List 中指定下标的元素
                // remove 返回值表示删除的这个元素
                Card card = poker.remove(0);
                players.add(card);
            }
        }
        //发牌结束，查看牌
        System.out.println("玩家手中的扑克牌");
        for(int i=0;i<3;i++){
            System.out.println("玩家"+i+":"+player.get(i));
        }

    }
    //创建一副扑克牌
    private static List<Card> createPoker(){
        List<Card> poker = new ArrayList<>();
        String[] suit = {"♠","♣","♦","♥"};   //四种花色
        for(int i=0;i<4;i++){
            for(int j =2;j<11;j++){
                poker.add(new Card(""+j,suit[i]));
            }
            poker.add(new Card("A",suit[i]));
            poker.add(new Card("J",suit[i]));
            poker.add(new Card("Q",suit[i]));
            poker.add(new Card("K",suit[i]));
        }
        return poker;
    }
}
