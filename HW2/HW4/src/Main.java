public class Main {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        Team<Knight> knights = new Team<>();
        archers.addPersons(new Archer("Robin", 99, new Bow(35)))
                .addPersons(new Archer("Bobin", 100, new Bow(35)))
                .addPersons(new Archer("Tobin", 1, new Bow(25)));
        knights.addPersons(new Knight("John", 150, new Sword(), new HeavyShield()))
                .addPersons(new Knight("Adam", 150, new Sword(), new LightShield()));
        System.out.println(knights);
        Knight k1 = new Knight("John", 100, new Sword(), new HeavyShield());
        Archer a1 = new Archer("Robin", 100, new Bow(35));
        Battle b1 = new Battle(k1, a1);
        Warrior w1 = b1.run();
        System.out.println(w1);
        Battle b2 = new Battle(archers.persons.get(1), knights.persons.get(1));
        b2.run();
        TeamBattle tb1 = new TeamBattle(archers, knights);
        tb1.RunTeamBattle();


    }
}