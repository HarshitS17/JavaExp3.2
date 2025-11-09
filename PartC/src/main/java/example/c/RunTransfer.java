package example.c;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.math.BigDecimal;

public class RunTransfer {
    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext ctx =
                     new AnnotationConfigApplicationContext(SpringHibernateConfig.class)) {

            BankService bankService = ctx.getBean(BankService.class);

            try {
                bankService.transfer(1, 2, new BigDecimal("100.00"));
                System.out.println("Transfer successful");
            } catch (Exception e) {
                System.err.println("Transfer failed: " + e.getMessage());
            }
        }
    }
}
