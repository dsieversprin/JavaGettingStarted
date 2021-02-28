
public class FizzBuzz {
    public String execute(Integer number) {
        switch (number) {
            case 1: {
                return "1";
            }
            case 2: {
                return "2";
            }
        }

        if (number % 5 == 0 && number % 3 == 0)
        {
            return "FizzBuzz";
        }

        if (number % 3 == 0)
        {
            return "Fizz";
        }

        if (number % 5 == 0)
        {
            return "Buzz";
        }

        return null;
    }
}
