public class Nature {

    public static void main(String[] args) {

        Penguin pingou = new Penguin("Pingou");
        pingou.dive();
        pingou.swimDown(3);
        pingou.swimUp(1);
        pingou.swimDown(4);
        pingou.swimUp(5);
        pingou.swimUp(1);
        pingou.getOut();

        Eagle eyeCherry = new Eagle("Eye Cherry");
        // TODO : uncomment the following code in order to test it

        eyeCherry.takeOff();
        eyeCherry.ascend(120);
        eyeCherry.ascend(30);
        eyeCherry.glides();
        eyeCherry.descend(140);
        eyeCherry.land();
        eyeCherry.descend(9);
        eyeCherry.land();

    }
}
