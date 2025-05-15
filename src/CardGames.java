import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardGames extends JFrame implements ActionListener {
    Random random;
    int round = 1;
    int win1 = 0;
    int win2 = 0;
    int score1 = 0;
    int score2 = 0;
    int score3 = 0;
    int num;
    String cards;
    JButton button1;
    JButton button2;
    JRadioButton rb0;
    JRadioButton rb1;
    JRadioButton rb2;
    JRadioButton rb3;
    JRadioButton rb4;
    JRadioButton rb5;
    JRadioButton rb6;
    JRadioButton rb7;
    JRadioButton rb8;
    JRadioButton rb9;
    JLabel oneLabel;
    JLabel twoLabel;
    JLabel threeLabel;
    JLabel fourLabel;
    JLabel il0;
    JLabel il1;
    JLabel il2;
    JLabel il3;
    JLabel il4;
    JLabel il5;
    JLabel il6;
    JLabel il7;
    JLabel il8;
    JLabel il9;
    JLabel ml1;
    JLabel ml2;
    JLabel ml3;

    private static final String[] names = {
            "Cards/acec.jpg", "Cards/2c.jpg", "Cards/3c.jpg", "Cards/4c.jpg",
            "Cards/5c.jpg", "Cards/6c.jpg", "Cards/7c.jpg", "Cards/8c.jpg",
            "Cards/9c.jpg", "Cards/10c.jpg", "Cards/jackc.jpg", "Cards/queenc.jpg",
            "Cards/kingc.jpg", "Cards/aces.jpg", "Cards/2s.jpg", "Cards/3s.jpg",
            "Cards/4s.jpg", "Cards/5s.jpg", "Cards/6s.jpg", "Cards/7s.jpg",
            "Cards/8s.jpg", "Cards/9s.jpg", "Cards/10s.jpg", "Cards/jacks.jpg",
            "Cards/queens.jpg", "Cards/kings.jpg", "Cards/aced.jpg", "Cards/2d.jpg",
            "Cards/3d.jpg", "Cards/4d.jpg", "Cards/5d.jpg", "Cards/6d.jpg",
            "Cards/7d.jpg", "Cards/8d.jpg", "Cards/9d.jpg", "Cards/10d.jpg",
            "Cards/jackd.jpg", "Cards/queend.jpg", "Cards/kingd.jpg", "Cards/aceh.jpg",
            "Cards/2h.jpg", "Cards/3h.jpg", "Cards/4h.jpg", "Cards/5h.jpg",
            "Cards/6h.jpg", "Cards/7h.jpg", "Cards/8h.jpg", "Cards/9h.jpg",
            "Cards/10h.jpg", "Cards/jackh.jpg", "Cards/queenh.jpg", "Cards/kingh.jpg"
    };

    private final boolean[] used;
    Icon back = new ImageIcon(getClass().getResource("Cards/back.jpg"));
    private List<String> cards1, cards2, cards3;
    boolean player1stop = false;
    boolean player2stop = false;

    public CardGames() {
        random = new Random();
        used = new boolean[names.length];
        cards1 = new ArrayList<>();
        cards2 = new ArrayList<>();
        cards3 = new ArrayList<>();

        il0 = new JLabel();
        il0.setBounds(50, 40, 100, 100);
        il1 = new JLabel();
        il1.setBounds(150, 40, 100, 100);
        il2 = new JLabel();
        il2.setBounds(250, 40, 100, 100);
        il3 = new JLabel();
        il3.setBounds(350, 40, 100, 100);
        il4 = new JLabel();
        il4.setBounds(450, 40, 100, 100);

        rb0 = new JRadioButton();
        rb0.setBounds(80, 150, 35, 15);
        rb1 = new JRadioButton();
        rb1.setBounds(180, 150, 35, 15);
        rb2 = new JRadioButton();
        rb2.setBounds(280, 150, 35, 15);
        rb3 = new JRadioButton();
        rb3.setBounds(380, 150, 35, 15);
        rb4 = new JRadioButton();
        rb4.setBounds(480, 150, 35, 15);

        il5 = new JLabel();
        il5.setBounds(150, 380, 100, 100);
        il6 = new JLabel();
        il6.setBounds(250, 380, 100, 100);
        il7 = new JLabel();
        il7.setBounds(350, 380, 100, 100);
        il8 = new JLabel();
        il8.setBounds(450, 380, 100, 100);
        il9 = new JLabel();
        il9.setBounds(50, 380, 100, 100);

        rb5 = new JRadioButton();
        rb5.setBounds(180, 490, 35, 15);
        rb6 = new JRadioButton();
        rb6.setBounds(280, 490, 35, 15);
        rb7 = new JRadioButton();
        rb7.setBounds(380, 490, 35, 15);
        rb8 = new JRadioButton();
        rb8.setBounds(480, 490, 35, 15);
        rb9 = new JRadioButton();
        rb9.setBounds(80, 490, 35, 15);

        ml1 = new JLabel();
        ml1.setBounds(150, 210, 100, 100);
        ml1.setIcon(back);
        ml2 = new JLabel();
        ml2.setBounds(250, 210, 100, 100);
        ml2.setIcon(back);
        ml3 = new JLabel();
        ml3.setBounds(350, 210, 100, 100);
        ml3.setIcon(back);

        oneLabel = new JLabel("Player 1");
        oneLabel.setBounds(660, 40, 500, 25);
        oneLabel.setFont(new Font("Arial", Font.BOLD, 21));

        twoLabel = new JLabel("Hand's Point: " + score1);
        twoLabel.setBounds(635, 70, 500, 25);
        twoLabel.setFont(new Font("Arial", Font.BOLD, 21));

        threeLabel = new JLabel("Player 2");
        threeLabel.setBounds(660, 380, 500, 25);
        threeLabel.setFont(new Font("Arial", Font.BOLD, 21));

        fourLabel = new JLabel("Hand's Point: " + score2);
        fourLabel.setBounds(635, 410, 500, 25);
        fourLabel.setFont(new Font("Arial", Font.BOLD, 21));

        button1 = new JButton("Change");
        button1.setBounds(655, 100, 100, 30);
        button1.setFocusable(false);
        button1.addActionListener(this);

        button2 = new JButton("Change");
        button2.setBounds(655, 440, 100, 30);
        button2.setFocusable(false);
        button2.addActionListener(this);

        JFrame frame = new JFrame();
        frame.setTitle("CardGame");
        frame.setSize(900, 630);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        frame.add(il0);
        frame.add(il1);
        frame.add(il2);
        frame.add(il3);
        frame.add(il4);
        frame.add(il5);
        frame.add(il6);
        frame.add(il7);
        frame.add(il8);
        frame.add(il9);
        frame.add(rb0);
        frame.add(rb1);
        frame.add(rb2);
        frame.add(rb3);
        frame.add(rb4);
        frame.add(rb5);
        frame.add(rb6);
        frame.add(rb7);
        frame.add(rb8);
        frame.add(rb9);
        frame.add(ml1);
        frame.add(ml2);
        frame.add(ml3);
        frame.add(button1);
        frame.add(button2);
        frame.add(oneLabel);
        frame.add(twoLabel);
        frame.add(threeLabel);
        frame.add(fourLabel);

        score1 = calculate(cards1);
        score2 = calculate(cards2);
        frame.setVisible(true);
        twoLabel.setText("Hand's Point: " + score1);
        fourLabel.setText("Hand's Point: " + score2);
        roundchange();
    }

    protected String randomize() {
        do {
            num = random.nextInt(names.length);
        } while (used[num]);
        used[num] = true;
        return names[num];
    }

    public void show1() {
        cards = randomize();
        il0.setIcon(new ImageIcon(getClass().getResource(cards)));
        cards1.add(cards);
        cards = randomize();
        il1.setIcon(new ImageIcon(getClass().getResource(cards)));
        cards1.add(cards);
        cards = randomize();
        il2.setIcon(new ImageIcon(getClass().getResource(cards)));
        cards1.add(cards);
        cards = randomize();
        il3.setIcon(new ImageIcon(getClass().getResource(cards)));
        cards1.add(cards);
        cards = randomize();
        il4.setIcon(new ImageIcon(getClass().getResource(cards)));
        cards1.add(cards);
    }

    public void show2() {
        cards = randomize();
        il5.setIcon(new ImageIcon(getClass().getResource(cards)));
        cards2.add(cards);
        cards = randomize();
        il6.setIcon(new ImageIcon(getClass().getResource(cards)));
        cards2.add(cards);
        cards = randomize();
        il7.setIcon(new ImageIcon(getClass().getResource(cards)));
        cards2.add(cards);
        cards = randomize();
        il8.setIcon(new ImageIcon(getClass().getResource(cards)));
        cards2.add(cards);
        cards = randomize();
        il9.setIcon(new ImageIcon(getClass().getResource(cards)));
        cards2.add(cards);
    }

    public void show3() {
        String cards;
        cards = randomize();
        ml1.setIcon(new ImageIcon(getClass().getResource(cards)));
        cards3.add(cards);
        cards = randomize();
        ml2.setIcon(new ImageIcon(getClass().getResource(cards)));
        cards3.add(cards);
        cards = randomize();
        ml3.setIcon(new ImageIcon(getClass().getResource(cards)));
        cards3.add(cards);
    }

    public void hide1() {
        il0.setIcon(back);
        il1.setIcon(back);
        il2.setIcon(back);
        il3.setIcon(back);
        il4.setIcon(back);
    }

    public void hide2() {
        il5.setIcon(back);
        il6.setIcon(back);
        il7.setIcon(back);
        il8.setIcon(back);
        il9.setIcon(back);
    }

    public void hide3() {
        ml1.setIcon(back);
        ml2.setIcon(back);
        ml3.setIcon(back);
    }

    public void setting1() {
        if (rb0.isSelected()) {
            String cards = randomize();
            cards1.set(0, cards);
            il0.setIcon(new ImageIcon(getClass().getResource(cards)));
        }
        if (rb1.isSelected()) {
            String cards = randomize();
            cards1.set(1, cards);
            il1.setIcon(new ImageIcon(getClass().getResource(cards)));
        }
        if (rb2.isSelected()) {
            String cards = randomize();
            cards1.set(2, cards);
            il2.setIcon(new ImageIcon(getClass().getResource(cards)));
        }
        if (rb3.isSelected()) {
            String cards = randomize();
            cards1.set(3, cards);
            il3.setIcon(new ImageIcon(getClass().getResource(cards)));
        }
        if (rb4.isSelected()) {
            String cards = randomize();
            cards1.set(4, cards);
            il4.setIcon(new ImageIcon(getClass().getResource(cards)));
        }
    }

    public void setting2() {
        if (rb5.isSelected()) {
            String cards = randomize();
            cards2.set(0, cards);
            il5.setIcon(new ImageIcon(getClass().getResource(cards)));
        }
        if (rb6.isSelected()) {
            String cards = randomize();
            cards2.set(1, cards);
            il6.setIcon(new ImageIcon(getClass().getResource(cards)));
        }
        if (rb7.isSelected()) {
            String cards = randomize();
            cards2.set(2, cards);
            il7.setIcon(new ImageIcon(getClass().getResource(cards)));
        }
        if (rb8.isSelected()) {
            String cards = randomize();
            cards2.set(3, cards);
            il8.setIcon(new ImageIcon(getClass().getResource(cards)));
        }
        if (rb9.isSelected()) {
            String cards = randomize();
            cards2.set(4, cards);
            il9.setIcon(new ImageIcon(getClass().getResource(cards)));
        }
    }

    public void roundchange() {
        if (round % 2 != 0) {
            show1();
            hide2();
            hide3();
            button1.setEnabled(true);
            button2.setEnabled(false);
            score1 = calculate(cards1);
            twoLabel.setText("Hand's Point: " + score1);

        } else {
            show2();
            hide1();
            hide3();
            button1.setEnabled(false);
            button2.setEnabled(true);
            score2 = calculate(cards2);
            fourLabel.setText("Hand's Point: " + score2);

        }
    }

    public int calculate(List<String> cards) {
        int score = 0;
        List<Integer> cardnum = new ArrayList<>();
        List<String> suits = new ArrayList<>();
        for (String card : cards) {
            int value = getcardnum(card);
            cardnum.add(value);
            suits.add(getcardsuit(card));
        }
        score += pair(cardnum);
        score = straight(cardnum, score);
        score = flush(suits, score);

        return score;
    }

    private int getcardnum(String card) {
        switch (card) {
            case "Cards/acec.jpg":
            case "Cards/aces.jpg":
            case "Cards/aced.jpg":
            case "Cards/aceh.jpg":
                return 14;
            case "Cards/kingc.jpg":
            case "Cards/kings.jpg":
            case "Cards/kingd.jpg":
            case "Cards/kingh.jpg":
                return 13;
            case "Cards/queenc.jpg":
            case "Cards/queens.jpg":
            case "Cards/queend.jpg":
            case "Cards/queenh.jpg":
                return 12;
            case "Cards/jackc.jpg":
            case "Cards/jacks.jpg":
            case "Cards/jackd.jpg":
            case "Cards/jackh.jpg":
                return 11;
            case "Cards/10c.jpg":
            case "Cards/10s.jpg":
            case "Cards/10d.jpg":
            case "Cards/10h.jpg":
                return 10;
            case "Cards/9c.jpg":
            case "Cards/9s.jpg":
            case "Cards/9d.jpg":
            case "Cards/9h.jpg":
                return 9;
            case "Cards/8c.jpg":
            case "Cards/8s.jpg":
            case "Cards/8d.jpg":
            case "Cards/8h.jpg":
                return 8;
            case "Cards/7c.jpg":
            case "Cards/7s.jpg":
            case "Cards/7d.jpg":
            case "Cards/7h.jpg":
                return 7;
            case "Cards/6c.jpg":
            case "Cards/6s.jpg":
            case "Cards/6d.jpg":
            case "Cards/6h.jpg":
                return 6;
            case "Cards/5c.jpg":
            case "Cards/5s.jpg":
            case "Cards/5d.jpg":
            case "Cards/5h.jpg":
                return 5;
            case "Cards/4c.jpg":
            case "Cards/4s.jpg":
            case "Cards/4d.jpg":
            case "Cards/4h.jpg":
                return 4;
            case "Cards/3c.jpg":
            case "Cards/3s.jpg":
            case "Cards/3d.jpg":
            case "Cards/3h.jpg":
                return 3;
            case "Cards/2c.jpg":
            case "Cards/2s.jpg":
            case "Cards/2d.jpg":
            case "Cards/2h.jpg":
                return 2;
            default:
                return 0;
        }
    }

    private String getcardsuit(String card) {
        if (card.contains("c.jpg"))
            return "Clubs";
        else if (card.contains("s.jpg"))
            return "Spades";
        else if (card.contains("d.jpg"))
            return "Diamonds";
        else
            return "Hearts";
    }

    private int pair(List<Integer> cardnum) {
        int points = 0;
        while (!cardnum.isEmpty()) {
            int currentCard = cardnum.get(0);
            int count = 1;
            for (int i = 1; i < cardnum.size(); i++) {
                if (cardnum.get(i) == currentCard) {
                    count++;
                }
            }
            for (int i = 0; i < count; i++) {
                cardnum.remove(Integer.valueOf(currentCard));
            }
            if (count > 1) {
                points += (currentCard * count) * count;
            } else {
                points += currentCard;
            }
        }
        return points;
    }

    private int straight(List<Integer> cardnum, int score) {
        Collections.sort(cardnum);
        for (int i = 0; i <= cardnum.size() - 5; i++) {
            boolean isStraight = true;
            int straightsum = cardnum.get(i);
            for (int j = i + 1; j < i + 5; j++) {
                if (cardnum.get(j) != cardnum.get(j - 1) + 1) {
                    isStraight = false;
                    straightsum += cardnum.get(j);
                }
            }
            if (isStraight) {
                score += straightsum * 5;
            }
        }
        return score;
    }

    private int flush(List<String> cards, int score) {
        int[] suitCount = new int[4];
        int[] suitSum = new int[4];
        for (String card : cards) {
            int cardValue = getcardnum(card);
            if (card.contains("c.jpg")) {
                suitCount[0]++;
                suitSum[0] += cardValue;
            } else if (card.contains("d.jpg")) {
                suitCount[1]++;
                suitSum[1] += cardValue;
            } else if (card.contains("h.jpg")) {
                suitCount[2]++;
                suitSum[2] += cardValue;
            } else if (card.contains("s.jpg")) {
                suitCount[3]++;
                suitSum[3] += cardValue;
            }
        }
        for (int i = 0; i < 4; i++) {
            if (suitCount[i] >= 5) {
                score += suitSum[i] * 6;
            }
        }
        return score;
    }

    public void winner() {
        if (score1 > score2) {
            win1++;
            JOptionPane.showMessageDialog(null,
                    "Player 1 wins the round with " + score1 + " points! Player 1's total wins: " + win1
                            + "  Player 2's total wins: " + win2);
            if (win1 == 3) {
                JOptionPane.showMessageDialog(null, "Player 1 wins the game.");
                System.exit(0);
            } else if (win2 == 3) {
                JOptionPane.showMessageDialog(null, "Player 2 wins the game.");
                System.exit(0);
            }
        } else if (score2 > score1) {
            win2++;
            JOptionPane.showMessageDialog(null,
                    "Player 2 wins the round with " + score2 + " points! Player 2's total wins: " + win2
                            + "  Player 1's total wins: " + win1);
            if (win1 == 3) {
                JOptionPane.showMessageDialog(null, "Player 1 wins the game.");
                System.exit(0);
            } else if (win2 == 3) {
                JOptionPane.showMessageDialog(null, "Player 2 wins the game.");
                System.exit(0);
            }
        } else if (score1 == score2 && score1 != 0 && score2 != 0) {
            JOptionPane.showMessageDialog(this, "Tie. Both players scored " + score1 + " points.");

        }
        if (win1 != 3 || win2 != 3) {
            JOptionPane.showMessageDialog(null, "NEXT ROUND!");
        }
        cards1.clear();
        cards2.clear();
        cards3.clear();
        score1 = 0;
        score2 = 0;
        score3 = 0;
        twoLabel.setText("Hand's Point: " + score1);
        fourLabel.setText("Hand's Point: " + score2);
    }

    public void resetсards() {
        for (int i = 0; i < used.length; i++) {
            used[i] = false;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (round % 2 != 0) {
            if (e.getSource() == button1) {
                setting1();
                score1 = calculate(cards1);
                twoLabel.setText("Hand's Point: " + score1);
                button1.setEnabled(false);
                button2.setEnabled(true);
                show2();
                score2 = calculate(cards2);
                fourLabel.setText("Hand's Point: " + score2);
                player1stop = true;

            } else if (e.getSource() == button2) {
                setting2();
                show3();
                cards2.addAll(cards3);
                score2 = calculate(cards2);
                fourLabel.setText("Hand's Point: " + score2);
                cards1.addAll(cards3);
                score1 = calculate(cards1);
                twoLabel.setText("Hand's Point: " + score1);
                button1.setEnabled(true);
                button2.setEnabled(false);
                player2stop = true;
            }
            if (player1stop && player2stop) {
                winner();
                player2stop = false;
                player1stop = false;
                round++;
                resetсards();
                roundchange();
            }
        } else if (round % 2 == 0) {
            if (e.getSource() == button1) {
                setting1();
                show3();
                cards2.addAll(cards3);
                score2 = calculate(cards2);
                fourLabel.setText("Hand's Point: " + score2);
                cards1.addAll(cards3);
                score1 = calculate(cards1);
                twoLabel.setText("Hand's Point: " + score1);
                button1.setEnabled(false);
                button2.setEnabled(true);
                player1stop = true;

            } else if (e.getSource() == button2) {
                setting2();
                score2 = calculate(cards2);
                fourLabel.setText("Hand's Point: " + score2);
                button1.setEnabled(true);
                button2.setEnabled(false);
                show1();
                score1 = calculate(cards1);
                twoLabel.setText("Hand's Point: " + score1);
                player2stop = true;
            }
            if (player1stop && player2stop) {
                winner();
                player2stop = false;
                player1stop = false;
                round++;
                resetсards();
                roundchange();
            }
        }
    }

    public static void main(String[] args) {
        new CardGames();
    }
}
