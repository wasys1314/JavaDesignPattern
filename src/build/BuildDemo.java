package build;


/***
 * 建造者模式
 */
public class BuildDemo {

    public static void main(String[] args) {
        HPComputerBuilder hpComputerBuilder = new HPComputerBuilder();
        Director director = new Director();
        director.setComputerBuilder(hpComputerBuilder);
        director.constructComputer();
        Computer computer = director.getComputer();
        System.out.println("computer--->"+computer.getAudio());

    }
}
