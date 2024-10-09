import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Park {
    private Attraction[] attractions;
    private int length;
    @Data
    @AllArgsConstructor
    private class Attraction {
        private String name;
        private String workingTime;
        private double cost;
        @Override
        public String toString() {
            return "Name: " + getName() + "\nWorking time: " + getWorkingTime() + "\nCost: " + getCost();
        }
    }
    public Park(int size) {
        attractions = new Attraction[size];
        length = 0;
    }

    public void addAttraction(String name, String workingTime, double cost) {
        Attraction attraction = new Attraction(name, workingTime, cost);
        attractions[length] = attraction;
        length++;
    }
}