import java.util.Objects;

/**
 * @program: 2020.6.8
 * @description:对象的比较
 * @author: Coderzhuzeyu
 * @create: 2020-06-08 18:10
 **/

//覆写基类的equal
class Card{
    public int rank;
    public String suit;

    public Card(int rank,String suit){
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        //如果 obj 不是 Card 的 实例， 返回 false
        if (obj == null || !(obj instanceof Card)) {
            return false;
        }

        Card tmp = (Card)obj;
        //this.suit 是String类型,this.suit.equals用的是String中的equals方法
        if (this.rank == tmp.rank && this.suit.equals(tmp.suit)) {
            return true;
        }
        return false;
    }

//    // alt + insert
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Card)) return false;
//        Card card = (Card) o;
//        return rank == card.rank &&
//                Objects.equals(suit, card.suit);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(rank, suit);
//    }
}

public class TestDemo {
    public static void main(String[] args) {
        Card card1 = new Card(5,"♥");
        Card card2 = new Card(5,"♥");
        System.out.println(card1 == card2);//false
        System.out.println(card1.equals(card2));//true
        // 如果没有重写 equals方法，则为默认的equals方法，结果为false
    }

}
