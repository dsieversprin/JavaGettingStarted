
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

        if (number % 3 == 0)
        {
            return "Fizz";
        }

        return null;
    }
}
