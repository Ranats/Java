package com.company;

class NormalCard {
    protected int point;

    NormalCard() {
        point = 0;
    }

    public int use(int price) {
        point += price * 1.05;
        return price;
    }

    public int get_point() {
        return point;
    }
}

class GoldCard extends NormalCard {
    GoldCard() {
        super();
    }

    public int use(int price) {
        point += price * 0.1;
        return price;
    }
}

class PremiumCard extends NormalCard {
    PremiumCard() {
        super();
    }

    public int use(int price) {
        point += price * 0.1;
        return (int) (price * 0.97);
    }
}

public class Main {
    public static void main(String[] args) {
        // write your code here
        NormalCard card1  = new NormalCard();
        GoldCard card2    = new GoldCard();
        PremiumCard card3 = new PremiumCard();

        NormalCard[] cards = {card1, card2, card3};

        int price = 100;
        int true_price = 0;

        for (NormalCard card : cards) {
            true_price = card.use(price);
            System.out.println("支払い金額 : " + true_price);
            System.out.println("現在のポイント : " + card.get_point());
        }
    }
}