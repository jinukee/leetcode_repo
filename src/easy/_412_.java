package easy;

import java.util.ArrayList;

public class _412_ {
    public List<String> fizzBuzz(int n){
        List<String> answer = new ArrayList<String>(n);
        for(int i = 1; i <= n; i++){
            if(i%3 == 0 && i%5 == 0){
                answer.add("FizzBuzz");
            }
            else if(i%3 == 0){
                answer.add("Fizz");
            }
            else if(i%5 == 0){
                answer.add("Buzz");
            }
            else{
                answer.add(String.valueOf(i));
            }
        }
        return answer;
    }
}
