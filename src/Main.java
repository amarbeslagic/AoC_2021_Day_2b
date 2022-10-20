import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("inputs//input_AoC_2b.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        List<String> listOfStrings = new ArrayList<>();

        String s;
        //put Strings in array
        while((s = br.readLine()) != null) {
            if (s.isBlank()) continue;

            listOfStrings.add(s);
        }

        String forward = "forward";
        String down = "down";
        String up = "up";

        int horisontalPosition = 0;
        int depth = 0;
        int aim = 0;

        for(String str : listOfStrings)
        {
            List<String> oneLine = new ArrayList<>();
            oneLine = List.of(str.split(" "));
            String command = oneLine.get(0);
            String size = oneLine.get(1);
            //forward
            if(command.equals(forward)){
                //System.out.println(command);
                horisontalPosition += Integer.parseInt(size);
                depth += aim * Integer.parseInt(size);
            }
            //up
            else if(command.equals(up)){
                //System.out.println(command);
                aim -= Integer.parseInt(size);
            }
            //down
            else if(command.equals(down)){
                //System.out.println(command);
                aim += Integer.parseInt(size);
            }

        }
        System.out.println("Horisontal position: " + horisontalPosition);
        System.out.println("Depth: " + depth);


        int finalPosition = horisontalPosition * depth;
        System.out.println("Final: " + finalPosition);

    }
}