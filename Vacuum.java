public class Vacuum {

    String State;
    int Speed;
    float Temperature;

    public Vacuum() {
        this.State = "Exploring";
        this.Speed = (int)(Math.random()*7);
        this.Temperature = -60F;
    }

    void displayAttributes() {
        System.out.printf("State: %s\n", this.State);
        System.out.printf("Speed: %d\n", this.Speed);
        System.out.printf("Temp: %f\n", this.Temperature);
    }

    void controlTemp() {
        if (this.Temperature <= -80) {
            this.State = "Turn to home";
            this.Speed = 5;
        } else {
            System.out.println("Everything is fine.");
        }
    }

    void setTemperature(float a_Temperature) {
        this.Temperature = a_Temperature;
    }
}
