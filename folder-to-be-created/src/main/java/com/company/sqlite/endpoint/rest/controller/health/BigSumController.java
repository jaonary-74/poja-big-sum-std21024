import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BigSumController {

    @GetMapping("/big-sum")
    public String calculateBigSum(@RequestParam("a") String a, @RequestParam("b") String b) {
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);
        BigInteger sum = numA.add(numB);
        return sum.toString();
    }
}