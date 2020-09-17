public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
        // initialize the variable numberCount here
    }

    public void addNumber(int number) {
        if (number != -1) {
        this.count++;
        this.sum = sum + number;            
        }

        
        // write code here
    }

    public int getCount() {
        return this.count;
        // write code here
    }
        public int sum() {
            return this.sum;
        // write code here
    }

    public double average() {
        double avg = 0;
        if (count > 0 && sum() != 0) {


        avg =  (sum*1.0)/count;
        return avg;
                    
        }
        return 0;// write code here
    }
}